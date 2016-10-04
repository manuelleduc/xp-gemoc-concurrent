package gx10.aspects;

import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class Context {
  private final Map<String, Integer> intContext = CollectionLiterals.<String, Integer>newHashMap();
  
  private final Map<String, Boolean> boolContext = CollectionLiterals.<String, Boolean>newHashMap();
  
  private final Context parent;
  
  public Context(final Context parent) {
    this.parent = parent;
  }
  
  public Context() {
    this.parent = null;
  }
  
  public void addInt(final String name, final int value) {
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(this.parent, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _intVarInContext = this.parent.intVarInContext(name);
      _and = _intVarInContext;
    }
    if (_and) {
      this.parent.addInt(name, value);
    } else {
      this.intContext.put(name, Integer.valueOf(value));
    }
  }
  
  public boolean intVarInContext(final String name) {
    boolean _or = false;
    boolean _containsKey = this.intContext.containsKey(name);
    if (_containsKey) {
      _or = true;
    } else {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(this.parent, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _intVarInContext = this.parent.intVarInContext(name);
        _and = _intVarInContext;
      }
      _or = _and;
    }
    return _or;
  }
  
  public boolean boolVarInContext(final String name) {
    boolean _or = false;
    boolean _containsKey = this.boolContext.containsKey(name);
    if (_containsKey) {
      _or = true;
    } else {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(this.parent, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _boolVarInContext = this.parent.boolVarInContext(name);
        _and = _boolVarInContext;
      }
      _or = _and;
    }
    return _or;
  }
  
  public int getInt(final String name) {
    Integer _xifexpression = null;
    boolean _or = false;
    boolean _containsKey = this.intContext.containsKey(name);
    if (_containsKey) {
      _or = true;
    } else {
      boolean _equals = Objects.equal(this.parent, null);
      _or = _equals;
    }
    if (_or) {
      _xifexpression = this.intContext.get(name);
    } else {
      _xifexpression = Integer.valueOf(this.parent.getInt(name));
    }
    return (_xifexpression).intValue();
  }
  
  public void addBool(final String name, final boolean value) {
    boolean _or = false;
    boolean _containsKey = this.boolContext.containsKey(name);
    if (_containsKey) {
      _or = true;
    } else {
      boolean _equals = Objects.equal(this.parent, null);
      _or = _equals;
    }
    if (_or) {
      this.boolContext.get(name);
    } else {
      this.parent.getInt(name);
    }
  }
  
  public boolean getBool(final String name) {
    Boolean _xifexpression = null;
    boolean _or = false;
    boolean _containsKey = this.boolContext.containsKey(name);
    if (_containsKey) {
      _or = true;
    } else {
      boolean _equals = Objects.equal(this.parent, null);
      _or = _equals;
    }
    if (_or) {
      _xifexpression = this.boolContext.get(name);
    } else {
      _xifexpression = Boolean.valueOf(this.parent.getBool(name));
    }
    return (_xifexpression).booleanValue();
  }
}
