package entidades;

import java.util.Arrays;
import java.util.List;

public class Menu {

	public List<Bebida>bebidas = Arrays.asList(
		new Bebida("Xereta",4.00,TipoBebida.REFRIGERANTE),
		new Bebida ("Coca-Cola",10.00,TipoBebida.REFRIGERANTE),
		new Bebida("Guaraná Antartica",9.00,TipoBebida.REFRIGERANTE),
		new Bebida ("Brahma",2.50,TipoBebida.CERVEJA),
		new Bebida ("Skol",2.80,TipoBebida.CERVEJA),
		new Bebida ("Original",3.00,TipoBebida.CERVEJA),
		new Bebida("Balalaika",9.00,TipoBebida.DESTILADO),
		new Bebida ("Vodka Smirnoff",30.00,TipoBebida.DESTILADO),
		new Bebida ("Whisky",120.00,TipoBebida.DESTILADO)
	);

}
