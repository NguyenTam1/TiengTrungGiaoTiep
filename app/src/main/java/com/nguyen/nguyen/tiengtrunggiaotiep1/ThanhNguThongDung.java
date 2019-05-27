package com.nguyen.nguyen.tiengtrunggiaotiep1;

import java.io.Serializable;

public class ThanhNguThongDung implements Serializable {
    String id;
    String tiengTrung;
    String phiemAm;
    String nghiaTV;

    public ThanhNguThongDung() {
    }

    public ThanhNguThongDung(String id, String tiengTrung, String phiemAm, String nghiaTV) {
        this.id = id;
        this.tiengTrung = tiengTrung;
        this.phiemAm = phiemAm;
        this.nghiaTV = nghiaTV;
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

    public String getPhiemAm() {
        return phiemAm;
    }

    public void setPhiemAm(String phiemAm) {
        this.phiemAm = phiemAm;
    }

    public String getNghiaTV() {
        return nghiaTV;
    }

    public void setNghiaTV(String nghiaTV) {
        this.nghiaTV = nghiaTV;
    }
}
