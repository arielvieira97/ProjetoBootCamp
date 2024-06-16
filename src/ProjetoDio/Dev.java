package ProjetoDio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> ConteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> ConteudoConcluidos = new LinkedHashSet<>();

    public void InscreverBootCamp(BootCamp bootcamp){
        this.ConteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void Progredir(){
      Optional<Conteudo> conteudo = this.ConteudosInscritos.stream().findFirst();
      if(conteudo.isPresent()) {
          this.ConteudoConcluidos.add(conteudo.get());
          this.ConteudosInscritos.remove(conteudo.get());
      }else {
          System.err.println("Voce nao esta matriculado em nenhum conteudo!");
      }
    }


    public double CalcularTotalXp() {
    return this.ConteudoConcluidos.stream().mapToDouble(conteudo -> conteudo.CalcularXP()).sum();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return ConteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> ConteudosInscritos) {
        this.ConteudoConcluidos = ConteudosInscritos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return  ConteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> ConteudosConcluidos) {
        this.ConteudoConcluidos = ConteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(ConteudosInscritos, dev.ConteudosInscritos) && Objects.equals(ConteudoConcluidos, dev.ConteudoConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ConteudosInscritos, ConteudoConcluidos);
    }


}