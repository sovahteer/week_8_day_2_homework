package models;

import java.io.File;
import java.util.List;

public class Folder {

    private int id;
    private String title;
    private List<File> files;

    public Folder(String title, List<File> files) {
        this.title = title;
        this.files = files;
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

    public List<File> getFiles() {
        return files;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
