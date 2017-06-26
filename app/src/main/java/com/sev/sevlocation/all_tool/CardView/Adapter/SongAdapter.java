package com.sev.sevlocation.all_tool.CardView.Adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.sev.sevlocation.all_tool.CardView.Entities.Song;
import com.sev.sevlocation.all_tool.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by SEV on 6/23/2017.
 */

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHoder>{
    private List<Song> lsongs;
    private Context mContext;
    private LayoutInflater inflater;

    public SongAdapter(List<Song> lsongs, Context mContext) {
        this.lsongs = lsongs;
        this.mContext = mContext;
        inflater=LayoutInflater.from(mContext);
    }

    @Override
    public SongViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewitem=inflater.inflate(R.layout.cardview_2,parent,false);
        return new SongViewHoder(viewitem);
    }


    @Override
    public void onBindViewHolder(SongViewHoder holder, int position) {
        final Song song=lsongs.get(position);
        holder.tvCode.setText(song.getsCode());
        holder.tvTitle.setText(song.getsName());
        holder.tvArtist.setText(song.getsArtist());
        holder.tvLyric.setText(song.getsLyric());
        //Bắt sự kiện click carđview
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, song.getsName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return lsongs.size();
    }
    class SongViewHoder extends RecyclerView.ViewHolder{
        private TextView tvCode;
        private TextView tvTitle;
        private TextView tvLyric;
        private TextView tvArtist;
        private CardView cardView;
        public SongViewHoder(View itemView) {
            super(itemView);
            tvCode = (TextView) itemView.findViewById(R.id.tv_code);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_name);
            tvLyric = (TextView) itemView.findViewById(R.id.tv_lyric);
            tvArtist = (TextView) itemView.findViewById(R.id.tv_artist);
            cardView=(CardView) itemView.findViewById(R.id.cv_cardview);
        }
    }
}
