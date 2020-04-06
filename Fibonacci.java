package project6;

public class Fibonacci {

    //Finish this method: recusrive implemenation of a Fibonacci number generator
    public static long recursiveFib(int n) {

        if (n <= 2) {
            return 1;
        } else {
            return recursiveFib(n - 1) + recursiveFib(n - 2);
        }

    }

    //Finish this method: iterative implemenation of Fibonacci number generator
    public static long iterativeFib(int n) {
        long returnVal;
        if (n <= 2) {
            returnVal = 1;
        } else {
            long olderValue = 1;
            long oldValue = 1;
            long newValue = 1;
            for (int i = 3; i <= n; i++) {
                newValue = oldValue + olderValue;
                olderValue = oldValue;
                oldValue = newValue;
            }
            returnVal = newValue;
        }
        return returnVal;
    }

}

