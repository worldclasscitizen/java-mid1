package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        // String은 불변 객체이기 때문에 concat을 호출하기만 해서는 String 변수가 바뀌지 않는다.
        str.concat(" java");
        System.out.println("str = " + str);
    }
}
