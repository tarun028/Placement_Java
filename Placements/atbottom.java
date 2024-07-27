import java.util.*;

public class atbottom {

    public static void pushAtBot(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.add(4);
        }
        int top=s.pop();
        pushAtBot(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);

        pushAtBot(s, 4);


        while(!s.empty()){
            System.out.println(s.pop());
        }

    }
}
