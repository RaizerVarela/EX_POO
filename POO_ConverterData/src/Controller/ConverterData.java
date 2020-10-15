package Controller;

import java.time.LocalDate;
import java.util.Scanner;

public class ConverterData {
 
    //Para testar informe para a função a data de inicio das olimpíadas do Brasil 05 de Agosto de 2016.
	//O resultado deverá ser : 2457606

    public static void main(String[] args) {

        System.out.println(recebeData());
    }

    private static long recebeData() {
        long dataJuliana;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a data que deseja converter no formato DD/MM/AAAA");
        String dataCompleta = sc.nextLine();
        int dia = Integer.parseInt(dataCompleta.substring(0, 2));
        int mes = Integer.parseInt(dataCompleta.substring(3, 5));
        int ano = Integer.parseInt(dataCompleta.substring(6));
        if (mes < 3) {
            ano -= 1;
            mes += 12;
        }
        return dataJuliana = convertData(dia, mes, ano);
    }

    private static Long convertData(int dia, int mes, int ano) {
        long dataBase = 15L + 10L + 1582L;
        long data = dia + mes + ano;
        int a=0, b=0, c=0;
        double d=0, e=0;
        if (comparaData(dia, mes, ano)) {
            a = ano / 100;
            b = a / 4;
            c = 2 - a + b;
            d = 365.25 * (ano + 4716);
            e = 30.6001 * mes + 1;
        }
        double dataJu = (d + e + dia + 0.5 + c - 1524.5) + 30;
        return  dataJu % 1 == 0 ? (long)dataJu-1 : (long)dataJu;
    }

    private static boolean comparaData(int dia, int mes, int ano) {
        LocalDate data = LocalDate.of(ano, mes, dia);
        LocalDate dataBase = LocalDate.of(1582, 10, 15);
        return data.isEqual(dataBase) || data.isAfter(dataBase);
    }


}