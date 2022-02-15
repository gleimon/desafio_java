//Validador de senha com critérios obrigatórios, entre eles: no mínimo 6 caracteres, 01 digito, 01 letra minuscula, 01 letra maiuscula e 01 caracter especial.

import java.util.Scanner;

public class desafio_02 {
    public static void main(String[] args) {
        Scanner entrada_dados = new Scanner(System.in);
        String senha;
        int numero_minimo_caracteres, calculo;
        final String criterios_obrigatorios = "^(?:(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).*)$";

        numero_minimo_caracteres = 6;
        System.out.println("Usuário, por favor informe sua senha: ");
        senha = entrada_dados.nextLine();
                      
            if(senha.length() >=6 && senha.matches(criterios_obrigatorios)){
                System.out.println("Senha salva com sucesso!");
                }else {
                        if(senha.length() <6){
                        System.out.println("Senha inválida!");
                        calculo = (numero_minimo_caracteres - senha.length());
                        System.out.println("A senha deve ter no mínimo 6 caracteres! Segue quantidade de caracter(es) que ainda falta ser adicionado(s): "+calculo);
                        }else{
                        System.out.println("Senha inválida! Você deve digitar no mínimo: um digito, uma letra minúscula, uma letra maiúscula e um caracter especial .");
                        }
                    }        

        entrada_dados.close();
    }
}

    

