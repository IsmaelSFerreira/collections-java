package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public List<Integer> getListaNumeros() {
        return listaNumeros;
    }


    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int totalSoma = 0;
        if(!listaNumeros.isEmpty()){
            for(int i = 0; i < listaNumeros.size(); i++){
                totalSoma = totalSoma + listaNumeros.get(i);
            }
        }
        return totalSoma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;

        if(!listaNumeros.isEmpty()){

            for(int cont = 0; cont < listaNumeros.size(); cont ++){
                if(listaNumeros.get(cont) > maiorNumero){
                    
                    maiorNumero = listaNumeros.get(cont);
                }
            }
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;

        if(!listaNumeros.isEmpty()){

            for(int cont = 0; cont < listaNumeros.size(); cont ++){
                if(listaNumeros.get(cont) < menorNumero){
                    
                    menorNumero = listaNumeros.get(cont);
                }
            }
        }

        return menorNumero;
    }

    public void exibirNumeros(){
        if(!listaNumeros.isEmpty()){
            System.out.println(listaNumeros);
        }else{
            System.out.println("A lista está vazia.");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(8);

        System.out.println("Soma total de todos os números da lista "+somaNumeros.calcularSoma());
        System.out.println("Maior número: "+ somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: "+ somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }



    
}
