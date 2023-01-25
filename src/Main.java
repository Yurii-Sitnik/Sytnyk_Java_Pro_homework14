public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add(new FileData("file111.txt", 50, "DIR"));
        fileNavigator.add(new FileData("file222.txt", 60, "DIR"));
        fileNavigator.add(new FileData("file333.txt", 70, "DIR"));
        fileNavigator.add(new FileData("file444.txt", 80, "DIR"));
        fileNavigator.add(new FileData("file555.txt", 100, "DIR/dir"));
        fileNavigator.add(new FileData("file666.txt", 20, "DIR"));

        System.out.println("Find: "+fileNavigator.find("DIR"));
        System.out.println("Filter by size"+ fileNavigator.filterBySize(70));
        System.out.println("Remove " + fileNavigator.remove("DIR/dir"));
        System.out.println("Find: "+fileNavigator.find("DIR/dir"));
        System.out.println("Sort by size"+ fileNavigator.sortBySize());
       }
}
