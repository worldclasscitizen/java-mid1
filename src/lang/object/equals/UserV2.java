package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    // [ equals() 메서드를 구현할 때 지켜야 하는 규칙 ]

    // 반사성 (Reflexivity) : 객체는 자기 자신과 동등해야 한다. (x.equals(x) 는 항상 true)
    // 대칭성 (Symmetry) : 두 객체가 서로에 대해 동일할 때, 양방향으로 동일해야 한다. (x.equals(y) 가 true 면 y.equals(x) 도 true)
    // 추이성 (Transitivity) : 만약 한 객체가 두 번째 객체와 동일하고, 두 번째 객체가 세 번째 객체와 동일하면, 첫 번째 객체는 세 번째 객체와 동일해야 한다.
    // 일관성 (Consistency) : equals() 메서드는 항상 동일한 값을 반환해야 한다.
    // null 에 대한 비교 : 모든 객체는 null 과 비교했을 때 false 를 반환해야 한다.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }
}
