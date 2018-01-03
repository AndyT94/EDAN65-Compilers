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
 * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/Interpreter.jrag:30
 */
public class ReturnException extends Exception {
  
		private int value;

  
	
		public ReturnException(int value) {
			super();
			this.value = value;
		}

  
		
		public int getValue() {
			return value;
		}


}
