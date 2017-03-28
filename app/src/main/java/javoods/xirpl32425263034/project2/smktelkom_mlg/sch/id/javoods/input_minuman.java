package javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;



/**
 * A simple {@link Fragment} subclass.
 */
public class input_minuman extends Fragment {

    int i = 0, j = 0;
    Activity activity;
    LinearLayout lAlat, lStep;
    ImageButton btPlus, btPlus2, hapus, hapus2, Submit;
    public input_minuman() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_input_minuman, container, false);
        lAlat = (LinearLayout) view.findViewById(R.id.l_makanan);
        lStep = (LinearLayout) view.findViewById(R.id.layout_step);
        activity = getActivity();
        btPlus = (ImageButton) view.findViewById(R.id.btnTambah);
        btPlus2 = (ImageButton) view.findViewById(R.id.btnTambah2);
        hapus = (ImageButton) view.findViewById(R.id.btnHapus);
        hapus2 = (ImageButton) view.findViewById(R.id.btnHapus2);
        Submit = (ImageButton) view.findViewById(R.id.button2);
        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final EditText etAlat = new EditText(activity);
                etAlat.setHint("Tulis Alat dan Bahan");
                lAlat.addView(etAlat);
                i++;

                hapus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        lAlat.removeView(lAlat.getChildAt(i));
                        i--;
                    }
                });
            }
        });


        btPlus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText etStep = new EditText(activity);
                etStep.setHint("Tuliskan Step");
                lStep.addView(etStep);
                j++;

                hapus2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        lStep.removeView(lStep.getChildAt(j));
                        j--;
                    }
                });

            }
        });

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;

    }

}
