package com.company;

public class Student {
    protected String _MSSV;
    protected String _HOTEN;
    protected Boolean _GT; //True: Nam , False: Nu
    protected String _CMND;

    public String get_MSSV(){
        return this._MSSV;
    }

    public String get_HOTEN(){
        return this._HOTEN;
    }

    public Boolean get_GioiTinh(){
        return this._GT;
    }

    public String get_CMND(){
        return this._CMND;
    }
}
