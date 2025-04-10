public class Test <T> {
    private T value;

    <U> Test(U input) {
        System.out.println(input.getClass().getName());
    }
}
