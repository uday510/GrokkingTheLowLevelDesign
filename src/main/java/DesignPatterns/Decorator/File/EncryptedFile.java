package DesignPatterns.Decorator.File;

import java.io.IOException;

public class EncryptedFile extends FileDecorator {
    public EncryptedFile(FileComponent fileComponent) {
        super(fileComponent);
    }
    @Override
    public void write(String content) throws IOException {
        System.out.println("Encrypting content...");
        super.write(content);
        System.out.println("Content encrypted.");
    }

}
