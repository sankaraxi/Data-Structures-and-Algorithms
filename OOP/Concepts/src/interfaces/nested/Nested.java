package interfaces.nested;

public class Nested {

    //nested interface
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

class NestedImplement implements Nested.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
