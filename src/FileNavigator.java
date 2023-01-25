import java.awt.geom.IllegalPathStateException;
import java.util.*;

public class FileNavigator {

    private final String ROOT_DIR = "DIR";
    private final Map<String, List<FileData>> listMap = new HashMap<>();

    public void add(FileData file) {

        if (file.getPath().indexOf(ROOT_DIR) != 0) {
            String message = "\nAdded new file directory [" + file.getPath() + "]"
                    + " is not root directory! [" + ROOT_DIR + "]";
            throw new IllegalPathStateException(message);
        }
        listMap.putIfAbsent(file.getPath(), new ArrayList<>());
        listMap.get(file.getPath()).add(file);
    }

    public List<FileData> find(String path) {
        return listMap.get(path);
    }

    public List<FileData> findAll() {
        List<FileData> files = new ArrayList<>();
        for (List<FileData> list : listMap.values()) {
            files.addAll(list);
        }
        return files;
    }

    public List<FileData> filterBySize(int size) {
        List<FileData> files = new ArrayList<>();
        for (FileData file : findAll()) {
            if (file.getSize() <= size) {
                files.add(file);
            }
        }
        return files;
    }

    public String remove(String path) {
        listMap.remove(path);
        return path;
    }

    public List<FileData> sortBySize() {
        List<FileData> fileDataList = findAll();
        Collections.sort(fileDataList);
        return fileDataList;
    }
}


