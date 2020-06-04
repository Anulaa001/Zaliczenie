package com.company;

import java.util.ArrayList;
import java.util.List;

class Klient {
    public int idKlienta;
    public String daneOsobowe;
    public String kontakt;
    public String nrKomorki;
    private ArrayList<Transakcja> dokonaneTransakcje;       //Transkacja
    private SystemRozliczen systemRozliczen;

    public boolean InformujOSukcesieLubPorazce() {
        return true;
    }
}
class Transakcja {
    public int idTransakcji;
    public int idPlatnosci;         //Platnosc
    public float kwotaTransakcji;
    public Klient klient;
    public String szczegolyTransakcji;

    public void rejestracjaTransakcji() {

    }

    public void odnotowanieZaplaty() {

    }
}

class SystemSprzedazy {
    public String oferta;
    private ArrayList<Transakcja> historiaTransakcji;       // Transakcja
    private ArrayList<String> id_klientow;                  //Klient

    public void obslugaTranskacji() {

    }

    public void odnotowanieZaplaty() {

    }
}

class Platnosc {
    public String czasSMS;
    public int nrPlatnosci;
    public float kwota;
    public int idPlatnosci;

    public void dodajPlatnosc() {

    }

    public String zestawienie() {
        return "";
    }
}
class SystemRozliczen {
    public String informacjeOSystemachSprzedazy;
    public List<Platnosc> rejestrPlatnosci;     //Platnosc

    public void przyjecieSMS() {

    }

    public void odnotowanieZaplaty() {

    }

    public void potwierdzenieDoSystemuSprzedazy() {

    }

    public void SMSZPotwierdzeniem() {

    }
}

public class Main {

    public static void main(String[] args) {
        Klient k1 = new Klient();
        k1.InformujOSukcesieLubPorazce();

        Platnosc p1 = new Platnosc();
        p1.zestawienie();
        p1.dodajPlatnosc();
    }
}
