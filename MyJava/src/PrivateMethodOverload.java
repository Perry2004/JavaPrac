public class PrivateMethodOverload extends ClassOne {
    @Override void print() {
        System.out.println("Class two. ");
    }
}

class ClassOne {
    public ClassOne(){}
    // private
    void print() {
        System.out.println("Class one. ");
    }
}