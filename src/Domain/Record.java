package Domain;

import java.io.Serial;
import java.io.Serializable;

public class Record implements Serializable {
    @Serial
    private static final long serialVersionUID = -1896163018506995817L;
    private String title;
    private String content;

    public Record() {
    }

    public Record(String title, String content) {
        this.title = title;
        this.content = content;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return "Record{title = " + title + ", content = " + content + "}";
    }
}
