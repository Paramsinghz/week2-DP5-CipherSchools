import java.util.*;
import java.io.*;

class Subset {
    static void subs(String s, String curr, int i) {
        if (i == s.length()) {
            System.out.println(curr);
            return;
        }

        subs(s, curr, i + 1);
        subs(s, curr + s.charAt(i), i + 1);
    }

    public static void main(String[] args) {

        subs("AB", "", 0);
    }
}