package com.company.reader;

public class File extends EncryptedReadDecorator {

    public File(Reader reader) {
        super(reader);
    }
}
