package com.j8.model;

import java.util.List;
import java.util.Map;

public class Topic {
//    private String topicName;
//    private List<String> topics;
    private Map<String, List<String>> topics;

    public Map<String, List<String>> getTopics() {
        return topics;
    }

    public void setTopics(Map<String, List<String>> topics) {
        this.topics = topics;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "topics=" + topics +
                '}';
    }
}
