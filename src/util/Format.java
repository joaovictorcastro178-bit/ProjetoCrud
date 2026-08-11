package util;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Format{
    public static Date converterSqlDate (String dataTexto){
        // Definindo o formato que vai receber da View
        DateTimeFormatter formatoBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // String para Local Date
        LocalDate data = LocalDate.parse(dataTexto, formatoBrasil);
        //Local Date para Date/SQL
        return Date.valueOf(data);
    }
}