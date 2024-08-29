package questao1;

public class Questao1 {
    public static void main(String[] args) {

        Integer[] vetorA = {2, 6, 3, 2, 4, 7, 9, 1, 5, 8};
        Integer[] vetorB = {6, 2, 3, 4, 5, 6, 2, 3, 9, 4};
        Boolean[] vetorC = new Boolean[10];
        for(int i = 0; i < vetorA.length; i++) {
            if(vetorA[i] * vetorB[i] % 2 == 0) {
                vetorC[i] = true;
            } else {
                vetorC[i] = false;
            }
        }

    }
}