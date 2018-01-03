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
 * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/lang.ast:2
 * @production Function : {@link ASTNode} ::= <span class="component">{@link Type}</span> <span class="component">{@link Id_decl}</span> <span class="component">{@link Params}</span> <span class="component">{@link Block}</span>;

 */
public class Function extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/PrettyPrint.jrag:15
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
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/Visitor.jrag:52
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
    children = new ASTNode[4];
  }
  /**
   * @declaredat ASTNode:13
   */
  public Function(Type p0, Id_decl p1, Params p2, Block p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:20
   */
  protected int numChildren() {
    return 4;
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
  public Function clone() throws CloneNotSupportedException {
    Function node = (Function) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
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
   * @declaredat ASTNode:56
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
   * @declaredat ASTNode:66
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
   * @declaredat ASTNode:86
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
   * @declaredat ASTNode:100
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Type child.
   * @param node The new node to replace the Type child.
   * @apilevel high-level
   */
  public void setType(Type node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Type child.
   * @return The current node used as the Type child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Type")
  public Type getType() {
    return (Type) getChild(0);
  }
  /**
   * Retrieves the Type child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Type child.
   * @apilevel low-level
   */
  public Type getTypeNoTransform() {
    return (Type) getChildNoTransform(0);
  }
  /**
   * Replaces the Id_decl child.
   * @param node The new node to replace the Id_decl child.
   * @apilevel high-level
   */
  public void setId_decl(Id_decl node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Id_decl child.
   * @return The current node used as the Id_decl child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Id_decl")
  public Id_decl getId_decl() {
    return (Id_decl) getChild(1);
  }
  /**
   * Retrieves the Id_decl child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Id_decl child.
   * @apilevel low-level
   */
  public Id_decl getId_declNoTransform() {
    return (Id_decl) getChildNoTransform(1);
  }
  /**
   * Replaces the Params child.
   * @param node The new node to replace the Params child.
   * @apilevel high-level
   */
  public void setParams(Params node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the Params child.
   * @return The current node used as the Params child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Params")
  public Params getParams() {
    return (Params) getChild(2);
  }
  /**
   * Retrieves the Params child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Params child.
   * @apilevel low-level
   */
  public Params getParamsNoTransform() {
    return (Params) getChildNoTransform(2);
  }
  /**
   * Replaces the Block child.
   * @param node The new node to replace the Block child.
   * @apilevel high-level
   */
  public void setBlock(Block node) {
    setChild(node, 3);
  }
  /**
   * Retrieves the Block child.
   * @return The current node used as the Block child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Block")
  public Block getBlock() {
    return (Block) getChild(3);
  }
  /**
   * Retrieves the Block child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Block child.
   * @apilevel low-level
   */
  public Block getBlockNoTransform() {
    return (Block) getChildNoTransform(3);
  }
/** @apilevel internal */
protected java.util.Set localLookup_String_visited;
  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/NameAnalysis.jrag:56
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/NameAnalysis.jrag:56")
  public Id_decl localLookup(String name) {
    Object _parameters = name;
    if (localLookup_String_visited == null) localLookup_String_visited = new java.util.HashSet(4);
    if (localLookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Function.localLookup(String).");
    }
    localLookup_String_visited.add(_parameters);
    try {
    		Params par = getParams();
    		for(int i = 0; i < par.getNumId_decl();i++) {
    			Id_decl decl = par.getId_decl(i);
    			if(decl.getID().equals(name)) {
    				return decl;
    			}
    		}
    		return unknownDecl();
    	}
    finally {
      localLookup_String_visited.remove(_parameters);
    }
  }
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/NameAnalysis.jrag:45
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/NameAnalysis.jrag:45")
  public Id_decl lookup(String name) {
    Object _parameters = name;
    if (lookup_String_visited == null) lookup_String_visited = new java.util.HashSet(4);
    if (lookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Function.lookup(String).");
    }
    lookup_String_visited.add(_parameters);
    Id_decl lookup_String_value = getParent().Define_lookup(this, null, name);
    lookup_String_visited.remove(_parameters);
    return lookup_String_value;
  }
/** @apilevel internal */
protected java.util.Set lookup_String_visited;
  /**
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/NameAnalysis.jrag:8
   * @apilevel internal
   */
  public Id_decl Define_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    if (_callerNode == getParamsNoTransform()) {
      // @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/NameAnalysis.jrag:53
      {
      		return localLookup(name);
      	}
    }
    else if (_callerNode == getBlockNoTransform()) {
      // @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/NameAnalysis.jrag:49
      {
      		Id_decl decl = localLookup(name);
      		return !decl.isUnknown() ? decl : lookup(name);
      	}
    }
    else if (_callerNode == getId_declNoTransform()) {
      // @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/NameAnalysis.jrag:46
      {
      		return lookup(name);
      	}
    }
    else {
      return getParent().Define_lookup(this, _callerNode, name);
    }
  }
  protected boolean canDefine_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    return true;
  }
  /**
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:58
   * @apilevel internal
   */
  public boolean Define_isFunction(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getId_declNoTransform()) {
      // @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:60
      return true;
    }
    else {
      return getParent().Define_isFunction(this, _callerNode);
    }
  }
  protected boolean canDefine_isFunction(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:69
   * @apilevel internal
   */
  public Function Define_function(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getId_declNoTransform()) {
      // @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:70
      return this;
    }
    else {
      return getParent().Define_function(this, _callerNode);
    }
  }
  protected boolean canDefine_function(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
}
