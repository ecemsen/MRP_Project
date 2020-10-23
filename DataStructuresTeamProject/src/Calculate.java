public class Calculate {

    public int[] grossReq = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] scheduledReq = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] onHand = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] netReq = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] timePhased = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] orderReleases = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] orderDelivery = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


    public void print(int amountOnHand, int scheduledReceipt, int arrivalOnWeek, int leadTime, int lotSizingRule, int[] grossReq) {
        if (arrivalOnWeek != 0) {
            scheduledReq[arrivalOnWeek - 1] = scheduledReceipt;
        }
        for(int x=0; x<10;x++){
            if(x+1<11) {
                if ((x-1<0)) {
                    onHand[0] = amountOnHand;
                }
                else {
                    onHand[x] = (orderDelivery[x - 1] + onHand[x - 1] + scheduledReq[x - 1]) - grossReq[x - 1];
                }


                if (grossReq[x]>(scheduledReq[x]+onHand[x])) {
                    netReq[x] = grossReq[x] - (scheduledReq[x] + onHand[x]);
                }


                if (x-leadTime>=0) {
                    timePhased[x-leadTime ] = netReq[x];

                    int a = netReq[x];
                    int d = lotSizingRule;
                    if(grossReq[x]!=0) {
                        if (lotSizingRule == 0) {
                            orderReleases[x - leadTime] = timePhased[x - leadTime];
                        }
                        else {
                            if ((a%d==0)&&(a!=0)){
                                orderReleases[x-leadTime]=lotSizingRule*(a / d);
                            }
                            else if(a==0){
                                orderReleases[x-leadTime]=0;
                            }
                            else{
                                int y = ((a / d) + 1);
                                orderReleases[x - leadTime] = (d * y);}
                        }
                    }
                }

                if(((x-leadTime)>=0)&&(netReq[x]!=0)) {
                    orderDelivery[x] = orderReleases[x - leadTime];
                }

            }
        }

        for (int i = 0; i <grossReq.length; i++) {

            System.out.println("                                  ");
            System.out.println("                                  ");
            System.out.println("----------------------------------");
            System.out.println("Week " + (i+1));
            System.out.println("----------------------------------");
            System.out.println("Gross Requirement :" + grossReq[i]);
            System.out.println("Scheduled Receipt :" + scheduledReq[i]);
            System.out.println("On Hand From Prior Period :" + onHand[i]);
            System.out.println("Net Requirement :" + netReq[i]);
            System.out.println("Time Phased Net Requirement :" + timePhased[i]);
            System.out.println("Planned Order Requirement :" + orderReleases[i]);
            System.out.println("Planned Order Delivery :" + orderDelivery[i]);
        }
    }



}
