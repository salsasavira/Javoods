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
import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.model.Daging;

/**
 * Created by User on 06/11/2016.
 */

public class DagingAdapter extends RecyclerView.Adapter<DagingAdapter.ViewHolder> {

    ArrayList<Daging> dagingList;
    IDagingAdapter mIDagingAdapter;

    public DagingAdapter(Context context, ArrayList<Daging> dagingList) {
        this.dagingList = dagingList;
        mIDagingAdapter = (IDagingAdapter) context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_daging, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Daging daging = dagingList.get(position);
        holder.tvJudul.setText(daging.juduldaging);
        holder.tvDeskripsi.setText(daging.deskripsidaging);
        holder.ivFoto.setImageURI(Uri.parse(daging.fotodaging));

    }

    @Override
    public int getItemCount() {
        if (dagingList != null)
            return dagingList.size();
        return 0;
    }

    public interface IDagingAdapter {
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

            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.tvJudulDaging);
            bLihat = (Button) itemView.findViewById(R.id.bLihatDaging);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIDagingAdapter.doClick(getAdapterPosition());
                }
            });
            bLihat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIDagingAdapter.doEdit(getAdapterPosition());
                }
            });


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIDagingAdapter.doClick(getAdapterPosition());
                }

            });
        }


    }
}


