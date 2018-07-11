public class Student{
    private String name;
    private int age;
    private String stack;

    public Student(String a, int b, String c){
        name = a;
        age = b;
        stack = c;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}

