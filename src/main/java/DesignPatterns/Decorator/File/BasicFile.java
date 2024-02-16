package DesignPatterns.Decorator.File;

import java.io.FileWriter;
import java.io.IOException;

// Concrete component
public class BasicFile implements FileComponent {
    private String fileName;

    public BasicFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(String content) throws IOException {
        try(FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(content);
        }
    }
}
