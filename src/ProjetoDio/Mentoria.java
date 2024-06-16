package ProjetoDio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {

   private LocalDate Data;

   @Override
   public double CalcularXP() {
      return XP_PADRAO + 20d;
   }

   public Mentoria() {

   }

   public LocalDate getData() {
      return Data;
   }

   public void SetData(LocalDate Data) {
      this.Data = Data;
   }


   @Override
   public String toString() {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      String dataFormatada = (Data != null) ? Data.format(formatter) : "Data não definida";
      return "Mentoria{" +
              "titulo='" + getTitulo() + '\'' +
              ", descricao='" + getDescricao() + '\'' +
              ", data=" + dataFormatada +
              '}';
   }

      public void setData(LocalDate now) {
   }


}