package String_API.Level_1;

public class NullPointerDemo {
    public static void main(String[] args) {
        try {
            String text = null;
            text.length();
        } catch (NullPointerException e) {
            try {
                String text = null;
                text.length();
            } catch (NullPointerException ex) {
                System.out.println("Exception Handled");
            }
        }
    }

}
