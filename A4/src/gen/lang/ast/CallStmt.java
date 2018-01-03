/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
package lang.ast;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
/**
 * @ast node
 * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/lang.ast:15
 * @production CallStmt : {@link Stmt} ::= <span class="component">{@link FunctionExpr}</span>;

 */
public class CallStmt extends Stmt implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/PrettyPrint.jrag:51
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(ind);
		getFunctionExpr().prettyPrint(out, ind);
		out.print(";\n");
	}
  /**
   * @aspect Visitor
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/Visitor.jrag:67
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public CallStmt() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
    children = new ASTNode[1];
  }
  /**
   * @declaredat ASTNode:13
   */
  public CallStmt(FunctionExpr p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:17
   */
  protected int numChildren() {
    return 1;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:21
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:25
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:29
   */
  public CallStmt clone() throws CloneNotSupportedException {
    CallStmt node = (CallStmt) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public CallStmt copy() {
    try {
      CallStmt node = (CallStmt) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:53
   */
  @Deprecated
  public CallStmt fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:63
   */
  public CallStmt treeCopyNoTransform() {
    CallStmt tree = (CallStmt) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:83
   */
  public CallStmt treeCopy() {
    CallStmt tree = (CallStmt) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:97
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the FunctionExpr child.
   * @param node The new node to replace the FunctionExpr child.
   * @apilevel high-level
   */
  public void setFunctionExpr(FunctionExpr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the FunctionExpr child.
   * @return The current node used as the FunctionExpr child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="FunctionExpr")
  public FunctionExpr getFunctionExpr() {
    return (FunctionExpr) getChild(0);
  }
  /**
   * Retrieves the FunctionExpr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the FunctionExpr child.
   * @apilevel low-level
   */
  public FunctionExpr getFunctionExprNoTransform() {
    return (FunctionExpr) getChildNoTransform(0);
  }
  /**
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:29
   * @apilevel internal
   */
  public Type Define_expectedType(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getFunctionExprNoTransform()) {
      // @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:35
      return intType();
    }
    else {
      return getParent().Define_expectedType(this, _callerNode);
    }
  }
  protected boolean canDefine_expectedType(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
}
