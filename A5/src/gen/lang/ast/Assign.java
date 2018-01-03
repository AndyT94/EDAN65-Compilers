/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
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
 * @ast node
 * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/lang.ast:9
 * @production Assign : {@link Stmt} ::= <span class="component">{@link Id_use}</span> <span class="component">{@link Expr}</span>;

 */
public class Assign extends Stmt implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/Interpreter.jrag:76
   */
  public void eval(ActivationRecord actrec) {
			actrec.put(getId_use().decl().uniqueName(), getExpr().eval(actrec));
		}
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/PrettyPrint.jrag:43
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(ind);
		getId_use().prettyPrint(out, ind);
		out.print(" = ");
		getExpr().prettyPrint(out, ind);
		out.println(";");
	}
  /**
   * @aspect Visitor
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/Visitor.jrag:70
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Assign() {
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
    children = new ASTNode[2];
  }
  /**
   * @declaredat ASTNode:13
   */
  public Assign(Id_use p0, Expr p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:18
   */
  protected int numChildren() {
    return 2;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:22
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:26
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:30
   */
  public Assign clone() throws CloneNotSupportedException {
    Assign node = (Assign) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public Assign copy() {
    try {
      Assign node = (Assign) clone();
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
   * @declaredat ASTNode:54
   */
  @Deprecated
  public Assign fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:64
   */
  public Assign treeCopyNoTransform() {
    Assign tree = (Assign) copy();
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
   * @declaredat ASTNode:84
   */
  public Assign treeCopy() {
    Assign tree = (Assign) copy();
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
   * @declaredat ASTNode:98
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Id_use child.
   * @param node The new node to replace the Id_use child.
   * @apilevel high-level
   */
  public void setId_use(Id_use node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Id_use child.
   * @return The current node used as the Id_use child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Id_use")
  public Id_use getId_use() {
    return (Id_use) getChild(0);
  }
  /**
   * Retrieves the Id_use child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Id_use child.
   * @apilevel low-level
   */
  public Id_use getId_useNoTransform() {
    return (Id_use) getChildNoTransform(0);
  }
  /**
   * Replaces the Expr child.
   * @param node The new node to replace the Expr child.
   * @apilevel high-level
   */
  public void setExpr(Expr node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Expr child.
   * @return The current node used as the Expr child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Expr")
  public Expr getExpr() {
    return (Expr) getChild(1);
  }
  /**
   * Retrieves the Expr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Expr child.
   * @apilevel low-level
   */
  public Expr getExprNoTransform() {
    return (Expr) getChildNoTransform(1);
  }
/** @apilevel internal */
protected boolean compatibleTypes_visited = false;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/TypeAnalysis.jrag:41
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/TypeAnalysis.jrag:41")
  public boolean compatibleTypes() {
    if (compatibleTypes_visited) {
      throw new RuntimeException("Circular definition of attribute Assign.compatibleTypes().");
    }
    compatibleTypes_visited = true;
    boolean compatibleTypes_value = getExpr().expectedType().compatibleType(getExpr().type());
    compatibleTypes_visited = false;
    return compatibleTypes_value;
  }
  /**
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/TypeAnalysis.jrag:29
   * @apilevel internal
   */
  public Type Define_expectedType(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getExprNoTransform()) {
      // @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/TypeAnalysis.jrag:33
      return intType();
    }
    else {
      return getParent().Define_expectedType(this, _callerNode);
    }
  }
  protected boolean canDefine_expectedType(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/Errors.jrag:46
    if (!compatibleTypes()) {
      {
        Program target = (Program) (program());
        java.util.Set<ASTNode> contributors = _map.get(target);
        if (contributors == null) {
          contributors = new java.util.LinkedHashSet<ASTNode>();
          _map.put((ASTNode) target, contributors);
        }
        contributors.add(this);
      }
    }
    super.collect_contributors_Program_errors(_root, _map);
  }
  protected void contributeTo_Program_errors(Set<ErrorMessage> collection) {
    super.contributeTo_Program_errors(collection);
    if (!compatibleTypes()) {
      collection.add(error(getId_use().getID() + " is not compatible. IDType: " + getId_use().type() + " ExprType: " + getExpr().type()));
    }
  }
}
