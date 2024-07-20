class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write");
    }
    public void colorPrint(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void Info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}




public class OOPs {
    public static void main(String[] args) {
        //object
        // Pen pen1=new Pen();
        // pen1.color="blue";
        // pen1.type="gel";

        // pen1.write();
        // Pen pen2= new Pen();
        // pen2.color="black";
        // pen2.type="ball";
        // pen1.colorPrint();
        // pen2.colorPrint();
        Student s1= new Student("tarun", 23);
    }
}
