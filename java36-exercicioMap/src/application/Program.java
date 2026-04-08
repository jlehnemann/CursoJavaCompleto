package application;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // for testing purposes, use file path below
        // /home/soundwarrior/Área de trabalho/CursoJavaCompleto/java36-exercicioMap/in.txt
        System.out.print("Enter full file path: ");
        String path = sc.nextLine();


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {


            Map<String, Integer> voteMap = new HashMap<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");

                if(voteMap.containsKey(fields[0])) {
                    int currentVotes = voteMap.get(fields[0]);
                    int updatedVotes = currentVotes + Integer.parseInt(fields[1]);
                    voteMap.put(fields[0], updatedVotes);
                }
                else{
                    voteMap.put(fields[0], Integer.parseInt(fields[1]));
                }
                line = br.readLine();
            }

            System.out.println("CURRENT VOTES:");
            for (String key : voteMap.keySet()) {
                System.out.println(key + ": " + voteMap.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error message: " + e.getMessage());
        }









    }
}
