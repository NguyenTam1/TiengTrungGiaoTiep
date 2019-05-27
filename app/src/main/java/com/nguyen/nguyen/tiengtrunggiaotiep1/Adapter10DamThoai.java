package com.nguyen.nguyen.tiengtrunggiaotiep1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter10DamThoai extends ArrayAdapter<ChatModel> {
    Activity context;
    int resource;
    List objects;
    public Adapter10DamThoai(Activity context, int resource, List objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View row=inflater.inflate(this.resource,null);
        TextView txtvID= (TextView) row.findViewById(R.id.txtvGridViewStt);
        TextView txtvTuVung= (TextView) row.findViewById(R.id.txtv_gridView_tiengTrung);
        TextView txtvPhienAm= (TextView) row.findViewById(R.id.bubbleChat);
        TextView txtvNghia= (TextView) row.findViewById(R.id.txtv_gridView_nghia);

        T100TuVung loi= (T100TuVung) this.objects.get(position);
        txtvID.setText(loi.getId());
        txtvTuVung.setText(loi.getTiengTrung());
        txtvPhienAm.setText(loi.getPhienAm());
        txtvNghia.setText(loi.getNghia());


        return row;
    }
}
