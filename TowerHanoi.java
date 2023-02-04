import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

class TowerHanoi {
    static void toh(int n, char A, char B, char C, int count)

    {

        if (n == 1) {
            System.out.println("Move Disc 1 from " + A + " to " + C);
            return;

        }
        toh(n - 1, A, C, B, count++);
        System.out.println("Move Disc " + n + " from " + A + " to " + C);
        toh(n - 1, B, A, C, count++);

        System.out.println("No of Operations : " + ++count);

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter No of Plates : ");
        int neww = s.nextInt();
        int count = 0;
        toh(neww, 'A', 'B', 'C', count);

        