// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double ticketPrice = 1000;
        int milesPer20Rubles = 1;

        int milesEarned = (int) (ticketPrice / 20) * milesPer20Rubles;
        System.out.println("Количество начисленных миль: " + milesEarned);
    }

}