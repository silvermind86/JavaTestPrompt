package dicionario;

import java.util.Scanner;

/**
 *
 * @author jonas.magno
 */
public class Dicionario {

    public static void main(String[] args) {
        
        Scanner scanner;
        StringBuilder strBufRes;
        String strBufPer;
        String entrada;
        String retorno;
        Boolean fim = false;
        
        scanner = new Scanner(System.in);
        strBufPer = " *                                                                                                 *";
                
        //Abertura
        System.out.println("/***************************************************************************************************/");
        System.out.println(" *                                                                                                 *");
        System.out.println(" *                                     Verificando a sintaxe                                       *");
        System.out.println(" *                                                                                                 *");
        System.out.println(" *                                                                                                 *");
        System.out.println(" *   1 - Sistema iniciado, e liberado para interação. (Digite 'sair' para encerrar)                *");
        System.out.println("/***************************************************************************************************/");       
        
        //Laço de entrada
        while(fim == false){
            System.out.print(" *   ");        
            entrada = scanner.nextLine();

            if(entrada != null && entrada.isEmpty()){
                System.out.println(" *                          Não foi adicionada nenhuma informação                                  *");
                System.out.println("/***************************************************************************************************/");
                continue;
            }
            if(entrada.toUpperCase().equals("SAIR")){
                System.out.println(" *                                   Aplicação concluida, Obrigado.                                *");
                System.out.println("/***************************************************************************************************/");
                fim = true;
                continue;
            }
            if(entrada.length() > 90){
                System.out.println(" *                                   O Número de caracteres excedeu o limite                       *");
                System.out.println("/***************************************************************************************************/");
                continue;
            }
            strBufRes =  new StringBuilder(strBufPer) ;
            strBufRes.replace(5, 5 + entrada.length(), entrada);
            System.out.println(strBufRes.toString());
            System.out.println("/***************************************************************************************************/");        
        }
    }
}
