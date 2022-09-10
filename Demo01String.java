package Demo;

public class Demo01String {
    public static void main(String[] args) {
        String str1=new String();//创建一个空的字符串
        System.out.println("第一个字符串："+str1);

        char[] charArray={'a','b','c'};//定义一个字符数组
        String str2=new String(charArray);//创建一个字符串并放入charArray
        System.out.println("第二个字符串："+str2);

        byte[] byteArray={97,98,99};//定义一个字节数组
        String str3=new String(byteArray);
        System.out.println("第三个字符串："+str3);

        String str4="Hello";//直接创建str4字符串
        System.out.println(str4);

    }
}
