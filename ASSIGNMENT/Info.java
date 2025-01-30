public class Info{
    private String name;
    private int height;

    public Info(String name, int height){
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Info{name='" + name + "', height=" + height + "}";
    }
}