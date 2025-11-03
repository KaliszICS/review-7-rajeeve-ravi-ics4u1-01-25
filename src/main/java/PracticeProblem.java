public class PracticeProblem {

	public static void main(String args[]) {

	}
    // Method 1: Return "Even" or "Odd"
    public static String evenOrOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method 2: Return "Teacher" or "Student"
    public static String teacherOrStudent(String name) {
        if (name.equals("Kalisz")) {
            return "Teacher";
        } else {
            return "Student";
        }
    }

    // Method 3: Farther from zero
    public static int fartherFromZero(int num) {
        if (num > 0) {
            return num + 5;
        } else if (num < 0) {
            return num - 5;
        } else {
            return 0;
        }
    }

    // Method 4: Check if number is five
    public static String isFive(int num) {
        if (num == 5) {
            return "The number is Five";
        } else {
            return "The number is not Five";
        }
    }

    // Method 5: Check if number is positive or negative
    public static String positiveOrNegative(double num) {
        if (num > 0) {
            return "Positive";
        } else {
            return "Negative";
        }
    }

    // Method 6: Check if number is high or low
    public static String highOrLow(int num) {
        if (num > 100) {
            return "High";
        } else {
            return "Low";
        }
    }

    // Method 7: Check if word is Hello
    public static String isHello(String word) {
        if (word.equals("Hello")) {
            return "The word is Hello";
        } else {
            return "The word is not Hello";
        }
    }

}
