package javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.model;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by WINDOWS 8.1 on 30/3/2017.
 */

public class Makanan extends SugarRecord implements Serializable {

    public String nama_resep;
    public String kategori;
    public String alat_bahan;
    public String langkah_langkah;

    public Makanan() {
    }

    public Makanan(String nama_resep, String kategori, String alat_bahan, String langkah_langkah) {
        this.nama_resep = nama_resep;
        this.kategori = kategori;
        this.alat_bahan = alat_bahan;
        this.langkah_langkah = langkah_langkah;
    }

    @Override
    public String toString() {
        return nama_resep + "\n" + kategori + "\n" + alat_bahan + "\n" + langkah_langkah + "\n";
    }
}
