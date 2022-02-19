package des_02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class teste_desafio_02 {
    
    desafio_02 password = new desafio_02();

   @Test
   // Teste 01 - Senha "Ya3" - Número de caracteres à ser adicionado = 3
   public void Ya3Teste(){
        assertEquals(3, password.numero_da_senha("Ya3"));
    }          

   @Test
   // Teste 02 - Senha "Ya3$12" - Número de caracteres à ser adicionado = 0
   public void Ya3$12Teste(){
        assertEquals(0, password.numero_da_senha("Ya3$12"));
    }     

    @Test
   // Teste 03 - Senha "Ya3$3123456789" - Número de caracteres à ser adicionado = 0
   public void Ya3$3123456789Teste(){
        assertEquals(0, password.numero_da_senha("Ya3$3123456789"));
    }    
}
