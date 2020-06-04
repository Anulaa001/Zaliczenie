package com.company;

public class Main {

    public static void main(String[] args) {
        Lampa l1 = new Lampa();
        l1.wlacz();
        l1.wypisz();

        Lampa l2 = new Lampa();
        l2.wylacz();
        l2.wypisz();
        l2.wlacz();
        l2.wypisz();
    }
}
class Lampa{
    boolean czySwieci;

    public boolean wlacz(){
        return czySwieci = true;
    }
    public boolean wylacz(){
        return czySwieci = false;
    }

    public void wypisz(){
        if (czySwieci == false){
            System.out.println("Nie swieci");
        }
        if (czySwieci == true){
            System.out.println("Swieci");
        }
    }
}

