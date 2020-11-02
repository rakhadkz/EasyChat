package com.company.reader;

public class EncryptedReadDecorator extends ReadDecorator{

    public EncryptedReadDecorator(Reader reader) {
        super(reader);
    }

    @Override
    public void read() {
        System.out.println("Decrypted the file!");
        this.reader.read();
    }
}
