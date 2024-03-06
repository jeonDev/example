package org.example.effective.item9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try (TryWithResources tryWithResources = new TryWithResources()) {
            tryWithResources.run();

        } catch (Exception e) {
            e.printStackTrace();
            // 
            Throwable[] suppressed = e.getSuppressed();
            Arrays.stream(suppressed).forEach(System.out::println);
        }
    }
}
