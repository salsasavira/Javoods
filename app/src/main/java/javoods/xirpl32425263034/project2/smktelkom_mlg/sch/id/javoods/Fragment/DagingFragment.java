package javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.R;
import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.model.Makanan;

/**
 * A simple {@link Fragment} subclass.
 */
public class DagingFragment extends Fragment {

    TextView recomend;
    public DagingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_daging, container, false);
        // Inflate the layout for this fragment

        recomend = (TextView) view.findViewById(R.id.tvRecomend);
        show_recomend();

        return view;
    }

    private void show_recomend() {
        List<Makanan> allMakanan = Makanan.listAll(Makanan.class);
        recomend.setText(allMakanan.toString());
    }

}
