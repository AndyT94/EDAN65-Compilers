/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
package lang.ast;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.HashSet;
/**
 * @ast node
 * @declaredat /h/d1/t/dat13aol/edan65/A1-CalcParse/MinimalAST/src/jastadd/lang.ast:12
 * @production If : {@link Stmt} ::= <span class="component">{@link Expr}</span> <span class="component">If:{@link Block}</span> <span class="component">[Else:{@link Block}]</span>;

 */
public class If extends Stmt implements Cloneable {
  /**
   * @aspect NameAnalysis
   * @declaredat /h/d1/t/dat13aol/edan65/A1-CalcParse/MinimalAST/src/jastadd/NameAnalysis.jrag:86
   */
  public void checkNames(PrintStream err, SymbolTable symbols) {
		getExpr().checkNames(err, symbols); //
		getIf().checkNames(err, symbols.push()); 
		if(hasElse()) {
			getElse().checkNames(err, symbols.push());
		}
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d1/t/dat13aol/edan65/A1-CalcParse/MinimalAST/src/jastadd/PrettyPrint.jrag:81
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(ind + "if(");
		getExpr().prettyPrint(out, ind);
		out.print(") ");
		getChild(1).prettyPrint(out, ind);
		if(hasElse()) {
			out.print(" else ");
			getElse().prettyPrint(out , ind);
		}
		out.print("\n");
	}
  /**
   * @aspect Visitor
   * @declaredat /h/d1/t/dat13aol/edan65/A1-CalcParse/MinimalAST/src/jastadd/Visitor.jrag:58
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public If() {
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
    children = new ASTNode[3];
    setChild(new Opt(), 2);
  }
  /**
   * @declaredat ASTNode:14
   */
  public If(Expr p0, Block p1, Opt<Block> p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:20
   */
  protected int numChildren() {
    return 3;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:24
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public If clone() throws CloneNotSupportedException {
    If node = (If) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public If copy() {
    try {
      If node = (If) clone();
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
   * @declaredat ASTNode:56
   */
  @Deprecated
  public If fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:66
   */
  public If treeCopyNoTransform() {
    If tree = (If) copy();
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
   * @declaredat ASTNode:86
   */
  public If treeCopy() {
    If tree = (If) copy();
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
   * @declaredat ASTNode:100
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Expr child.
   * @param node The new node to replace the Expr child.
   * @apilevel high-level
   */
  public void setExpr(Expr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Expr child.
   * @return The current node used as the Expr child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Expr")
  public Expr getExpr() {
    return (Expr) getChild(0);
  }
  /**
   * Retrieves the Expr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Expr child.
   * @apilevel low-level
   */
  public Expr getExprNoTransform() {
    return (Expr) getChildNoTransform(0);
  }
  /**
   * Replaces the If child.
   * @param node The new node to replace the If child.
   * @apilevel high-level
   */
  public void setIf(Block node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the If child.
   * @return The current node used as the If child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="If")
  public Block getIf() {
    return (Block) getChild(1);
  }
  /**
   * Retrieves the If child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the If child.
   * @apilevel low-level
   */
  public Block getIfNoTransform() {
    return (Block) getChildNoTransform(1);
  }
  /**
   * Replaces the optional node for the Else child. This is the <code>Opt</code>
   * node containing the child Else, not the actual child!
   * @param opt The new node to be used as the optional node for the Else child.
   * @apilevel low-level
   */
  public void setElseOpt(Opt<Block> opt) {
    setChild(opt, 2);
  }
  /**
   * Replaces the (optional) Else child.
   * @param node The new node to be used as the Else child.
   * @apilevel high-level
   */
  public void setElse(Block node) {
    getElseOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Else child exists.
   * @return {@code true} if the optional Else child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasElse() {
    return getElseOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Else child.
   * @return The Else child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Block getElse() {
    return (Block) getElseOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Else child. This is the <code>Opt</code> node containing the child Else, not the actual child!
   * @return The optional node for child the Else child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Else")
  public Opt<Block> getElseOpt() {
    return (Opt<Block>) getChild(2);
  }
  /**
   * Retrieves the optional node for child Else. This is the <code>Opt</code> node containing the child Else, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Else.
   * @apilevel low-level
   */
  public Opt<Block> getElseOptNoTransform() {
    return (Opt<Block>) getChildNoTransform(2);
  }
}
