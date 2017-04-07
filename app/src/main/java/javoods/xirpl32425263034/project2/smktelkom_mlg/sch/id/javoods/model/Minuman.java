package javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.model;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by User on 31/03/2017.
 */

public class Minuman extends SugarRecord implements Serializable {

    public String judulminuman;
    public String deskripsiminuman;
    public String detailminuman;
    public String fotominuman;

    public Minuman() {
    }

    public Minuman(String judulminuman, String deskripsiminuman, String detailminuman, String fotominuman) {
        this.judulminuman = judulminuman;
        this.deskripsiminuman = deskripsiminuman;
        this.detailminuman = detailminuman;
        this.fotominuman = fotominuman;
    }

    @Override
    public String toString() {
        return judulminuman + "\n" + deskripsiminuman + "\n" + detailminuman + "\n" + fotominuman + "\n";
    }
}
