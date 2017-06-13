package id.sch.smktelkom_mlg.privateassignment.xirpl429.marvelinfo2;

import com.orm.SugarRecord;

import java.io.Serializable;

public class Place extends SugarRecord implements Serializable {
    //    String poster;
    String overview;
    String terbit;
    String judul;
    byte[] backdrop = new byte[2048];
    String rate;

    public Place() {


    }

    public Place(String overview, String terbit, String judul, byte[] backdrop, String rate) {

        this.overview = overview;
        this.terbit = terbit;
        this.judul = judul;
        this.backdrop = backdrop;
        this.rate = rate;
    }
}