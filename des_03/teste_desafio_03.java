package des_03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class teste_desafio_03 {
    
    desafio_03 anag = new desafio_03();

   @Test
   // Teste 01 - Palavra "ovo" - Número de Anagramas = 2
   public void ovoTesteAnagrama(){
        assertEquals(2, anag.numero_de_anagramas("ovo"));
   }          
   
   @Test
   // Teste 02 - Palavra "ifailuhkqq" - Número de Anagramas = 3
   public void ifailuhkqqTesteAnagrama(){
    assertEquals(3, anag.numero_de_anagramas("ifailuhkqq"));
   }

   @Test
    // Teste 03 - Palavra "abcd" - Número de Anagramas = 0
   public void abcdTesteAnagrama(){
    assertEquals(0, anag.numero_de_anagramas("abcd"));
   }
}
