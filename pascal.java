public class pascal {

    static void pascaltriangle(int numRows) {
        int divi = 0;
        int arr[] = new int[numRows];

        for (int r = 0; r < numRows - 1; r++) {
            divi = (fact(numRows - r)) * (fact(r));
            arr[r] = (fact(numRows)) / divi;
        }

        for (int i = 0; i < numRows; i++) {
            System.out.println(arr[i]);
        }

    }

    static int fact(int n) {

        if (n == 1) {
            return 1;
        }

        return n * fact(n - 1);
    }

    public static void main(String[] args) {

        int numRows = 5;
        pascaltriangle(numRows);

    }
}
