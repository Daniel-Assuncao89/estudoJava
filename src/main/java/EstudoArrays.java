public class EstudoArrays {
    public static void main(String[] args) {
        int[] numero = {1, 2, 3, 4, 5};
        System.out.println((numero.length));

        for(int i = 0; i < numero.length; i++){
            System.out.println("Posição " + i + " com valor " + numero[i]);
        }
        double soma = 0;

        for (double nota : numero) { //for each.
            soma += nota;
            System.out.println(soma);
        }

        String mensagem = (soma < 7 )? "você esta reprovado" : "você esta aprovado"; // condição ternaria
        System.out.println(mensagem);
    }
}
