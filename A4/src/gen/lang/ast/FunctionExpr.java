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
 * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/lang.ast:20
 * @production FunctionExpr : {@link Expr} ::= <span class="component">{@link Id_use}</span> <span class="component">{@link Exprs}</span>;

 */
public class FunctionExpr extends Expr implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/PrettyPrint.jrag:171
   */
  public void prettyPrint(PrintStream out, String ind) {
		getId_use().prettyPrint(out, ind);
		out.print("(");
		getExprs().prettyPrint(out, ind);
		out.print(")");
	}
  /**
   * @aspect Visitor
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/Visitor.jrag:43
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public FunctionExpr() {
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
  public FunctionExpr(Id_use p0, Exprs p1) {
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
  public FunctionExpr clone() throws CloneNotSupportedException {
    FunctionExpr node = (FunctionExpr) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public FunctionExpr copy() {
    try {
      FunctionExpr node = (FunctionExpr) clone();
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
  public FunctionExpr fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:64
   */
  public FunctionExpr treeCopyNoTransform() {
    FunctionExpr tree = (FunctionExpr) copy();
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
  public FunctionExpr treeCopy() {
    FunctionExpr tree = (FunctionExpr) copy();
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
   * Replaces the Exprs child.
   * @param node The new node to replace the Exprs child.
   * @apilevel high-level
   */
  public void setExprs(Exprs node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Exprs child.
   * @return The current node used as the Exprs child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Exprs")
  public Exprs getExprs() {
    return (Exprs) getChild(1);
  }
  /**
   * Retrieves the Exprs child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Exprs child.
   * @apilevel low-level
   */
  public Exprs getExprsNoTransform() {
    return (Exprs) getChildNoTransform(1);
  }
/** @apilevel internal */
protected boolean type_visited = false;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:3")
  public Type type() {
    if (type_visited) {
      throw new RuntimeException("Circular definition of attribute Expr.type().");
    }
    type_visited = true;
    Type type_value = getId_use().type();
    type_visited = false;
    return type_value;
  }
/** @apilevel internal */
protected boolean hasAllParam_visited = false;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:72
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:72")
  public boolean hasAllParam() {
    if (hasAllParam_visited) {
      throw new RuntimeException("Circular definition of attribute FunctionExpr.hasAllParam().");
    }
    hasAllParam_visited = true;
    boolean hasAllParam_value = getId_use().decl().sameParams(this);
    hasAllParam_visited = false;
    return hasAllParam_value;
  }
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/Errors.jrag:66
    if (!hasAllParam()) {
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
    if (!hasAllParam()) {
      collection.add(error("Param numbers does not match"));
    }
  }
}
