public class Exercises {

    /*
    HOW TO RUN THIS
    1) cd ~/???/pset8/src
    2) javac Exercises.java
    3) cd ~/???/pset8/test/grader
    4) java -jar grader.jar [exercise name]
    */

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}

		// write your code here
        if ((a[0] == b[0]) || (a[a.length-1] == b[b.length-1])) {
            return true;
        }

		return false;	// default return value to ensure compilation
	}

	public String[] endsMeet(String[] values, int n) {
        if (values == null || n < 0 && values.length < n) {
            return null;
        }

        // write your code here
        String[] combinedString = new String[3];
        combinedString[0] = values[0];
        combinedString[1] = values[n];
        return combinedString;

		// return null; default return value to ensure compilation
	}

	public int difference(int[] numbers) {
        // input verification

        // write your code here
        // code

		return -1;		// default return value to ensure compilation
	}

	public double biggest(double[] numbers) {
        // input verification

        // write your code here
        // code

		return -1;		// default return value to ensure compilation
	}

	public String[] middle(String[] values) {
        // input verification

        // write your code here
        // code

		return null;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
        // input verification

        // write your code here
        // code

		return false;	// default return value to ensure compilation
	}

	public boolean everywhere(int[] numbers, int x) {
        // input verification

        // write your code here
        // code

		return false;	// default return value to ensure compilation
	}

	public boolean consecutive(int[] numbers) {
        // input verification

        // write your code here
        // code

		return false;	// default return value to ensure compilation
	}

	public boolean balance(int[] numbers) {
        // input verification

        // write your code here
        // code

		return false;	// default return value to ensure compilation
	}

	public int clumps(String[] values) {
        // input verification

        // write your code here
        // code

		return -1;		// default return value to ensure compilation
	}
}
