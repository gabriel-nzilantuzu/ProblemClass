public class Student{
    private int id;
    private String name;


    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
}


class TestStudent{
   Student s1 = new Student();
   s1.setId(100);
   System.out.println("The Id is" + s1.getId)
}