package org.example.effective.item13;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        TestObj obj = new TestObj();
//        Object clone = obj.clone();
//        System.out.println(obj.toString());
//        System.out.println(clone.toString());
        Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        Stack clone = stack.clone();
        System.out.println(stack.toString());
        System.out.println(clone.toString());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(clone.pop());
        System.out.println(clone.pop());
    }
}
