package com.nguyen.nguyen.tiengtrunggiaotiep1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.github.library.bubbleview.BubbleTextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    List<ChatModel>listChat;
    Context context;
    LayoutInflater inflater;

    public CustomAdapter(List<ChatModel> listChat, Context context) {
        this.listChat = listChat;
        this.context = context;
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listChat.size();
    }

    @Override
    public Object getItem(int position) {
        return listChat.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View vi = convertView;
       if (convertView==null){
           if (listChat.get(position).isSend())
               vi=inflater.inflate(R.layout.item_send,null);
           else
               vi=inflater.inflate(R.layout.item_recen,null);
       }
       BubbleTextView bubbleTextView = (BubbleTextView) vi.findViewById(R.id.bubbleChat);
       bubbleTextView.setText(listChat.get(position).chatMassenge);
     return vi;
    }
}
