package JavaBook;

public class BeerSong {
    public static void main(String[] args) {
        int BeerNumb = 99;
        String word = "бутылок (бутылки)";
        while (BeerNumb > 0) {
            if (BeerNumb == 1 ) {
                word = "бутылка";
            }
            System.out.println(BeerNumb + " " + word + " пива на стене");
            System.out.println(BeerNumb + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            BeerNumb = BeerNumb - 1;
            if (BeerNumb == 0) {
                System.out.println( "Нет бутылок пива на стене");
            }
        }
    }
}
