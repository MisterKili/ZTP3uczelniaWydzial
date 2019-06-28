import java.util.ArrayList;
import java.util.Random;

public class GeneratorLosowych {

    Random random = new Random();
    String[] tablicaNazwWydzialow = {"Informatyki i Zarzadzania", "Elektroniczny", "Matematyczny", "Humanistyczny",
            "Prawa", "Lekarski", "Fizyki", "Kultury", "Ekonomii", "Geografii", "Sztuki", "Biologii", "Chemiczny"};
    String[] tablicaImion = {"Adam", "Adrian", "Andrzej", "Bartosz", "Cezary", "Damian", "Dawid", "Daniel",
            "Filip", "Grzegorz", "Jerzy", "Jan", "Kamil", "Krzysztof", "Mateusz", "Marek", "Michal", "Piotr",
            "Pawel", "Tomasz", "Wiktor", "Wojciech"};
    String[] tablicaNazwisk = {"Abacki", "Babacki", "Cabacki", "Dabaci", "Ebacki", "Fabacki", "Gabacki", "Habacki",
            "Ibacki", "Jabacki", "Kabacki", "Labacki", "Mabacki", "Nabacki", "Obacki", "Pabacki", "Rabacki", "Tabacki",
            "Wabacki", "Zabacki"};

    public ArrayList<Wydzial> generujWydzialy(int liczbaWydzialow, int liczbaStudentowNaWydziale){
        ArrayList<Wydzial> tempWydzialy = new ArrayList<>(liczbaWydzialow);

        String tempNazwaWydzialu = null;
        Wydzial tempWydzial = null;

        for (int i = 1; i<liczbaWydzialow+1; i++){
            tempNazwaWydzialu = tablicaNazwWydzialow[random.nextInt(tablicaNazwWydzialow.length)];
            tempWydzial = new Wydzial(i, tempNazwaWydzialu);
            tempWydzial.setStudenci(generujStudentow(liczbaStudentowNaWydziale));
            tempWydzialy.add(tempWydzial);
        }
        return tempWydzialy;
    }

    public ArrayList<Student> generujStudentow(int liczbaStudentow){
        ArrayList<Student> tempStudenci = new ArrayList<>(liczbaStudentow);

        String tempNazwisko, tempImie;
        Student tempStudent;

        for(int i = 1; i<liczbaStudentow+1; i++){
            tempImie = tablicaImion[random.nextInt(tablicaImion.length)];
            tempNazwisko = tablicaNazwisk[random.nextInt(tablicaNazwisk.length)];
            tempStudent = new Student(i, tempNazwisko, tempImie);
            tempStudenci.add(tempStudent);
        }
        return tempStudenci;
    }
}
