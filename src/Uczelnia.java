import java.io.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Uczelnia implements Cloneable, Serializable {

    public String nazwaUczelni;
    public ArrayList<Wydzial> wydzialy = new ArrayList<>();

    public Uczelnia(String nazwaUczelni){
        this.nazwaUczelni = nazwaUczelni;
    }

    public Uczelnia(String nazwaUczelni, int n){
        this.nazwaUczelni = nazwaUczelni;
        this.wydzialy = new ArrayList<>(n);
    }

    public ArrayList<Wydzial> getWydzialy(){
        return wydzialy;
    }

    public void setWydzialy(ArrayList<Wydzial> lista){
        wydzialy = lista;
    }

    public ArrayList<Wydzial> getWydzialyCopy(){
        ArrayList<Wydzial> temp = new ArrayList<>();
        for (Wydzial w: wydzialy){
            temp.add(new Wydzial(w));
        }
        return temp;
    }

    public String toString(){
        return nazwaUczelni+" liczba wydzialow: "+wydzialy.size();
    }

    public void drukujWydzialy(){
        for(Wydzial w: wydzialy){
            System.out.println(w);
        }
    }

    public Uczelnia copy1(){
        Uczelnia nowa = new Uczelnia(this.nazwaUczelni);
        nowa.setWydzialy(this.getWydzialyCopy());
        Wydzial w;
        Wydzial wNowyTemp;
        for(int i = 0; i<this.wydzialy.size(); i++){
            w = this.wydzialy.get(i);
            wNowyTemp = nowa.wydzialy.get(i);
            wNowyTemp.setStudenci(w.getStudenciCopy());
        }
        return nowa;
    }

    public Uczelnia copy2(){
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return (Uczelnia) ois.readObject();
        } catch (IOException e) {
            return null;
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public Uczelnia copy3(){
        Uczelnia nowa = new Uczelnia(this.nazwaUczelni);
        Wydzial wydzialTemp;
        for (Wydzial w: wydzialy){
            wydzialTemp = new Wydzial(w);
            for (Student s: w.studenci){
                wydzialTemp.studenci.add(new Student(s));
            }
            nowa.wydzialy.add(wydzialTemp);
        }
        return nowa;
    }
}
