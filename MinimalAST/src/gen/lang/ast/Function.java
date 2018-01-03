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
 * @declaredat /h/d1/t/dat13aol/edan65/A1-CalcParse/MinimalAST/src/jastadd/lang.ast:2
 * @production Function : {@link ASTNode} ::= <span class="component">{@link Id_decl}</span> <span class="component">{@link Params}</span> <span class="component">{@link Block}</span>;

 */
public class Function extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d1/t/dat13aol/edan65/A1-CalcParse/MinimalAST/src/jastadd/PrettyPrint.jrag:15
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print("int ");
		getId_decl().prettyPrint(out, ind);
		out.print("(");
		getParams().prettyPrint(out, ind);
		out.print(") ");
		getBlock().prettyPrint(out, ind);
		out.print("\n\n");
	}
  /**
   * @aspect Visitor
   * @declaredat /h/d1/t/dat13aol/edan65/A1-CalcParse/MinimalAST/src/jastadd/Visitor.jrag:52
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Function() {
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
  }
  /**
   * @declaredat ASTNode:13
   */
  public Function(Id_decl p0, Params p1, Block p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:19
   */
  protected int numChildren() {
    return 3;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:23
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:27
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public Function clone() throws CloneNotSupportedException {
    Function node = (Function) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public Function copy() {
    try {
      Function node = (Function) clone();
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
   * @declaredat ASTNode:55
   */
  @Deprecated
  public Function fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:65
   */
  public Function treeCopyNoTransform() {
    Function tree = (Function) copy();
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
   * @declaredat ASTNode:85
   */
  public Function treeCopy() {
    Function tree = (Function) copy();
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
   * @declaredat ASTNode:99
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Id_decl child.
   * @param node The new node to replace the Id_decl child.
   * @apilevel high-level
   */
  public void setId_decl(Id_decl node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Id_decl child.
   * @return The current node used as the Id_decl child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Id_decl")
  public Id_decl getId_decl() {
    return (Id_decl) getChild(0);
  }
  /**
   * Retrieves the Id_decl child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Id_decl child.
   * @apilevel low-level
   */
  public Id_decl getId_declNoTransform() {
    return (Id_decl) getChildNoTransform(0);
  }
  /**
   * Replaces the Params child.
   * @param node The new node to replace the Params child.
   * @apilevel high-level
   */
  public void setParams(Params node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Params child.
   * @return The current node used as the Params child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Params")
  public Params getParams() {
    return (Params) getChild(1);
  }
  /**
   * Retrieves the Params child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Params child.
   * @apilevel low-level
   */
  public Params getParamsNoTransform() {
    return (Params) getChildNoTransform(1);
  }
  /**
   * Replaces the Block child.
   * @param node The new node to replace the Block child.
   * @apilevel high-level
   */
  public void setBlock(Block node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the Block child.
   * @return The current node used as the Block child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Block")
  public Block getBlock() {
    return (Block) getChild(2);
  }
  /**
   * Retrieves the Block child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Block child.
   * @apilevel low-level
   */
  public Block getBlockNoTransform() {
    return (Block) getChildNoTransform(2);
  }
}
