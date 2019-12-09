package com.nirui.springboot.entity;

import java.io.Serializable;

public class T_booktype implements Serializable {
    private String id;

    private String booktypename;

    private String booktypedesc;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBooktypename() {
        return booktypename;
    }

    public void setBooktypename(String booktypename) {
        this.booktypename = booktypename;
    }

    public String getBooktypedesc() {
        return booktypedesc;
    }

    public void setBooktypedesc(String booktypedesc) {
        this.booktypedesc = booktypedesc;
    }
}