import java.util.*;

class Josephus {
    static int jos(int n, int k) {
        if (n == 1) {
            return 0;
        }

        return ((jos(n - 1, k)) + k) % n;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter values for n and k : ");
        int j = s.nextInt();
        int o = s.nextInt();

        System.out.println("The Survivor is : ");
        System.out.println(jos(j, o) + 1);

    }
}