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
 * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/lang.ast:3
 * @production Params : {@link ASTNode} ::= <span class="component">{@link Id_decl}*</span>;

 */
public class Params extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/PrettyPrint.jrag:25
   */
  public void prettyPrint(PrintStream out, String ind) {
		for(int i = 0; i < getChild(0).getNumChild(); i++) {
			out.print("int ");
			getChild(0).getChild(i).prettyPrint(out, ind);
			if(i < getChild(0).getNumChild() - 1) {
				out.print(", ");
			}
		}
	}
  /**
   * @aspect Visitor
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/Visitor.jrag:49
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Params() {
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
    setChild(new List(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  public Params(List<Id_decl> p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:18
   */
  protected int numChildren() {
    return 1;
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
  public Params clone() throws CloneNotSupportedException {
    Params node = (Params) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public Params copy() {
    try {
      Params node = (Params) clone();
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
  public Params fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:64
   */
  public Params treeCopyNoTransform() {
    Params tree = (Params) copy();
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
  public Params treeCopy() {
    Params tree = (Params) copy();
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
   * Replaces the Id_decl list.
   * @param list The new list node to be used as the Id_decl list.
   * @apilevel high-level
   */
  public void setId_declList(List<Id_decl> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Id_decl list.
   * @return Number of children in the Id_decl list.
   * @apilevel high-level
   */
  public int getNumId_decl() {
    return getId_declList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Id_decl list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Id_decl list.
   * @apilevel low-level
   */
  public int getNumId_declNoTransform() {
    return getId_declListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Id_decl list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Id_decl list.
   * @apilevel high-level
   */
  public Id_decl getId_decl(int i) {
    return (Id_decl) getId_declList().getChild(i);
  }
  /**
   * Check whether the Id_decl list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasId_decl() {
    return getId_declList().getNumChild() != 0;
  }
  /**
   * Append an element to the Id_decl list.
   * @param node The element to append to the Id_decl list.
   * @apilevel high-level
   */
  public void addId_decl(Id_decl node) {
    List<Id_decl> list = (parent == null) ? getId_declListNoTransform() : getId_declList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addId_declNoTransform(Id_decl node) {
    List<Id_decl> list = getId_declListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Id_decl list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setId_decl(Id_decl node, int i) {
    List<Id_decl> list = getId_declList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Id_decl list.
   * @return The node representing the Id_decl list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Id_decl")
  public List<Id_decl> getId_declList() {
    List<Id_decl> list = (List<Id_decl>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Id_decl list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Id_decl list.
   * @apilevel low-level
   */
  public List<Id_decl> getId_declListNoTransform() {
    return (List<Id_decl>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the Id_decl list without
   * triggering rewrites.
   */
  public Id_decl getId_declNoTransform(int i) {
    return (Id_decl) getId_declListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Id_decl list.
   * @return The node representing the Id_decl list.
   * @apilevel high-level
   */
  public List<Id_decl> getId_decls() {
    return getId_declList();
  }
  /**
   * Retrieves the Id_decl list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Id_decl list.
   * @apilevel low-level
   */
  public List<Id_decl> getId_declsNoTransform() {
    return getId_declListNoTransform();
  }
}
