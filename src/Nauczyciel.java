public sealed class Nauczyciel extends Osoba implements Dyzurny permits Wychowawca{

    //seald ograniczenie dziedziczenia
    //permits jaka klasa może dziedziczyć
    private String przedmiot;


    public Nauczyciel(String imie, String nazwisko, int wiek, String przedmiot) {
        super(imie, nazwisko, wiek);
        this.przedmiot = przedmiot;

    }
    @Override
    public String toString() {
        return "Nauczyciel{" +
                "przedmiot='" + przedmiot +
                ", Imie: "+
                getImie() +
                ", nazwisko: "+
                getNazwisko()+
                ", wiek: "+
                getWiek()+
                " lat"+
                '\'' +
                '}';
    }

    @Override
    public void wykonajDyzur() {

    }
}
