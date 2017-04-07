package javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods;


import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;

import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.model.Makanan;
import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.model.Minuman;


/**
 * A simple {@link Fragment} subclass.
 */
public class input_minuman extends Fragment {

    Activity activity;
    EditText etNama, etAlat, etStep;
    Spinner kategori;
    ImageButton Submit;


    public input_minuman() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_input_minuman, container, false);
        activity = getActivity();
        etNama = (EditText) view.findViewById(R.id.editText);
        etAlat = (EditText) view.findViewById(R.id.etAlat);
        Submit = (ImageButton) view.findViewById(R.id.button2);
        etStep = (EditText) view.findViewById(R.id.etStep);
        kategori = (Spinner) view.findViewById(R.id.spinner_minum);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doSave();
            }
        });

        return view;

    }

    private void doSave() {
        String nama = etNama.getText().toString();
        String category = kategori.getSelectedItem().toString();
        String alat = etAlat.getText().toString();
        String step = etStep.getText().toString();
        Minuman minuman = new Minuman(nama, category, alat, step);
        minuman.save();

        Snackbar.make(Submit, "Data Berhasil Ditambahkan", Snackbar.LENGTH_SHORT).show();
    }

}
