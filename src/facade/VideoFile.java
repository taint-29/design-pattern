package facade;

public class VideoFile {
    private String name;
    private String codeType;

    public VideoFile(String name) {
        this.name = name;
    }

    public VideoFile(String name, String codeType) {
        this.name = name;
        this.codeType = codeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }
}
