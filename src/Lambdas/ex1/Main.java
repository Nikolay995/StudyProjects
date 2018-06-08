package Lambdas.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("one");
        names.add("two");
        names.add("три");
        names.add("четыре");


        names.forEach(Main::print);
    }
    static void print(String a){
        System.out.println(a);
    }
}
