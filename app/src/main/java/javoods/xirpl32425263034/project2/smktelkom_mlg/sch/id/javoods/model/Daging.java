package javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.model;

import java.io.Serializable;

/**
 * Created by User on 06/11/2016.
 */

public class Daging implements Serializable {
    public String juduldaging;
    public String deskripsidaging;
    public String detaildaging;
    public String fotodaging;

    public Daging(String judul, String deskripsi, String detail, String foto) {
        this.juduldaging = judul;
        this.deskripsidaging = deskripsi;
        this.detaildaging = detail;
        this.fotodaging = foto;
    }
}
