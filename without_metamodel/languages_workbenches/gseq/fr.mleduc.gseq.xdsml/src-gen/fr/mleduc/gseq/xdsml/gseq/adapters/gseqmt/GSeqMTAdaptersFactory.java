package fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.MethodAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.MethodCallAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.OperationAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.PrintAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.ProgramAdapter;
import gseq.Method;
import gseq.MethodCall;
import gseq.Operation;
import gseq.Print;
import gseq.Program;
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
}
