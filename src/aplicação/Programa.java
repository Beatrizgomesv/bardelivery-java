package aplicação;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;

import entidades.Bebida;
import entidades.Cliente;
import entidades.Menu;
import entidades.Pedido;
import telas.JFmenu;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");

		System.out.println("Seja Bem vindo a Adega do Chaves");
		
		JFmenu jf = new JFmenu();
		
		jf.setVisible(true);
	/*	System.out.println("MENU:");
		menu.bebidas.forEach(bebida -> {
			System.out.println("\n" + bebida.getNome() + "\nPreço:R$" + df.format(bebida.getPreco()) + "\nTipo:"
					+ bebida.getTipo());
		});
		System.out.println("\n\nDigite a bebida desejada: ");
		String nomeDigitado = sc.next();
		System.out.println("Digite a quantidade:");
		int quantidadeDigitada = sc.nextInt();
		Bebida bebida = menu.bebidas.stream().filter(bbd -> bbd.getNome().equals(nomeDigitado)).findFirst()
				.orElse(null);

		System.out.println("Digite o seu nome: ");
		String nome = sc.next();

		System.out.println("Digite o endereço da entrega: ");
		String endereco = sc.next();
		Cliente cliente = new Cliente(nome, endereco);
		Pedido pedido = new Pedido(quantidadeDigitada * bebida.getPreco(), Map.of(bebida, quantidadeDigitada), cliente);
		pedido.getItens().keySet().stream().forEach(item -> System.out.println(pedido.getItens().get(item)+ " - " + item.getNome()));;
		System.out.println("TOTAL: R$" + df.format(pedido.getValor()));
		System.out.println("Pedido Confirmado"); */ 
		
	}
}
