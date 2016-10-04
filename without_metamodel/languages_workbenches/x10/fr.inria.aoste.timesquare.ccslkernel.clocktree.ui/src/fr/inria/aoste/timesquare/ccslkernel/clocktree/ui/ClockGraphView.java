package fr.inria.aoste.timesquare.ccslkernel.clocktree.ui;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.zest.core.viewers.ZoomContributionViewItem;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.DirectedGraphLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.GridLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.HorizontalShift;
import org.eclipse.zest.layouts.algorithms.HorizontalTreeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.RadialLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

import fr.inria.aoste.timesquare.ccslkernel.clocktree.generator.Activator;
import fr.inria.aoste.timesquare.ccslkernel.clocktree.generator.ClockTreeConstructor;
import fr.inria.aoste.timesquare.ccslkernel.clocktree.generator.CoincidentClocks;
import fr.inria.aoste.timesquare.ccslkernel.clocktree.generator.Edge;
import fr.inria.aoste.timesquare.ccslkernel.clocktree.generator.GrphClockTreeConstructor;
import fr.inria.aoste.timesquare.utils.console.ErrorConsole;
import fr.inria.aoste.timesquare.utils.pluginhelpers.PluginHelpers;
import grph.oo.ObjectGrph;


public class ClockGraphView extends ViewPart{
	

		/*public field */
		public static final String CLOCK_GRAPH = "Clock Graph";
		public static final String RELOAD_LAYOUT = "Reload Layout";
		public static final String RELOAD_FILE = "Reload file";
		public static final String LAYOUT = "Layout";
		public static final String UPDATE_LAYOUT = "Update Layout";
		public static final String CHANGE_LAYOUT = "Change Layout";

		private static final String STRING_INTERNAL2 = "]";
		private static final String STRING_INTERNAL1 = "\n[";

		/**
		 * The ID of the view as specified by the extension.
		 */
		public static final String ID = "fr.inria.aoste.timesquare.ccslkernel.clocktree.ui.ClockGraphView";

		private static ClockGraphView courant = null;

		public final class UpdateLayoutAction extends Action {
			public UpdateLayoutAction() {
				super();
				setText(LAYOUT);
				setToolTipText(UPDATE_LAYOUT);
				setImageDescriptor(PluginHelpers.getImageDescriptor("org.eclipse.jdt.ui", "/icons/full/elcl16/refresh.gif"));
			}

			public void run() {
				runLayout();
			}
		}

		public final class SetAlgorithm extends Action {

			private LayoutAlgorithm mylayoutAlgorithm;

			@Override
			public void run() {

				ClockGraphView.this.setLayoutAlgorithm(mylayoutAlgorithm);

				for (SetAlgorithm sa : ClockGraphView.this.listsetAlgorithms) {
					sa.setChecked(sa == this);

				}
			}

			public SetAlgorithm(String text, LayoutAlgorithm layoutAlgorithm) {
				super(text);
				this.mylayoutAlgorithm = layoutAlgorithm;
			}

			public SetAlgorithm(LayoutAlgorithm layoutAlgorithm) {
				super(getClassNameWithSpace(layoutAlgorithm));
				this.mylayoutAlgorithm = layoutAlgorithm;
			}
		}

		public final class ChangeLayoutAction extends Action implements IMenuCreator {

			public ChangeLayoutAction() {
				super();
				setImageDescriptor(PluginHelpers.getImageDescriptor("org.eclipse.zest.core", "/icons/tree_normal.gif"));
				setToolTipText(CHANGE_LAYOUT);
			}

			@Override
			public void dispose() {

			}

			private Menu fMenu;

			@Override
			public Menu getMenu(Control parent) {
				if (fMenu != null) {
					fMenu.dispose();
				}
				fMenu = new Menu(parent);
				for (SetAlgorithm la : ClockGraphView.this.listsetAlgorithms) {
					ActionContributionItem item = new ActionContributionItem(la);
					item.fill(fMenu, -1);
				}

				return fMenu;
			}

			@Override
			public Menu getMenu(Menu parent) {

				return null;
			}

			public void runWithEvent(Event event) {
				if (event.widget instanceof ToolItem) {
					ToolItem toolItem = (ToolItem) event.widget;
					Control control = toolItem.getParent();
					Menu menu = getMenu(control);

					Rectangle bounds = toolItem.getBounds();
					Point topLeft = new Point(bounds.x, bounds.y + bounds.height);
					menu.setLocation(control.toDisplay(topLeft));
					menu.setVisible(true);
				}
			}
		}

		
		public class ClockGraphAction extends Action implements IObjectActionDelegate , Runnable {

			private IFile _ccslFile;
			private ClockTreeConstructor _clockTreegenerator = null;

			public ClockGraphAction(String text, ImageDescriptor image) {
				super(text, image);
				
			}
			/**
			 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
			 */
			public void setActivePart(IAction action, IWorkbenchPart targetPart) {
			}

