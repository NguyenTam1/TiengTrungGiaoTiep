package com.nguyen.nguyen.tiengtrunggiaotiep1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SimsimiActyvity extends AppCompatActivity {
    final String DATABASE_NAME = "tenbanlagi.sqlite";
    SQLiteDatabase database;

    List<ChatModel> listChat = new ArrayList<>();
     TextToSpeech tts;
     //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simsimi_actyvity);

        setUpMassenge();
        final ListView listView = findViewById(R.id.lisview_Simsimi);
        CustomAdapter customAdapter = new CustomAdapter(listChat,this);
        listView.setAdapter(customAdapter);
        ChatModel model = new ChatModel();

      /*  listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final String a = listChat.get(position).getChatMassenge();
                tts=new TextToSpeech(SimsimiActyvity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.US);
                            tts.speak(a,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }        });*/
      listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //  listView.getAdapter().getView(position, null, null).performClick();
                  final String a = listChat.get(position).getChatMassenge();
                  tts = new TextToSpeech(SimsimiActyvity.this, new TextToSpeech.OnInitListener() {
                      @Override
                      public void onInit(int status) {
                          if (status != TextToSpeech.ERROR) {
                              tts.setLanguage(Locale.US);
                              tts.speak(a, TextToSpeech.QUEUE_FLUSH, null);
                          }
                      }
                  });
              }
      });
    }

    private void setUpMassenge() {
        database = Database.initDatabase(this, DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT * FROM HOITEN",null);
        //list.clear();
        for (int i=0; i<cursor.getCount(); i++){
            cursor.moveToPosition(i);
            String id=cursor.getString(0);
            String tiengTrung=cursor.getString(1);
            String h = cursor.getString(2);

           // listChat.add(new ChatModel(tiengTrung,giatri));
        }
        /*listChat.add(new ChatModel("Hello",true));
        listChat.add(new ChatModel("hi,how are you",false));

        listChat.add(new ChatModel("yes, i am fine,and you",true));
        listChat.add(new ChatModel("yes, where do you go?",false));
        listChat.add(new ChatModel("i go to shool",true));*/
    }
}
