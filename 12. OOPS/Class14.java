//  METHOD   OVERLOADING  POLYMORPHISM 

public class Class14 {

    public static void main(String args[]) {

        Calculator cal = new Calculator();
        System.out.println(cal.sum(4, 5));
        System.out.println(cal.sum(2, 7, 1));
        System.out.println(cal.sum((float) 3., (float) 6.8f));
    }
}

class Calculator {

    int sum(int a, int b) {

        return a + b;
    }

    float sum(float a, float b) {

        return a + b;
    }

    int sum(int a, int b, int c) {

        return a + b + c;
    }
}