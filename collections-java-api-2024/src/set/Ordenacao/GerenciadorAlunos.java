package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        
        if(!alunosSet.isEmpty()){
            for(Alunos a : alunosSet){
                if(a.getMatricula() == matricula){
                    alunosSet.remove(a);
                    break;
                }
            }
        }else {
            throw new RuntimeException("O conjunto está vazio.");
        }
    }

    public Set<Alunos> exibirAlunosPorNome(){
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);

        return alunosPorNome;
    }

    public Set<Alunos> exibirAlunosPorNota(){
        Set<Alunos> alunosOrganizaPorNotas = new TreeSet<>(new OrganizaPorNota());
        alunosOrganizaPorNotas.addAll(alunosSet);
        return alunosOrganizaPorNotas;
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("João", 223, 8);
        gerenciadorAlunos.adicionarAluno("Alexa", 200, 10);
        gerenciadorAlunos.adicionarAluno("Rafael", 201, 0);
        gerenciadorAlunos.adicionarAluno("Antônia", 199, 9);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        gerenciadorAlunos.removerAluno(199);

        gerenciadorAlunos.exibirAlunos();
        
    }
    

    
    
}
