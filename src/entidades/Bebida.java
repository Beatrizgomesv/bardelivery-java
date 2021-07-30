package entidades;

public class Bebida {
private String nome;
private Double preco;
private TipoBebida tipo;

public Bebida(String nome, Double preco, TipoBebida tipo) {

	this.nome = nome;
	this.preco = preco;
	this.tipo = tipo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Double getPreco() {
	return preco;
}

public void setPreco(Double preco) {
	this.preco = preco;
}

public TipoBebida getTipo() {
	return tipo;
}

public void setTipo(TipoBebida tipo) {
	this.tipo = tipo;
}

}

