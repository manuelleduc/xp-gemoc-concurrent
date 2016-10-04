package fr.inria.aoste.timesquare.ccslkernel.clocktree.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import fr.inria.aoste.timesquare.ccslkernel.clocktree.generator.ClockTreeConstructor;
import fr.inria.aoste.timesquare.ccslkernel.clocktree.generator.CoincidentClocks;
import fr.inria.aoste.timesquare.ccslkernel.clocktree.generator.Edge;
import fr.inria.aoste.timesquare.ccslkernel.clocktree.generator.GrphClockTreeConstructor;
import fr.inria.aoste.timesquare.ccslkernel.clocktree.ui.ClockGraphView;
import grph.oo.ObjectGrph;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ClockGraphHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public ClockGraphHandler() {
	}

	private IFile ccslFile;
	private ClockTreeConstructor clockTreegenerator = null;
	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			if (((IStructuredSelection) selection).size() == 1) {
				Object selected = ((IStructuredSelection) selection).getFirstElement();
				if (selected instanceof IFile) {
					ccslFile = (IFile) selected;
					String filename = ccslFile.getFullPath().toString();
					clockTreegenerator = new GrphClockTreeConstructor();//CCSLKernelClockTreeConstructor();
					ObjectGrph<CoincidentClocks, Edge> g = clockTreegenerator.createClockGrphDag("platform:/resource"
							+ filename);

				//	g.display();
					ClockGraphView.getCourant().display(g, filename);
				}
			}
		}
		return null;
	}
}
