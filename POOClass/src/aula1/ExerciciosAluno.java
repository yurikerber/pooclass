package aula1;

import modelos.Aluno;

/**
 *
 * @author jonasdhein
 */
public class ExerciciosAluno {

    //public => É o modificador de acesso
    //permite que o método fique visível para outras classes
    //private => Permite que apenas a própria classe utilize o método
    //protected => ?
    //static => permite que o método seja invocado sem necessidade de criar uma
    //nova instância
    //void => o método em questão não tem retorno
    public static void main(String[] args) {

        Aluno objAluno1 = new Aluno();
        objAluno1.setIdade(36);
        objAluno1.setNome("Bruno");
        objAluno1.setAltura(1.76);
        objAluno1.setPeso(70.2);

        Aluno objAluno2 = new Aluno();
        objAluno2.setIdade(23);
        objAluno2.setNome("Yuri");
        objAluno2.setAltura(1.70);
        objAluno2.setPeso(62.2);

        objAluno1.imprimir();
        objAluno2.imprimir();

        objAluno2.fazAniversario();
        objAluno2.imprimir();

        //o método imprimir deve mostrar o nome e a idade do aluno juntos
        //System.out.println("objAluno1 = " + objAluno1.imprimir());
        //System.out.println("objAluno2 = " + objAluno2.imprimir());
        //objAluno2.fazAniversario();
        //System.out.println("objAluno2 = " + objAluno2.imprimir());
    }

}
