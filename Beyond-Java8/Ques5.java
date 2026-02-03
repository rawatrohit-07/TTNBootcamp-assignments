
record Student(String name, int id , int age){
    static int count=0;

    public Student{
        count++;
    }
}
public class Ques5 {
    public static void main(String[] args) {
        Student s1 = new Student("Rohit ", 101, 25);
        Student s2 = new Student("krish ", 102, 23);
        Student s3 = new Student("Paaji", 103, 24);

        System.out.println(s1.equals(s2));

        System.out.println("Total Object created =" + Student.count);


    }
}