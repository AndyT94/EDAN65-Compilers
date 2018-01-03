package lang;

import lang.ast.*;


public class MSNVisitor extends TraversingVisitor{

	private static int MSNDepth = 0;
	private static int MSNCurrent = 0;
	
	public static int result(ASTNode n) {
		MSNDepth = MSNCurrent = 0;
		MSNVisitor v = new MSNVisitor();
		n.accept(v, null);
		return MSNDepth;
	}
	
	private void updateMSNDepth() {
		if(MSNCurrent >= MSNDepth) {
			MSNCurrent++;
			MSNDepth = MSNCurrent;
		} else {
			MSNCurrent++;
		}
	}
	
	@Override
	public Object visit(Function node, Object data) {
		updateMSNDepth();
		visitChildren(node, data);
		MSNCurrent--;
		return data;
	}
	
	@Override
	public Object visit(While node, Object data) {
		updateMSNDepth();
		visitChildren(node, data);
		MSNCurrent--;
		return data;
	}
	
	@Override
	public Object visit(If node, Object data) {
		updateMSNDepth();
		visitChildren(node, data);
		MSNCurrent--;
		return data;
	}
}
