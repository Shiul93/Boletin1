1. Crearemos una clase denominada �UtilidadesString� cuyo objetivo sea incluir una serie de 
m�todos que realizan operaciones sobre un String que se pasa por par�metro (supondremos 
por simplicidad que s�lo tiene caracteres del alfabeto). En concreto se definir�n los 
siguientes m�todos:
� �longitud�: Devolver� la longitud en caracteres del String
� �contar�: Devolver� el n�mero de veces que un determinado car�cter pasado por 
par�metro se repite en el String dado. Por sencillez en este m�todo diferenciaremos 
entre may�sculas y min�sculas
� �contarVocales�: Devolver� el n�mero de vocales existentes en el String dado
Tema: Bucles, sentencias condicionales, clase String
De utilidad: En el apartado de pr�cticas de Moodle os dejamos un fichero con la prueba 
JUnit de este ejercicio (pod�is ampliarla si lo consider�is necesario). Veremos JUnit en el 
pr�ximo TGR.
Por simplicidad pod�is suponer que todos los m�todos son m�todos de clase (static) de 
forma que no es necesario crear una clase para poder llamarlos
2. En la siguiente tabla tenemos las  puntuaciones (de 1 a 5) que un grupo de amigos han 
dado a ciertas pel�culas.
The Artist Hugo Biutiful Drive X-Men Torrente 4
Alberto 5 4 3 3 1 2
Joaquim 1 2 2 3 4 5
Alejandro 3 4 3 1 2 3
Chris 2 2 5 3 2 4
Robert 5 4 2 5 1 2
Implementa la siguiente tabla mediante arrays e implementa la siguiente funci�n:
� �calificacionPelicula�: Devuelve la calificaci�n media de una pel�cula dada pasada 
por par�metro
Tema: Bucles, arrays.De utilidad: Pod�is usar un array de enteros para las puntuaciones y un array de String para 
los nombres de las pel�culas. Los arrays pueden inicializarse usando llaves de la siguiente 
forma: �int [] miArray = {1, 2, 3};�
Recordar que el operador �/� realiza una divisi�n entera si sus argumentos son enteros y 
una divisi�n en coma flotante si sus argumentos est�n en coma flotante.
En el apartado de pr�cticas de Moodle os dejamos un fichero con la prueba JUnit de este 
ejercicio (pod�is ampliarla si lo consider�is necesario). 
3. Crea una clase �Persona� que permita representar individuos y que tiene los siguientes 
m�todos: 
� Un constructor que acepte un String que represente el DNI de dicho individuo en el 
siguiente formato �12345678Z�. El constructor debe comprobar que el DNI es 
v�lido (8 n�meros, una letra y dicha letra se obtiene realizando un c�lculo a partir de 
los n�meros). En caso de no ser correcto el DNI el constructor debe lanzar una 
excepci�n mediante la instrucci�n �throw new IllegalArgumentException();�. No se 
podr� construir una Persona sin pasarle el DNI.
� Un m�todo para leer el DNI de una persona dada. Una vez creada la persona su DNI 
no podr� ser cambiado
� Un m�todo de utilidad que dados los 8 n�meros de un DNI nos devuelve su letra 
correspondiente y que usaremos en el constructor para validar el DNI.
Tema: Encapsulaci�n de objetos, M�todos constructores.
De Utilidad:  En esta direcci�n pod�is encontrar el algoritmo del DNI: 
http://es.wikibooks.org/wiki/Algoritmo_para_obtener_la_letra_del_NIF. Tambi�n puede 
ser de utilidad la clase Character y sus m�todos o la clase Integer para convertir un String 
a un n�mero.
4. Crea una clase Barometro que almacene una presi�n atmosf�rica. Provee un constructor 
para el bar�metro que permita pasarle una  presi�n  y la unidad en que se encuentra 
(Pascales, milibares o atm�sferas). La representaci�n interna de la presi�n queda a 
decisi�n del alumno. El Barometro debe proporcionar:
� M�todos de lectura  getPascales,  getMilibares y  getAtmosferas, que 
devolver�n la presi�n atmosf�rica en la unidad que se le indica.
� M�todos de escritura setPascales, setMilibares y setAtmosferas.
� Implementa tambi�n un m�todo equals que permita comparar dos Barometro por 
su presi�n atmosf�rica. Recuerda que el contrato de  equals dice que si dos 
n�meros son iguales deben devolver el mismo c�digo hash. Por tanto, es necesario 
redefinir tambi�n el m�todo  hashCode (una forma de hacerlo es, en  Netbeans, utilizando el icono contextual en forma de bombilla que aparece a la derecha del 
m�todo y seleccionando "Generate missing hashCode()").
Tema: Encapsulaci�n de objetos, m�todos equals y hashCode.
De utilidad: para comparar dos n�meros en coma flotante se deben restar y comprobar que 
el valor absoluto de la diferencia es menor que un umbral significativamente peque�o. Se 
adjunta tambi�n tabla de conversiones (10
-2
se representa en Java como 1E-2):
Pascal milibar Atm�sfera
1 Pascal = 1 10
-2
0,987 x 10
-5
1 milibar = 10
2
1 0,987 x 10
-3
1 atm�sfera = 1,01325 x 10
5
1013,25 1
Recuerda que es posible que dos objetos distintos tengan el mismo c�digo hash, por lo que 
este m�todo no puede usarse para determinar la igualdad de dos objetos.
5. Crea una clase  �Carta� que incluya las caracter�sticas b�sicas de una carta de la baraja 
espa�ola (como el n�mero y el Palo). La clase �Carta� deber� ser inmutable, es decir, los 
objetos de dicha clase no podr�n modificarse despu�s de su creaci�n. Crea tambi�n  una 
clase  �Baraja� que se encargue de mantener una baraja de cartas, para ello tendr� un 
m�todo constructor que genere todas las cartas. Esta clase tambi�n ser� inmutable e incluir� 
un m�todo que nos permitir� ver la carta existente en una posici�n dada de la baraja.
Posteriormente crearemos en �Baraja� un m�todo que nos permita crear un mazo de cartas. 
B�sicamente un mazo de cartas ser� pr�cticamente igual que una baraja pero no ser� 
inmutable, por lo que pueden incluirse y eliminarse cartas del mazo. Adem�s el orden de las 
cartas al generarse el mazo a partir de la baraja siempre ser� aleatorio. La idea es que el 
�Mazo� se genera para cada partida de cartas a partir de la �Baraja�.
Tema: Composici�n de objetos, Objetos mutables e inmutables, Colecciones de objetos.
De utilidad:  Clases como �ArrayList�, �LinkedList�, etc. son la mejor alternativa a los 
arrays para representar colecciones de objetos.  Clases como �Arrays� o �Collections� 
incluyen m�todos que pueden ser de utilidad para el manejo de dichas colecciones.
Tambi�n es importante tener en cuenta que es complicado probar que un Mazo de cartas 
est� verdaderamente desordenado dada la aleatoriedad de los algoritmos de barajeo. Por 
simplicidad  ser� suficiente con hacer una prueba que analice que el mazo est� 
�razonablemente� desordenado de forma sencilla.
6. El ajedrez es un juego muy antiguo cuyos or�genes se remontan a la India en el siglo VI 
d.C. Se juega sobre un tablero cuadrado de sesenta y cuatro (ocho por ocho) casillas. Un 
jugador lleva las piezas blancas y el otro, las negras. Las piezas pueden ser de varios tipos: 
rey, dama, alfil, caballo, torre y pe�n.En este ejercicio vamos a dise�ar e implementar una clase Tablero que permita modelar 
un tablero de ajedrez y jugar una partida. Para ello, en primer lugar, necesitamos crear una 
clase Pieza que represente a las piezas de ajedrez. Cada Pieza se define por un tipo (que 
ser� REY, DAMA, ALFIL, CABALLO, TORRE o PEON) y un color (que ser� NEGRO 
o BLANCO). Estas propiedades habr� que definirlas como tipos enumerados.
La clase Tablero contendr� un array 8x8 de Pieza que servir� para almacenar la posici�n 
actual de las Piezas en el tablero. Debe incluir los siguientes m�todos:
a) iniciarPartida: establece la posici�n inicial de una partida de ajedrez (ver siguiente 
Figura).
Figura 1: posici�n inicial de una partida de ajedrez.
b) toString: devuelve una representaci�n del tablero en texto. Para ello se utilizar� la 
notaci�n FEN (ver descripci�n al final del ejercicio).
c) buscaPiezas: recibe un tipo de pieza y devuelve una lista de posiciones donde se 
encuentran las Piezas de ese tipo (blancas y negras). Crea una clase Posicion para 
almacenar las coordenadas.
d) mover: este m�todo se utiliza para realizar movimientos de Piezas en el Tablero. 
Recibe una Posicion de origen y una Posicion de destino. Si en la Posicion de 
destino hay una Pieza, se har� una captura, colocando en su lugar la pieza que 
estamos moviendo. Por simplicidad no se har�n comprobaciones de si el movimiento 
es v�lido o no. De todas formas el m�todo lanzar� excepciones si en la posici�n de 
origen no hay una pieza o si alguna de las posiciones es err�nea.
Tema:  Encapsulaci�n,  Objetos enumerados, colecciones de objetos, arrays, manejo de 
Strings.
De utilidad:
a. M�todos de la clase String y de la clase StringBuilder (versi�n mutable de String)b. Clase java.util.ArrayList, para manejar f�cilmente colecciones de objetos.
c. Notaci�n FEN: la notaci�n FEN (Forsyth-Edwards Notation) es una notaci�n 
est�ndar para describir una posici�n de tablero particular de una partida de ajedrez
(ver ejemplo en la Figura 2). Un tablero de ajedrez se compone de ocho filas. El 
contenido de cada fila se describe con una cadena de texto y las ocho cadenas se 
compactan separ�ndolas con barras ("/"). Se describe cada fila, comenzando por la 
fila 8 y terminando por la fila 1 (de arriba abajo desde el punto de vista de las 
blancas). Dentro de cada fila, el contenido de cada casilla se describe comenzando 
por la columna "a" hasta la "h". Cada pieza se identifica por su primera letra: rey 
es "R", dama es "D", alfil "A", caballo "C", torre "T" y pe�n "P". Las piezas 
blancas se designan utilizando letras may�sculas ("RDACTP") y las piezas negras 
se designan utilizando letras min�sculas ("rdactp"). Las casillas vac�as se denotan 
utilizando un n�mero que indica el n�mero de casillas vac�as.
Figura 2: ejemplo para la comprensi�n de la notaci�n FEN.
La cadena de texto de cada fila se une a las dem�s utilizando la barra "/", como se 
dec�a m�s arriba. La cadena FEN del ejemplo (Figura 2) es 
t1ar3t/p2pApCp/c4c2/1p1CP2P/6P1/3P4/P1P1R3/d5a1
La cadena FEN de la posici�n inicial de una partida de ajedrez (ver Figura 1 m�s 
arriba) es tcadract/pppppppp/8/8/8/8/PPPPPPPP/TCADRACT
Se aconseja, por comodidad, utilizar notaci�n FEN para las pruebas.