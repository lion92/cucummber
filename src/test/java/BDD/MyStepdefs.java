package BDD;

import Convertisseur.Calculator;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Soit;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyStepdefs {
        Calculator calculator=null;
    @Soit("un montant en euros de {double} euros")
    public void unMontantEnEurosDeEuros(double montant) {
        calculator=new Calculator(montant);
    }

    @Quand("benjamin convertit le montant avec un montant de change de {double}")
    public void benjaminConvertitLeMontantAvecUnMontantDeChangeDe(double rate) {

        calculator.calculChange(rate);
    }

    @Alors("le montant convertit serait de {double} {string}")
    public void leMontantConvertitSeraitDe(double montant, String currency) {

        assertEquals(""+montant+" "+currency,calculator.getFormatCurrency(calculator.getMontantConvertit(),currency));
    }


}
