package br.com.rgaviolli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Parte1 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separados por ',' : ");

        String nomes = s.next();
        String[] lista = nomes.split(",");

        ArrayList<String> nomesLista = new ArrayList<>();
        Collections.addAll(nomesLista, lista);
        Collections.sort(nomesLista);
        System.out.println("Ordenação das variáveis em ordem alfabética");
        System.out.println(nomesLista);
        System.out.println("");
    }
}
