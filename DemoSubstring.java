package Demo;

public class DemoSubstring {
    public static void main(String[] args) {
        String str1="HelloWorld";
        String str2=str1.substring(5);//从W发生截断
        System.out.println(str2);
        String str3=str1.substring(4,7);
        System.out.println(str3);
    }
}
