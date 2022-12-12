package br.com.rgaviolli;


import java.util.*;



public class Parte2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separados por ',' : ");

        String nomes = s.next();
        String[] lista = nomes.split("-," );


        ArrayList<String> nomesLista = new ArrayList<>();
        Collections.addAll(nomesLista, lista);
        Collections.sort(nomesLista);

        if(nomesLista.contains("M")){
            System.out.println("Tem macho");
        }else{
            System.out.println("Não tem");
        }
    }
}
