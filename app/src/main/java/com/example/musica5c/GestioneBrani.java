package com.example.musica5c;

import java.util.ArrayList;
import java.util.List;

public class GestioneBrani {

    List<Brano> ListBrani;

    public GestioneBrani() {ListBrani= new ArrayList<Brano>();
    }
    public void addBrano(String titolo, String autore, String genere, int durata){
        Brano br = new Brano(titolo, autore, genere, durata);
        ListBrani.add(br);
      }
    public String visualizzaTitolo(String autore)
    {
        StringBuilder sbBrani = new StringBuilder();
        for (Brano brc : ListBrani){
            sbBrani.append(brc.getTitolo().toString());
            sbBrani.append(brc.getAutore().toString());
        }
        return sbBrani.toString();
    }
}