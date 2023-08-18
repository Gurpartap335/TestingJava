package junit.testing;

public class Basics {

    public int compare(int n1, int n2) {
        if (n1 > n2) {
            return 1;
        } else if (n1 < n2) {
            return -1;
        } else {
            return 0;
        }
    }

    public String compare2(int n1, int n2) {
        if (n1 > n2) {
            return "First number is greater";
        } else if (n1 < n2) {
            return "Second number is greater";
        } else {
            return "Both are equal";
        }
    }
}
