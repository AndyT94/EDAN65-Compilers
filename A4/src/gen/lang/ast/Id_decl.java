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
 * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/lang.ast:35
 * @production Id_decl : {@link ASTNode} ::= <span class="component">&lt;ID:String&gt;</span>;

 */
public class Id_decl extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/PrettyPrint.jrag:167
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(getID());
	}
  /**
   * @aspect Visitor
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/Visitor.jrag:118
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Id_decl() {
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
  public Id_decl(String p0) {
    setID(p0);
  }
  /**
   * @declaredat ASTNode:15
   */
  public Id_decl(beaver.Symbol p0) {
    setID(p0);
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
  public Id_decl clone() throws CloneNotSupportedException {
    Id_decl node = (Id_decl) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public Id_decl copy() {
    try {
      Id_decl node = (Id_decl) clone();
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
  public Id_decl fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:65
   */
  public Id_decl treeCopyNoTransform() {
    Id_decl tree = (Id_decl) copy();
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
  public Id_decl treeCopy() {
    Id_decl tree = (Id_decl) copy();
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
    return super.is$Equal(node) && (tokenString_ID == ((Id_decl) node).tokenString_ID);    
  }
  /**
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   */
  public void setID(String value) {
    tokenString_ID = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_ID;
  /**
   */
  public int IDstart;
  /**
   */
  public int IDend;
  /**
   * JastAdd-internal setter for lexeme ID using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme ID
   * @apilevel internal
   */
  public void setID(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setID is only valid for String lexemes");
    tokenString_ID = (String)symbol.value;
    IDstart = symbol.getStart();
    IDend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme ID.
   * @return The value for the lexeme ID.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ID")
  public String getID() {
    return tokenString_ID != null ? tokenString_ID : "";
  }
/** @apilevel internal */
protected boolean isMultiplyDeclared_visited = false;
  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/NameAnalysis.jrag:9
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/NameAnalysis.jrag:9")
  public boolean isMultiplyDeclared() {
    if (isMultiplyDeclared_visited) {
      throw new RuntimeException("Circular definition of attribute Id_decl.isMultiplyDeclared().");
    }
    isMultiplyDeclared_visited = true;
    boolean isMultiplyDeclared_value = lookup(getID()) != this;
    isMultiplyDeclared_visited = false;
    return isMultiplyDeclared_value;
  }
/** @apilevel internal */
protected boolean type_visited = false;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:17
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:17")
  public Type type() {
    if (type_visited) {
      throw new RuntimeException("Circular definition of attribute Id_decl.type().");
    }
    type_visited = true;
    Type type_value = intType();
    type_visited = false;
    return type_value;
  }
/** @apilevel internal */
protected boolean bothVarNFunc_visited = false;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:66
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:66")
  public boolean bothVarNFunc() {
    if (bothVarNFunc_visited) {
      throw new RuntimeException("Circular definition of attribute Id_decl.bothVarNFunc().");
    }
    bothVarNFunc_visited = true;
    boolean bothVarNFunc_value = functionLookup(getID()).isFunction() && this.isVariable();
    bothVarNFunc_visited = false;
    return bothVarNFunc_value;
  }
/** @apilevel internal */
protected java.util.Set sameParams_FunctionExpr_visited;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:74
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:74")
  public boolean sameParams(FunctionExpr f) {
    Object _parameters = f;
    if (sameParams_FunctionExpr_visited == null) sameParams_FunctionExpr_visited = new java.util.HashSet(4);
    if (sameParams_FunctionExpr_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Id_decl.sameParams(FunctionExpr).");
    }
    sameParams_FunctionExpr_visited.add(_parameters);
    try {
    		if(function().getParams().getNumId_decl() == f.getExprs().getNumExpr()){
    			return true;
    		}
    		return false;
    	}
    finally {
      sameParams_FunctionExpr_visited.remove(_parameters);
    }
  }
/** @apilevel internal */
protected boolean isUnknown_visited = false;
  /**
   * @attribute syn
   * @aspect UnknownDecl
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/UnknownDecl.jrag:7
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="UnknownDecl", declaredAt="/h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/UnknownDecl.jrag:7")
  public boolean isUnknown() {
    if (isUnknown_visited) {
      throw new RuntimeException("Circular definition of attribute Id_decl.isUnknown().");
    }
    isUnknown_visited = true;
    boolean isUnknown_value = false;
    isUnknown_visited = false;
    return isUnknown_value;
  }
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/NameAnalysis.jrag:8
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/NameAnalysis.jrag:8")
  public Id_decl lookup(String name) {
    Object _parameters = name;
    if (lookup_String_visited == null) lookup_String_visited = new java.util.HashSet(4);
    if (lookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Id_decl.lookup(String).");
    }
    lookup_String_visited.add(_parameters);
    Id_decl lookup_String_value = getParent().Define_lookup(this, null, name);
    lookup_String_visited.remove(_parameters);
    return lookup_String_value;
  }
/** @apilevel internal */
protected java.util.Set lookup_String_visited;
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/NameAnalysis.jrag:81
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/NameAnalysis.jrag:81")
  public Id_decl functionLookup(String name) {
    Object _parameters = name;
    if (functionLookup_String_visited == null) functionLookup_String_visited = new java.util.HashSet(4);
    if (functionLookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Id_decl.functionLookup(String).");
    }
    functionLookup_String_visited.add(_parameters);
    Id_decl functionLookup_String_value = getParent().Define_functionLookup(this, null, name);
    functionLookup_String_visited.remove(_parameters);
    return functionLookup_String_value;
  }
/** @apilevel internal */
protected java.util.Set functionLookup_String_visited;
  /**
   * @attribute inh
   * @aspect TypeAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:57
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:57")
  public boolean isVariable() {
    if (isVariable_visited) {
      throw new RuntimeException("Circular definition of attribute Id_decl.isVariable().");
    }
    isVariable_visited = true;
    boolean isVariable_value = getParent().Define_isVariable(this, null);
    isVariable_visited = false;
    return isVariable_value;
  }
/** @apilevel internal */
protected boolean isVariable_visited = false;
  /**
   * @attribute inh
   * @aspect TypeAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:58
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:58")
  public boolean isFunction() {
    if (isFunction_visited) {
      throw new RuntimeException("Circular definition of attribute Id_decl.isFunction().");
    }
    isFunction_visited = true;
    boolean isFunction_value = getParent().Define_isFunction(this, null);
    isFunction_visited = false;
    return isFunction_value;
  }
/** @apilevel internal */
protected boolean isFunction_visited = false;
  /**
   * @attribute inh
   * @aspect TypeAnalysis
   * @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:69
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/TypeAnalysis.jrag:69")
  public Function function() {
    if (function_visited) {
      throw new RuntimeException("Circular definition of attribute Id_decl.function().");
    }
    function_visited = true;
    Function function_value = getParent().Define_function(this, null);
    function_visited = false;
    return function_value;
  }
/** @apilevel internal */
protected boolean function_visited = false;
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/Errors.jrag:38
    if (isMultiplyDeclared()) {
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
    // @declaredat /h/d1/l/dat13at1/git/Edan65/A4/src/jastadd/Errors.jrag:62
    if (bothVarNFunc()) {
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
    if (isMultiplyDeclared()) {
      collection.add(error("symbol '" + getID() + "' is already declared!"));
    }
    if (bothVarNFunc()) {
      collection.add(error("symbol '" + getID() + "' is both function and variable"));
    }
  }
}
