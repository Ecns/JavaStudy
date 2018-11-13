public class Test {
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A(3);
        a3.show();
    }
}
class A{
    static int y = 0;
    int a;
    A(){
        y++;
    }
    A(int a){
        y++;
        this.a=a;
    }

    void show(){
        System.out.println("创建了"+y+"个对象！");
    }
}

/*
* static静态变量和常量在全局数据区(共用变量)
* 静态变量在使用时如果访问权限允许，可以使用类名.变量名来使用
* 如果类当中只用到了静态的变量，可以把方法变成静态的方法。可以通过类名.方法名调用
* 静态的属性和方法，针对整个类的资源
* 非静态的属性和方法，针对每个对象的
* 静态的方法中只能使用静态的属性，不能使用非静态属性
* 非静态方法中可以使用静态的属性，也能使用非静态的属性
* 静态属性/方法可以使用类名直接调用
* 静态代码块 》main方法 》构造代码块 》构造方法
* 只执行一次            每次创建对象时都执行
* */