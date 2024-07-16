import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de empleados y trabajos
        System.out.print("Ingrese la cantidad de empleados en el taller: ");
        int empleados = scanner.nextInt();
        System.out.print("Ingrese el número de trabajos a registrar: ");
        int canTrabajos = scanner.nextInt();


        //El numero de trabajos a realizar no puede superar al numero de empleados
        if (canTrabajos > empleados) {
            System.out.println("El número de trabajos no puede superar la cantidad de empleados.");

        }

        // Primera dimension -> Empleado
        // Segunda dimension -> tipoVehiculo
        // Tercera dimension -> detallesVehiculo

        // array de tres dimensiones
        String[][][] trabajos = new String[empleados][2][4];

        // Pedir la información de cada vehículo
        scanner.nextLine(); // con esta linea limpiamos el buffer para que no se venga con el enter
        //
        for (int i = 0; i < canTrabajos; i++) {
            System.out.print("Ingrese el nombre del trabajador asignado al trabajo " + (i + 1) + ": ");
            String trabajador = scanner.nextLine();

            System.out.print("Ingrese el tipo de vehículo (1.moto / 2.automóvil): ");
            String tipoVehiculo = scanner.nextLine();
            //Se realiza condición ternaria para escoger tipo de vehiculo
            // Con el equalsIgnoreCase no importa si el ususario escribe en minuscula o mayúscula.

            int tipo = tipoVehiculo.equalsIgnoreCase("moto") ? 0 : 1;

            System.out.print("Ingrese la marca del vehículo: ");
            String marca = scanner.nextLine();

            System.out.print("Ingrese el modelo del vehículo: ");
            String modelo = scanner.nextLine();

            System.out.print("Ingrese el año del vehículo: ");
            String año = scanner.nextLine();

            System.out.print("Ingrese el estado del vehículo (Pendiente, En reparación, Reparado): ");
            String estado = scanner.nextLine();

            // Almacenar los datos en el array tridimensional
            trabajos[i][tipo][0] = marca;
            trabajos[i][tipo][1] = modelo;
            trabajos[i][tipo][2] = año;
            trabajos[i][tipo][3] = estado;
        }

        // Mostrar todos los vehículos
        System.out.println("\nLista de vehículos:");
        for (int i = 0; i < canTrabajos; i++) {
            for (int j = 0; j < 2; j++) {
                if (trabajos[i][j][0] != null) {
                    String tipo = (j == 0) ? "Moto" : "Automóvil";


                    System.out.println("*****************************************************************************************");
                    System.out.print("|Trabajadores: " + (i + 1));
                    System.out.print("| Tipo Vehículo: " + tipo);
                    System.out.print("| Marca: " + trabajos[i][j][0]);
                    System.out.print("| Modelo: " + trabajos[i][j][1]);
                    System.out.print("| Año: " + trabajos[i][j][2]);
                    System.out.println("| Estado: " + trabajos[i][j][3]);
                    System.out.println("*****************************************************************************************");


                }
            }
        }

        // Contar y mostrar cuántos vehículos hay en cada estado
        int[] estados = new int[3]; // [Pendiente, En reparación, Reparado]
        for (int i = 0; i < canTrabajos; i++) {
            for (int j = 0; j < 2; j++) {
                if (trabajos[i][j][0] != null) {
                    switch (trabajos[i][j][3].toLowerCase()) {
                        case "pendiente":
                            estados[0]++;
                            break;
                        case "en reparacion":
                            estados[1]++;
                            break;
                        case "reparado":
                            estados[2]++;
                            break;
                    }
                }
            }
        }

        // Se imprime la sumatoria del estado de los vehiculos
        System.out.println("Vehículos en estado 'Pendiente': " + estados[0]);
        System.out.println("Vehículos en estado 'En reparación': " + estados[1]);
        System.out.println("Vehículos en estado 'Reparado': " + estados[2]);

        // Buscar un vehículo por su marca y modelo
        System.out.print("\nIngrese la marca del vehículo a buscar: ");
        String buscarMarca = scanner.nextLine();
        System.out.print("Ingrese el modelo del vehículo a buscar: ");
        String buscarModelo = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < canTrabajos; i++) {
            for (int j = 0; j < 2; j++) {
                if (trabajos[i][j][0] != null &&
                        trabajos[i][j][0].equalsIgnoreCase(buscarMarca) &&
                        trabajos[i][j][1].equalsIgnoreCase(buscarModelo)) {

                    String tipo = (j == 0) ? "Moto" : "Automóvil";
                    System.out.println("Vehículo encontrado:");
                    System.out.println("Trabajador: " + (i + 1));
                    System.out.println("Tipo: " + tipo);
                    System.out.println("Marca: " + trabajos[i][j][0]);
                    System.out.println("Modelo: " + trabajos[i][j][1]);
                    System.out.println("Año: " + trabajos[i][j][2]);
                    System.out.println("Estado: " + trabajos[i][j][3]);
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("Vehículo no encontrado.");
        }

        // Actualizar el estado de un vehículo específico
        System.out.print("\nIngrese la marca del vehículo cuyo estado desea actualizar: ");
        String actualizarMarca = scanner.nextLine();
        System.out.print("Ingrese el modelo del vehículo cuyo estado desea actualizar: ");
        String actualizarModelo = scanner.nextLine();

        boolean actualizado = false;
        for (int i = 0; i < canTrabajos; i++) {
            for (int j = 0; j < 2; j++) {
                if (trabajos[i][j][0] != null &&
                        trabajos[i][j][0].equalsIgnoreCase(actualizarMarca) &&
                        trabajos[i][j][1].equalsIgnoreCase(actualizarModelo)) {

                    System.out.print("Ingrese el nuevo estado del vehículo: ");
                    String nuevoEstado = scanner.nextLine();
                    trabajos[i][j][3] = nuevoEstado;
                    System.out.println("Estado actualizado correctamente.");
                    actualizado = true;
                }
            }
        }
        if (!actualizado) {
            System.out.println("Vehículo no encontrado.");
        }

        scanner.close();
    }
}