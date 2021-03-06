package com.rockets.proj1;

public class Message {
    private String header;      // message header, contains destination or timespan (in seconds) if topic is specified

    private String content;     // message content

    private String topic;       // message topic, null for non-topic messages


    // non-topic message constructor
    public Message(String h, String c) {
        this.header = h;
        this.content = c;
        this.topic = null;
    }

    // topic message constructor
    public Message(String h, String c, String t) {
        this.header = h;
        this.content = c;
        this.topic = t;
    }


    public String getHeader() {
        return header;
    }


    public String getMessage() {
        return content;
    }

    public String getTopic() {
        return topic;
    }

    public String toString() {
        return "HEADER="+header + " ; CONTENT=" + content + "\n";
    }
}
