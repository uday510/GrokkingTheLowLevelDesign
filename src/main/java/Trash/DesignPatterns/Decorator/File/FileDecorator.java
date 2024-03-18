package Trash.DesignPatterns.Decorator.File;

import java.io.IOException;

public class FileDecorator implements FileComponent {
    private FileComponent fileComponent;

    public FileDecorator(FileComponent fileComponent) {
        this.fileComponent = fileComponent;
    }

    @Override
    public void write(String content) throws IOException {
        fileComponent.write(content);
    }
}
