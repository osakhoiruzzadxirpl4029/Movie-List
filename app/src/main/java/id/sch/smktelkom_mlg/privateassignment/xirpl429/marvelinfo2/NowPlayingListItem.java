package id.sch.smktelkom_mlg.privateassignment.xirpl429.marvelinfo2;

/**
 * Created by SUPER USER on 13/06/2017.
 */

public class NowPlayingListItem {
    private String poster;
    private String overview;
    private String terbit;
    private String judul;
    private String backdrop;

    public NowPlayingListItem(String backdrop, String judul) {
        this.poster = poster;
        this.overview = overview;
        this.terbit = terbit;
        this.judul = judul;
        this.backdrop = backdrop;
    }

    public String getPoster() {
        return poster;
    }

    public String getOverview() {
        return overview;
    }

    public String getTerbit() {
        return terbit;
    }

    public String getJudul() {
        return judul;
    }

    public String getBackdrop() {
        return backdrop;
    }


}
