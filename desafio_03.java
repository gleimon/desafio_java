//Vai devolver o número de pares de substrings de uma palavra qualquer informada pelo usuário.
//Por exemplo: se o usuário inserir a palavra abcde, vai devolver 0 (zero).
//Se o usuário inserir a palavra ifailuhkqq, vai devolver 03 (três).

import java.util.Scanner;

public class desafio_03 {

    public static void main(String[] args) {
        Scanner entrada_dados = new Scanner(System.in);
        String palavra;
        int T = 1;
        for(int i=0; i<T; ++i){
            System.out.println("Insira a palavra desejada: ");
            palavra = entrada_dados.next();
            System.out.println(numero_de_anagramas(palavra));
        }
    }
    
    public static int numero_de_anagramas(String palavra){
        int total_encontrado_anagramas = 0;
        for(int i=1; i<palavra.length(); ++i){
            int[] tmppalavra = new int[26];
            
            for(int j=i; j>=0; --j){
                tmppalavra[palavra.charAt(j)-'a']++;
                
                for(int k=0; k<j; ++k){
                    int[] chars = new int[26];
                    int x = k;
                    int contador =0;
                    while(contador<=i-j){
                        ++chars[palavra.charAt(x)-'a'];
                        ++x;
                        ++contador;
                    }
                    boolean resposta = true;
                    for(x=0; x<26; ++x){
                        if(tmppalavra[x]!=chars[x]){
                            resposta = false;
                            break;
                        }
                    }
                    if(resposta) ++total_encontrado_anagramas;   
                }
                
            }
        }

        return total_encontrado_anagramas;
        
    }
}
