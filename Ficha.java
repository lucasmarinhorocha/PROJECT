import java.util.List;

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

