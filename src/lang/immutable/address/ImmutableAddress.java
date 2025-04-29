package lang.immutable.address;

public class ImmutableAddress {

    // 불변 객체는 내부의 값들이 바뀌면 안 되므로 final 키워드를 사용한다.
    private final String value;

    // 생성자를 통해서만 값을 설정할 수 있고, 이후에는 바꿀 수 없다.
    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
