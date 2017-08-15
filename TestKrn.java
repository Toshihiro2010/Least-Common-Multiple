package ssru.toshihiro;

import java.util.ArrayList;

public class TestKrn {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int num = 40;
        int num2 = 28;

        int myMinumum = Math.min(num, num2);

        ArrayList<Integer> myNum1ArrayList = new ArrayList<Integer>();
        ArrayList<Integer> myNum1ArrayList2 = new ArrayList<Integer>();

        for (int i = 2 ; i < num ; i++) {
            if (num % i == 0) {

                myNum1ArrayList.add(i);
                num = num / i;
                i = 1;
            }

        }
        myNum1ArrayList.add(num);

        for (int i = 2 ; i < num2 ; i++) {
            if (num2 % i == 0) {

                myNum1ArrayList2.add(i);
                num2 = num2 / i;
                i = 1;
            }

        }
        myNum1ArrayList2.add(num2);

        System.out.println(myNum1ArrayList);
        System.out.println(myNum1ArrayList2);

        int result = 1;

        for (int i = 0; i < myNum1ArrayList.size(); i++) {
            int numTemp = myNum1ArrayList.get(i);

            for (int j = 0 ; j < myNum1ArrayList2.size(); j++) {
                int numTemp2 = myNum1ArrayList2.get(j);

                if (numTemp == numTemp2) {
                    result *= numTemp2;
                    myNum1ArrayList2.remove(j);
                    break;
                }
            }

        }
        System.out.println("result = " + result);


    }
}
