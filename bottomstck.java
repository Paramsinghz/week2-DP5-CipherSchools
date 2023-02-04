
import java.util.Stack;

class bottomstck {

    static void insertToBottom(Stack<Integer> S, int N) {

        Stack<Integer> temp = new Stack<>();

        while (!S.empty()) {

            temp.push(S.peek());

            S.pop();
        }

        S.push(N);

        while (!temp.empty()) {

            S.push(temp.peek());

            temp.pop();
        }

        while (!S.empty()) {
            System.out.print(S.peek() + " ");
            S.pop();
        }
    }

    public static void main(String[] args) {

        Stack<Integer> S = new Stack<>();
        S.push(5);
        S.push(4);
        S.push(3);
        S.push(2);
        S.push(1);

        int N = 7;

        insertToBottom(S, N);
    }
}
