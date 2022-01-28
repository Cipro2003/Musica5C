package com.example.musica5c;

import java.util.Date;

public class Brano {
    private String titolo;
    private String autore;
    private int durata;
    private Date dataCreazione;
    private String genere;

    public Brano(String titolo, String durata, String genere, int autore) {
        this.titolo = this.titolo;
        this.autore = this.autore;
        this.durata = this.durata;
        this.dataCreazione = dataCreazione;
    }

    public String getTitolo(){
        return titolo;
    }
    public String getAutore(){
        return autore;
    }
    public String getGenere() {
        return genere;
    }
    public int getDurata() {
        return durata;
    }
    public Date getDataCreazione(){
        return dataCreazione;
    }
    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    public void setAutore(String autore){
        this.autore = autore;
    }
    public void setGenere(String genere){
        this.genere = genere;
    }
    public void setDurata(int durata){
        this.durata = durata;
    }
    public void setDataCreazione(Date dataCreazione){
        this.dataCreazione = dataCreazione;
    }
}