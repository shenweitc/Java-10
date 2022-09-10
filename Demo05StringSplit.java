package Demo;

public class Demo05StringSplit {
    public static void main(String[] args) {
        String str="aaa,bbb,ccc";
        String[] array=str.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
