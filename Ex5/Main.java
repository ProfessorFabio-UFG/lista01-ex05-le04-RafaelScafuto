package Ex5;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Apartamento ap1 = new Apartamento(101, 1, 75.0, "quitado");
        ap1.adicionarMorador(new Morador("Lucas Alves", "12345678900", "(11)91234-5678", new Date(), 'M', 1, 101, "ABC123"));

        Apartamento ap2 = new Apartamento(202, 2, 80.0, "financiado");
        ap2.adicionarMorador(new Morador("Maria Costa", "98765432100", "(11)98765-4321", new Date(), 'F', 2, 202, "DEF456"));

        System.out.println(ap1);
        System.out.println(ap2);
    }
}

