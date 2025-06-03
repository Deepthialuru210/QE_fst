package Activities;


//Main class with main method and exceptionTest method
public class TestCustomException {

 // Method that throws CustomException if input is null
 public static void exceptionTest(String value) throws CustomException {
     if (value == null) {
         throw new CustomException("CustomException: Input string is null");
     } else {
         System.out.println(value);
     }
 }

 public static void main(String[] args) {
     try {
    	 TestCustomException.exceptionTest("Will print to console");
    	 TestCustomException.exceptionTest(null); // This will throw the exception
     } catch (CustomException e) {
         System.out.println("Caught an exception: " + e.getMessage());
     }
 }
}
