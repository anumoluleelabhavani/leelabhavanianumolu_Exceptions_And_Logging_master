package interest_calculation;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Interest {
	public static final Logger LOGGER=LogManager.getLogger(Interest.class);
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double principalAmount,interestRate;
        int timePeriod;

        LOGGER.info("Enter your Principal Amount : ");
        principalAmount = sc.nextDouble();
        LOGGER.info("Enter rate : ");
        interestRate = sc.nextDouble();
        LOGGER.info("Enter time : ");
        timePeriod = sc.nextInt();

        calculateInterest Interest = new calculateInterest(principalAmount,interestRate,timePeriod);

        LOGGER.info("Simple Interest is : " + Interest.findSimpleInterest());
        LOGGER.info("Compound Interest is : " + Interest.findCompoundInterest());

    }

}
