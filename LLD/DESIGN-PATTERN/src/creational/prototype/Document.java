package creational.prototype;

public class Document implements Prototype {

    private String type;
    private String content;

    @Override
    public Prototype clone() {
        return new Document(this.type, this.content);
    }

    public Document(String type, String content) {
        this.type = type;
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void display() {
        System.out.println("Content " + this.content);
    }
}
