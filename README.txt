1. Crearemos una clase denominada “UtilidadesString” cuyo objetivo sea incluir una serie de 
métodos que realizan operaciones sobre un String que se pasa por parámetro (supondremos 
por simplicidad que sólo tiene caracteres del alfabeto). En concreto se definirán los 
siguientes métodos:
• “longitud”: Devolverá la longitud en caracteres del String
• “contar”: Devolverá el número de veces que un determinado carácter pasado por 
parámetro se repite en el String dado. Por sencillez en este método diferenciaremos 
entre mayúsculas y minúsculas
• “contarVocales”: Devolverá el número de vocales existentes en el String dado
Tema: Bucles, sentencias condicionales, clase String
De utilidad: En el apartado de prácticas de Moodle os dejamos un fichero con la prueba 
JUnit de este ejercicio (podéis ampliarla si lo consideráis necesario). Veremos JUnit en el 
próximo TGR.
Por simplicidad podéis suponer que todos los métodos son métodos de clase (static) de 
forma que no es necesario crear una clase para poder llamarlos
2. En la siguiente tabla tenemos las  puntuaciones (de 1 a 5) que un grupo de amigos han 
dado a ciertas películas.
The Artist Hugo Biutiful Drive X-Men Torrente 4
Alberto 5 4 3 3 1 2
Joaquim 1 2 2 3 4 5
Alejandro 3 4 3 1 2 3
Chris 2 2 5 3 2 4
Robert 5 4 2 5 1 2
Implementa la siguiente tabla mediante arrays e implementa la siguiente función:
• “calificacionPelicula”: Devuelve la calificación media de una película dada pasada 
por parámetro
Tema: Bucles, arrays.De utilidad: Podéis usar un array de enteros para las puntuaciones y un array de String para 
los nombres de las películas. Los arrays pueden inicializarse usando llaves de la siguiente 
forma: “int [] miArray = {1, 2, 3};”
Recordar que el operador “/” realiza una división entera si sus argumentos son enteros y 
una división en coma flotante si sus argumentos están en coma flotante.
En el apartado de prácticas de Moodle os dejamos un fichero con la prueba JUnit de este 
ejercicio (podéis ampliarla si lo consideráis necesario). 
3. Crea una clase “Persona” que permita representar individuos y que tiene los siguientes 
métodos: 
• Un constructor que acepte un String que represente el DNI de dicho individuo en el 
siguiente formato “12345678Z”. El constructor debe comprobar que el DNI es 
válido (8 números, una letra y dicha letra se obtiene realizando un cálculo a partir de 
los números). En caso de no ser correcto el DNI el constructor debe lanzar una 
excepción mediante la instrucción “throw new IllegalArgumentException();”. No se 
podrá construir una Persona sin pasarle el DNI.
• Un método para leer el DNI de una persona dada. Una vez creada la persona su DNI 
no podrá ser cambiado
• Un método de utilidad que dados los 8 números de un DNI nos devuelve su letra 
correspondiente y que usaremos en el constructor para validar el DNI.
Tema: Encapsulación de objetos, Métodos constructores.
De Utilidad:  En esta dirección podéis encontrar el algoritmo del DNI: 
http://es.wikibooks.org/wiki/Algoritmo_para_obtener_la_letra_del_NIF. También puede 
ser de utilidad la clase Character y sus métodos o la clase Integer para convertir un String 
a un número.
4. Crea una clase Barometro que almacene una presión atmosférica. Provee un constructor 
para el barómetro que permita pasarle una  presión  y la unidad en que se encuentra 
(Pascales, milibares o atmósferas). La representación interna de la presión queda a 
decisión del alumno. El Barometro debe proporcionar:
• Métodos de lectura  getPascales,  getMilibares y  getAtmosferas, que 
devolverán la presión atmosférica en la unidad que se le indica.
• Métodos de escritura setPascales, setMilibares y setAtmosferas.
• Implementa también un método equals que permita comparar dos Barometro por 
su presión atmosférica. Recuerda que el contrato de  equals dice que si dos 
números son iguales deben devolver el mismo código hash. Por tanto, es necesario 
redefinir también el método  hashCode (una forma de hacerlo es, en  Netbeans, utilizando el icono contextual en forma de bombilla que aparece a la derecha del 
método y seleccionando "Generate missing hashCode()").
Tema: Encapsulación de objetos, métodos equals y hashCode.
De utilidad: para comparar dos números en coma flotante se deben restar y comprobar que 
el valor absoluto de la diferencia es menor que un umbral significativamente pequeño. Se 
adjunta también tabla de conversiones (10
-2
se representa en Java como 1E-2):
Pascal milibar Atmósfera
1 Pascal = 1 10
-2
0,987 x 10
-5
1 milibar = 10
2
1 0,987 x 10
-3
1 atmósfera = 1,01325 x 10
5
1013,25 1
Recuerda que es posible que dos objetos distintos tengan el mismo código hash, por lo que 
este método no puede usarse para determinar la igualdad de dos objetos.
5. Crea una clase  “Carta” que incluya las características básicas de una carta de la baraja 
española (como el número y el Palo). La clase “Carta” deberá ser inmutable, es decir, los 
objetos de dicha clase no podrán modificarse después de su creación. Crea también  una 
clase  “Baraja” que se encargue de mantener una baraja de cartas, para ello tendrá un 
método constructor que genere todas las cartas. Esta clase también será inmutable e incluirá 
un método que nos permitirá ver la carta existente en una posición dada de la baraja.
Posteriormente crearemos en “Baraja” un método que nos permita crear un mazo de cartas. 
Básicamente un mazo de cartas será prácticamente igual que una baraja pero no será 
inmutable, por lo que pueden incluirse y eliminarse cartas del mazo. Además el orden de las 
cartas al generarse el mazo a partir de la baraja siempre será aleatorio. La idea es que el 
“Mazo” se genera para cada partida de cartas a partir de la “Baraja”.
Tema: Composición de objetos, Objetos mutables e inmutables, Colecciones de objetos.
De utilidad:  Clases como “ArrayList”, “LinkedList”, etc. son la mejor alternativa a los 
arrays para representar colecciones de objetos.  Clases como “Arrays” o “Collections” 
incluyen métodos que pueden ser de utilidad para el manejo de dichas colecciones.
También es importante tener en cuenta que es complicado probar que un Mazo de cartas 
está verdaderamente desordenado dada la aleatoriedad de los algoritmos de barajeo. Por 
simplicidad  será suficiente con hacer una prueba que analice que el mazo está 
“razonablemente” desordenado de forma sencilla.
6. El ajedrez es un juego muy antiguo cuyos orígenes se remontan a la India en el siglo VI 
d.C. Se juega sobre un tablero cuadrado de sesenta y cuatro (ocho por ocho) casillas. Un 
jugador lleva las piezas blancas y el otro, las negras. Las piezas pueden ser de varios tipos: 
rey, dama, alfil, caballo, torre y peón.En este ejercicio vamos a diseñar e implementar una clase Tablero que permita modelar 
un tablero de ajedrez y jugar una partida. Para ello, en primer lugar, necesitamos crear una 
clase Pieza que represente a las piezas de ajedrez. Cada Pieza se define por un tipo (que 
será REY, DAMA, ALFIL, CABALLO, TORRE o PEON) y un color (que será NEGRO 
o BLANCO). Estas propiedades habrá que definirlas como tipos enumerados.
La clase Tablero contendrá un array 8x8 de Pieza que servirá para almacenar la posición 
actual de las Piezas en el tablero. Debe incluir los siguientes métodos:
a) iniciarPartida: establece la posición inicial de una partida de ajedrez (ver siguiente 
Figura).
Figura 1: posición inicial de una partida de ajedrez.
b) toString: devuelve una representación del tablero en texto. Para ello se utilizará la 
notación FEN (ver descripción al final del ejercicio).
c) buscaPiezas: recibe un tipo de pieza y devuelve una lista de posiciones donde se 
encuentran las Piezas de ese tipo (blancas y negras). Crea una clase Posicion para 
almacenar las coordenadas.
d) mover: este método se utiliza para realizar movimientos de Piezas en el Tablero. 
Recibe una Posicion de origen y una Posicion de destino. Si en la Posicion de 
destino hay una Pieza, se hará una captura, colocando en su lugar la pieza que 
estamos moviendo. Por simplicidad no se harán comprobaciones de si el movimiento 
es válido o no. De todas formas el método lanzará excepciones si en la posición de 
origen no hay una pieza o si alguna de las posiciones es errónea.
Tema:  Encapsulación,  Objetos enumerados, colecciones de objetos, arrays, manejo de 
Strings.
De utilidad:
a. Métodos de la clase String y de la clase StringBuilder (versión mutable de String)b. Clase java.util.ArrayList, para manejar fácilmente colecciones de objetos.
c. Notación FEN: la notación FEN (Forsyth-Edwards Notation) es una notación 
estándar para describir una posición de tablero particular de una partida de ajedrez
(ver ejemplo en la Figura 2). Un tablero de ajedrez se compone de ocho filas. El 
contenido de cada fila se describe con una cadena de texto y las ocho cadenas se 
compactan separándolas con barras ("/"). Se describe cada fila, comenzando por la 
fila 8 y terminando por la fila 1 (de arriba abajo desde el punto de vista de las 
blancas). Dentro de cada fila, el contenido de cada casilla se describe comenzando 
por la columna "a" hasta la "h". Cada pieza se identifica por su primera letra: rey 
es "R", dama es "D", alfil "A", caballo "C", torre "T" y peón "P". Las piezas 
blancas se designan utilizando letras mayúsculas ("RDACTP") y las piezas negras 
se designan utilizando letras minúsculas ("rdactp"). Las casillas vacías se denotan 
utilizando un número que indica el número de casillas vacías.
Figura 2: ejemplo para la comprensión de la notación FEN.
La cadena de texto de cada fila se une a las demás utilizando la barra "/", como se 
decía más arriba. La cadena FEN del ejemplo (Figura 2) es 
t1ar3t/p2pApCp/c4c2/1p1CP2P/6P1/3P4/P1P1R3/d5a1
La cadena FEN de la posición inicial de una partida de ajedrez (ver Figura 1 más 
arriba) es tcadract/pppppppp/8/8/8/8/PPPPPPPP/TCADRACT
Se aconseja, por comodidad, utilizar notación FEN para las pruebas.