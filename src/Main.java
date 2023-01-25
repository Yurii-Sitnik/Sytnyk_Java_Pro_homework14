public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add(new FileData("file111.txt", 50, "DIR"));
        fileNavigator.add(new FileData("file222.txt", 60, "DIR"));
        fileNavigator.add(new FileData("file333.txt", 70, "DIR"));
        fileNavigator.add(new FileData("file444.txt", 80, "DIR"));
        fileNavigator.add(new FileData("file555.txt", 100, "DIRECT"));

        System.out.println(fileNavigator.filterBySize(70)+"\n");



    }

}
