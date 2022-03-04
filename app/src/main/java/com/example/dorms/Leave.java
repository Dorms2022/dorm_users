package com.example.dorms;

public class Leave {

    String to;
    String from;
    String complaint;

    public Leave(String to, String from, String complaint) {
        this.to = to;
        this.from = from;
        this.complaint = complaint;
    }

    public Leave() {
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }


}
