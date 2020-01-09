/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author student
 */
public class ElectricityFactory {
    private Domestic bill_Domestic = null;
    private Institutional bill_Institute = null;
    private Commercial bill_Commercial = null;
        
    public void GenerateElectricityBill(int BillType, int units){
        ElectricityBill billInstance = null;
        switch(BillType){
            case 1:
                if(bill_Domestic == null)
                    bill_Domestic = new Domestic();

                billInstance = bill_Domestic;
                break;

            case 2:
                 if(bill_Institute == null)
                    bill_Institute = new Institutional();

                billInstance = bill_Institute;
                break;

            case 3:
                 if(bill_Commercial == null)
                    bill_Commercial = new Commercial();

                billInstance = bill_Commercial;
                break;

            default:
                System.out.print("Bill type not found");
        }
        
        if(billInstance != null)
            System.out.println("Bill amount is : " +  billInstance.generateElectricityBill(units));
    }
}
