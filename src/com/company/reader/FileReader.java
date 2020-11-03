package com.company.reader;


public class FileReader implements Reader{

    //TODO Decorator
    private String path;

    public FileReader(String path){
        this.path = path;
    }

    @Override
    public void read() {
        System.out.println("Reading file from: " +
                this.path);
    }
}
