class Student {
    String stdId, name;
    public Student(String id, String n){
       stdId = id;
       name = n;
       System.out.println("Student Id is: " + stdId);
       System.out.println("Student name is: " + name);
       System.out.println("#################################");
    }

}

public class StudentDetails{
    public static void main(String[] args){
        Student details1 = new Student("2024-06-00441", "Asha");
        Student details2 = new Student("2024-06-00442", "Juma");
    }
}
