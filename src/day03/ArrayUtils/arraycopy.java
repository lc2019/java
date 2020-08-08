package day03.ArrayUtils;

public class arraycopy {
    public static void main(String[] args) {
        String[] arr = {"hello ", "java", "world"};
        String[] dest = new String[3];
        System.arraycopy(arr, 0, dest, 0, arr.length);
        for (String s : dest) {
            System.out.println(s);
        }
    }
}
