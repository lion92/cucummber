package Convertisseur;

public class Calculator {
    private final double montant;
    private double montantConvertit;
    private String currency;

    public Calculator(double montant) {
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }

    public void calculChange(double rate) {

        this.montantConvertit=this.montant*rate;

    }

    public double getMontantConvertit() {
        return montantConvertit;
    }

    public void setMontantConvertit(double montantConvertit) {
        this.montantConvertit = montantConvertit;
    }

    public String getFormatCurrency(double montantConvertit, String currency) {
        this.currency=currency;
        return ""+montantConvertit+" "+this.currency;
    }

}
