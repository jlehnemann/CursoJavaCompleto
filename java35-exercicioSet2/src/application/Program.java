package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //for testing purposes: /home/soundwarrior/Área de trabalho/CursoJavaCompleto/java35-exercicioSet2/in.txt
        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(" ");
                LogEntry logEntry = new LogEntry(fields[0], Instant.parse(fields[1]));
                set.add(logEntry);
                line = br.readLine();
            }

            System.out.println("Total users: " + set.size());

        }
        catch (IOException e) {
            System.out.println("Error message: " + e.getMessage());
        }

        sc.close();

    }
}
