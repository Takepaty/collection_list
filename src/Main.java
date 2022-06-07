import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class ExemplosList {
    public static void main(String[] args) {

//Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:

        // 1º Forma de fazer

//        System.out.println("Crie uma lista e adicione as sete notas: ");
//        ArrayList<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 5d, 7d, 0d, 3.6));
//        notas.add(10d);
//        System.out.println(notas);

        // 2º Forma de fazer

        System.out.println("Crie uma lista e adicione as sete notas: ");
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));// Exibir a posição da nota (indexOf()
        System.out.println("Adicione na lista a nota 8.0 na pisição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); // set é substituir
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));//contains para saber se tem um valor dentro da lista

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for(Double nota: notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba  a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){   //has.Next verifica se tem o proximo
           Double next =  iterator.next();
           soma += next;
        }
        System.out.println("Exiba a soma dos valore: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }
}