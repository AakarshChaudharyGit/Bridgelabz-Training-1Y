package function_interface;

public class Main {
    static void main(String[] args) {
        Employee obj = () -> "Software Engineer";
        System.out.println(obj.getName());
        Employee obj2 = () -> "Doctor";
        System.out.println(obj2.getName());
    }
}
