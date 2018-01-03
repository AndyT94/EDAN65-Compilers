package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import lang.ast.ErrorMessage;
import lang.ast.Function;
import lang.ast.Program;

/**
 * Tests name analysis
 */
@RunWith(Parameterized.class)
public class TestFunctionCollection extends AbstractParameterizedTest {
	/**
	 * Directory where test files live
	 */
	private static final String TEST_DIR = "testfiles/functioncollection";

	/**
	 * Construct a new JastAdd test
	 * 
	 * @param filename
	 *            filename of test input file
	 */
	public TestFunctionCollection(String filename) {
		super(TEST_DIR, filename);
	}

	/**
	 * Run the JastAdd test
	 */
	@Test
	public void runTest() throws Exception {
		Program program = (Program) parse(inFile);
		StringBuilder sb = new StringBuilder();
		for (Function f : program.getFunctionList()) {
			for (Function fu : f.functionCollections()) {
				sb.append(f.getId_decl().getID() + " -> " + (fu.getId_decl().getID()));
				sb.append("\n");
			}
		}

		for (Function f : program.getFunctionList()) {
			for (String s : f.stringCollections()) {
				sb.append(s + "\n");

			}
		}
		compareOutput(sb.toString(), outFile, expectedFile);
	}

	@SuppressWarnings("javadoc")
	@Parameters(name = "{0}")
	public static Iterable<Object[]> getTests() {
		return getTestParameters(TEST_DIR);
	}
}
