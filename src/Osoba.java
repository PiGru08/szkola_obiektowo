import java.util.Scanner;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;

    //prywatne własnosci są dostępne tylko W TEJ KLASIE
    //konstruktor to metoda wywoływana w momencie tworzenia obiektu

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        //przypisz do własności klasy imię (this wskazuje na ten obiekt)
        //imie które jest parametrem tej metody
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba() {
        imie = "";
        nazwisko = "";
        wiek = 0;
    }

    //metody dostępowe
    //gettery i settery
    public String getImie() {
        return imie;
    }
    //przeciążenie konstruktora

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        wiek = 7; // jeżeli nie ma lokalnie zmiennej wiek to jest to pole klasy
    }

    public void setImie(String imie) {
        //wpisywanie hasła z klawiatury
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj hasło do zmiany imienia: ");
        String haslo = klawiatura.next();
        //jeżeli hasło qwe123 to zmień w przeciwnym wypadku daj komunikat
        if(haslo.equals("qwe123")) {
            this.imie = imie;
        }else{
            System.out.println("Nie możesz zmienić imienia");
        }
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
