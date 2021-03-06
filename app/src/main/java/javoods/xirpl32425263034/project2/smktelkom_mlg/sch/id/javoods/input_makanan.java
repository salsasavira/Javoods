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
import android.widget.Spinner;

import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.model.Makanan;


/**
 * A simple {@link Fragment} subclass.
 */
public class input_makanan extends Fragment {
    Activity activity;
    EditText etNama, etAlat, etStep;
    Spinner kategori;
    ImageButton Submit;
    public input_makanan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_input_makanan, container, false);

        activity = getActivity();
        Submit = (ImageButton) view.findViewById(R.id.button2);
        etNama = (EditText) view.findViewById(R.id.editText);
        etAlat = (EditText) view.findViewById(R.id.etAlat);
        etStep = (EditText) view.findViewById(R.id.etStep);
        kategori = (Spinner) view.findViewById(R.id.spinner2);


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
        Makanan makanan = new Makanan(nama, category, alat, step);
        makanan.save();

        Snackbar.make(Submit, "Data Berhasil Ditambahkan", Snackbar.LENGTH_SHORT).show();
    }

}
