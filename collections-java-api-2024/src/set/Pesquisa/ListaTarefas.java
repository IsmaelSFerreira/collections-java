package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaRemovida = null;
        if(!listaDeTarefas.isEmpty()){
            for(Tarefa t : listaDeTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    listaDeTarefas.remove(t);
                    tarefaRemovida = t;
                    break;
                }
            }
        }else{
            throw new RuntimeException("A descrição não está presente na lista de tarefas.");
        }

        System.out.println("A tarefa: '"+tarefaRemovida+"' foi removida com sucesso.");
    }

    public void exibirTarefas(){
        System.out.println(listaDeTarefas);
    }

    public int contarTarefas(){
        return listaDeTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        if(!listaDeTarefas.isEmpty()){
            for(Tarefa t : listaDeTarefas){
                if(t.isConcluida()){
                    tarefasConcluidas.add(t);
                }
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if(!listaDeTarefas.isEmpty()){
            for(Tarefa t : listaDeTarefas){
                if(!t.isConcluida()){
                    tarefasPendentes.add(t);
                }
            }
        }

        return tarefasPendentes;

    }

    public void marcarTarefaConcluida(String descricao) {

        if (!listaDeTarefas.isEmpty()) {
            for (Tarefa t : listaDeTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(true);
                    break;
                }
            }
    
            // Verificar se a tarefa foi encontrada
            if (!listaDeTarefas.contains(new Tarefa(descricao, false))) {
                throw new RuntimeException("A tarefa não está presente.");
            }
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public void marcarTarefaPendente(String descricao){

        Tarefa tarefaParaMarcarComoPendente = null;

        if(!listaDeTarefas.isEmpty()){
            for(Tarefa t : listaDeTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaMarcarComoPendente = t;
                    break;
                }
                }
                if (tarefaParaMarcarComoPendente != null) {
                    if(tarefaParaMarcarComoPendente.isConcluida()) {
                      tarefaParaMarcarComoPendente.setConcluida(false);
                    }
            }
        }else{
            throw new RuntimeException("A lista esta vazia.");
        }

    }

    public void limparListaTarefas(){
        listaDeTarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Número de tarefas: "+listaTarefas.contarTarefas());
        listaTarefas.adicionarTarefa("Exercicio");
        listaTarefas.adicionarTarefa("Compras");
        listaTarefas.adicionarTarefa("JavaScript");
        listaTarefas.adicionarTarefa("React Native");
        listaTarefas.adicionarTarefa("Pyton");

        System.out.println("Número de tarefas: "+listaTarefas.contarTarefas());
        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("Exercicio");
        listaTarefas.marcarTarefaConcluida("Compras");

        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaPendente("Exercicio");
        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Pyton");
        listaTarefas.exibirTarefas();
        System.out.println("Número de tarefas: "+listaTarefas.contarTarefas());

        System.out.println("Tarefas concluidas: "+listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas concluidas: "+listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();
        System.out.println("Número de tarefas: "+listaTarefas.contarTarefas());
        
        


    }
    
    
}
