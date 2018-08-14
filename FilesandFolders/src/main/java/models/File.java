package models;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public ExtensionType getExtension() {
        return extension;
    }

    public int getSize(){
        return size;
    }

    public Folder getFolder() {
        return folder;
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
