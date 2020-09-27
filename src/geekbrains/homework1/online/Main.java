package geekbrains.homework1.online;

public class Main {

    public static void main(String[] args) {
        // Первое задание
        byte myByte;
        myByte = 120;
        short myShort;
        myShort = 30000;
        int myInt;
        myInt = 10;
        long myLong;
        myLong = 132000;
        float myFloat;
        myFloat = 1123;
        double myDouble = 11;
        char myChar = 128;
        boolean myBoolean = false; // Не ясно что с этим делать, как и со всем заданием)
        System.out.println(myByte + " " + myShort + " " + myInt + " " + myLong + " " + myFloat + " " + myDouble + " " + myChar + " " + myBoolean);
        equation(10, 20, 30, 30); // Ввел свои значения для проверки ну и работоспособности кода
        checkDistance(20, 10);
        checkSymbol(0);
        negative(1);
        sayHello("Вася", "Пупкин"); // Добавил вывод фамилии
        year(2001);
    }
    static void equation(int a, int b, int c, int d) {
        int e = a * (b + (c / d));
        System.out.println(e);
    }
    static void checkDistance(int a, int b) {
        int c = a + b;
        boolean d = true;
        if (c > 10 && c <= 20) {
            System.out.println(d);
        } else
            System.out.println(!d);
    }
    static void checkSymbol(int a) {
        if (a < 0) {
            System.out.println("Ваше число отрицательно");
        } else {
            System.out.println("Ваше число положительно, либо равно 0");
        }
    }
    static void negative(int a) {
        boolean b = true;
        if (a < 0) {
            System.out.println(b);
        } else {
            System.out.println(!b);
        }
    }
    static void sayHello(String name,String surname){
        System.out.println("Привет, " + name + " " + surname);
    }
    static void year(int a){
        float c = (float)a/4;
        float d = (float)a/100;
        float e = (float)a/400;
        boolean f;
        if(e == (int)e){
            f = true;
        }else{
            f = false;
        }
        if (c == (int)c || d == (int)d && f == false){
            System.out.println(a + " год является високосным");
        }else{
            System.out.println(a + " не является високосным годом");
        }
    }
}
