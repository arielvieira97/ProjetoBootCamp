package ProjetoDio;

public class Curso extends Conteudo {

    private int CargaHoraria;

    @Override
    public double CalcularXP() {
        return XP_PADRAO * CargaHoraria;
    }



   public Curso() {

   }


   public int getCargaHoraria() {
     return CargaHoraria;
   }

   public void setCargaHoraria(int CargaHoraria) {
       this.CargaHoraria = CargaHoraria;
   }

    @Override
   public String toString() {
        return "Curso{" +
                "Titulo='" + getTitulo() + '\'' +
                ", Descricao=" + getDescricao() + '\'' +
                ", CargaHoraria=" + CargaHoraria +
                '}';
    }
}
