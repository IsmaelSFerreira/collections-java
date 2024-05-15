package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }


    public Set<String> getConjuntoPalavras() {
        return conjuntoPalavras;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((conjuntoPalavras == null) ? 0 : conjuntoPalavras.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
        if (conjuntoPalavras == null) {
            if (other.conjuntoPalavras != null)
                return false;
        } else if (!conjuntoPalavras.equals(other.conjuntoPalavras))
            return false;
        return true;
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!conjuntoPalavras.isEmpty()) {
            for(String p : conjuntoPalavras){
                if(p.equals(palavra)){
                    conjuntoPalavras.remove(p);
                    break;
                }
            }
        }
    }

    public void verificarPalavra(String palavra){
        if (!conjuntoPalavras.isEmpty()) {
            for(String p : conjuntoPalavras){
                if(p.equals(palavra)){
                    System.out.println("A palavra ["+palavra+"] está presente no conjunto.");
                    break;
                }
            }
        }
    }

    public void exibirPalavrasUnicas(){
        if (!conjuntoPalavras.isEmpty()) {
            System.out.println(conjuntoPalavras);
        }else{
            throw new RuntimeException("O conjunto está vazio.");
        }
        
    }

    public static void main(String[] args) {
        
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("Feijão");
        palavrasUnicas.adicionarPalavra("Arroz");
        palavrasUnicas.adicionarPalavra("Cuscuz");
        palavrasUnicas.adicionarPalavra("Lasanha");
        palavrasUnicas.adicionarPalavra("Pizza");

        palavrasUnicas.exibirPalavrasUnicas();

        palavrasUnicas.removerPalavra("Cuscuz");
        palavrasUnicas.exibirPalavrasUnicas();

        palavrasUnicas.verificarPalavra("Pizza");
    }

    


}
