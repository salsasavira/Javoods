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
import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.model.Cemilan;

/**
 * Created by User on 06/11/2016.
 */

public class CemilanAdapter extends RecyclerView.Adapter<CemilanAdapter.ViewHolder> {

    ArrayList<Cemilan> cemilanList;
    ICemilanAdapter mICemilanAdapter;

    public CemilanAdapter(Context context, ArrayList<Cemilan> cemilanList) {
        this.cemilanList = cemilanList;
        mICemilanAdapter = (ICemilanAdapter) context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_cemilan, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Cemilan cemilan = cemilanList.get(position);
        holder.tvJudul.setText(cemilan.judulcemilan);
        holder.tvDeskripsi.setText(cemilan.deskripsicemilan);
        holder.ivFoto.setImageURI(Uri.parse(cemilan.fotocemilan));

    }

    @Override
    public int getItemCount() {
        if (cemilanList != null)
            return cemilanList.size();
        return 0;
    }

    public interface ICemilanAdapter {
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

            ivFoto = (ImageView) itemView.findViewById(R.id.imageViewCemilan);
            tvJudul = (TextView) itemView.findViewById(R.id.tvJudulCemilan);
            bLihat = (Button) itemView.findViewById(R.id.bLihatCamilan);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mICemilanAdapter.doClick(getAdapterPosition());
                }
            });
            bLihat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mICemilanAdapter.doEdit(getAdapterPosition());
                }
            });


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mICemilanAdapter.doClick(getAdapterPosition());
                }

            });
        }


    }
}


