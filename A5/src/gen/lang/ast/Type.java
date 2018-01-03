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
 * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/lang.ast:38
 * @production Type : {@link ASTNode};

 */
public abstract class Type extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Type() {
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
  public Type clone() throws CloneNotSupportedException {
    Type node = (Type) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:36
   */
  @Deprecated
  public abstract Type fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:44
   */
  public abstract Type treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:52
   */
  public abstract Type treeCopy();
  /**
   * @attribute syn
   * @aspect ErrorContributions
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/Errors.jrag:74
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ErrorContributions", declaredAt="/h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/Errors.jrag:74")
  public abstract String toString();
/** @apilevel internal */
protected java.util.Set compatibleType_Type_visited;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/TypeAnalysis.jrag:37
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/TypeAnalysis.jrag:37")
  public boolean compatibleType(Type t) {
    Object _parameters = t;
    if (compatibleType_Type_visited == null) compatibleType_Type_visited = new java.util.HashSet(4);
    if (compatibleType_Type_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Type.compatibleType(Type).");
    }
    compatibleType_Type_visited.add(_parameters);
    try {
    		return this.equals(t)||isUnknownType()|| t.isUnknownType();
    	}
    finally {
      compatibleType_Type_visited.remove(_parameters);
    }
  }
/** @apilevel internal */
protected boolean isUnknownType_visited = false;
  /**
   * @attribute syn
   * @aspect UnknownType
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/UnknownType.jrag:7
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="UnknownType", declaredAt="/h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/UnknownType.jrag:7")
  public boolean isUnknownType() {
    if (isUnknownType_visited) {
      throw new RuntimeException("Circular definition of attribute Type.isUnknownType().");
    }
    isUnknownType_visited = true;
    boolean isUnknownType_value = false;
    isUnknownType_visited = false;
    return isUnknownType_value;
  }
/** @apilevel internal */
protected boolean isIntType_visited = false;
  /**
   * @attribute syn
   * @aspect IntType
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/UnknownType.jrag:17
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="IntType", declaredAt="/h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/UnknownType.jrag:17")
  public boolean isIntType() {
    if (isIntType_visited) {
      throw new RuntimeException("Circular definition of attribute Type.isIntType().");
    }
    isIntType_visited = true;
    boolean isIntType_value = false;
    isIntType_visited = false;
    return isIntType_value;
  }
/** @apilevel internal */
protected boolean isBoolType_visited = false;
  /**
   * @attribute syn
   * @aspect BoolType
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/UnknownType.jrag:27
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="BoolType", declaredAt="/h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/UnknownType.jrag:27")
  public boolean isBoolType() {
    if (isBoolType_visited) {
      throw new RuntimeException("Circular definition of attribute Type.isBoolType().");
    }
    isBoolType_visited = true;
    boolean isBoolType_value = false;
    isBoolType_visited = false;
    return isBoolType_value;
  }
}
