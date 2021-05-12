import java.time.LocalDateTime;

public class ExemploExercicioLocalDateTime {
    public static void main(String[] args) {
        //Adicione 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        LocalDateTime future = now.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(future);
    }
}
