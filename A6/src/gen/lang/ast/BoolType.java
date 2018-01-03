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
 * @declaredat /h/d1/l/dat13at1/git/Edan65/A6/src/jastadd/lang.ast:40
 * @production BoolType : {@link Type};

 */
public class BoolType extends Type implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public BoolType() {
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
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:13
   */
  protected int numChildren() {
    return 0;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:17
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:21
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:25
   */
  public BoolType clone() throws CloneNotSupportedException {
    BoolType node = (BoolType) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:30
   */
  public BoolType copy() {
    try {
      BoolType node = (BoolType) clone();
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
   * @declaredat ASTNode:49
   */
  @Deprecated
  public BoolType fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:59
   */
  public BoolType treeCopyNoTransform() {
    BoolType tree = (BoolType) copy();
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
   * @declaredat ASTNode:79
   */
  public BoolType treeCopy() {
    BoolType tree = (BoolType) copy();
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
   * @declaredat ASTNode:93
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
/** @apilevel internal */
protected boolean toString_visited = false;
  /**
   * @attribute syn
   * @aspect ErrorContributions
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A6/src/jastadd/Errors.jrag:74
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ErrorContributions", declaredAt="/h/d1/l/dat13at1/git/Edan65/A6/src/jastadd/Errors.jrag:74")
  public String toString() {
    if (toString_visited) {
      throw new RuntimeException("Circular definition of attribute Type.toString().");
    }
    toString_visited = true;
    String toString_value = "bool";
    toString_visited = false;
    return toString_value;
  }
/** @apilevel internal */
protected boolean isBoolType_visited = false;
  /**
   * @attribute syn
   * @aspect BoolType
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A6/src/jastadd/UnknownType.jrag:27
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="BoolType", declaredAt="/h/d1/l/dat13at1/git/Edan65/A6/src/jastadd/UnknownType.jrag:27")
  public boolean isBoolType() {
    if (isBoolType_visited) {
      throw new RuntimeException("Circular definition of attribute Type.isBoolType().");
    }
    isBoolType_visited = true;
    boolean isBoolType_value = true;
    isBoolType_visited = false;
    return isBoolType_value;
  }
}
