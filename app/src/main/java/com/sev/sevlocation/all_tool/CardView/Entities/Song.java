package com.sev.sevlocation.all_tool.CardView.Entities;

/**
 * Created by SEV on 6/23/2017.
 */

public class Song {
    private String sCode;
    private String sArtist;
    private String sLyric;
    private String sName;
    public Song(){

    }
    public Song(String sCode,String sName, String sLyric, String sArtist) {
        this.sCode = sCode;
        this.sArtist = sArtist;
        this.sLyric = sLyric;
        this.sName = sName;
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public String getsArtist() {
        return sArtist;
    }

    public void setsArtist(String sArtist) {
        this.sArtist = sArtist;
    }

    public String getsLyric() {
        return sLyric;
    }

    public void setsLyric(String sLyric) {
        this.sLyric = sLyric;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}
