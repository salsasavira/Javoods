package javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.model;

/**
 * Created by Widya on 3/21/2017.
 */

import java.io.Serializable;

/**
 * Created by User on 06/11/2016.
 */

public class Cemilan implements Serializable {
    public String judulcemilan;
    public String deskripsicemilan;
    public String detailcemilan;
    public String fotocemilan;

    public Cemilan(String judul, String deskripsi, String detail, String foto) {
        this.judulcemilan = judul;
        this.deskripsicemilan = deskripsi;
        this.detailcemilan = detail;
        this.fotocemilan = foto;
    }


    public void save() {

    }
}
