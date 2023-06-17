package SDA.genericTypes;

public class Main {
    public static void main(String[] args)
    {
        Pair<Integer, String> pair1 = new Pair<>(1, "pierwsza para");
        Pair<Integer, String> pair2 = new Pair<>(2, "druga para");
        Pair<String, String> pair3 = new Pair<>("kolejna para", "trzecia para");

        System.out.println(pair1.getFirst() + "  " + pair1.getSecond());
    }
}
