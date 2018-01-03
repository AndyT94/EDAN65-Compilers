/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
package lang.ast;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /h/d1/t/dat13aol/edan65/A1-CalcParse/MinimalAST/src/jastadd/lang.ast:15
 * @production Comment : {@link Stmt} ::= <span class="component">&lt;COMMENT:String&gt;</span>;

 */
public class Comment extends Stmt implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Comment() {
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
  /**
   * @declaredat ASTNode:12
   */
  public Comment(String p0) {
    setCOMMENT(p0);
  }
  /**
   * @declaredat ASTNode:15
   */
  public Comment(beaver.Symbol p0) {
    setCOMMENT(p0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:19
   */
  protected int numChildren() {
    return 0;
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
  public Comment clone() throws CloneNotSupportedException {
    Comment node = (Comment) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public Comment copy() {
    try {
      Comment node = (Comment) clone();
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
  public Comment fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:65
   */
  public Comment treeCopyNoTransform() {
    Comment tree = (Comment) copy();
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
  public Comment treeCopy() {
    Comment tree = (Comment) copy();
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
    return super.is$Equal(node) && (tokenString_COMMENT == ((Comment) node).tokenString_COMMENT);    
  }
  /**
   * Replaces the lexeme COMMENT.
   * @param value The new value for the lexeme COMMENT.
   * @apilevel high-level
   */
  public void setCOMMENT(String value) {
    tokenString_COMMENT = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_COMMENT;
  /**
   */
  public int COMMENTstart;
  /**
   */
  public int COMMENTend;
  /**
   * JastAdd-internal setter for lexeme COMMENT using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme COMMENT
   * @apilevel internal
   */
  public void setCOMMENT(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setCOMMENT is only valid for String lexemes");
    tokenString_COMMENT = (String)symbol.value;
    COMMENTstart = symbol.getStart();
    COMMENTend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme COMMENT.
   * @return The value for the lexeme COMMENT.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="COMMENT")
  public String getCOMMENT() {
    return tokenString_COMMENT != null ? tokenString_COMMENT : "";
  }
}
