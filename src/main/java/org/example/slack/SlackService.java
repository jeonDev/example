package org.example.slack;

import com.slack.api.Slack;
import com.slack.api.model.Attachment;
import com.slack.api.model.Field;
import com.slack.api.webhook.WebhookPayloads;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static com.slack.api.webhook.WebhookPayloads.payload;

public class SlackService {
    private final String SLACK_URL = "https://hooks.slack.com/services/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";
    private final Slack slackClient = Slack.getInstance();
    public void sendMessage(String title, HashMap<String, String> data) throws IOException {
        slackClient.send(SLACK_URL, payload(p -> p
                .text(title)
                .attachments(List.of(
                        Attachment.builder()
                                .fields(data.keySet().stream().map(key -> generateSlackField(key, data.get(key))).collect(Collectors.toList()))
                                .build()
                ))
        ));
    }

    /**
     * Slack Field 생성
     **/
    private Field generateSlackField(String title, String value) {
        return Field.builder()
                .title(title)
                .value(value)
                .valueShortEnough(false)
                .build();
    }
}
