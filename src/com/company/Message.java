package com.company;

import com.company.reader.File;
import com.company.user.User;

import java.util.Date;

public class Message {
    private int id;
    private User author;
    private Date date;
    private String text;
    private Media media;
    private File file;

    public Message(String text, Date date) {
        this.text = text;
        this.date = date;
    }

    public Message(String text){
        this.id = Random.generated();
        this.date = new Date();
        this.text = text;
        this.file = null;
        this.media = null;
    }

    public Message(String text, Media media, File file) {
        this.id = Random.generated();
        this.date = new Date();
        this.text = text;
        this.file = file;
        this.media = media;
    }

    public Message(String text, File file) {
        this.id = Random.generated();
        this.date = new Date();
        this.text = text;
        this.file = file;
        this.media = null;
    }

    public Message(String text, Media media) {
        this.id = Random.generated();
        this.date = new Date();
        this.text = text;
        this.file = null;
        this.media = media;
    }

    public Message(Media media) {
        this.id = Random.generated();
        this.date = new Date();
        this.text = "";
        this.file = null;
        this.media = media;
    }

    public Message(File file) {
        this.id = Random.generated();
        this.date = new Date();
        this.text = "";
        this.file = file;
        this.media = null;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", media=" + media +
                ", file=" + file +
                ", date=" + date +
                '}';
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
