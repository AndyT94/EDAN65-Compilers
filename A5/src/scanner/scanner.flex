package lang.ast; // The generated scanner will belong to the package lang.ast

import lang.ast.LangParser.Terminals; // The terminals are implicitly defined in the parser
import lang.ast.LangParser.SyntaxError;

%%

// define the signature for the generated scanner
%public
%final
%class LangScanner
%extends beaver.Scanner

// the interface between the scanner and the parser is the nextToken() method
%type beaver.Symbol 
%function nextToken 

// store line and column information in the tokens
%line
%column

// this code will be inlined in the body of the generated scanner class
%{
  private beaver.Symbol sym(short id) {
    return new beaver.Symbol(id, yyline + 1, yycolumn + 1, yylength(), yytext());
  }
%}

// macros
WhiteSpace = [ ] | \t | \f | \n | \r
ID = [a-zA-Z]+([0-9]+)?
NUMERAL = [0-9]+ ("." [0-9]+)?
COMMENT = \/\/[\x20-\x7E\t\f]+
%%

// discard whitespace information
{WhiteSpace}  { }

// token definitions
","         { return sym(Terminals.COMMA); }
"int"		{ return sym(Terminals.INT); }
"boolean"	{ return sym(Terminals.BOOLEAN); }
"while"		{ return sym(Terminals.WHILE); }
"else"		{ return sym(Terminals.ELSE); }
"if"		{ return sym(Terminals.IF); }
"return"	{ return sym(Terminals.RETURN); }
"="			{ return sym(Terminals.ASSIGN); }
"=="		{ return sym(Terminals.EQUAL); }
"!="		{ return sym(Terminals.NOTEQUAL); }
"<="		{ return sym(Terminals.LESSEQUAL); }
">="		{ return sym(Terminals.GREATEQUAL); }
"<"			{ return sym(Terminals.LESSER); }
">"			{ return sym(Terminals.GREATER); }
"+"			{ return sym(Terminals.PLUS); }
"-"			{ return sym(Terminals.MINUS); }
"*"			{ return sym(Terminals.MUL); }
"/"			{ return sym(Terminals.DIV); }
"%"			{ return sym(Terminals.MOD); }
"("           { return sym(Terminals.LPAR); }
")"           { return sym(Terminals.RPAR); }
"{"           { return sym(Terminals.LBRACKET); }
"}"           { return sym(Terminals.RBRACKET); }
{ID}          { return sym(Terminals.ID); }
{NUMERAL}	{ return sym(Terminals.NUMERAL); }
";"			{return sym(Terminals.SEMICOLON);}
{COMMENT}	{ }
<<EOF>>       { return sym(Terminals.EOF); }

/* error fallback */
[^]           { throw new SyntaxError("Illegal character <"+yytext()+">"); }
