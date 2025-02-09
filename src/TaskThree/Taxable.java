//create an Interface Taxable with members salesTax=7%,IncomeTax=10.5% and abstract method calcTax() 
package TaskThree;

public interface Taxable {
	double salesTax=0.07;
	double IncomeTax=0.105;
	double calcTax();  //Abstract method to calculate tax

}
