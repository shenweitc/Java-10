package Demo;

public class Demo04StringConvert {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[2]);

        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String str="How do you do?";
        String o = str.replace("o", "*");
        System.out.println(str);
        System.out.println(o);


    }
}
