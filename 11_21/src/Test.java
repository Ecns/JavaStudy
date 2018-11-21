public class Test {
    public static void main(String[] args){
        Student s[] = new Student[5];
        s[0] = new Student("10001","zhangsan");
        s[1] = new XStudent("10002","lisi");
        s[2] = new ZStudent("10003","wangwu");
        s[3] = new DStudent("10004","zhaoliu");
        s[4] = new YStudent("10005","TOM");
        for(int i=0;i<s.length;i++){
            s[i].show();
        }
    }
}

class Student{
    String num;
    String name;
    Student(String num, String name){
        this.num = num;
        this.name = name;
    }
    void show(){
        System.out.println("我是学生"+num+" "+name);
    }
}

class XStudent extends Student{
    XStudent(String num,String name){
        super(num, name);
        this.num = num;
        this.name = name;
    }
    void show(){
        System.out.println("我是小学生"+num+" "+name);
    }
}

class ZStudent extends Student{
    ZStudent(String num,String name){
        super(num, name);
        this.num = num;
        this.name = name;
    }
    void show(){
        System.out.println("我是中学生"+num+" "+name);
    }
}

class DStudent extends Student{
    DStudent(String num,String name){
        super(num, name);
        this.num = num;
        this.name = name;
    }
    void show(){
        System.out.println("我是大学生"+num+" "+name);
    }
}
class YStudent extends Student{
    YStudent(String num,String name){
        super(num, name);
        this.num = num;
        this.name = name;
    }
    void show(){
        System.out.println("我是研究生"+num+" "+name);
    }
}