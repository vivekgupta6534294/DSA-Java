package Oops;

public class constructor {
    public static class Person{
        int age;
        String name;
        void saysHi(){
            System.out.println(name + age + " says hi");
        }
        //Default Constructor 
        // if we forget to make a constructor class will automatically make it 
        Person(){
            //constructor name should be same as of class
        }
        //Parametrized constructor 
        Person(int age,String name){
            this.age=age;
            this.name=name;
        }
        
    }
    public static void main(String[] args) {
        Person p1=new Person();
        p1.age=10;
        p1.name="A";
        p1.saysHi();
        Person p2=new Person();
        p2.age=20;
        p2.name="B";
        p2.saysHi();
        Person p3=new Person(30,"C");
        p3.saysHi();
    }
    
    
}
