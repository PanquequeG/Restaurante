package ingsoftware;

import java.util.Scanner;

/*

-Grijalva jaciel
$clase y atributos de alimentos y el menu principal 
- galindo arnoldo
$caso 1 de ver menu
-Luis Reyna
$caso 2 seleccionar platillo
-Elioth Tanori
$caso 3 pagar

 */
public class Principal {

    public static void main(String[] args) {

        // empiesa jaciel grijalva  
        //se declara el sacanner para pedir los datos por consola 
        Scanner t = new Scanner(System.in);

        //el arreglo unidimensional de objetos sacado de la calse Alimentos con 100 espacios 
        //para posibles platillos agregarlos en un futuro 
        Alimentos[] alimentos = new Alimentos[100];

        //Declaracion de los alimentos de cada tipo 
        //Platillos
        alimentos[1] = new Alimentos("-Mole", "\n-chile \n-Especias \n-Piezas de guajolote o pollo \n-Totillas", 20);
        alimentos[2] = new Alimentos("-Cochinita pibil", "\n-Especies \n-Manteca de cerdo fundida \n-lomo de cerdo cabeza \n-Hoja de plátano asadas", 30);
        alimentos[3] = new Alimentos("-Frijol con queso", "\n-frijoles bayos \n-queso chihuahua \n-sal", 40);
        alimentos[4] = new Alimentos("-Barbacoa", "\n-carne de res \n-Especies", 50);
        alimentos[5] = new Alimentos("-Pescado asado", "\n-pescado tilapia \n-ajo \n-cebolla en polvo", 350);

        //Postres
        alimentos[6] = new Alimentos("-Pay de queso", "\n-queso crema \n-lechera", 15);
        alimentos[7] = new Alimentos("-Pastel de chocolate", "\n-Leche condensada \n-chocolate semiamargo fundido \n-Media crema nestle", 10);
        alimentos[8] = new Alimentos("-Crepas", "\n-harina de trigo \n-choco milk  \n-Leche", 25);
        alimentos[9] = new Alimentos("-Pay de manzana", "\n-canela molida \n-pasas \n-Nuez picada \n-Manzanas amarillas cortadas en rebanadas", 20);
        alimentos[10] = new Alimentos("-Flan", "\n-Leche Condensada \n-Leche Leche Evaporada \n-queso crema", 35);

        //bebidas
        alimentos[11] = new Alimentos("-Jamaica", "\nagua \n-Flor de Jamaica \n-Hielos \n-Azúcar al gusto", 50);
        alimentos[12] = new Alimentos("-Limonada", "\n-Limón \n-Agua natural \n-Hielos \n-Azúcar al gusto", 10);
        alimentos[13] = new Alimentos("-Horchata", "\n-Almendras \n-Leche evaporada \n-Arroz \n-Leche de Vaca \n-Hielos ", 20);
        alimentos[14] = new Alimentos("-Jugo de naranja", "\n-Naranjas \n-Agua Natural \n-Hielos \n-Azúcar al gusto", 10);
        alimentos[15] = new Alimentos("-Limonada", "\n-Limón \n-Agua natural \n-Hielos \n-Azúcar al gusto", 15);

        //variables principales para iniciar el programa
        String nombre;
        int opc, seleccion, numeroMesa;
        double acumulador = 0;

        //damos la bienvenida y pedimos datos
        System.out.println("Buen dia por favor compruebe los datos");
        System.out.println("Nombre:");
        nombre = t.nextLine();
        System.out.println("Numero de Mesa:");
        numeroMesa = t.nextInt();
        //aqui termina jaciel grijalva

        do {
            //hacemos el menu principal
            System.out.println("Bienvenido seleccione lo que desea ver");
            System.out.println("1-Ver Menu");
            System.out.println("2-Seleccionar Platillos");
            System.out.println("3-Pagar");
            System.out.println("5-salir");
            opc = t.nextInt();

            switch (opc) {
                //caso 1 para ver menu
                //empieza arnoldo
                case 1:
                    /* NOTA: antes de iniciar el programa tiene que estar ya el 
                    arreglo definido con sus atributos en los espacios correspondidos*/

 /*declaramos una variable agregandole cualquier valor
                    ya que tiene que estar inicializada 
                     de lo contrario dara error*/
                    char decicion = 'a';
                    /*iniciamos un ciclo que determinara si el cliente
                      quiere ver los ingredientes de los platillos*/
                    do {
                        /*se hace la primera comparacion y en esta sabemos
                        que va a entrar si o si para presentar los alimentos
                        sin sus ingredientes*/

                        if (decicion == 's') {
                            System.out.println("Platillos con ingredientes son: ");
                        } else {

                            /*despues de hacer la comparacion entra al
                              ciclo for para presentar el nombre y precio 
                              de los alimentos en si el menu*/
                            for (int i = 0; i < alimentos.length; i++) {
                                if (alimentos[i] != null) {
                                    System.out.println(alimentos[i].toString());
                                }
                            }
                        }

                        /* una ves fuera ya presentado el menu preguntamos 
                          si quiere ver los ingredientes de los platillos*/
                        System.out.println("quiere ver los ingredientes? s o n");
                        decicion = t.next().charAt(0);
                        /*si la decicion es si se muestran los platillos 
                        con sus ingerdientes de lo contrario da por finalizado este apartado*/
                        if (decicion == 's') {
                            for (int i = 0; i < alimentos.length; i++) {
                                //comprobamos los espacios vacios
                                if (alimentos[i] != null) {
                                    //llamamos al metodo de la calse Alimentos para mostrar los ingredientes
                                    System.out.println(alimentos[i].mostrarDatosDescripcion());
                                }
                            }
                        }
                        //el while que determina si finaliza o sigue
                    } while (decicion != 'n');

                    //aqui termina el caso 1
                    //termina arnoldo
                    break;

                //empieza caso 2
                //epieza Luis Reyna
                /* NOTA: antes de iniciar el programa tiene que estar ya el 
                    arreglo definido con sus atributos en los espacios correspondidos*/
                case 2:
                    /*iniciamos con un ciclo do para repetir mientras el cliente 
                      no quiera salir*/
                    do {
                        //al agregar producto es para ir acumulando los pedidos
                        System.out.println("1-Agregar producto");
                        //esta opcion muestra el precion de los productos acumulados 
                        System.out.println("2-mostrar precio");
                        //esta variable determinara la decicion en un switch
                        opc = t.nextInt();

                        //se delcara el switch para hacer la opcion que quiera el cliente
                        switch (opc) {
                            //en el caso 1
                            case 1:
                                //iniciamos con un ciclo do while
                                do {
                                    //ciendo la opcion 1 le mostramos los alimentos solo con el nombre y precio
                                    for (int a = 0; a < alimentos.length; a++) {
                                        //mostramos las pocisiones del arreglo solo los espacios vacios
                                        if (alimentos[a] != null) {
                                            System.out.println(alimentos[a].toString());
                                        }
                                    }

                                    //le decimos las opciones que tiene 
                                    System.out.println("selecione 16 para dejar de sumar");
                                    System.out.println("Seleccione los productos");
                                    seleccion = t.nextInt();
                                    // despues de que el cliente seleccione

                                    /*comparamos la decicion como es el apartado para registrar 
                                    alimentos solo tenemos 15 espacios entonces comparamos si
                                    la decicion es mas de los que tenemos registrados de ser asi
                                    damos el mensaje de parametro no registrado*/
                                    if (seleccion > 15) {
                                        System.out.println("Parametro no registrado...");
                                    } else {
                                        //de lo contrario se ejecuta la accion
                                        if (seleccion <= 15) {
                                            for (int i = 0; i < alimentos.length; i++) {
                                                if (alimentos[i] != null) {
                                                    //y se van sumando los Alimentos seleccionados
                                                    acumulador = acumulador + alimentos[seleccion].getPrecio();
                                                    break;
                                                }

                                            }
                                        }
                                    }
                                    //dependiendo de la decicion del cliente se dejara de sumar
                                } while (seleccion != 16);
                                break;

                            /*en el caso dos le daremos lo acumulado si quiere verlo de los contrario 
                                procedera a realizar el pago*/
                            case 2:
                                /*comparamos si el acumulador tine algun valor sabemos que en caso de 
                                no tenerlo es porque aun no a seleccionado nada*/
                                if (acumulador <= 0) {
                                    //mostramos el mensaje si aun no seleccoina nada
                                    System.out.println("Aun no hay productos seleccion");

                                } else {
                                    //de lo contrario mostramos la cantidad acumulada
                                    if (acumulador > 0) {
                                        System.out.println("Precio acumulado es:" + acumulador);
                                    }
                                }

                                break;
                        }

                    } while (opc != 16);
                    //termina caso 2
                    //termina Luis Reyna
                    break;

                case 3:
                    //Empieza Elioth Tanori
                    /* NOTA: antes de iniciar el programa tiene que estar ya el 
                    arreglo definido con sus atributos en los espacios correspondidos*/
                    
                    //igual como el anterior comparamos si hay una cantidad acumulada
                    if (acumulador <= 0) {
                        //caso de ser no se muestra el mensaje
                        System.out.println("aun no hay platillos acumulados");
                    } else {
                        //en caso de lo contrario se continua con el pago mostrando el total
                        System.out.println("cantidad total que pagara: " + acumulador);

                        //mostramos las opciones de pago
                        System.out.println("como desea pagar?");
                        System.out.println("1-efectio");
                        System.out.println("2-targeta");
                        int pagar = t.nextInt();
                        
                        //dependiendo de la opcion se realizara la accion
                        switch (pagar) {
                            //en caso de ser 1
                            case 1:
                                //el cliente ingresa la cantidad
                                System.out.println("deposite la cantidad que desea pagar: ");
                                double cantidadUsuario = t.nextDouble();
                                
                                //verificamos la cantidad que ingreso para ver si queda en 0 o tiene que ingresar mas
                                if (cantidadUsuario == acumulador) {
                                    acumulador = acumulador - cantidadUsuario;
                                }
                                //mostramos los mensajes finales 
                                System.out.println("la cantidad pendiente es: " + acumulador);
                                //el nombre que se debe pedir al inicio se mostraran aqui junto con el numero de mesa
                                System.out.println("que tenga un buen dia " + nombre + " de la mesa " + numeroMesa);

                                break;
                            case 2:
                                //se pide numero de tarjeta
                                System.out.println("Ingrese numero de tarjeta");
                                String numeroTargeta = t.nextLine();
                                //el cliente ingresa la cantidad que transferira
                                System.out.println("deposite la cantidad que desea pagar: ");
                                cantidadUsuario = t.nextDouble();
                                
                                //verificamos la cantidad que ingreso para ver si queda en 0 o tiene que ingresar mas
                                if (cantidadUsuario == acumulador) {
                                    acumulador = acumulador - cantidadUsuario;
                                }
                                //mostramos los mensajes finales 
                                System.out.println("la cantidad pendiente es: " + acumulador);
                                //el nombre que se debe pedir al inicio se mostraran aqui junto con el numero de mesa
                                System.out.println("que tenga un buen dia " + nombre + " de la mesa " + numeroMesa);
                                break;
                        }
                    }
                    //termina caso 3
                    //termina Elioth Tanori

                    break;

            }
        } while (opc != 5);

    }

}
