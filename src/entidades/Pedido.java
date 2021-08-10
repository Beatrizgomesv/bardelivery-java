package entidades;

import java.util.Map;

public class Pedido {

	private Double valor;
	private StatusEnum status;
	private Map<Bebida, Integer> itens;
	private Cliente cliente;

	public Pedido(Double valor, Map<Bebida, Integer> itens, Cliente cliente) {
		this.valor = valor;
		this.status = StatusEnum.AGUARDANDO_CONFIRMACAO;
		this.itens = itens;
		this.cliente = cliente;
	}

	public Pedido(Double valor, Map<Bebida, Integer> itens) {
		this.valor = valor;
		this.status = StatusEnum.AGUARDANDO_CONFIRMACAO;
		this.itens = itens;

	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public Map<Bebida, Integer> getItens() {
		return itens;
	}

	public void setItens(Map<Bebida, Integer> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
