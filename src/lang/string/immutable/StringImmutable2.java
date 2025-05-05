package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        // 기존 값을 변경하지 않고, 대신 새로운 결과를 만들어서 반환한다.
        String str2 = str1.concat(" java");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        /*
        String이 가변 객체였더라면, String Pool 안에 있는 특정 변수를 참조하는 모든 변수가 사이드 이펙트에 노출되어 버린다.
        */
    }
}
