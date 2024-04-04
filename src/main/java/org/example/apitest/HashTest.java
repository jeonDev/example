package org.example.apitest;

import java.util.HashMap;

public class HashTest {
    public static void main(String[] args) {
        HashMap<Test, String> t = new HashMap<>();
        Test a = new Test();
        Test b = new Test();
        t.put(a, "2");
        t.put(b, "3");
        System.out.println(t.get(a));
        System.out.println(t.get(b));
//        Test<String, String> test = new Test<>();
//        test.put("1", "테스트1");
//        test.put("2", "테스트2");
//        test.put("3", "테스트3");
//        System.out.println(test.get("1"));
//        System.out.println(test.get("2"));
//        System.out.println(test.get("3"));
    }
}
