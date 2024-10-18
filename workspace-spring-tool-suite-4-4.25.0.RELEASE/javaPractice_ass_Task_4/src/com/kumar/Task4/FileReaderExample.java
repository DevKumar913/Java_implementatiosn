package com.kumar.Task4;

import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;

// Custom Exception
class FileNotAcceptedException extends Exception {
    public FileNotAcceptedException(String message) {
        super(message);
    }
}

public class FileReaderExample {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the file path
        System.out.print("Enter the path of the file to read: ");
        String filePath = scanner.nextLine();

        // Read and display file content using file I/O
        try {
            // Create a file object based on user input
            File file = new File(filePath);

            // Use an anonymous class to filter for .txt files
            FilenameFilter txtFileFilter = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(".txt");  // Only accept .txt files
                }
            };

            // Check if the file has the right extension, if not throw custom exception
            if (!txtFileFilter.accept(file.getParentFile(), file.getName())) {
                throw new FileNotAcceptedException("File format not accepted. Only .txt files are allowed.");
            }

            // FileReader to read the content of the file
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println("Displaying file content:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } catch (FileNotAcceptedException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
