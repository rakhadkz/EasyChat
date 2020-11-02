package com.company;

public class Media {
    private int id;
    private String name;
    private int bytes;

    public Media(int bytes, String name) {
        this.id = Random.generated();
        this.bytes = bytes;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }
}
