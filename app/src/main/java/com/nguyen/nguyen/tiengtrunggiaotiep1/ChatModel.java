package com.nguyen.nguyen.tiengtrunggiaotiep1;

public class ChatModel {
    public String chatMassenge ;
    public boolean isSend ;

    public ChatModel() {
    }

    public ChatModel(String chatMassenge, boolean isSend) {
        this.chatMassenge = chatMassenge;
        this.isSend = isSend;
    }

    public String getChatMassenge() {
        return chatMassenge;
    }

    public void setChatMassenge(String chatMassenge) {
        this.chatMassenge = chatMassenge;
    }

    public boolean isSend() {
        return isSend;
    }

    public void setSend(boolean send) {
        isSend = send;
    }
}

