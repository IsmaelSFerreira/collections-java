package set.Ordenacao;

import java.util.Comparator;

public class Alunos implements Comparable<Alunos>{

    private String nome;
    private long matricula;
    private double nota;

    public Alunos(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    @Override
    public int compareTo(Alunos a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alunos [nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (matricula ^ (matricula >>> 32));
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
        Alunos other = (Alunos) obj;
        if (matricula != other.matricula)
            return false;
        return true;
    }
    
}

class OrganizaPorNota implements Comparator<Alunos>{

    @Override
    public int compare(Alunos a1, Alunos a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }

    

} 
