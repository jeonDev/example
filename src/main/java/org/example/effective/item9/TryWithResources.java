package org.example.effective.item9;

public class TryWithResources implements AutoCloseable {

    public void run() {
        throw new RuntimeException("111");
    }
    @Override
    public void close() throws Exception {
        throw new RuntimeException("222");
    }

}
