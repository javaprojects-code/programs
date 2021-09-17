package streamovani;

public class Paket {
private Paket dalsi;
private String data;

public Paket(String data) {
	super();
	this.data = data;
	
}
public Paket getDalsi() {
	return dalsi;
}
public void setDalsi(Paket dalsi) {
	this.dalsi = dalsi;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}

}
