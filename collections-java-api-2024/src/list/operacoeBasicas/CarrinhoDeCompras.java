package list.operacoeBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> carrinhoCompras;

    public CarrinhoDeCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem (String nome, double preco, int quantidade){
        carrinhoCompras.add( new Item(nome, preco, quantidade));
    }

    public void removerItem (String nome){
        
        List<Item> itemsParaRemover = new ArrayList<>();

        for(Item i: carrinhoCompras){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(i);
            }
        }

        carrinhoCompras.removeAll(itemsParaRemover);

    }

    public double calcularValorTotal(){
        double valorTotal = 0.0;

        for(Item i: carrinhoCompras){
            double valor = i.getQuantidade()*i.getPreco();
            valorTotal += valor;
            valor = 0;
        }

        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinhoCompras);
    }

    public static void main(String[] args) {
        
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Arroz", 5, 5);
        carrinhoDeCompras.adicionarItem("Feijão", 8, 3);
        carrinhoDeCompras.adicionarItem("Carne", 20, 1);
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total: "+carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Carne");
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total: "+carrinhoDeCompras.calcularValorTotal());

    }



    
    
}
