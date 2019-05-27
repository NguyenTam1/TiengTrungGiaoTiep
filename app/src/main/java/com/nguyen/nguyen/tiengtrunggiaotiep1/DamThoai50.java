package com.nguyen.nguyen.tiengtrunggiaotiep1;

import java.io.Serializable;

public class DamThoai50 implements Serializable {
    String id;
    String tv;
    String tt;
    String pa;

    public DamThoai50() {
    }

    public DamThoai50(String id, String tv, String tt, String pa) {
        this.id = id;
        this.tv = tv;
        this.tt = tt;
        this.pa = pa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }
}
