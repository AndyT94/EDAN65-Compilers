package tests;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class ParseTests extends AbstractTestSuite {
	public ParseTests() {
		super("testfiles");// where test input files are
	}

	@Test
	public void allConstructs() {
		testValidSyntax("minS.calc");
	}

	@Test
	public void shortestProgram() {
		testValidSyntax("shortMin.calc");
	}

	@Test 
	public void numerical() {
		testSyntaxError("parseError.calc");
	}

	@Test
	public void error() {
		testSyntaxError("scanError.calc");
	}

	@Test
	public void integer() {
		testValidSyntax("integer.calc");
	}
}
