package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		// Padrão americano de unidade 
		Locale.setDefault(Locale.US);
		
		// criando a lista de produtos
		List<Product> list = new ArrayList<>();
		
		// adicionando os produtos manualmente
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// removendo todos os produtos que tem o preço menor que 100
		// É utilizado sem Programação Funcional
		//list.removeIf(p -> p.getPrice() >= 100.00);
		
		// Utilizando a Interface Funcional
		//list.removeIf(new PredicateProduct());	

		// Utilizando uma expressão Lambda declarada
		Predicate<Product> pred = p -> p.getPrice() >= 100.00;
		list.removeIf(pred);
		
		// lendo todos os produtos e mandando imprimir na tela
		for (Product p : list) {
			System.out.println(p);
		}
		
	}

}
