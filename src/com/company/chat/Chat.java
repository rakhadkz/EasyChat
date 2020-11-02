package com.company.chat;

import com.company.Message;
import com.company.Random;
import com.company.user.Member;

import java.util.ArrayList;

public class Chat {
    private int id;
    private ArrayList<Message> messages;
    private ArrayList<Member> members;

    public Chat(ArrayList<Message> messages){
        this.messages = messages;
    }

    public Chat(ArrayList<Message> messages, ArrayList<Member> members) {
        this.id = Random.generated();
        this.messages = messages;
        this.members = members;
    }

    public void addMessage(Message message){
        this.messages.add(message);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }
}
