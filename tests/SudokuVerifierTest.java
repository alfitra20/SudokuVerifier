import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	//@Test
	public void testVerify() {
		fail("Not yet implemented");
	}
	
	@Test
	public void check_rule1_test() {
		SudokuVerifier verifier = new SudokuVerifier();
		String test = "123-456789912345678891234567789123456678912345567891234456789123345678912234567891";
		int check = verifier.verify(test);
		assertEquals("Sudoku", 1, check);
	}
	@Test
	public void check_rule2_sub_content_test() {
		SudokuVerifier verifier = new SudokuVerifier();
		String test = "123556789912345678891234567789123456678912345567891234456789123345678912234567891";
		int check = verifier.verify(test);
		assertEquals("Sudoku",2, check);
	}
	//@Test
	//public void check_rule3_row_test() {
	//	SudokuVerifier verifier = new SudokuVerifier();
	//	String test = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
	//	int check = verifier.verify(test);
	//	assertEquals("Sudoku",3, check);
	//}
	

}