			private String filename = null;
			
			/**
			 * @see IActionDelegate#run(IAction)
			 */
			@Override
			public void run(IAction action) {
				run();
			}

			/**
			 *  Called by ClockGraph
			 */
			@Override
			public void run() {			
				try {
					if (filename != null) {
						_clockTreegenerator = null;
						_clockTreegenerator = new GrphClockTreeConstructor();//CCSLKernelClockTreeConstructor();
						ObjectGrph<CoincidentClocks, Edge> g = _clockTreegenerator.createClockGrphDag("platform:/resource"
								+ filename);

						ClockGraphView.getCourant().display(g, filename);
					}
				} catch (Throwable e) {	
					String message="Clock Graph : [" +e.getMessage()+ "]";			
					Activator.getDefault().getLog().log(new Status(IStatus.ERROR,Activator.PLUGIN_ID,message,e));			
					e.printStackTrace();
					ClockGraphView.getCourant().cleanDiagram( filename,message);
				}
			}

			/**
			 * @see IActionDelegate#selectionChanged(IAction, ISelection)
			 */
			public void selectionChanged(IAction action, ISelection selection) {
				filename = null;
				if (selection instanceof StructuredSelection) {
					StructuredSelection ss = (StructuredSelection) selection;
					Object o = ss.getFirstElement();
					if (o instanceof IFile) {
						_ccslFile = (IFile) o;
						filename = _ccslFile.getFullPath().toString();
						String s = _ccslFile.getFullPath().getFileExtension();
						if ("extendedCCSL".equals(s)) {
							action.setEnabled(true);					
						} else {
							action.setEnabled(false);
						}
					}
				}
			}

			public String getFilename() {
				return filename;
			}

			public void setFilename(String filename) {
				this.filename = filename;
			}

			public void runInDisplay() {
				Display.getDefault().syncExec(this);		
			}
		}

		public static String getClassNameWithSpace(Object o) {
			if (o != null) {
				return o.getClass().getSimpleName().replaceAll("[A-Z]", " $0").trim();
			}
			return "";
		}

		private ArrayList<SetAlgorithm> listsetAlgorithms = new ArrayList<ClockGraphView.SetAlgorithm>();

		private Grph4zest zestCreator = null;
		private Graph _g = null;

		private ChangeLayoutAction action1;

		private UpdateLayoutAction action2;

		private ClockGraphAction newAction;

		private String filename = "";
		private String algoname = "";

		private LayoutAlgorithm _layoutAlgorithm = new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
		private Composite _parent;

		/**
		 * The constructor.
		 */
		public ClockGraphView() {
			setCourant(this);
		}

		public synchronized static ClockGraphView getCourant() {
			if (courant == null) {
				try {
					PluginHelpers.getShowView(ID);

					if (courant == null) {
						PluginHelpers.getCreateView(ID);
					}
					PluginHelpers.getShowView(ID);
					if (courant != null) {
						courant.setFocus();
					}

				} catch (Throwable ex) {
					ErrorConsole.printError(ex, CLOCK_GRAPH);
				}
			}
			return courant;
		}

		@Override
		public void dispose() {
			super.dispose();
			setCourant(null);
		}

		private synchronized static final void setCourant(ClockGraphView courant) {
			ClockGraphView.courant = courant;
		}

		/**
		 * This is a callback that will allow us to create the viewer and initialize
		 * it.
		 */
		public void createPartControl(Composite parent) {
			_parent = parent;
			zestCreator = new Grph4zest(parent);
			initAlgorithm();
			makeActions();
			contributeToActionBars();
		}

