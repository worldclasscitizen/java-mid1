package lang.object;

// 명시적으로 클래스를 상속받으면 Object 를 상속받지 않는다.
// Parent 는 묵시적으로 Object 를 상속받고 있다.
// 결과적으로는 모든 클래스의 최상위 부모 클래스는 Object 다.
public class Child extends Parent {

    public void childMethod() {
        System.out.println("Child.childMeothd");
    }
}
