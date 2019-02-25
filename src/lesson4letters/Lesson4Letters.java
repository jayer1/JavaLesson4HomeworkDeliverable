package lesson4letters;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author ayerj
 */
public class Lesson4Letters {

    public static void main(String[] args) {

        BigInteger wisconsinPopulation = new BigInteger("5726398");
        BigInteger californiaPopulation = new BigInteger("38041430");
        BigInteger texasPopulation = new BigInteger("26059203");
        BigDecimal cost = new BigDecimal("3.23");

        BigInteger wiscLettersToCalif = wisconsinPopulation.multiply(californiaPopulation);
        System.out.println("Letters written from Wisconsonites to Californians: " + wiscLettersToCalif);

        BigInteger copiesToTexas = wiscLettersToCalif.multiply(texasPopulation);
        System.out.println("Copies of letters written from Wisconsonites to Californians sent to Texans: " + copiesToTexas);

        BigDecimal costOfTexasCopies = cost.multiply(new BigDecimal(copiesToTexas));
        System.out.println("The cost of the letters sent to Texas is " + costOfTexasCopies);
    }

}
