public class Main {
    public static void main(String[] args) {


        System.out.println("Liczba uczniów: " + Uczen.liczbaObiektow);
        Uczen uczen = new Uczen("Daniel", "Nowy");
        System.out.println("Liczba uczniów: " + Uczen.liczbaObiektow);
        Uczen uczen2 = new Uczen("Daniela", "Nowa");
        System.out.println("Liczba uczniów: " + Uczen.liczbaObiektow);
        Uczen uczen3 = new Uczen("Danielo", "Stary");
        System.out.println("Liczba uczniów: " + Uczen.liczbaObiektow);
        System.out.println(uczen3);

        Nauczyciel nauczycielSlowik = new Nauczyciel("Marlena", "Słowik", 25, "matematyka");
        System.out.println(nauczycielSlowik);
    }
}