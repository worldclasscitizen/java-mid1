package lang.object.equals;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj;
        // 문자열 비교는 equals() 를 사용한다.
        return id.equals(user.id);
    }

}
