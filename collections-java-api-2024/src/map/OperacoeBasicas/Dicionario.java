package map.OperacoeBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){

        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        if(!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);
        }else{
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String palavraPesquisa = dicionarioMap.get(palavra);

        if(palavraPesquisa != null){
            return palavraPesquisa;
        }

        return "Palavra não encontrada no dicionário.";
        
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Java", " Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", " Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", " Linguagem moderna de programação para a JVM.");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("kotlin");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Java"));

    }

    

    

    
}
