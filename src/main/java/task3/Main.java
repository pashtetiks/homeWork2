package task3;

public class Main {
    public static void main(String[] args) {
        Searcher searcher = new Searcher();

        System.out.println(searcher.fuzzySearch("car", "ca6$$#_rtwheel"));
        System.out.println(searcher.fuzzySearch("cwhl", "cartwheel"));
        System.out.println(searcher.fuzzySearch("cartwheel", "cartwheel"));
        System.out.println(searcher.fuzzySearch("cwheeel", "cartwheel"));
        System.out.println(searcher.fuzzySearch("lw", "cartwheel"));
    }
}
