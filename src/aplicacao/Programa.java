package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entidades.Produto;
import services.ServicoCalculo;

public class Programa {

	public static void main(String[] args) {
		List<Produto> list = new ArrayList<>();

		String path = "C:\\circular\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				
				String[] campo = line.split(",");
				list.add(new Produto(campo[0], Double.parseDouble(campo[1])));
				line = br.readLine();
			}
			
			Produto x = ServicoCalculo.max(list);
			System.out.println("Mostrar o maior preço:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	}


