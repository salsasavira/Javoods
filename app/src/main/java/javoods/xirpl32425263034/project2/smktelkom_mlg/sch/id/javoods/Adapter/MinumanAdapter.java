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
import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.model.Minuman;

/**
 * Created by User on 06/11/2016.
 */

public class MinumanAdapter extends RecyclerView.Adapter<MinumanAdapter.ViewHolder> {

    ArrayList<Minuman> minumanList;
    IMinumanAdapter mIMinumanAdapter;

    public MinumanAdapter(Context context, ArrayList<Minuman> minumanList) {
        this.minumanList = minumanList;
        mIMinumanAdapter = (IMinumanAdapter) context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_minuman, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Minuman minuman = minumanList.get(position);
        holder.tvJudul.setText(minuman.judulminuman);
        holder.tvDeskripsi.setText(minuman.deskripsiminuman);
        holder.ivFoto.setImageURI(Uri.parse(minuman.fotominuman));

    }

    @Override
    public int getItemCount() {
        if (minumanList != null)
            return minumanList.size();
        return 0;
    }

    public interface IMinumanAdapter {
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

            ivFoto = (ImageView) itemView.findViewById(R.id.imageViewMinuman);
            tvJudul = (TextView) itemView.findViewById(R.id.tvJudulMinuman);
            bLihat = (Button) itemView.findViewById(R.id.bLihatMinuman);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIMinumanAdapter.doClick(getAdapterPosition());
                }
            });
            bLihat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIMinumanAdapter.doEdit(getAdapterPosition());
                }
            });


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIMinumanAdapter.doClick(getAdapterPosition());
                }

            });
        }


    }
}




