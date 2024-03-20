package br;

public class Principal {
	
	public static void main(String[] args) {
		Principal p = new Principal();
		System.out.print(p.getText()+" - "+p.getSoma(1, 2));
	}
	
	public String getText() {
		return "Test";
	}
	
	public int getSoma(int a, int b) {
		return a+b;
	}

}
