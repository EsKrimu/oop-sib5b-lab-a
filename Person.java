public class Person {

    String name;
    int age;

    //public Person(String name, int age){
        //this.name = name;
        //this.age = age;
    //}
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
        
    public void getinfo () {
        System.out.println("ini info person namanya " + this.name + "umurnya " + this.age );
    }
        
}
