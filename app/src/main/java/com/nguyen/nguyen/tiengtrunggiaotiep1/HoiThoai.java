package com.nguyen.nguyen.tiengtrunggiaotiep1;

import java.io.Serializable;

public class HoiThoai implements Serializable {
    int id;
    String A;
    String ndA;
    String B;
    String ndB;

    public HoiThoai() {
    }

    public HoiThoai(int id, String a, String ndA, String b, String ndB) {
        this.id = id;
        A = a;
        this.ndA = ndA;
        B = b;
        this.ndB = ndB;
    }

    public HoiThoai(String a, String ndA, String b, String ndB) {
        A = a;
        this.ndA = ndA;
        B = b;
        this.ndB = ndB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getNdA() {
        return ndA;
    }

    public void setNdA(String ndA) {
        this.ndA = ndA;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getNdB() {
        return ndB;
    }

    public void setNdB(String ndB) {
        this.ndB = ndB;
    }
}
