import java.io.*;
import java.util.*;
import static java.lang.System.out;

class SubsSum {
    static int fun(int arr[], int n, int sum) {
        if (n == 0)
            return sum == 0 ? 1 : 0;

        return fun(arr, n - 1, sum) + fun(arr, n - 1, sum - arr[n - 1]);
    }

    public static void main(String[] args) {
        int n = 3, arr[] = { 10, 20, 15 }, sum = 25;
        System.out.println(fun(arr, n, sum));
    }
}