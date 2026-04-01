package Poderes;

public class Warfare {

    public String[] ariete() {
        return new String[] {
            "Investe em linha reta, causando dano físico e derrubando inimigos em seu caminho.",
            "Alcance: 5m", "Execução: Instantânea", "Alvo: Inimigos em linha reta",
            "Duração: Instantânea", "Efeitos: Dano físico, Derrubar"
        };
    }

    public String[] pisadaDeBatalha() {
        return new String[] {
            "Golpeia o chão, derrubando inimigos à sua frente e limpando superfícies não amaldiçoadas.",
            "Alcance: 5m", "Execução: Instantânea", "Alvo: Inimigos à sua frente",
            "Duração: Instantânea", "Efeitos: Derrubar, Limpar superfície"
        };
    }

    public String[] escudoRicocheteante() {
        return new String[] {
            "Lança seu escudo em um inimigo; ele pode ricochetear para um segundo alvo próximo.",
            "Alcance: 10m", "Execução: Instantânea", "Alvo: Inimigo ou segundo alvo próximo",
            "Duração: Instantânea", "Efeitos: Dano físico, Ricochete"
        };
    }

    public String[] golpeAleijador() {
        return new String[] {
            "Um golpe poderoso que causa dano físico e aplica 'aleijado' ao alvo e inimigos próximos.",
            "Alcance: 2m", "Execução: Instantânea", "Alvo: Alvo e inimigos próximos",
            "Duração: Instantânea", "Efeitos: Dano físico, Aleijado"
        };
    }

    public String[] ataqueBlitz() {
        return new String[] {
            "Salta entre até dois alvos, atingindo cada um com um ataque físico.",
            "Alcance: 8m", "Execução: Instantânea", "Alvo: Até 2 inimigos",
            "Duração: Instantânea", "Efeitos: Dano físico"
        };
    }

    public String[] barreiraDefletora() {
        return new String[] {
            "Cria uma barreira que reflete projéteis de volta para os atacantes e fornece armadura física.",
            "Alcance: Pessoal", "Execução: Instantânea", "Alvo: Você mesmo",
            "Duração: Até ser quebrada", "Efeitos: Reflexo de projéteis, Armadura física"
        };
    }

    public String[] enfurecer() {
        return new String[] {
            "Inspira um aliado com fúria, garantindo acertos críticos, mas silenciando-o.",
            "Alcance: 10m", "Execução: Instantânea", "Alvo: 1 aliado",
            "Duração: 2 turnos", "Efeitos: Acerto crítico garantido, Silêncio"
        };
    }

    public String[] mergulhoDaFenix() {
        return new String[] {
            "Salta para uma posição alvo, criando uma superfície de fogo ao aterrissar.",
            "Alcance: 15m", "Execução: Instantânea", "Alvo: Área de aterrissagem",
            "Duração: 2 turnos", "Efeitos: Dano físico, Superfície de fogo"
        };
    }

    public String[] provocar() {
        return new String[] {
            "Provoca inimigos ao redor para que eles foquem seus ataques em você.",
            "Alcance: 6m", "Execução: Instantânea", "Alvo: Inimigos ao redor",
            "Duração: 1 turno", "Efeitos: Provocar"
        };
    }

    public String[] redemoinho() {
        return new String[] {
            "Realiza um ataque giratório que atinge todos os inimigos ao seu redor.",
            "Alcance: 3m", "Execução: Instantânea", "Alvo: Todos ao redor",
            "Duração: Instantânea", "Efeitos: Dano físico em área"
        };
    }

    public String[] desafio() {
        return new String[] {
            "Marca um inimigo; se ele morrer em 3 turnos, você ganha bônus de vida e dano.",
            "Alcance: 12m", "Execução: Instantânea", "Alvo: 1 inimigo",
            "Duração: 3 turnos", "Efeitos: Marca, Bônus de vida e dano"
        };
    }

    public String[] anjoGuarda() {
        return new String[] {
            "Aliados próximos redirecionam metade do dano recebido para você.",
            "Alcance: 5m", "Execução: Instantânea", "Alvo: Aliados próximos",
            "Duração: 2 turnos", "Efeitos: Redirecionamento de dano"
        };
    }

    public String[] investida() {
        return new String[] {
            "Ataca cinco vezes rapidamente, cada golpe causando dano físico.",
            "Alcance: 2m", "Execução: Instantânea", "Alvo: 1 inimigo",
            "Duração: Instantânea", "Efeitos: Dano físico x5"
        };
    }

    public String[] noCalorDaLuta() {
        return new String[] {
            "Ganha um bônus de dano para cada personagem (aliado ou inimigo) próximo a você.",
            "Alcance: Pessoal", "Execução: Passiva", "Alvo: Você mesmo",
            "Duração: Contínua", "Efeitos: Bônus de dano por personagem próximo"
        };
    }

    public String[] dominar() {
        return new String[] {
            "Ataque massivo que destrói toda a armadura física do alvo se a sua armadura for maior que a dele.",
            "Alcance: 2m", "Execução: Instantânea", "Alvo: 1 inimigo",
            "Duração: Instantânea", "Efeitos: Dano físico, Destruir armadura"
        };
    }
}