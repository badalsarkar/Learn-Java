//class can be declared before or after
/*
class Person{
    String name;
    int age;
}
*/

class classExample{
    public static void main(String args[]){
        Person badal= new Person();
        badal.name="Badal";
        badal.age=33;
        System.out.println("The name is : " + badal.name);
        System.out.println("The age is : " + badal.age);
    }
}

class Person{
    String name;
    int age;
}
