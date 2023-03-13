import java.io.Serializable;
public class quotes implements Serializable {
    private int id;
    private int authorId;
    private String content;

    public quotes(int id, int authorId, String content){
        this.id=id;
        this.authorId=authorId;
        this.content=content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
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
                ", author_id='" + authorId + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}