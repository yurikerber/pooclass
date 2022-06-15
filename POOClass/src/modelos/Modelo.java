/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author yuri
 */
public class Modelo {

    private String marca;
    private String modelo;

    public Modelo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {

        StringBuilder retorno = new StringBuilder();
        retorno.append("\nMarca: " + this.marca);
        retorno.append("\nModelo: " + this.modelo);

        return retorno.toString();
    }

}
