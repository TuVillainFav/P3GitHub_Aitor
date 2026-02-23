public class Aplicacion {

private String nombre;
private int x;
private int y;
public Aplicacion(String nombre, int x, int y) {
    this.nombre = nombre;
    this.x = x;
    this.y = y;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public void mueveDerecha() {
	setX(x+1);
}
public void mueveIzquierda() {
	setX(x-1);
}
public void mueveArriba() {
	setY(y+1);
}
public void mueveAbajo() {
	setY(y-1);
}
public void imprimeElemento() {
	System.out.println("Nombre:"+nombre+"\n Posicion X:"+x+"\n Posicion Y:"+y);
}
}

