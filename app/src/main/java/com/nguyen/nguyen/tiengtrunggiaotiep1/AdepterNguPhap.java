package com.nguyen.nguyen.tiengtrunggiaotiep1;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AdepterNguPhap extends ArrayAdapter<NguPhap> {
    Activity context;
    int resource;
    List<NguPhap> objects;
    public AdepterNguPhap(@NonNull Activity context, int resource, @NonNull List<NguPhap> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View row=inflater.inflate(this.resource,null);
        TextView tvtID= (TextView) row.findViewById(R.id.txtvID_nguPhap);
        TextView tvtvTitle= (TextView) row.findViewById(R.id.txtvTitle_nguPhap);
        TextView tvtvNoiDung= (TextView) row.findViewById(R.id.txtvNoiDung_nguPhap);
        NguPhap nguPhap =this.objects.get(position);
        tvtID.setText(nguPhap.getId());
        tvtvTitle.setText(nguPhap.getTitle());
        tvtvNoiDung.setText(nguPhap.getNoiDung());
        return row;
    }
}
