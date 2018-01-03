package lang;
import lang.ast.LangParser;
import lang.ast.LangScanner;
import static lang.ast.LangParser.Terminals.*;

public class RDP extends RDPTemplate {

	public void parseProgram() {
		statement();
	}

	private void statement() {
		int currAct = peek();
		switch(currAct) {
			case LangParser.Terminals.ID: 
				assignment();
			break;
			case LangParser.Terminals.FOR:
				forStmt();
			break;
			case LangParser.Terminals.IF:
				ifStmt();
			break;
		default: error("Statement Error");
		}
	}

	private void forStmt() {
		accept();
		accept(LangParser.Terminals.ID);
		accept(LangParser.Terminals.ASSIGN);
		expr();
		accept(LangParser.Terminals.UNTIL);
		expr();
		accept(LangParser.Terminals.DO);
		statement();
		accept(LangParser.Terminals.OD);
	}

	private void ifStmt() {
		accept();
		expr();
		accept(LangParser.Terminals.THEN);
		statement();
		accept(LangParser.Terminals.FI);
	}

	private void assignment() {
		accept();
		accept(LangParser.Terminals.ASSIGN);
		expr();
	}

	private void expr() {
		int currAct = peek();
		switch(currAct) {
			case LangParser.Terminals.ID: accept(); break;
			case LangParser.Terminals.NUMERAL: accept(); break;
			case LangParser.Terminals.NOT: 
				accept();
				expr();
			break;
		default: error("Expr Error");
		}
	}
}
