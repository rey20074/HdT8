import org.junit.jupiter.api.DynamicTest;

class VectorHeapTest {

    @org.junit.jupiter.api.Test
    void parent() {
        int i=3;
        int x=(i-1)/2;
        System.out.println(x);
    }

    @org.junit.jupiter.api.Test
    void left() {
        int i=1;
        int x=2*i+1;
        System.out.println(x);
    }

    @org.junit.jupiter.api.Test
    void right() {
        int i=1;
        int x=(2*i+1) + 1;
        System.out.println(x);
    }

}