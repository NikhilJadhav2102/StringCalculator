package Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorShould {

    @Test
    public void empty_string_should_return_0() {
    	
    	//first test for the string numbers
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    public void string_with_Two_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }
    

    @Test
    public void testNewLine(){
    	//second test for new line
        StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(6, stringCalculator.add("1\n2,3"));
    }
    

    @Test
    public void testDifferntDelimiter(){
    	
    	//test for the differnt dilimiter
        StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(3, stringCalculator.add("//;\n1;2"));
    }
    
    
    //test for the negative number
    @Test
    public void testNegativeNumver(){
        StringCalculator stringCalculator = new StringCalculator();
    	
    	try {
    		stringCalculator.add("-1,2");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -1");
		}

		try {
			stringCalculator.add("2,-4,3,-5");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
		}
    }
    
    
}
