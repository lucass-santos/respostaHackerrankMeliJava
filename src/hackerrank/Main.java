package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*
		 * Complete a seguinte função para que a mesma devolva todos os possíveis
		 * números de 4 dígitos, onde cada um seja menor ou igual a<maxDigit>, e a soma
		 * dos dígitos de cada número gerado seja 21 Exemplo maxDigit=6: 3666, 4566...
		 */
		
		int max_digit = 6;
		
		for (int x : geraSequencia(max_digit)) {
			System.out.println(x);
		}
		
		
	}

	public static List<Integer> geraSequencia(int max_digit) {
		List<Integer> list = new ArrayList<>();
		String strMaxDigit = Integer.toString(max_digit);
		int sum = 0;
		for (int i = 0; i<2; i++) {
			strMaxDigit +=strMaxDigit;
		}
		//System.out.println(strMaxDigit);
		int totalNumber = Integer.parseInt(strMaxDigit);
		//System.out.println(totalNumber);
		for(int i = 1000; i < totalNumber; i++) {
			String sequence = Integer.toString(i);
			//System.out.println(sequence);
			for (int h = 0; h < sequence.length(); h++) {
				if(Integer.parseInt(sequence.substring(h, h+1)) <= max_digit) {
					//System.out.println(sequence.substring(h, h+1));
					sum += Integer.parseInt(sequence.substring(h, h+1));
				}
			}
			
			if(sum == 21) {
				list.add(i);
			}
			sum = 0;
		}
		
		return list;
		
	}
}
