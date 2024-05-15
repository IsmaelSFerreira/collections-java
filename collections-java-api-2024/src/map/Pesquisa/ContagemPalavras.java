package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {

        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
        } else {
            throw new RuntimeException("A lista de palavras está vazia.");
        }
    }

    public void exibirContagemPalavras() {
        if (!palavrasMap.isEmpty()) {
            System.out.println(palavrasMap);
        } else {
            throw new RuntimeException("A lista de palavras está vazia.");
        }
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorCont = 0;

        
            for(Map.Entry<String, Integer> entry : palavrasMap.entrySet()){
                if(entry.getValue() > maiorCont){
                    maiorCont = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
    }
            return palavraMaisFrequente;
}

    public Map<String, Integer> getPalavrasMap() {
        return palavrasMap;
    }

    public static void main(String[] args) {

        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Java", 12);
        contagemPalavras.adicionarPalavra("Pyton", 6);
        contagemPalavras.adicionarPalavra("React", 2);
        contagemPalavras.adicionarPalavra("C#", 4);

        contagemPalavras.removerPalavra("Pyton");
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
        contagemPalavras.exibirContagemPalavras();




    }
}
