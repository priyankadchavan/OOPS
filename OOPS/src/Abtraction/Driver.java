package Abtraction;

public class Driver {
public static void main(String[] args) {
	Son s=new GrandSon();
	GrandSon gs=(GrandSon)s;
	gs.buildHouse();
	gs.buyCar();
}
}