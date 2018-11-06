package bb;

public class Student {
    private String num;
    private String name;
    private int age;

    public Student(){
        num = "0000";
        name = "无名";
        age = 0;
    }
    public Student(String num, String name){
        this.num = num;
        this.name = name;
    }
    public Student(String num, String name, int age){
        this.num = num;
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("学号："+num+" 姓名："+name+" 年龄："+age);
    }
    public void set(String num, String name, int age){
        this.num = num;
        this.name = name;
        this.age = age;
    }
}
