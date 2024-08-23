import java.util.*;
public class createHashMap {


    static class HashMap<K,V>{
        
        //genereic - dwhen dont know type
        private class Node{
            K key;
            V value;

            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        //constuctuor - create empty linked list , rightnow its null
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];

            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int bi=key.hashCode();
            return Math.abs(bi) % N;  //abs- positive , remainder se always less than 4
        }

        private int searchInLL(K key,int bi){
            LinkedList<Node> ll = buckets[bi];

            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldbucket[]=buckets;
            buckets=new LinkedList[N*2];

            //make all value null to zero
            for(int i=0;i<N*2;i++){
                buckets[i]=new LinkedList<>();
            }

            for(int i=0;i<oldbucket.length;i++){
                LinkedList<Node> ll=oldbucket[i];

                for(int j=0;j<ll.size();i++){
                    Node node=ll.get(j);
                    put(node.key,node.value);
                }
            }


        }

        
        public void put(K key,V value){ //bi-bucket idx,di - data idx
            int bi=hashFunction(key);
            int di=searchInLL(key,bi); //di=-1

            if(di==-1){ //key dne
                buckets[di].add(new Node(key, value));
                n++;
            }
            else{//key present
                Node node=buckets[bi].get(di);
                node.value=value; 
            }

            double lambda=(double)n/N;

            if(lambda>2.0){
                //rehashing
                rehash();
            }


        }

        public V get(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi); //di=-1

            if(di==-1){ //key dne
                
                return null;
            }
            else{//key present
                Node node=buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containKeys(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi); //di=-1

            if(di==-1){ //key dne
                
                return false;
            }
            else{//key present
                Node node=buckets[bi].get(di);
                return true;
            }
        }

        public V remove(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi); //di=-1

            if(di==-1){ //key dne
                
                return null;
            }
            else{//key present
                Node node=buckets[bi].remove(di);
                return node.value;
            }

        }

        public boolean isEmpty(){
            return n==0;
        }

    }

    
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();

        map.put("india",120);
    }
}
