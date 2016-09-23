package fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.AndAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.AssignAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.BooleanExpressionAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.ConstAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.EqualityAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.FalseAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.IfAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.IntegerExpressionAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.MethodAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.MethodCallAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.NotAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.OperationAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.PrintAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.PrintableAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.ProgramAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.TrueAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.VarAdapter;
import gseq.And;
import gseq.Assign;
import gseq.BooleanExpression;
import gseq.Const;
import gseq.Equality;
import gseq.False;
import gseq.If;
import gseq.IntegerExpression;
import gseq.Method;
import gseq.MethodCall;
import gseq.Not;
import gseq.Operation;
import gseq.Print;
import gseq.Printable;
import gseq.Program;
import gseq.True;
import gseq.Var;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class GSeqMTAdaptersFactory implements AdaptersFactory {
  private static GSeqMTAdaptersFactory instance;
  
  public static GSeqMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public GSeqMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof gseq.Program){
    	return createProgramAdapter((gseq.Program) o, res);
    }
    if (o instanceof gseq.Method){
    	return createMethodAdapter((gseq.Method) o, res);
    }
    if (o instanceof gseq.Print){
    	return createPrintAdapter((gseq.Print) o, res);
    }
    if (o instanceof gseq.MethodCall){
    	return createMethodCallAdapter((gseq.MethodCall) o, res);
    }
    if (o instanceof gseq.If){
    	return createIfAdapter((gseq.If) o, res);
    }
    if (o instanceof gseq.True){
    	return createTrueAdapter((gseq.True) o, res);
    }
    if (o instanceof gseq.False){
    	return createFalseAdapter((gseq.False) o, res);
    }
    if (o instanceof gseq.Equality){
    	return createEqualityAdapter((gseq.Equality) o, res);
    }
    if (o instanceof gseq.Not){
    	return createNotAdapter((gseq.Not) o, res);
    }
    if (o instanceof gseq.And){
    	return createAndAdapter((gseq.And) o, res);
    }
    if (o instanceof gseq.Const){
    	return createConstAdapter((gseq.Const) o, res);
    }
    if (o instanceof gseq.Var){
    	return createVarAdapter((gseq.Var) o, res);
    }
    if (o instanceof gseq.Assign){
    	return createAssignAdapter((gseq.Assign) o, res);
    }
    
    return null;
  }
  
  public ProgramAdapter createProgramAdapter(final Program adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.ProgramAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.ProgramAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.ProgramAdapter) adapter;
    }
  }
  
  public MethodAdapter createMethodAdapter(final Method adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.MethodAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.MethodAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.MethodAdapter) adapter;
    }
  }
  
  public OperationAdapter createOperationAdapter(final Operation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.OperationAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.OperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.OperationAdapter) adapter;
    }
  }
  
  public PrintAdapter createPrintAdapter(final Print adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.PrintAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.PrintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.PrintAdapter) adapter;
    }
  }
  
  public MethodCallAdapter createMethodCallAdapter(final MethodCall adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.MethodCallAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.MethodCallAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.MethodCallAdapter) adapter;
    }
  }
  
  public BooleanExpressionAdapter createBooleanExpressionAdapter(final BooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.BooleanExpressionAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.BooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.BooleanExpressionAdapter) adapter;
    }
  }
  
  public IfAdapter createIfAdapter(final If adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.IfAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.IfAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.IfAdapter) adapter;
    }
  }
  
  public TrueAdapter createTrueAdapter(final True adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.TrueAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.TrueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.TrueAdapter) adapter;
    }
  }
  
  public FalseAdapter createFalseAdapter(final False adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.FalseAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.FalseAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.FalseAdapter) adapter;
    }
  }
  
  public EqualityAdapter createEqualityAdapter(final Equality adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.EqualityAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.EqualityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.EqualityAdapter) adapter;
    }
  }
  
  public NotAdapter createNotAdapter(final Not adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.NotAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.NotAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.NotAdapter) adapter;
    }
  }
  
  public AndAdapter createAndAdapter(final And adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.AndAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.AndAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.AndAdapter) adapter;
    }
  }
  
  public IntegerExpressionAdapter createIntegerExpressionAdapter(final IntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.IntegerExpressionAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.IntegerExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.IntegerExpressionAdapter) adapter;
    }
  }
  
  public ConstAdapter createConstAdapter(final Const adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.ConstAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.ConstAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.ConstAdapter) adapter;
    }
  }
  
  public VarAdapter createVarAdapter(final Var adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.VarAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.VarAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.VarAdapter) adapter;
    }
  }
  
  public AssignAdapter createAssignAdapter(final Assign adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.AssignAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.AssignAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.AssignAdapter) adapter;
    }
  }
  
  public PrintableAdapter createPrintableAdapter(final Printable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.PrintableAdapter) adapter;
    else {
    	adapter = new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.PrintableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.PrintableAdapter) adapter;
    }
  }
}
