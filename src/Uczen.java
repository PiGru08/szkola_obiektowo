public class Uczen extends Osoba {
    //ponieważ uczeń ma te same własności co osoba to będzie klasą potomną klasy osoba
    //klasa Osoba będzie klasą bazową

    private int nr_ewidencyjny;
    static int liczbaObiektow;

    public Uczen(String imie, String nazwisko, int wiek, int nr_ewidencyjny) {
        super(imie, nazwisko, wiek);
        //wywołanie konstruktora klasy bazowej
        this.nr_ewidencyjny = nr_ewidencyjny;
        liczbaObiektow++;
    }


    @Override
    public String toString() {
        return "Uczen{" +
                "Imię: " + getImie() +", Nazwisko: "+ getNazwisko() +", nr_ewidencyjny: "+ nr_ewidencyjny+
                '}';
    }

    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        liczbaObiektow++;
        nr_ewidencyjny = liczbaObiektow;

    }


}
