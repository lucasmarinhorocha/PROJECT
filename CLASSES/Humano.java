package CLASSES;

public class Humano {

    public class estastisticas {
            int vida;
            int energia;

        public void atributos(int nivel) {
             vida = 20 + (nivel * 5);
             energia = 10 + (nivel * 3);


        }
          
        public int getVida() {
            return vida;
        } 
        
        public int getEnergia() {
            return energia;
        }
        
    }
    
 public class passiva {
     public void Engenhoso(){

            System.out.println("Aumenta a margem de critico em +1");

        }  
    public void economico(){

            System.out.println("Os itens tem o preço reduzido em 1 categoria");

        } 
    }

 public class habilidades {
     public void incentivas(double energia,double custo) {
        if(energia < custo){
            System.out.println("Energia insuficiente para usar a habilidade.");
        } else {
            System.out.println("Aumenta todos os atributos em +1 por 2 turnos.");
        }
        
    }

   public void cupula_de_protecao(double energia,double custo) {
        if(energia < custo){
            System.out.println("Energia insuficiente para usar a habilidade.");
        } else {
            System.out.println("fornece + 5 de ressitencia e restaura igual ao limite de energia a magia e armadura fisica");
        }
        
    }
}

    
}

 
   
