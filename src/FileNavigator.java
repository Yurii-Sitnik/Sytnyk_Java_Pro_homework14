import java.util.*;

public class FileNavigator {

    private String ROOT_DIR = "DIR";
    private Map<String, List<FileData>> listMap;
    private List<FileData> list;

    public FileNavigator() {
        this.listMap = new HashMap<>();
    }

    //    public void add(FileData file) {
//        if (Objects.equals(file.getPath(), ROOT_DIR)) {
//            if (!listMap.containsKey(file.getPath())) {
//                list = new ArrayList<>();
//                list.add(file);
//                listMap.put(file.getPath(), list);
//            } else {
//                list = new ArrayList<>();
//                list = listMap.get(file.getPath());
//                list.add(file);
//                listMap.put(listMap.get(file.getPath()).toString(), list);
//            }
//        }
//    }
    public void add(FileData fileData) {
        List<FileData> fileDataList = listMap.get(fileData.getPath());
        if (fileDataList != null) {
            fileDataList.add(fileData);
        } else {
            System.out.println(" Incorrect file path");
        }
    }

    public void find(String path) {
        if (listMap.containsKey(path)) {
            System.out.println(" Finding by path :" + '\n' + listMap.get(path));
        } else {
            System.out.println(" File not found ;");
        }
    }

    public Map<String, List<FileData>> filterBySize(int size) {
        Map<String, List<FileData>> lm = new HashMap<>();
        for (List<FileData> fd : listMap.values()) {
            for (FileData fileData : fd) {
                if (fileData.getSize() < size) {
                    lm.put(fileData.getPath(), fd);
                }
            }
        }
        return lm;
    }

    public void remove(String path) {
        listMap.remove(path);
    }

//    public List<FileData> sortBySize() {
//        List<FileData> list = new ArrayList<>();
//        for (String key : listMap.keySet()) {
//            list.addAll(listMap.get(key));
//            list.sort(new Comparator<FileData>() {
//                @Override
//                public int compare(FileData o1, FileData o2) {
//                   // return o1.getSize().compareTo(o2.getSize());
//                }
//            });
//        }
//        return list;
//    }

    public void addListMap(String ROOT_DIR) {
        if (!listMap.containsKey(ROOT_DIR)) {
            listMap.put(ROOT_DIR, new ArrayList<FileData>());
        }
    }

    public Map<String, List<FileData>> getListMap() {
        return listMap;
    }
}
