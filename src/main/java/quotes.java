import java.io.Serializable;
public class quotes implements Serializable {
    private int id;
    private String author;
    private String content;

    public quotes(int id, String author, String content){
        this.id=id;
        this.author=author;
        this.content=content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "id='" + id + '\'' +
                ", author_id='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}