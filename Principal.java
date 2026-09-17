package Objetosperdidos;

public class Principal {
	public static void main(String[] args) {
		gestor gestor = new gestor(
				"Nicolas",
		         "Gomez",
                 12345678
   );
		
		Alumno alumno = new Alumno(
				"Juan",
				"Perez",
				98765432,
				"2 de Informatica"
);

		objetoperdido objeto = new objetoperdido(
				     1,
		          "Celular",
		          "10/09/2026",
		          "Salon de Informatica",
		          15000,
		          "2-INF",
		          "Guardado"
 );

	System.out.println("===== OBJETOS PERDIDOS =====");
		System.out.println();

		alumno.mostrarDatos();
		System.out.println();
        objeto.mostrarDatos();
        System.out.println();

        gestor.registrarObjeto(objeto);
        gestor.revisarObjeto(objeto);
        gestor.retirarObjeto(objeto);
}}


