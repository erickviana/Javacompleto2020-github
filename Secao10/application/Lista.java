package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); 
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		//adiciona Marco a posição 2 do vetor
		list.add(2, "Marco");
		
		//mostra o tamanho da lista
		System.out.println(list.size());
		
		//lista for each
		for(String x: list) {
			System.out.println(x);
		}
		
		System.out.println("--------------");
		
			//remove da lista
			//list.remove("Anna");
			//list.remove(1);
			//remove da lista todos que começam com letra M
			list.removeIf(x -> x.charAt(0) == 'M');
				
		//lista for each
		for(String x: list) {
			System.out.println(x);
		}
		
		System.out.println("--------------");
		//mostra qual a posição do elemento na lista
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("--------------");
		//filtra somente os elementos que começam com a letra A
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x: result) {
			System.out.println(x);
		}
		System.out.println("--------------");
		//encontra o primeiro elemento que começa com A
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println("--------------");
		//encontra o primeiro elemento que começa com A se não encontra retorna nulo
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name2);
		
	}

}
