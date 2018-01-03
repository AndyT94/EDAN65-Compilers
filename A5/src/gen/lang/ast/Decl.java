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
 * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/lang.ast:7
 * @production Decl : {@link Stmt} ::= <span class="component">{@link Type}</span> <span class="component">{@link Id_decl}</span> <span class="component">[{@link Expr}]</span>;

 */
public class Decl extends Stmt implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/Interpreter.jrag:68
   */
  public void eval(ActivationRecord actrec) {
			if(hasExpr()) {
				actrec.put(getId_decl().uniqueName(), getExpr().eval(actrec));
			}else{
				actrec.put(getId_decl().uniqueName(), 0);
			}
		}
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/PrettyPrint.jrag:57
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(ind + "int ");
		getId_decl().prettyPrint(out, ind);
		if(hasExpr()) {
			out.print(" = ");
			getExpr().prettyPrint(out, ind);
		}
		out.println(";");
	}
  /**
   * @aspect Visitor
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/Visitor.jrag:61
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Decl() {
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
  public Decl(Type p0, Id_decl p1, Opt<Expr> p2) {
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
  public Decl clone() throws CloneNotSupportedException {
    Decl node = (Decl) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public Decl copy() {
    try {
      Decl node = (Decl) clone();
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
  public Decl fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:66
   */
  public Decl treeCopyNoTransform() {
    Decl tree = (Decl) copy();
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
  public Decl treeCopy() {
    Decl tree = (Decl) copy();
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
   * Replaces the optional node for the Expr child. This is the <code>Opt</code>
   * node containing the child Expr, not the actual child!
   * @param opt The new node to be used as the optional node for the Expr child.
   * @apilevel low-level
   */
  public void setExprOpt(Opt<Expr> opt) {
    setChild(opt, 2);
  }
  /**
   * Replaces the (optional) Expr child.
   * @param node The new node to be used as the Expr child.
   * @apilevel high-level
   */
  public void setExpr(Expr node) {
    getExprOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Expr child exists.
   * @return {@code true} if the optional Expr child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasExpr() {
    return getExprOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Expr child.
   * @return The Expr child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Expr getExpr() {
    return (Expr) getExprOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Expr child. This is the <code>Opt</code> node containing the child Expr, not the actual child!
   * @return The optional node for child the Expr child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Expr")
  public Opt<Expr> getExprOpt() {
    return (Opt<Expr>) getChild(2);
  }
  /**
   * Retrieves the optional node for child Expr. This is the <code>Opt</code> node containing the child Expr, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Expr.
   * @apilevel low-level
   */
  public Opt<Expr> getExprOptNoTransform() {
    return (Opt<Expr>) getChildNoTransform(2);
  }
/** @apilevel internal */
protected java.util.Set localLookup_String_visited;
  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/NameAnalysis.jrag:27
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/NameAnalysis.jrag:27")
  public Id_decl localLookup(String name) {
    Object _parameters = name;
    if (localLookup_String_visited == null) localLookup_String_visited = new java.util.HashSet(4);
    if (localLookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Decl.localLookup(String).");
    }
    localLookup_String_visited.add(_parameters);
    Id_decl localLookup_String_value = getId_decl().getID().equals(name) ? getId_decl() : unknownDecl();
    localLookup_String_visited.remove(_parameters);
    return localLookup_String_value;
  }
/** @apilevel internal */
protected boolean compatibleTypes_visited = false;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/TypeAnalysis.jrag:43
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/TypeAnalysis.jrag:43")
  public boolean compatibleTypes() {
    if (compatibleTypes_visited) {
      throw new RuntimeException("Circular definition of attribute Decl.compatibleTypes().");
    }
    compatibleTypes_visited = true;
    try {
    		if(hasExpr()) {
    			return getExpr().expectedType().compatibleType(getExpr().type());
    		}
    		return true;
    	}
    finally {
      compatibleTypes_visited = false;
    }
  }
  /**
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/TypeAnalysis.jrag:29
   * @apilevel internal
   */
  public Type Define_expectedType(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getExprOptNoTransform()) {
      // @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/TypeAnalysis.jrag:34
      return intType();
    }
    else {
      return getParent().Define_expectedType(this, _callerNode);
    }
  }
  protected boolean canDefine_expectedType(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/TypeAnalysis.jrag:57
   * @apilevel internal
   */
  public boolean Define_isVariable(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getId_declNoTransform()) {
      // @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/TypeAnalysis.jrag:61
      return true;
    }
    else {
      return getParent().Define_isVariable(this, _callerNode);
    }
  }
  protected boolean canDefine_isVariable(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /h/d1/l/dat13at1/git/Edan65/A5/src/jastadd/Errors.jrag:50
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
      collection.add(error(getId_decl().getID() + " is not compatible. IDType: " + getId_decl().type() + " ExprType: " + getExpr().type()));
    }
  }
}
