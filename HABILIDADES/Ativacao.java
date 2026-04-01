import Poderes.Warfare;

public class Ativacao {

    private static final int COL_NOME      = 22;
    private static final int COL_ALCANCE   = 14;
    private static final int COL_EXECUCAO  = 13;
    private static final int COL_ALVO      = 30;
    private static final int COL_EFEITOS   = 30;

    public static void main(String[] args) {
        Warfare w = new Warfare();

        String[][] habilidades = {
            { "Ariete",               String.join("|", w.ariete()) },
            { "Pisada de Batalha",    String.join("|", w.pisadaDeBatalha()) },
            { "Escudo Ricocheteante", String.join("|", w.escudoRicocheteante()) },
            { "Golpe Aleijador",      String.join("|", w.golpeAleijador()) },
            { "Ataque Blitz",         String.join("|", w.ataqueBlitz()) },
            { "Barreira Defletora",   String.join("|", w.barreiraDefletora()) },
            { "Enfurecer",            String.join("|", w.enfurecer()) },
            { "Mergulho da Fênix",    String.join("|", w.mergulhoDaFenix()) },
            { "Provocar",             String.join("|", w.provocar()) },
            { "Redemoinho",           String.join("|", w.redemoinho()) },
            { "Desafio",              String.join("|", w.desafio()) },
            { "Anjo Guarda",          String.join("|", w.anjoGuarda()) },
            { "Investida",            String.join("|", w.investida()) },
            { "No Calor da Luta",     String.join("|", w.noCalorDaLuta()) },
            { "Dominar",              String.join("|", w.dominar()) }
        };

        imprimirTabela(habilidades);
    }

    private static void imprimirTabela(String[][] habilidades) {
        String sep = linha(COL_NOME, COL_ALCANCE, COL_EXECUCAO, COL_ALVO, COL_EFEITOS);

        // Cabeçalho
        System.out.println(sep);
        System.out.printf("│ %-" + COL_NOME     + "s │ %-" + COL_ALCANCE  + "s │ %-"
                        + COL_EXECUCAO + "s │ %-" + COL_ALVO    + "s │ %-"
                        + COL_EFEITOS  + "s │%n",
                "Habilidade", "Alcance", "Execução", "Alvo", "Efeitos");
        System.out.println(sep);

        // Linhas de dados
        for (String[] hab : habilidades) {
            String nome    = hab[0];
            String[] c     = hab[1].split("\\|", -1);

            // índices do array retornado por Warfare:
            // 0 = descrição  1 = Alcance  2 = Execução  3 = Alvo  4 = Duração  5 = Efeitos
            String alcance  = limpar(extrair(c, 1), "Alcance: ");
            String execucao = limpar(extrair(c, 2), "Execução: ");
            String alvo     = limpar(extrair(c, 3), "Alvo: ");
            String efeitos  = limpar(extrair(c, 5), "Efeitos: ");

            System.out.printf("│ %-" + COL_NOME     + "s │ %-" + COL_ALCANCE  + "s │ %-"
                            + COL_EXECUCAO + "s │ %-" + COL_ALVO    + "s │ %-"
                            + COL_EFEITOS  + "s │%n",
                    nome, alcance, execucao, alvo, efeitos);

            // Linha de descrição logo abaixo, identada
            String desc = extrair(c, 0);
            if (!desc.isEmpty()) {
                System.out.printf("│  ↳ %-" + (COL_NOME + COL_ALCANCE + COL_EXECUCAO + COL_ALVO + COL_EFEITOS + 16)
                        + "s │%n", desc);
            }

            System.out.println(sep);
        }
    }

    private static String linha(int... larguras) {
        StringBuilder sb = new StringBuilder("├");
        for (int i = 0; i < larguras.length; i++) {
            sb.append("─".repeat(larguras[i] + 2));
            sb.append(i < larguras.length - 1 ? "┼" : "┤");
        }
        return sb.toString();
    }

    private static String extrair(String[] arr, int i) {
        return i < arr.length ? arr[i].trim() : "";
    }

    // Remove o prefixo "Alcance: ", "Alvo: " etc. para não repetir na coluna
    private static String limpar(String valor, String prefixo) {
        return valor.startsWith(prefixo) ? valor.substring(prefixo.length()) : valor;
    }
}