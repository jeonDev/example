package org.example.slack;

import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        String title = "Slack 메시지 전송 테스트";
        HashMap<String, String> data = new HashMap<>();
        data.put("테스트1", "테스트1 내용");
        data.put("테스트2", "테스트2 내용");
        SlackService service = new SlackService();
        service.sendMessage(title, data);
    }
}
