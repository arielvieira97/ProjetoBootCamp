package ProjetoDio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
    private String Nome;
    private String Descricao;
    private final LocalDate DataInicial = LocalDate.now();
    private final LocalDate DataFinal= DataInicial.plusDays(45);
    private Set<Dev> DevsInscritos = new HashSet<>();
    private Set<Conteudo> Conteudos = new LinkedHashSet<>();


    public String getNome(){
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Set<Dev> getDevsInscritos() {
        return DevsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        DevsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return Conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        Conteudos = conteudos;
    }

    public LocalDate getDataFinal() {
        return DataFinal;
    }

    public LocalDate getDataInicial() {
        return DataInicial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(Nome, bootCamp.Nome) && Objects.equals(Descricao, bootCamp.Descricao) && Objects.equals(DataInicial, bootCamp.DataInicial) && Objects.equals(DataFinal, bootCamp.DataFinal) && Objects.equals(DevsInscritos, bootCamp.DevsInscritos) && Objects.equals(Conteudos, bootCamp.Conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome, Descricao, DataInicial, DataFinal, DevsInscritos, Conteudos);
    }
}
