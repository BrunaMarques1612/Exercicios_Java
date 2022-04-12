/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleta;

public class Bicicleta {
    public static void main(String[] args) {
    private int marcha;
    private int velocidade;

	public Bicicleta() {
	}

	public Bicicleta(int marcha, int velocidade) {
		this.marcha = marcha;
		this.velocidade = velocidade;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public int getMarcha() {
		return marcha;
	}
	private void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	private void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

    public void aplicarFreios() {
        setVelocidade(0);
    }
    public void aumentarVelocidade(int aumVelocidade) {
        setVelocidade(getVelocidade() + aumVelocidade);
    }
  
    public void diminuirVelocidade(int dimVelocidade) {
        setVelocidade(getVelocidade() - dimVelocidade);
    }

    public void aumMarcha(int marcha) {

        setMarcha(getMarcha() - marcha);        
    }

    public void dimMarcha(int marcha) {

        setMarcha(getMarcha() - marcha);        
    }
    }
    
}
    }
    
}
