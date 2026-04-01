import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

import CLASSES.Humano;
import java.util.Scanner;

public class Ficha {
    public void montagem(String classe) {
    if(classe.equalsIgnoreCase("Humano")) {
            Humano humano = new Humano();
            Humano.estastisticas stats = humano.new estastisticas();
            Humano.passiva passiva = humano.new passiva();
            Humano.habilidades habilidades = humano.new habilidades();


            int nivel = 1; // Exemplo de nível, você pode ajustar conforme necessário
            stats.atributos(nivel);
            
            int vida = stats.getVida();
            int energia = stats.getEnergia();
            int forca = 10;
            int destreza = 10;
            int inteligencia = 110;
            int vigor = 10;

            int[] atributos = {
                forca, 
                destreza, 
                inteligencia, 
                vigor
            };

            
   


            passiva.Engenhoso();
            passiva.economico();

            habilidades.incentivas(energia, 5);
            habilidades.cupula_de_protecao(energia, 7);

        } else {
            System.out.println("Classe não reconhecida. Por favor, escolha uma classe válida.");

            
            


        }  
    }




    public class Main {
    public static void main(String[] args){
        Ficha ficha = new Ficha();
        System.out.println("defina a classe do seu personagem:");
        Scanner scanner = new Scanner(System.in);
        String classe = scanner.nextLine();

        
        ficha.montagem(classe);



    }

}

}

