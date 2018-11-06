package aa;
import bb.Student;
public class Test {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("2001", "zhangsan");
        Student s3 = new Student("2002", "lisi", 90);
        s1.show();s2.show();s3.show();
        s1.set("1001","zhang", 90);
        s2.set("1002", "wang", 80);
        s3.set("1003", "li", 95);
        s1.show();s2.show();s3.show();
    }
}
