package javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.Adapter;

/**
 * Created by User on 31/03/2017.
 */

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.R;
import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.model.Sayuran;

/**
 * Created by User on 06/11/2016.
 */

public class SayuranAdapter extends RecyclerView.Adapter<SayuranAdapter.ViewHolder> {

    ArrayList<Sayuran> sayuranList;
    ISayuranAdapter mISayuranAdapter;

    public SayuranAdapter(Context context, ArrayList<Sayuran> sayuranList) {
        this.sayuranList = sayuranList;
        mISayuranAdapter = (ISayuranAdapter) context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_sayuran, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Sayuran sayuran = sayuranList.get(position);
        holder.tvJudul.setText(sayuran.judulsayuran);
        holder.tvDeskripsi.setText(sayuran.deskripsisayuran);
        holder.ivFoto.setImageURI(Uri.parse(sayuran.fotosayuran));

    }

    @Override
    public int getItemCount() {
        if (sayuranList != null)
            return sayuranList.size();
        return 0;
    }

    public interface ISayuranAdapter {
        void doClick(int pos);

        void doEdit(int pos);


        boolean onCreateOptionMenu(Menu menu);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;
        Button bLihat;

        public ViewHolder(View itemView) {
            super(itemView);

            ivFoto = (ImageView) itemView.findViewById(R.id.imageViewSayuran);
            tvJudul = (TextView) itemView.findViewById(R.id.tvJudulSayuran);
            bLihat = (Button) itemView.findViewById(R.id.bLihatSayuran);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mISayuranAdapter.doClick(getAdapterPosition());
                }
            });
            bLihat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mISayuranAdapter.doEdit(getAdapterPosition());
                }
            });


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mISayuranAdapter.doClick(getAdapterPosition());
                }

            });
        }


    }
}




