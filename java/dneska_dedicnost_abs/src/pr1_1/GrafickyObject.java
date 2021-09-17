package pr1_1;

public abstract class GrafickyObject {
 protected int poziceX;
 protected int poziceY;
 protected int poziceZ;
 protected String barva;
 
 
 public int getPoziceZ() {
	return poziceZ;
}
public void setPoziceZ(int poziceZ) {
	this.poziceZ = poziceZ;
}
public int getPoziceX() {
	return poziceX;
}
public void setPoziceX(int poziceX) {
	this.poziceX = poziceX;
}
public int getPoziceY() {
	return poziceY;
}
public void setPoziceY(int poziceY) {
	this.poziceY = poziceY;
}
public String getBarva() {
	return barva;
}
public void setBarva(String barva) {
	this.barva = barva;
}

 
 public void vypisSouradnic() {
	 System.out.println("Pozice X je " + poziceX + ", pozice Y je "+ poziceY+ ", pozice Z je "+ poziceZ);
 }
 public abstract void  vykresli();
}
