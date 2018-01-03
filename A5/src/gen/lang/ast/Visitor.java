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
 * @ast interface
 * @aspect Visitor
 * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/Visitor.jrag:6
 */
public interface Visitor {

		 
		public Object visit(Exprs node, Object data);

		 
		public Object visit(FunctionExpr node, Object data);

		 
		public Object visit(Function node, Object data);

		 
		public Object visit(Params node, Object data);

		 
		public Object visit(Block node, Object data);

		 
		public Object visit(While node, Object data);

		 
		public Object visit(If node, Object data);

		 
		public Object visit(Decl node, Object data);

		 
		public Object visit(Return node, Object data);

		 
		public Object visit(CallStmt node, Object data);

		 
		public Object visit(Assign node, Object data);
	
		 	
		public Object visit(List node, Object data);

		 
		public Object visit(Opt node, Object data);

		 
		public Object visit(Program node, Object data);

		 
		public Object visit(Mul node, Object data);

		 
		public Object visit(Div node, Object data);

		 
		public Object visit(Mod node, Object data);

		 
		public Object visit(Add node, Object data);

		 
		public Object visit(Sub node, Object data);

		 
		public Object visit(Equal node, Object data);

		 
		public Object visit(NotEqual node, Object data);

		 
		public Object visit(Greater node, Object data);

		 
		public Object visit(Lesser node, Object data);

		 
		public Object visit(LessEqual node, Object data);

		 
		public Object visit(GreatEqual node, Object data);

		 
		public Object visit(Numeral node, Object data);

		 
		public Object visit(Id_decl node, Object data);

		 
		public Object visit(Id_use node, Object data);
}
