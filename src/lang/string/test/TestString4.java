package lang.string.test;

public class TestString4 {

    public static void main(String[] args) {
        String str = "hello.txt";
        System.out.println("filename = " + str.substring(0, str.indexOf(".txt")));
        System.out.println("extName = " + str.substring(str.indexOf(".txt")));

    }
}
