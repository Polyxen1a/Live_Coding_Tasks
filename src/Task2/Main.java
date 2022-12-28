package Task2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList testList = new ArrayList();

        testList.add("One");

        testList.add("Two");

        testList.add("Three");

        System.out.println(testList.size());

        System.out.println("Цикл While:");

        Iterator iter = testList.iterator();

        while(iter.hasNext()) {

            System.out.println(iter.next());

        }

        System.out.println("Улучшенный цикл For:");

        for(Object o : testList) {

            System.out.println(o);

        }

        System.out.println("Цикл For:");

        for(int i=0; i< testList.size(); i++) {

            System.out.println(testList.get(i));

        }

    }

}