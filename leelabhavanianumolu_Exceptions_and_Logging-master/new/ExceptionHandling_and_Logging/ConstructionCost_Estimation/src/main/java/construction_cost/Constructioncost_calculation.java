package construction_cost;

import java.util.Scanner;


import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;


public class Constructioncost_calculation {
	public static final Logger LOGGER=LogManager.getLogger(Constructioncost_calculation.class);
	public static void main( String[] args )
    {   
        int Option;
    	Scanner obj= new Scanner(System.in);
		
		do {
		LOGGER.info("CONSTRUCTION COST ESTIMATION \n");
		LOGGER.info("Available choice::");
		LOGGER.info("1. Construction with standard materials \n2. Construction with above standard materials\n3. Construction with high standard materials \n4. Construction with high standard materials and fully automated ");
		LOGGER.info("Enter your choice: ");
		Option=obj.nextInt();
    	}while(Option>4);
		LOGGER.info("enter the area of house");
		double Area=obj.nextDouble();
		ConstructionCostEstimation cost =new ConstructionCostEstimation(Option,Area);
		LOGGER.info("the cost estimated is Rs:" +cost.getTotalCost()); 
	
  
     obj.close();
    }

}
