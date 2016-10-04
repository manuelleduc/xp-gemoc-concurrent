package fr.inria.aoste.timesquare.ccslkernel.clocktree.ui;

/**
 * This is a way to represent Grph by using ZEST
 * 
 * 
 * @author Julien DeAntoni
 * 
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.eclipse.draw2d.Label;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.viewers.IGraphContentProvider;
import org.eclipse.zest.core.viewers.ISelfStyleProvider;
import org.eclipse.zest.core.viewers.IZoomableWorkbenchPart;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;

import fr.inria.aoste.timesquare.ccslkernel.clocktree.generator.CoincidentClocks;
import fr.inria.aoste.timesquare.ccslkernel.clocktree.generator.Edge;
import grph.oo.ObjectGrph;

public class Grph4zest implements IZoomableWorkbenchPart {

	public static class ClockTreeFilter extends ViewerFilter {

		public ClockTreeFilter() {
			super();
		}

		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element) {
			// System.out.println("F+"+element);
			if ( element instanceof Edge)
			{
				
			}
			if ( element instanceof CoincidentClocks)
			{
				
			}
			return true;
		}
	}

	public static class GraphContentProvider implements IGraphContentProvider {// ,INestedContentProvider{

		public GraphContentProvider() {
			super();			
		}

		private ObjectGrph<CoincidentClocks, Edge> _og = null;

		@Override
		public void dispose() {		

		}

		@SuppressWarnings("unchecked")
		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			_og = null;
			if (newInput instanceof ObjectGrph) {
				_og = (ObjectGrph<CoincidentClocks, Edge>) newInput;
			}
			/*else{
				throw new RuntimeException("newInput not instance of ObjectGrph: " +newInput);
			}
			 */
		}

		@Override
		public Object getSource(Object rel) {
			if (rel instanceof Edge) {
				if (_og != null){
					return _og.getDirectedSimpleEdgeTail((Edge) rel);
				}else{
					throw new RuntimeException("_og is null");
				}
			}
//			if (rel instanceof CoincidentClocks) {
//				return rel;
//			}
//			throw new RuntimeException("rel not instance of Edge or coincident clocks");
			return null;
		}

		@Override
		public Object getDestination(Object rel) {
			if (rel instanceof Edge) {
				if (_og != null){
					return _og.getDirectedSimpleEdgeHead((Edge) rel);
				}else{
					throw new RuntimeException("_og is null");
				}
			}
//			if (rel instanceof CoincidentClocks) {
//				return rel;
//			}
//			throw new RuntimeException("rel not instance of Edge");
			return null;
		}

		@Override
		public Object[] getElements(Object input) {
			if (input instanceof ObjectGrph) {
				Collection<Edge> tmp = _og.getEdges();//_og.getVertices();
				Collection<Object> lst = new HashSet<Object>(tmp);
				// add vertex for vertex whithotu edge)
				//lst.addAll(new HashSet<Object>(_og.getEdges()));
				return lst.toArray(new Object[lst.size()]);
			}
//			else{
//				throw new RuntimeException("input not instance of ObjectGrph: "+input.getClass().getCanonicalName());
//			}
			return new Object[] {};
		}
	}

	public static class LabellingProvider implements IBaseLabelProvider, ISelfStyleProvider {

		public LabellingProvider() {
			super();

		}

		@Override
		public void addListener(ILabelProviderListener listener) {

		}

		@Override
		public void dispose() {

		}

		@Override
		public boolean isLabelProperty(Object element, String property) {

			return true;
		}

		@Override
		public void removeListener(ILabelProviderListener listener) {

		}

		@Override
		public void selfStyleConnection(Object element, GraphConnection c) {
			if (element instanceof Edge) {
				Edge e = (Edge) element;
				Color color = e.getColor(null);
				c.setLineColor(color);
				c.setCurveDepth(0);
				c.setConnectionStyle(ZestStyles.CONNECTIONS_DIRECTED);
				if (e.k_affineFunction != null){
					c.setText(e.getLabel()+"\n"+e.k_affineFunction);
				}else{
					c.setText(e.getLabel());
				}
				c.setLineWidth(e.getSize());
			}

		}

		@Override
		public void selfStyleNode(Object element, GraphNode node) {
			// GraphNode n = new GraphNode(_g, SWT.NONE, v.getVertexLabel());
			if (element instanceof CoincidentClocks) {
				CoincidentClocks v = (CoincidentClocks) element;
				node.setText(v.getVertexLabel());
				Color color = v.getEdgeColor(null);
				node.setBorderColor(color);

				Label fig = new Label(v.getLongVertexLabel());
				node.setTooltip(fig);
			}
		}

	}

	private ObjectGrph<CoincidentClocks, Edge> _og = new ObjectGrph<CoincidentClocks, Edge>();
	private Graph _g;
	private GraphViewer _gv = null;

	public Grph4zest(ObjectGrph<CoincidentClocks, Edge> g, Composite parent) {
		this(parent);
		setGrph( g);
	}

	public Grph4zest(Composite parent) {
		_gv = new GraphViewer(parent, SWT.NONE);
		_g = _gv.getGraphControl();
		_gv.setLabelProvider(new LabellingProvider());
		_gv.setContentProvider(new GraphContentProvider());
		_gv.addFilter(new ClockTreeFilter());
	}

	public void setGrph(ObjectGrph<CoincidentClocks, Edge> g) {
		dispose();
		_og = g;
		_gv.setInput(g);	
	}

	public ObjectGrph<CoincidentClocks, Edge> getGrph() {
		return _og;
	}

	public Graph getZestGraph() {
		return _g;
	}

	@Override
	public GraphViewer getZoomableViewer() {
		return _gv;
	}

	public void dispose() {
		try {
			_gv.setInput(new Object());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*	public void createVertex(){

			for(CoincidentClocks v : _og.vertexSet()){
			//	_gv.addNode(v);
				
				GraphNode n = new GraphNode(_g, SWT.NONE, v.getVertexLabel());
				Color color =  v.getEdgeColor(_d);
				n.setBorderColor(color);
				
				Label fig = new Label(v.getLongVertexLabel());
				n.setTooltip(fig);
				_gNodes.put(v, n);
				_listItem.add(n);
			}
		}
		
		public void createEdges(){
			for(Edge e : _og.edgeSet()){
				
				CoincidentClocks dest= _og.getEdgeTarget(e);
				CoincidentClocks source= _og.getEdgeSource(e);
				//_gv.addRelationship(e, source, dest);
				GraphConnection c = new GraphConnection(_g, SWT.NONE, _gNodes.get(source), _gNodes.get(dest));
				
				Color color = e.getColor(_d);
				c.setLineColor(color);
				c.setConnectionStyle(Graphics.LINE_DASH);
				c.setText(e.getLabel());
				c.setWeight(e.getSize());
				_gEdges.put(e,c);
				_listItem.add(0,c);
			}
		}*/

}