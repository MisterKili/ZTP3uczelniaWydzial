import java.util.ArrayList;

public class Test {

    public void sprawdzStudentow(Uczelnia uczelnia1, Uczelnia uczelnia2) {
        ArrayList<Student> studenci1 = uczelnia1.getWydzialy().get(0).getStudenci();
        ArrayList<Student> studenci2 = uczelnia2.getWydzialy().get(0).getStudenci();

        System.out.println("Przed zmiana -   stud1: " + studenci1.get(0).imie + "   stud2: " + studenci2.get(0).imie);
        studenci2.get(0).setImie("Xxxxx");

        System.out.println("Po zmianie -   stud1: " + studenci1.get(0).imie + "   stud2: " + studenci2.get(0).imie);
    }

    public void sprawdzWydzialy(Uczelnia uczelnia1, Uczelnia uczelnia2){
        ArrayList<Wydzial> wydzialy1 = uczelnia1.getWydzialy();
        ArrayList<Wydzial> wydzialy2 = uczelnia2.getWydzialy();

        System.out.println("Przed zmiana -   wydzial1: " + wydzialy1.get(0).nazwaWydzialu + "   wydzial2: " + wydzialy2.get(0).nazwaWydzialu);
        wydzialy2.get(0).setNazwaWydzialu("Xxxxx");

        System.out.println("Po zmianie -   wydzial1: " + wydzialy1.get(0).nazwaWydzialu + "   wydzial2: " + wydzialy2.get(0).nazwaWydzialu);
    }
}
