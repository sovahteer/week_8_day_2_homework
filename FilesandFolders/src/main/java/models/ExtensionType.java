package models;

public enum ExtensionType {

    TXT(".txt"),
    RB(".rb"),
    JAVA(".java"),
    PPT(".ppt"),
    JPG(".jpg"),
    DOCX(".docx");

    private String extension;

    ExtensionType(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }
}
