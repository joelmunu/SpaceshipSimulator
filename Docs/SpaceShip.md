# Clase SpaceShip
# Atributos
La clase SpaceShip cuenta con los siguientes atributos:
* nombre
* matriculaGalactica
* aceleracion
* velocidadX
* velocidadY
* coordenadaX
* coordenadaY
* direccionX
* direccionY
* ejeSeleccionado

> Junto a los atributos se encuentran sus métodos de acceso y un construcctor con los atributos nombre, 
matricula galactica y ejeSeleccionado, este último atributo permite al usuario seleccionar el eje en el que
se moverá.

# Métodos
## Método speedUp()
> El método speedUp, permite a la nave acelerar en los dos ejes disponibles, X e Y. La fórmula utilizada fue una de las vistas en clase.
> También permite saber donde se encuentra la nave tras acelerar mostrando sus coordenadas en ambos ejes.

## Método break()
> El método brake pemrite al usuario frenar o ir marcha atrás con la nave, utilizando la misma aceleración que hacia delante.
> La fórmula utilizada es la misma que la del método speedUp pero al revés.

## Método emergencyStop()
> Este método frenará la nave completamente, haciendo que su velocidad pase a ser cero inmediatamente, además mostrará que la velocidad es 0
> y las coordenadas actuales.

## Método toString()
> El método toString se ha sobrecargado para que muestre una representación gráfica de la nave mediante un AsciiArt
> El AsciiArt original fue seleccionado de la página del AscciArt Archive, y fue creado por un artista anónimo y modificado por mí.