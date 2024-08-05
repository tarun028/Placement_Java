import java.util.*;
public class queueByArray {
    
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;

        Queue(int n){
            arr=new int[n];
            this.size=n;
        }

        public static boolean isEmpty(){
            return rear ==-1;
        }

        //enqueue
        public static void add(int data){
            if(rear==size-1){
                System.err.println("full");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        //dequeue
        public static int remove(int data){
            if(isEmpty()){
                System.err.println("full");
                return -1;
            }
            int front =arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek(int data){
            if(isEmpty()){
                System.err.println("full");
                return -1;
            }
            
            return arr[0];
        }

        public static void main(String[] args) {
            Queue q= new Queue();

        }
    }
}
