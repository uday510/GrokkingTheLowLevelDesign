package DesignPatterns.Decorator.File;

import java.io.*;

public interface FileComponent {
    void write(String content) throws IOException;
}
