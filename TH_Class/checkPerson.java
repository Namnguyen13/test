import java.sql.Struct;

abstract class Person {
    String name;
    int age;
    boolean sex;
    Person(String name, int age, boolean sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
class Student extends Person{
    Student(String name, int age, boolean sex){
        super(name, age, sex);
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setSex(boolean sex){
        this.sex = sex;
    }
    void getName(){
        System.out.println("Name: "+name);
    }
    void getAge(){
        System.out.println("Age"+age);
    }
    void getSex(){
        if(sex==false){
            System.out.println("Sex: Nu");
        } else{
            System.out.println("Sex: Nam");
        }
    }
    void getInf(){
        System.out.print(name+" "+age+" ");
        if(sex == false){
            System.out.println("Nu");
        } else{
            System.out.println("Nam");
        }
    }
}
class checkPerson{
    public static void main(String[] args) {
        Student a = new Student("Nguyen The Nam", 19, true);
        a.getName();
        a.getAge();
        a.getSex();
        a.getInf();
    }
}