package Activities;

// class
public class sumcheck {
	// method
    public static boolean isSumOfTensExactly30(int[] arr) {
    	// Initialization and declaration
        int sum = 0;
        
        // loop of every element in a rray
        for (int num : arr) {
        	// condition 
            if (num == 10) {
                sum += num;
            }
        }
        return sum == 30;
    }
}

