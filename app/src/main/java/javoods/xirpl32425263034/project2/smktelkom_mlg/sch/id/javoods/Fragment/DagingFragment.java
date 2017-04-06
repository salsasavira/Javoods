package javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.DetailActivity;
import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.R;
import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.model.Makanan;

/**
 * A simple {@link Fragment} subclass.
 */
public class DagingFragment extends Fragment {

    Button imLihat;
    public DagingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_daging, container, false);
        // Inflate the layout for this fragment

        imLihat = (Button) v.findViewById(R.id.bLihatDaging);

        imLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), DetailActivity.class));
            }

        });
        return v;
    }


}
