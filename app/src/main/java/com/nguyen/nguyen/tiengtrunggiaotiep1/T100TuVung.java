package com.nguyen.nguyen.tiengtrunggiaotiep1;

public class T100TuVung {
    String id ;
    String tiengTrung;
    String phienAm;
    String nghia;

    public T100TuVung() {
    }

    public T100TuVung(String id, String tiengTrung, String phienAm, String nghia) {
        this.id = id;
        this.tiengTrung = tiengTrung;
        this.phienAm = phienAm;
        this.nghia = nghia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTiengTrung() {
        return tiengTrung;
    }

    public void setTiengTrung(String tiengTrung) {
        this.tiengTrung = tiengTrung;
    }

    public String getPhienAm() {
        return phienAm;
    }

    public void setPhienAm(String phienAm) {
        this.phienAm = phienAm;
    }

    public String getNghia() {
        return nghia;
    }

    public void setNghia(String nghia) {
        this.nghia = nghia;
    }
}
