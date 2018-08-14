package models;

import javax.persistence.*;

public class File {

    private int id;
    private String name;
    private ExtensionType extension;
    private int size;
    private Folder folder;


    public File(String name, ExtensionType extension, int size, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "Folder_id", nullable = false)
    public Folder getFolder(){
        return folder;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Enumerated(value = EnumType.STRING)
    public ExtensionType getExtension() {
        return extension;
    }

    @Column(name = "size")
    public int getSize(){
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(ExtensionType extension) {
        this.extension = extension;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
