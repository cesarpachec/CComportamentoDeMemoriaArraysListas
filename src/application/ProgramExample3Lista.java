package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramExample3Lista {

	public static void main(String[] args) {

		// Pelo fato de list ser uma interface, é necessário que ao instanciar se
		// utilize uma classe que implementa a interface, a utilização de ArrayList
		// nesse caso se dá pelo fato de que esta é bem utilizada, já trabalhando bem
		// com as melhores características existentes tanto em um vetor como em uma
		// lista.
		List<String> list = new ArrayList<>();

		// Método utilizado para adição em uma lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana ");
		// pode-se indicar uma posição para adiciona algo em uma determinada posição sem
		// afetar o restante da lista
		list.add(2, "Marco");
		//Verificando o tamanho da lista
		System.out.println(list.size() );

		for (String string : list) {
			System.out.println(string);
		}
		
		//Removendo ítens da lista
		System.out.println("--------------------------");
		//primeiro uma remoção por ítem
		list.remove(1);
		//segundo uma remoção por predicado 
		list.removeIf(string -> string.charAt(0) == 'M'); 

		for (String string : list) {
			System.out.println(string);
		}
		
		//encontrando o posicionamento de um elemento
		System.out.println("--------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		//quando o elemento não é encontrado, o programa irá retorno o valor -1
		System.out.println("Index of Bob: " + list.indexOf("Joao"));
		
		System.out.println("--------------------------");
		//Deonstração apenas dos elementos de interesse 
		List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String string : result) {
			System.out.println(string);
		}
		
		//Busca do primeiro elemento com uma determinada caracteristica
		System.out.println("--------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}
}
