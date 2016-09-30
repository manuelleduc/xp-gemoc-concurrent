package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.AndAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.AsyncAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BlockAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BoolExpressionAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BoolVarAccessAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BoolVarAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.ControlStructureAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.ExpressionAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.FalseAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.FinishAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IfAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntConstAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntExpressionAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntVarAccessAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntVarAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.MethodAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.MethodCallAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.NotAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.PlusAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.PrintAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.ProgramAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.StatementAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.TrueAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.WhileAdapter;
import gx10.And;
import gx10.Async;
import gx10.Block;
import gx10.BoolExpression;
import gx10.BoolVar;
import gx10.BoolVarAccess;
import gx10.ControlStructure;
import gx10.Expression;
import gx10.False;
import gx10.Finish;
import gx10.If;
import gx10.IntConst;
import gx10.IntExpression;
import gx10.IntVar;
import gx10.IntVarAccess;
import gx10.Method;
import gx10.MethodCall;
import gx10.Not;
import gx10.Plus;
import gx10.Print;
import gx10.Program;
import gx10.Statement;
import gx10.True;
import gx10.While;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class GX10MTAdaptersFactory implements AdaptersFactory {
  private static GX10MTAdaptersFactory instance;
  
  public static GX10MTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public GX10MTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof gx10.Program){
    	return createProgramAdapter((gx10.Program) o, res);
    }
    if (o instanceof gx10.Method){
    	return createMethodAdapter((gx10.Method) o, res);
    }
    if (o instanceof gx10.Block){
    	return createBlockAdapter((gx10.Block) o, res);
    }
    if (o instanceof gx10.If){
    	return createIfAdapter((gx10.If) o, res);
    }
    if (o instanceof gx10.While){
    	return createWhileAdapter((gx10.While) o, res);
    }
    if (o instanceof gx10.True){
    	return createTrueAdapter((gx10.True) o, res);
    }
    if (o instanceof gx10.False){
    	return createFalseAdapter((gx10.False) o, res);
    }
    if (o instanceof gx10.Not){
    	return createNotAdapter((gx10.Not) o, res);
    }
    if (o instanceof gx10.And){
    	return createAndAdapter((gx10.And) o, res);
    }
    if (o instanceof gx10.IntConst){
    	return createIntConstAdapter((gx10.IntConst) o, res);
    }
    if (o instanceof gx10.Plus){
    	return createPlusAdapter((gx10.Plus) o, res);
    }
    if (o instanceof gx10.Async){
    	return createAsyncAdapter((gx10.Async) o, res);
    }
    if (o instanceof gx10.MethodCall){
    	return createMethodCallAdapter((gx10.MethodCall) o, res);
    }
    if (o instanceof gx10.Finish){
    	return createFinishAdapter((gx10.Finish) o, res);
    }
    if (o instanceof gx10.Print){
    	return createPrintAdapter((gx10.Print) o, res);
    }
    if (o instanceof gx10.BoolVar){
    	return createBoolVarAdapter((gx10.BoolVar) o, res);
    }
    if (o instanceof gx10.IntVar){
    	return createIntVarAdapter((gx10.IntVar) o, res);
    }
    if (o instanceof gx10.IntVarAccess){
    	return createIntVarAccessAdapter((gx10.IntVarAccess) o, res);
    }
    if (o instanceof gx10.BoolVarAccess){
    	return createBoolVarAccessAdapter((gx10.BoolVarAccess) o, res);
    }
    
    return null;
  }
  
  public ProgramAdapter createProgramAdapter(final Program adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.ProgramAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.ProgramAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.ProgramAdapter) adapter;
    }
  }
  
  public MethodAdapter createMethodAdapter(final Method adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.MethodAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.MethodAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.MethodAdapter) adapter;
    }
  }
  
  public BlockAdapter createBlockAdapter(final Block adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BlockAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BlockAdapter) adapter;
    }
  }
  
  public StatementAdapter createStatementAdapter(final Statement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.StatementAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.StatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.StatementAdapter) adapter;
    }
  }
  
  public ControlStructureAdapter createControlStructureAdapter(final ControlStructure adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.ControlStructureAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.ControlStructureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.ControlStructureAdapter) adapter;
    }
  }
  
  public IntExpressionAdapter createIntExpressionAdapter(final IntExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntExpressionAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntExpressionAdapter) adapter;
    }
  }
  
  public BoolExpressionAdapter createBoolExpressionAdapter(final BoolExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BoolExpressionAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BoolExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BoolExpressionAdapter) adapter;
    }
  }
  
  public IfAdapter createIfAdapter(final If adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IfAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IfAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IfAdapter) adapter;
    }
  }
  
  public WhileAdapter createWhileAdapter(final While adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.WhileAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.WhileAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.WhileAdapter) adapter;
    }
  }
  
  public TrueAdapter createTrueAdapter(final True adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.TrueAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.TrueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.TrueAdapter) adapter;
    }
  }
  
  public FalseAdapter createFalseAdapter(final False adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.FalseAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.FalseAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.FalseAdapter) adapter;
    }
  }
  
  public NotAdapter createNotAdapter(final Not adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.NotAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.NotAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.NotAdapter) adapter;
    }
  }
  
  public AndAdapter createAndAdapter(final And adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.AndAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.AndAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.AndAdapter) adapter;
    }
  }
  
  public IntConstAdapter createIntConstAdapter(final IntConst adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntConstAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntConstAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntConstAdapter) adapter;
    }
  }
  
  public PlusAdapter createPlusAdapter(final Plus adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.PlusAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.PlusAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.PlusAdapter) adapter;
    }
  }
  
  public AsyncAdapter createAsyncAdapter(final Async adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.AsyncAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.AsyncAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.AsyncAdapter) adapter;
    }
  }
  
  public MethodCallAdapter createMethodCallAdapter(final MethodCall adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.MethodCallAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.MethodCallAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.MethodCallAdapter) adapter;
    }
  }
  
  public ExpressionAdapter createExpressionAdapter(final Expression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.ExpressionAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.ExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.ExpressionAdapter) adapter;
    }
  }
  
  public FinishAdapter createFinishAdapter(final Finish adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.FinishAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.FinishAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.FinishAdapter) adapter;
    }
  }
  
  public PrintAdapter createPrintAdapter(final Print adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.PrintAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.PrintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.PrintAdapter) adapter;
    }
  }
  
  public BoolVarAdapter createBoolVarAdapter(final BoolVar adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BoolVarAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BoolVarAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BoolVarAdapter) adapter;
    }
  }
  
  public IntVarAdapter createIntVarAdapter(final IntVar adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntVarAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntVarAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntVarAdapter) adapter;
    }
  }
  
  public IntVarAccessAdapter createIntVarAccessAdapter(final IntVarAccess adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntVarAccessAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntVarAccessAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntVarAccessAdapter) adapter;
    }
  }
  
  public BoolVarAccessAdapter createBoolVarAccessAdapter(final BoolVarAccess adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BoolVarAccessAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BoolVarAccessAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BoolVarAccessAdapter) adapter;
    }
  }
}
