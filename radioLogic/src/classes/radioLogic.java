package classes;

import enums.Stanje;
import intefaces.ioperation;

public class radioLogic implements ioperation{

	public double f;
	public double z;
	Stanje stanje;
	public double getF() {
		return f;
	}


	public void setF(double f) {
		this.f = f;
	}


	public double getZ() {
		return z;
	}


	public void setZ(double z) {
		this.z = z;
	}


	public Stanje getStanje() {
		return stanje;
	}


	public void setStanje(Stanje stanje) {
		this.stanje = stanje;
	}


	/**
	 * inicijalizacija klase radio
	 */
	public void radio() {
		this.f=0;
		this.z=0;
		this.stanje=stanje.sOFF;
	}
	
	
	@Override
	public double addf() {
		return f=f+1;
	}

	@Override
	public double addz() {
		// TODO Auto-generated method stub
		return z=z+10;
	}

	@Override
	public double minusf() {
		// TODO Auto-generated method stub
		return f=f-1;
	}

	@Override
	public double minusz() {
		// TODO Auto-generated method stub
		return z=z-10;
	}

	public void stateOn(){
		this.f=87.5;
		this.z=10;
	}
	public void stateOFF(){
		this.f=0;
		this.z=0;
	}
	public void stateOut(){
		this.f=0;
		this.z=0;
	}
	
}
