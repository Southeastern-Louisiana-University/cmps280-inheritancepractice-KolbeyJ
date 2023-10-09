package chapter13;

class DynamicBindingDemo {
    public static void main(String[] args) {
        System.out.println("YOU'RE #1! KEEP IT PUSHING!! YOU GOT IT!!!<3 ");
        Object object = new Object();
        System.out.println("\nObject.toString()\n" + object.toString());
        Person person = new Person();
        System.out.println("Person.toString()\n" + person.toString());
        Student student = new Student();
        System.out.println("\nStudent.toString()\n" + student.toString());
        GradStudent gradstudent = new GradStudent();
        System.out.println("\nGradStudent.toString()\n" + gradstudent.toString());

        Object object1 = new GradStudent();
        Object object2 = new Student();

        MethodDBD(object);
        MethodDBD(person);
        MethodDBD(student);
        MethodDBD(gradstudent);

        if(object2 instanceof GradStudent){
            System.out.println("GradStudent identified");
           // if(object2 instanceof Student){
               // System.out.println("Student Identified");
            }
        else
            System.out.println("Not GS");
        }
    //}

    public static void MethodDBD(Object object) {
        System.out.println((object.toString()));

    }
}
class Person extends Object  {
    public String toString(){
        return "-Person";
    }
}
class Student extends Person{
    public String toString(){
        return "-Student";
    }
}
class GradStudent extends Student{
    public String toString(){
        return "-GradStudent";
    }
}
