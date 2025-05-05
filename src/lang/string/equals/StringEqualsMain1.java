package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002
        System.out.println("new String() == 비교 : " + (str1 == str2));
        System.out.println("new String() equals 비교 : " + (str1.equals(str2)));

        /*
        문자열 풀 (String Pool)

        String Literal을 사용하면 String Pool 내에서 같은 문자를 가진 인스턴스를 찾아 반환한다.
        만약 찾고자 하는 인스턴스가 없다면 새로 생성한다.

        String str3 = "hello"; 에서 x003 인스턴스를 생성했기 때문에,
        String str4 = "hello"; 는 x003 인스턴스를 반환한다.
        따라서 두 String 변수는 동일성을 만족한다.
        */
        String str3 = "hello"; // x003
        String str4 = "hello"; // x003
        System.out.println("리터럴 == 비교 : " + (str3 == str4));
        System.out.println("리터럴 equals 비교 : " + (str3.equals(str4)));
    }
}

