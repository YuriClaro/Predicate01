package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		// criando a lista de produtos
		List<Product> list = new ArrayList<>();
		
		// adicionando os produtos manualmente
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// removendo todos os produtos que tem o pre�o menor que 100
		// � utilizado sem Programa��o Funcional
		list.removeIf(p -> p.getPrice() >= 100.00);
		

		// lendo todos os produtos e mandando imprimir na tela
		for (Product p : list) {
			System.out.println(p);
		}
		
	}

}
