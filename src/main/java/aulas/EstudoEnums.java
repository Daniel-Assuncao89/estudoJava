package aulas;

import javax.swing.*;

/**
 * Enums são estruturas com constantes definidas
 * ex: dias da semana, meses do ano, turnos do dia, estações... etc
 */
public class EstudoEnums {
    public static void main(String[] args) {
        enum DiaDaSemana {
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }

        DiaDaSemana hoje = DiaDaSemana.QUINTA;
        System.out.println(hoje);

        enum NivelDev { JUNIOR, PLENO, SENIOR}
        NivelDev nivel = NivelDev.PLENO;

        switch (nivel){
            case JUNIOR -> System.out.println("Seu nivel é JUNIOR");
            case PLENO -> System.out.println(("Seu nivel é PLENO"));
            case SENIOR -> System.out.println("Seu nivel é SENIOR");
        }
    }
}
