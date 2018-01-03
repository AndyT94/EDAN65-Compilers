package tests;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class ParseTests extends AbstractTestSuite {
	public ParseTests() {
		super("testfiles/parser");// where test input files are
	}

	@Test
	public void oneEmptyFunction() {
		testValidSyntax("oneEmptyFunction.lang");
	}
	
	@Test
	public void twoEmptyFunction() {
		testValidSyntax("twoEmptyFunctions.lang");
	}

	@Test
	public void oneUsefulFunction() {
		testValidSyntax("oneUsefulFunction.lang");
	}

	@Test
	public void oneDecl() {
		testValidSyntax("oneDecl.lang");
	}
	
	@Test
	public void twoDecl() {
		testValidSyntax("twoDecl.lang");
	}
	
	@Test
	public void oneAssign() {
		testValidSyntax("oneAssign.lang");
	}
	
	@Test
	public void testAddId() {
		testValidSyntax("testAddId.lang");
	}
	
	@Test
	public void testAddNum() {
		testValidSyntax("testAddNum.lang");
	}
	
	@Test
	public void testAddMany() {
		testValidSyntax("testAddMany.lang");
	}
	
	@Test
	public void testAddMix() {
		testValidSyntax("testAddMix.lang");
	}
	
	@Test
	public void testMulId() {
		testValidSyntax("testMulId.lang");
	}
	
	@Test
	public void testMulNum() {
		testValidSyntax("testMulNum.lang");
	}
	
	@Test
	public void testMulMany() {
		testValidSyntax("testMulMany.lang");
	}
	
	@Test
	public void testMulMix() {
		testValidSyntax("testMulMix.lang");
	}
	
	@Test
	public void MulAndAdd() {
		testValidSyntax("MulAndAdd.lang");
	}
	
	@Test
	public void minusMany() {
		testValidSyntax("minusMany.lang");
	}
	
	@Test
	public void minusMul() {
		testValidSyntax("minusMul.lang");
	}
	
	@Test
	public void divMany() {
		testValidSyntax("divMany.lang");
	}
	
	@Test
	public void modMul() {
		testValidSyntax("modMany.lang");
	}
	
	@Test
	public void simpleWhile() {
		testValidSyntax("simpleWhile.lang");
	}
	
	@Test
	public void doubleWhile() {
		testValidSyntax("doubleWhile.lang");
	}
	
	@Test
	public void returnNum() {
		testValidSyntax("return.lang");
	}
	
	@Test
	public void returnID() {
		testValidSyntax("returnID.lang");
	}
	
	@Test
	public void conditions() {
		testValidSyntax("conditions.lang");
	}
	
	@Test
	public void noElseif() {
		testValidSyntax("noelseif.lang");
	}
	
	@Test
	public void onlyIf() {
		testValidSyntax("onlyif.lang");
	}
	@Test
	public void withInput() {
		testValidSyntax("withInput.lang");
	}
	@Test
	
	public void twoInput() {
		testValidSyntax("twoInput.lang");
	}
	
	@Test
	public void assignFunction() {
		testValidSyntax("read.lang");
	}
	
	@Test
	public void assignFunctionSub() {
		testValidSyntax("assignFunctionSub.lang");
	}

	@Test
	public void lessequalgreat() {
		testValidSyntax("lessequalANDgreatequal.lang");
	}
	
	@Test
	public void lrPAR() {
		testValidSyntax("lrPAR.lang");
	}
	
	@Test
	public void printVar() {
		testValidSyntax("printvar.lang");
	}
	
	@Test
	public void printFunction() {
		testValidSyntax("printfunction.lang");
	}
	
	@Test
	public void declAss() {
		testValidSyntax("declAss.lang");
	}
	
	@Test
	public void simpliC() {
		testValidSyntax("simpliC.lang");
	}
	
	@Test
	public void SimpliC() {
		testValidSyntax("SimpliC.lang");
	}
	
	@Test
	public void noIntDeclFunction() {
		testSyntaxError("noIntDeclFunction.lang");
	}
	
	@Test
	public void noendBracket() {
		testSyntaxError("noendBracket.lang");
	}
	
	@Test
	public void ifAss() {
		testValidSyntax("ifass.lang");
	}
	@Test
	public void callStmt() {
		testValidSyntax("callStmt.lang");
	}
}
