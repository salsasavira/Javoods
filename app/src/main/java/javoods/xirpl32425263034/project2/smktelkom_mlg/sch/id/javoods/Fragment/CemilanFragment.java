package javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.DetailActivity;
import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CemilanFragment extends Fragment {

    Button imLihat;

    public CemilanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_cemilan, container, false);


        imLihat = (Button) v.findViewById(R.id.bLihatCamilan);

        imLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), DetailActivity.class));
            }

    });
        return v;


        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_cemilan, container, false);
        //Intent i = new Intent(getActivity(), DetailActivity.class);startActivity(i);
        //View view = inflater.inflate(R.layout.fragment_cemilan,container,false);
        //ImageButton btnaye = (ImageButton) getView().findViewById(R.id.ImagebuttonLihatCemilan);
        //btnaye.setOnClickListener(new View.OnClickListener() {
          //  @Override
          //  public void onClick(View v) {
           //       startActivity(new Intent(getActivity(), DetailActivity.class));

          //  }
       // });
      //  return view;
    }

}
