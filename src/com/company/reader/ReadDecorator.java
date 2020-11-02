package com.company.reader;

public class ReadDecorator implements Reader {
    protected Reader reader;

    public ReadDecorator(Reader reader) {
        this.reader = reader;
    }

    @Override
    public void read() {

    }
}
