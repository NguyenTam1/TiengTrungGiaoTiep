package com.nguyen.nguyen.tiengtrunggiaotiep1;

import java.io.Serializable;

public class NguPhap implements Serializable {
    String id;
    String title;
    String noiDung;
    String xem;

    public NguPhap() {
    }

    public NguPhap(String id, String title) {
        this.id = id;
        this.title = title;
    }



    public NguPhap(String id, String title, String noiDung) {
        this.id = id;
        this.title = title;
        this.noiDung = noiDung;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getXem() {
        return xem;
    }

    public void setXem(String xem) {
        this.xem = xem;
    }
}
