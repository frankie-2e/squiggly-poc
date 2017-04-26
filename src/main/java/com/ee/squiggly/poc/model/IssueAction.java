package com.ee.squiggly.poc.model;

public class IssueAction {

    private String issueId;
    private String type;
    private String text;

    private User user;

    public IssueAction(String type, String text, User user) {
        this.text = text;
        this.type = type;
        this.user = user;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
