/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author Jhon
 */
public class Modelo {

    private Double moneda;
    private Double cantidad;
    private Double resultado;

    public void setMoneda(Double moneda) {
        this.moneda = moneda;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getResultado() {
        return resultado;
    }

    public void convetirDolarAPeso() {
        resultado = cantidad * moneda;
    }
	public void 

    public void convertirPesoADolar() {
        resultado = cantidad / moneda;
    }
}