		private void initAlgorithm() {
			// _accelerator = 0;
			addAlgorithms(_layoutAlgorithm);// = new
											// TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING));
			addAlgorithms(new HorizontalTreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING));
			addAlgorithms(new RadialLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING));
			addAlgorithms(new GridLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING));
			addAlgorithms(new HorizontalShift(LayoutStyles.NO_LAYOUT_NODE_RESIZING));
			addAlgorithms(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING));
			addAlgorithms(new DirectedGraphLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING));
			// setLayoutAlgorithm(_layoutAlgorithm);
			for (SetAlgorithm sa : listsetAlgorithms) {
				sa.setChecked(sa.mylayoutAlgorithm == _layoutAlgorithm);

			}

		}

		private void addAlgorithms(LayoutAlgorithm _layoutAlgorithm) {
			SetAlgorithm action = new SetAlgorithm(_layoutAlgorithm);
			listsetAlgorithms.add(action);
		}

		public ArrayList<String> getListAlgorithms() {
			ArrayList<String> ls = new ArrayList<String>();
			for (SetAlgorithm sa : listsetAlgorithms)
				ls.add(sa.getText());
			return ls;
		}

		/**
		 * Passing the focus request to the viewer's control.
		 */
		public void setFocus() {

		}

		public void display(ObjectGrph<CoincidentClocks, Edge> g, String _filename) {
			if (zestCreator == null) {
				System.err.println("Error :zestCreator is null");
				return;
			}
			if (tipRectangle != null && _g != null) {
				_g.getContents().remove(tipRectangle);
				tipRectangle = null;
			}
			filename = _filename;
			zestCreator.dispose();
			zestCreator.setGrph(g);
			_g = zestCreator.getZestGraph();
			newAction.setFilename(filename);
			setContentDescription(filename + STRING_INTERNAL1 + algoname + STRING_INTERNAL2);
			runLayout();
		}

		RectangleWithMessage tipRectangle = null;

		public void cleanDiagram(String _filename, String message) {
			filename = _filename;
			zestCreator.setGrph(null);
			_g = zestCreator.getZestGraph();
			int x = _parent.getSize().x;
			int y = _parent.getSize().y;
			if (tipRectangle != null)
				_g.getContents().remove(tipRectangle);
			newAction.setFilename(filename);
			String text = _filename + "\n\n\n" + message;
			_g.getContents().add(tipRectangle = new RectangleWithMessage(text, x, y));

		}

		private static final class RectangleWithMessage extends RectangleFigure {
			private Label l = null;

			public RectangleWithMessage(String texte, int x, int y) {
				super();
				setVisible(true);
				this.setOpaque(false);
				this.setLineStyle(Graphics.LINE_DOT);
				this.setForegroundColor(ColorConstants.yellow);
				this.setBackgroundColor(ColorConstants.yellow);
				this.setBounds(new org.eclipse.draw2d.geometry.Rectangle(0, 0, x, y));
				l = new Label();
				l.setText(texte);
				l.setLocation(new org.eclipse.draw2d.geometry.Point(5, 5));
				l.setForegroundColor(ColorConstants.black);
				l.setOpaque(true);
				l.setVisible(true);
				l.setSize(x, y);
				this.add(l);
			}

			@Override
			public void repaint() {
				if (l != null) {
					l.repaint();
				}
				super.repaint();
			}

		}

		private void runLayout() {
			if (_g != null)
				_g.setLayoutAlgorithm(_layoutAlgorithm, true);
		}

		public void setLayoutAlgorithm(LayoutAlgorithm layoutAlgorithm) {
			_layoutAlgorithm = layoutAlgorithm;
			algoname = getClassNameWithSpace(_layoutAlgorithm);
			if (_g != null)
				_g.setLayoutAlgorithm(layoutAlgorithm, true);
			setContentDescription(filename + STRING_INTERNAL1 + algoname + STRING_INTERNAL2);
		}

		private void contributeToActionBars() {
			IActionBars bars = getViewSite().getActionBars();
			fillLocalPullDown(bars.getMenuManager());
			fillLocalToolBar(bars.getToolBarManager());
		}

		private void fillLocalPullDown(IMenuManager manager) {
			manager.add(action2);
			manager.add(newAction);
			IMenuManager manager2 = new MenuManager("Layout", ID + ".menu.layout");
			manager.add(manager2);
			for (SetAlgorithm action : listsetAlgorithms) {
				manager2.add(action);
			}
		}

		private void makeActions() {
			action1 = new ChangeLayoutAction();
			action2 = new UpdateLayoutAction();
			newAction = new ClockGraphAction(RELOAD_FILE, PluginHelpers.getImageDescriptor("org.eclipse.ui.ide",
					"/icons/full/elcl16/refresh_nav.gif"));
			newAction.setToolTipText(RELOAD_LAYOUT);
			zoomContributionViewItem = new ZoomContributionViewItem(zestCreator);
		}

		ZoomContributionViewItem zoomContributionViewItem;

		private void fillLocalToolBar(IToolBarManager mgr) {
			mgr.add(action2);
			mgr.add(newAction);
			mgr.add(action1);
			mgr.add(zoomContributionViewItem);
			if (mgr instanceof ToolBarManager) {
				ToolBarManager tbm = (ToolBarManager) mgr;
				final ToolBar tb = tbm.getControl();
				tb.addMouseListener(new MouseAdapter() {
					public void mouseDown(MouseEvent e) {
						ToolItem ti = tb.getItem(new Point(e.x, e.y));
						if (ti != null) {
							if (ti.getData() instanceof ActionContributionItem) {
								ActionContributionItem actionContributionItem = (ActionContributionItem) ti.getData();
								IAction action = actionContributionItem.getAction();
								if (action == action1) {
									Event event = new Event();
									event.widget = ti;
									event.x = e.x;
									event.y = e.y;
									action.runWithEvent(event);
								}
							}
						}
					}
				});
			}
		}

	}