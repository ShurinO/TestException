package lec211;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("qwerty");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("we were there");
        }
    }
}
