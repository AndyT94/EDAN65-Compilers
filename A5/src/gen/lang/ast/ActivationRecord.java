package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
/**
 * @ast class
 * @aspect Interpreter
 * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/Interpreter.jrag:6
 */
public class ActivationRecord extends java.lang.Object {
  
	//	private static final ActivationRecord BOTTOM = new ActivationRecord();
		private Map<String, Integer> decls;

  
		private ActivationRecord tail;

  
		
		public ActivationRecord() {
			decls = new HashMap<String, Integer>();
			tail = null;
		}

  
		
		public ActivationRecord(ActivationRecord actrec) {
			decls = new HashMap<String, Integer>();
			tail = actrec;
		}

  
		
		public void put(String name, int value) {
			decls.put(name, value);
		}

  
		
		public int get(String name) {
			return decls.get(name);
		}


}
