
class Parent{
    protected int number=10;


    public Parent(){
    };

};


class Child extends Parent{

    public Child(){
        super();
    
    }

    public void print(){
        System.out.println(number);
    }
}



public class AccessModifier{
    public static void main(String [] args){
        Child newObject=new Child();
        newObject.print();
    }
}


