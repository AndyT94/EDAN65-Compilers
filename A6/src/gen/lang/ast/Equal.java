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
 * @declaredat /h/d1/l/dat13at1/git/Edan65/A6/src/jastadd/lang.ast:28
 * @production Equal : {@link BinExpr};

 */
public class Equal extends BinExpr implements Cloneable {
  /**
   * @aspect CodeGen
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A6/src/jastadd/CodeGen.jrag:243
   */
  public void genCode(PrintStream out) {
		getLeft().genCode(out);
		out.println("\t pushq %rax");
		getRight().genCode(out);
		out.println("\t movq %rax, %rbx");
		out.println("\t popq %rax");
		out.println("\t cmpq %rbx, %rax");
		out.print("\t jne ");
		
	}
  /**
   * @aspect Interpreter
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A6/src/jastadd/Interpreter.jrag:162
   */
  public int eval(ActivationRecord actrec) {
			return (getLeft().eval(actrec) == getRight().eval(actrec)) ? 1 : 0;
		}
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A6/src/jastadd/PrettyPrint.jrag:123
   */
  public void prettyPrint(PrintStream out, String ind) {
		getLeft().prettyPrint(out, ind);
		out.print(" == ");
		getRight().prettyPrint(out, ind);
	}
  /**
   * @aspect Visitor
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A6/src/jastadd/Visitor.jrag:97
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Equal() {
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
  public Equal(Expr p0, Expr p1) {
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
  public Equal clone() throws CloneNotSupportedException {
    Equal node = (Equal) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public Equal copy() {
    try {
      Equal node = (Equal) clone();
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
  public Equal fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:64
   */
  public Equal treeCopyNoTransform() {
    Equal tree = (Equal) copy();
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
  public Equal treeCopy() {
    Equal tree = (Equal) copy();
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
   * Replaces the Left child.
   * @param node The new node to replace the Left child.
   * @apilevel high-level
   */
  public void setLeft(Expr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Left child.
   * @return The current node used as the Left child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Left")
  public Expr getLeft() {
    return (Expr) getChild(0);
  }
  /**
   * Retrieves the Left child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Left child.
   * @apilevel low-level
   */
  public Expr getLeftNoTransform() {
    return (Expr) getChildNoTransform(0);
  }
  /**
   * Replaces the Right child.
   * @param node The new node to replace the Right child.
   * @apilevel high-level
   */
  public void setRight(Expr node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Right child.
   * @return The current node used as the Right child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Right")
  public Expr getRight() {
    return (Expr) getChild(1);
  }
  /**
   * Retrieves the Right child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Right child.
   * @apilevel low-level
   */
  public Expr getRightNoTransform() {
    return (Expr) getChildNoTransform(1);
  }
/** @apilevel internal */
protected boolean type_visited = false;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A6/src/jastadd/TypeAnalysis.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A6/src/jastadd/TypeAnalysis.jrag:3")
  public Type type() {
    if (type_visited) {
      throw new RuntimeException("Circular definition of attribute Expr.type().");
    }
    type_visited = true;
    Type type_value = boolType();
    type_visited = false;
    return type_value;
  }
}
