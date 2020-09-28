package aplicacoes;

public class TempoStringBuffer {

	public static void main(String[] args1) {
		long startTime = System.currentTimeMillis();
		String texto = "";
		
		for (int i = 0; i <= 600000; i++) {
			texto += i + ", ";
			if(i % 10000 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println(texto);
		long endTime = System.currentTimeMillis();
		String tempoGastoString = "Tempo gasto (String): " + ((endTime - startTime)/1000) + "seg";

		StringBuffer sb = new StringBuffer("");
		startTime = System.currentTimeMillis();
		for (int i = 0; i <= 600000; i++) {
			sb.append(i + ", ");
		}
		
		System.out.println(sb);
		endTime = System.currentTimeMillis();
		String tempoGastoStringBuffer = "Tempo gasto (StringBuffer): " + ((endTime - startTime)/1000) + "seg";
		
		System.out.println(tempoGastoString + "\n" + tempoGastoStringBuffer);
	}
}
