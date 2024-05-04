package io.javabrains;

import java.util.Arrays;
import java.util.List;

public class MathUtils {

    public int add(int a, int b) {
        return a + b;
    }

    public List<String> getList() {
        return Arrays.asList("hello", "how", "is", "romania");
    }

    public boolean isNameVinit() {
        String name = "Puiu";
        String bName = "Poopi";
        return false;
    }

    public double computeCircleArea(int radius) {
        radius = 10;
        return Math.PI * radius * radius;
    }


    public void divide(int a, int b) {
        throw new ArithmeticException();
    }


    class Add{
        public void addHello(){
            add(1,  1);
        }
    }
}
