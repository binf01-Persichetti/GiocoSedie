/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giocosedie;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Studente
 */
import java.util.logging.Logger;

import java.util.Scanner;

public class TestGiocoSedie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numero di partecipanti: ");
        int numPartecipanti = scanner.nextInt();

        Posto sedie[] = new Posto[numPartecipanti - 1];

        for (int k = 0; k < sedie.length; k++)
            sedie[k] = new Posto();

        Display display = new Display(sedie);
        display.start();

        Partecipante array[] = new Partecipante[numPartecipanti];
        for (int i = 0; i < numPartecipanti; i++) {
            array[i] = new Partecipante(sedie);
            array[i].start();
        }
        scanner.close();
    }
}

        public void scrivi(){
        BufferedWriter br=null;
        
        try {
            //1) apro il file
            br = new BufferedWriter(
                    new FileWriter(nomeFile, true));
            //2) scrivo nel buffer
            br.write("File in output");
            br.write("\n\r");
            //3) svuoto il buffer e salvo nel file i dati
            br.flush();         
        } catch (IOException ex) {
            Logger.getLogger("Stampa l'id della classe");
        }
        finally{
            if (br!=null)
                try {
                    //4)chiudo lo stream in uscita
                    br.close();
            } catch (IOException ex) {
                System.err.println("Stampa l'id della classe");
            }

    }
        }
}
