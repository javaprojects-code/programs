package pr2;

public class Polozka {
 private int data;
 private Polozka dalsi;
 private Polozka predchozi;
 
public Polozka getPredchozi() {
	return predchozi;
}
public void setPredchozi(Polozka predchozi) {
	this.predchozi = predchozi;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public Polozka getDalsi() {
	return dalsi;
}
public void setDalsi(Polozka dalsi) {
	this.dalsi = dalsi;
}
 
}
