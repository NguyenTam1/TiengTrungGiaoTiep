package com.nguyen.nguyen.tiengtrunggiaotiep1;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter50DamThoai extends ArrayAdapter<DamThoai50> {
    Activity context;
    int resource;
    List<DamThoai50> objects;
    public Adapter50DamThoai(@NonNull Activity context, int resource, @NonNull List<DamThoai50> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource, null);
        TextView tvtID = (TextView) row.findViewById(R.id.txtv_50_id);
        TextView tvtvTV = (TextView) row.findViewById(R.id.txtv_50_tv);
         TextView tvtvTA = (TextView) row.findViewById(R.id.txtv_50_tt);
        TextView tvtvPA = (TextView) row.findViewById(R.id.txtv_50_pa);

        DamThoai50 damThoai50 = this.objects.get(position);
        tvtID.setText(damThoai50.getId());
        tvtvTV.setText(damThoai50.getTv());
        tvtvTA.setText(damThoai50.getTt());
        tvtvPA.setText(damThoai50.getPa());
        return row;
    }

}
