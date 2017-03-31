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
import javoods.xirpl32425263034.project2.smktelkom_mlg.sch.id.javoods.model.Ikan;


/**
 * Created by User on 06/11/2016.
 */

public class IkanAdapter extends RecyclerView.Adapter<IkanAdapter.ViewHolder> {

    ArrayList<Ikan> ikanList;
    IIkanAdapter mIIkanAdapter;

    public IkanAdapter(Context context, ArrayList<Ikan> ikanList) {
        this.ikanList = ikanList;
        mIIkanAdapter = (IIkanAdapter) context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_ikan, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Ikan ikan = ikanList.get(position);
        holder.tvJudul.setText(ikan.judulikan);
        holder.tvDeskripsi.setText(ikan.deskripsiikan);
        holder.ivFoto.setImageURI(Uri.parse(ikan.fotoikan));

    }

    @Override
    public int getItemCount() {
        if (ikanList != null)
            return ikanList.size();
        return 0;
    }

    public interface IIkanAdapter {
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

            ivFoto = (ImageView) itemView.findViewById(R.id.imageViewIkan);
            tvJudul = (TextView) itemView.findViewById(R.id.tvJudulIkan);
            bLihat = (Button) itemView.findViewById(R.id.bLihatIkan);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIIkanAdapter.doClick(getAdapterPosition());
                }
            });
            bLihat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIIkanAdapter.doEdit(getAdapterPosition());
                }
            });


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIIkanAdapter.doClick(getAdapterPosition());
                }

            });
        }


    }
}



