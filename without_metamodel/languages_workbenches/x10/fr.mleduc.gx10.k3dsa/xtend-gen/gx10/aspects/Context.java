package gx10.aspects;

import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class Context {
  private Map<String, Integer> intContext = CollectionLiterals.<String, Integer>newHashMap();
  
  public void addInt(final String name, final int value) {
    this.intContext.put(name, Integer.valueOf(value));
  }
  
  public int getInt(final String name) {
    return (this.intContext.get(name)).intValue();
  }
}
