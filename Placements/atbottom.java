import java.util.*;

public class atbottom {

    public static void pushAtBot(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.add(data);
        }
        int top=s.pop();
        pushAtBot(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.empty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushAtBot(s, top);

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);

        reverse(s);

    }
}
