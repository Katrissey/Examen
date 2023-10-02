package rocio.garciagil.examen;

public class Restaurante {

	private String nombre;

	public static void main(String[] args) {

		Restaurante restaurante = new Restaurante ("Restaurante Juani");
		restaurante.abrirRestaurante(restaurante);

	}
	
	public void abrirRestaurante (Restaurante restaurante) {
		
		Plato plato1 = new Plato("caracoles", 15.20, true);
		Plato plato2 = new Plato("merluza", 16.30, true);
		Plato plato3 = new Plato("tallarines carbonara", 9.50, true);
		Plato plato4 = new Plato("croquetas", 8.50, true);
		Plato plato5 = new Plato("Jamón de Jabugo", 30.60, false);

		Bebida bebida1 = new Bebida("cerveza", 2.70);
		Bebida bebida2 = new Bebida("agua", 1.20);

		Plato[] platos1 = { plato3, plato1, null };
		Plato[] platos2 = { plato2, plato4, plato5 };

		Bebida[] bebidas1 = { bebida1, bebida2 };
		Bebida[] bebidas2 = { bebida1 };
		Bebida[] bebidas3 = { bebida2 };

		Carta carta1 = new Carta("Menú del día normal", platos1, bebidas2);
		Carta carta2 = new Carta("Menú del día especial", platos2, bebidas3);
		
		mostrarPlatosDisponibles(carta1);
		mostrarPlatosDisponibles(carta2);
		
		queCartaDesea(carta1, carta2);
		
		importeCarta(carta1);
		importeCarta(carta2);
		
	}

	public void mostrarPlatosDisponibles(Carta carta) {

		if (carta.getPlatos()[2] != null) {
			System.out.println("\n\nMenú del día especial\n");

			if (carta.getPlatos()[0].isDisponible()) {
				System.out.println(carta.getPlatos()[0].getNombre());
			}

			if (carta.getPlatos()[1].isDisponible()) {
				System.out.println(carta.getPlatos()[1].getNombre());
			}

			if (carta.getPlatos()[2].isDisponible()) {

				System.out.println(carta.getPlatos()[2].getNombre());
			}
		} else {
			System.out.println("\n\nMenú del día normal\n\n" + carta.getPlatos()[0].getNombre() + "\n"
					+ carta.getPlatos()[1].getNombre());
		}
	}

	public void queCartaDesea(Carta... carta) {

		for (Carta cartas : carta) {
			mostrarPlatosDisponibles(cartas);
		}
		
		Utilidades.pideDatoNumerico("¿Qué menú desea escoger: normal (1) o especial (2)? \n\n");
		
		}
	
	public void importeCarta (Carta carta) {
		double plato1 = 0;
		double plato2 = 0;
		double plato3 = 0;
		
		if (carta.getPlatos()[2] != null) {
			System.out.println("\n\nMenú del día especial\n");

			if (carta.getPlatos()[0].isDisponible()) {
				plato1 = carta.getPlatos()[0].getPrecio();
			}

			if (carta.getPlatos()[1].isDisponible()) {
				plato2 = carta.getPlatos()[1].getPrecio();
			}

			if (carta.getPlatos()[2].isDisponible()) {

				plato3 = carta.getPlatos()[2].getPrecio();
			}
			
			double importeTotal = plato1 + plato2 + plato3;
			
			System.out.println (importeTotal);
			
		} else {
			System.out.println("\n\nMenú del día normal\n\n");
			plato1 = carta.getPlatos()[0].getPrecio();
			plato2 = carta.getPlatos()[1].getPrecio();
			
			double importeTotal = plato1 + plato2;
			
			System.out.println (importeTotal);

			
		}
		
	}

	public Restaurante(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
