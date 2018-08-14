package models;

import javax.persistence.*;
import java.io.File;
import java.util.List;

public class Folder {

    private int id;
    private String title;
    private List<File> files;

    public Folder(String title) {
        this.title = title;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @OneToMany( mappedBy = "files", fetch = FetchType.LAZY)
    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files){
        this.files = files;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
