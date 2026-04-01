import java.util.HashMap;
import java.util.Map;

public class Pericias {
    

     
    private String tipo;   // Ex: "Espada"
    private int treino; // Ex: "Avançado"
    private int bonus;     // Ex: +5

// criar um construtor para a classe Pericia
    public Pericias(String tipo, int treino, int bonus) {
        this.tipo = tipo;
        this.treino = treino;
        this.bonus = bonus;
    }

    public String getTipo() { return tipo; }
    public int getTreino() { return treino; }
    public int getBonus() { return bonus; }

    public void inicializarPericias() {

        Map<String, Pericias> pericias = new HashMap<>();

        pericias.put("Luta", new Pericias("Força", 0, 0));
        pericias.put("Pontaria", new Pericias("Reflexo", 0, 0));
        pericias.put("Adestramento", new Pericias("Carisma", 0, 0));

        /* 
        pericias.values().forEach(pericia -> {
            System.out.println("Perícia: " + pericia.getTipo() + ", Treino: " + pericia.getTreino() + ", Bônus: " + pericia.getBonus());
        });
        */
    }

    public void listarPericias(Map<String, Pericias> pericias) {
        pericias.values().forEach(pericia -> {
            System.out.println("Perícia: " + pericia.getTipo() + ", Treino: " + pericia.getTreino() + ", Bônus: " + pericia.getBonus());
        });
    }
}
