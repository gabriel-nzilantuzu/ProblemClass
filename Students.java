public class Students{
    private int id;
    private String name;


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}


class TestStudent{
    public static void main(String[] args){
        Students s1 = new Students();
        s1.setId(100);
        s1.setName("Rahma")
        System.out.println("student ID is: " + s1.getId());
        System.out.println("Student name is: " + s1.getName());
    }
  
}