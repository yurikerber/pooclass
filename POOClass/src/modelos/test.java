/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class test {

    public static void main(String[] args) {
        int vet[] = new int[8];

        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                vet[i] = (int) (Math.random() * 10);
                vet[j] = (int) (Math.random() * 10);
            }

        }

        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i] + "    ");
        }
    }
}
