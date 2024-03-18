package Trash.DesignPatterns.Decorator.File;

import java.io.IOException;

// Concrete decorator for compression
public class CompressedFile extends FileDecorator {
    public CompressedFile(FileComponent fileComponent) {
        super(fileComponent);
    }

    public void write(String content) throws IOException {
        System.out.println("Compressing content...");
        super.write(content);
        System.out.println("Content compressed.");
    }
}
