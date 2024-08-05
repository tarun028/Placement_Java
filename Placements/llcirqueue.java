public class llcirqueue {
    static class Queue{
        

        Queue(int n){
            arr=new int[n];
            this.size=n;
        }

        public static boolean isEmpty(){
            return rear ==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        //enqueue
        public static void add(int data){
            if(isFull()){
                System.err.println("full");
                return;
            }
            //first element added
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //dequeue
        public static int remove(int data){
            if(isEmpty()){
                System.err.println("full");
                return -1;
            }
            int result =arr[front];
            
            //single elem
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            
            return result;
        }

        //peek
        public static int peek(int data){
            if(isEmpty()){
                System.err.println("full");
                return -1;
            }
            
            return arr[front];
        }

        public static void main(String[] args) {
            //Queue q= new Queue();

        }
    }
    
}