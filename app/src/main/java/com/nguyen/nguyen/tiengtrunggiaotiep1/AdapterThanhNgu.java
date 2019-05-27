package com.nguyen.nguyen.tiengtrunggiaotiep1;

import android.support.annotation.NonNull;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterThanhNgu extends RecyclerView.Adapter<AdapterThanhNgu.ViewHolder> {
    ArrayList<ThanhNguThongDung> thanhNgu;
    OnCallBack  mListioner;
    LongClick mLongClick;
    public AdapterThanhNgu(ArrayList<ThanhNguThongDung> thanhNgu, OnCallBack mListioner, LongClick mLongClick) {
        this.thanhNgu = thanhNgu;
        this.mListioner =  mListioner;
        this.mLongClick =  mLongClick;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_100thanhnguthongdung,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtvId.setText(thanhNgu.get(position).getId());
        holder.txtvTiengTrung.setText(thanhNgu.get(position).getTiengTrung());
        holder.txtvPhienAm.setText(thanhNgu.get(position).getPhiemAm());
        holder.txtvTiengViet.setText(thanhNgu.get(position).getNghiaTV());
    }

    @Override
    public int getItemCount() {
        return thanhNgu.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtvTiengTrung, txtvPhienAm,  txtvTiengViet, txtvId;
        public ViewHolder(final View itemView) {
            super(itemView);
            txtvId = itemView.findViewById(R.id.txtv_Id_100ThanhNguThongDung);
            txtvTiengTrung = itemView.findViewById(R.id.txtv_TiengTRung_100ThanhNguThongDung);
            txtvPhienAm = itemView.findViewById(R.id.txtv_PhienAm_100ThanhNguThongDung);
            txtvTiengViet = itemView.findViewById(R.id.txtv_NgiaTV_100ThanhNguThongDung);

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
