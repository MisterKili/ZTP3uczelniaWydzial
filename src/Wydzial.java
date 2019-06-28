import java.io.Serializable;
import java.util.ArrayList;

public class Wydzial implements Cloneable, Serializable {

    public int numerWydzialu;
    public String nazwaWydzialu;
    public ArrayList<Student> studenci = new ArrayList<>();

    public Wydzial(int numerWydzialu, String nazwaWydzialu){
        this.numerWydzialu = numerWydzialu;
        this.nazwaWydzialu = nazwaWydzialu;
    }

    public Wydzial(Wydzial inny){
        this.numerWydzialu = inny.numerWydzialu;
        this.nazwaWydzialu = inny.nazwaWydzialu;
        this.studenci = inny.getStudenciCopy();
    }

    public void setNazwaWydzialu(String nowaNazwa){
        this.nazwaWydzialu = nowaNazwa;
    }

    public ArrayList<Student> getStudenci(){
        return studenci;
    }

    public void setStudenci(ArrayList<Student> lista){
        studenci = lista;
    }

    public void dodajStudenta(Student student){
        studenci.add(student);
    }

    public String toString(){
        return numerWydzialu+" "+nazwaWydzialu;
    }

    public void drukujStudentow(){
        for (Student s: studenci){
            System.out.println(s);
        }
    }

    public ArrayList<Student> getStudenciCopy(){
        ArrayList<Student> temp = new ArrayList<>();
        for(Student s: studenci){
            temp.add(new Student(s));
        }
        return temp;
    }
}
