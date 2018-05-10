package com.requests.models;

public class UserModel {
    private int id;
    private String title;
    private String body;
    private int userId;

    {
        title = "foo";
        body = "bar";
        userId = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "{\n" +
                "userId: " + userId + "\n" +
                "id: " + id + "\n" +
                "title: " + title + "\n" +
                "body: " + body + "\n" +
                "}";
    }
}
