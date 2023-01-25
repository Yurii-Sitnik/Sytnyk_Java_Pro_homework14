import java.util.Objects;

public class FileData implements Comparable<FileData> {

    private final String path;
    private final String name;
    private final int size;

    public FileData(String name, int size, String path) {
        this.path = path;
        this.name = name;
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "path='" + path + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public int compareTo(FileData o) {
        return this.getSize() - o.getSize();
    }

}



