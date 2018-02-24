package live.daniel.webcontent.model;

import javax.persistence.*;

/**
 * @author Daniel Chuev
 */
@Entity
@Table(name = "videos")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "link")
    private String link;

    @Override
    public String toString() {
        return "{" + "\"id\":" + id + ",\"name\":\"" + name + "\",\"link\":\"" + link + "\"}";
    }

    public Video() {}

    public Video(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public Video(long id, String name, String link) {
        this.id = id;
        this.name = name;
        this.link = link;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
