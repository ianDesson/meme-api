package model;

public class Face {

    private long id;
    private String content;

    public Face(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Face() {

    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
