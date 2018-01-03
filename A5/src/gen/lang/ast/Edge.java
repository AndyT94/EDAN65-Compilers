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
 * @aspect FunctionCollection
 * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/FunctionCollection.jrag:5
 */
public class Edge extends java.lang.Object implements Comparable<Edge> {
  
			protected Function firstFunction;

  
			protected Function secondFunction;

  
			protected String message;

  
			
		public Edge(String message) {
			this.firstFunction = null;
			this.secondFunction = null;
			this.message = message;
		}

  
			
		public Edge(Function first, Function second) {
			this.firstFunction = first;
			this.secondFunction = second;
			this.message = first.getId_decl().getID() + " -> " + second.getId_decl().getID();
		}

  
		
		public int compareTo(Edge other) {
			return (firstFunction == other.firstFunction && secondFunction == other.secondFunction)? 0 : -1;
		}

  
		
		public String toString() {
			return message;
		}

  
		public Function getFirst(){
			return firstFunction;
		}

  
		
		public Function getSecond(){
			return secondFunction;
		}

  
		
		public boolean contains(Function f){
			return f==secondFunction;
		}


}
