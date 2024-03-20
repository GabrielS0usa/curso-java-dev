package aula_11;

public class Aula_11a {
	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG   ";

		/* tolowerSase() Deixas toda string em minusculo.*/
		String s01 = original.toLowerCase();
		// toUpperCase() Deixa toda a string em maiusculo
		String s02 = original.toUpperCase();
		// trim() Elimina os espaços em brenco no inicio e no fim da String
		String s03 = original.trim();
		// substring() Corta a string a parti do caractere selecionado
		String s04 = original.substring(2);
		// substring() Corta a string a parti do caractere selecionado e termina no
		// caractere selecionado
		String s05 = original.substring(2, 10);
		// replace() Troca os caracteres da indicado a esqueda pelo caractere indicado a
		// direita
		String s06 = original.replace('a', 'x');
		// replace() Também fuciona para substring
		String s07 = original.replace("abcde", "edcba");
		// indexOf("bc") Mostra a primeira posição que começa a string
		int i = original.indexOf("bc");
		// lastIndexOf("bc") Mostra a última posição que acaba a string
		int j = original.lastIndexOf("bc");
		//split(" "); Separa a string a parti do separador indicado em aspas e coloca em um vetor
		String s = "fix ball cat";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];

		System.out.println("Original: " + "-" + original + "-");
		System.out.println("toLowerCase() :" + "-" + s01 + "-");
		System.out.println("toUpperCase() :" + "-" + s02 + "-");
		System.out.println("trim() :" + "-" + s03 + "-");
		System.out.println("substring(2) :" + "-" + s04 + "-");
		System.out.println("substring(2, 10) :" + "-" + s05 + "-");
		System.out.println("replace('a', 'x') :" + "-" + s06 + "-");
		System.out.println("replace(abcde, edcba) :" + "-" + s07 + "-");
		System.out.println("Index of 'bc' : " + i );
		System.out.println("Last Index of 'bc' : " + j );
		System.out.println("word1: " + word1);
		System.out.println("word2: " + word2);
		System.out.println("word3: " + word3);
		
		
	}
}
