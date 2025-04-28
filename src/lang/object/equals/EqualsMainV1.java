package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));
        // Object 가 기본으로 제공하는 equals() 메서드는 == 으로 비교한다.
        // 왜냐하면 동등성에 대한 개념은 각 클래스마다 다르기 때문이다.
        System.out.println("equality = " + (user1.equals(user2)));
    }
}
