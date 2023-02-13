public class Main {
    public static void main(String[] args) {
        System.out.println("Random numbers");
        for (int i = 0; i < 20; i++) {
            System.out.print((int) (Math.random() * 100) + " ");
        }
        System.out.println("not end");

    }
}