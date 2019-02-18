public class Main {
    public static void main(String[] args) {
        for (int i = 99; i > 0; i--) {
            int j = i-1;
            System.out.printf("%d bottles of socially acceptable non-alcoholic beverage on the wall, %d bottles of socially acceptable non-alcoholic beverage! You take one down, and pass it around, %d bottles of socially acceptable non-alcoholic beverage on the wall! %n", i, i, j);
        }
    }
}