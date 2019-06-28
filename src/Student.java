import java.io.Serializable;

public class Student implements Cloneable, Serializable {

    public int nrAlbumu;
    public String imie;
    public String nazwisko;

    public Student(int nrAlbumu, String nazwisko, String imie){
        this.nrAlbumu = nrAlbumu;
        this.nazwisko = nazwisko;
        this.imie = imie;
    }

    public Student(Student inny){
        this.nrAlbumu = inny.nrAlbumu;
        this.imie = inny.imie;
        this.nazwisko = inny.nazwisko;
    }

    public void setImie(String noweImie){
        this.imie = noweImie;
    }

    public String toString(){
        return nrAlbumu+" "+nazwisko+" "+imie;
    }
}
