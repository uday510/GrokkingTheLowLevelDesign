package DesignPatterns.Decorator.File;

public class Example {
    public static void main(String[] args) {
        try {
           // Create a basic file
            FileComponent basicFile = new BasicFile("file.txt");
            basicFile.write("Hello World");

            // Create compressed file
            FileComponent compressedFile = new CompressedFile(basicFile);
            compressedFile.write("Hello World");

            // Create encrypted file
            FileComponent encryptedFile = new EncryptedFile(basicFile);
            encryptedFile.write("Hello World");

            //  create compressed and encrypted file
            FileComponent compressedEncryptedFile = new CompressedFile(new EncryptedFile(basicFile));
            compressedEncryptedFile.write("Hello World");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
