package com.nguyen.nguyen.tiengtrunggiaotiep1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterHoiThoai extends RecyclerView.Adapter<AdapterHoiThoai.ViewHolder> {
    ArrayList<HoiThoai> hoiThoais;
    AdapterHoiThoai.OnCallBack mListioner;
    AdapterHoiThoai.LongClick mLongClick;

    public AdapterHoiThoai(ArrayList<HoiThoai> hoiThoais, AdapterHoiThoai.OnCallBack mListioner, AdapterHoiThoai.LongClick mLongClick) {
        this.hoiThoais = hoiThoais;
        this.mListioner =  mListioner;
        this.mLongClick =  mLongClick;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_hoai_thoai,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHoiThoai.ViewHolder holder, int position) {
        holder.txtvA.setText(hoiThoais.get(position).getA());
        holder.txtvNoiDungA.setText(hoiThoais.get(position).getNdA());
        holder.txtvB.setText(hoiThoais.get(position).getB());
        holder.txtvNoiDungB.setText(hoiThoais.get(position).getNdB());
    }

    @Override
    public int getItemCount() {
        return hoiThoais.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtvA, txtvNoiDungA,  txtvB, txtvNoiDungB;
        public ViewHolder(final View itemView) {
            super(itemView);
            txtvA = itemView.findViewById(R.id.txtvA);
            txtvNoiDungA = itemView.findViewById(R.id.txtv_hoiThoai_A);
            txtvB = itemView.findViewById(R.id.txtvB);
            txtvNoiDungB = itemView.findViewById(R.id.txtv_hoiThoai_B);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mListioner.onItemClick(getPosition());

                }
            });
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    mLongClick.onLongClick(getPosition());
                    return true;
                }
            });
        }
    }
    public interface OnCallBack{
        void onItemClick(int position);
    }

    public interface LongClick{
        void onLongClick(int position);
    }
}
