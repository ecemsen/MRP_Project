import java.util.Scanner;
public class Test {

    public static void main(String[] args) {

        int[] grossReq1605 = {0, 0, 0, 60, 100, 0, 50, 0, 30, 0};
        int[] grossReq118 = {0, 0, 30, 100, 0, 50, 0, 30, 0, 0};
        int[] grossReq457 = {0, 0, 80, 0, 40, 0, 40, 0, 0, 0};
        int[] grossReq1118 = {0, 0, 0, 0, 0, 50, 0, 0, 0, 0};
        int[] grossReq13122 = {0, 0, 30, 100, 0, 50, 0, 30, 0, 0};
        int[] grossReq48 = {0, 0, 30, 100, 0, 50, 0, 30, 0, 0};
        int[] grossReq314 = {0, 0, 30, 100, 0, 50, 0, 30, 0, 0};
        int[] grossReq2142 = {0, 50, 100, 0, 0, 0, 50, 0, 0, 0};
        int[] grossReq19 = {0, 50, 100, 0, 0, 0, 50, 0, 0, 0};
        int[] grossReq14127 = {0, 300, 720, 400, 0, 200, 300, 120, 0, 0};
        int[] grossReq129 = {0, 0, 0, 0, 0, 50, 0, 0, 0, 0};
        int[] grossReq62 = {0, 0, 200, 400, 40, 200, 40, 120, 0, 0};
        int[] grossReq11495 = {0, 0, 80, 0, 40, 0, 40, 0, 0, 0};

        Calculate p = new Calculate();


        int idCheck[] = {1605, 118, 457, 118, 13122, 48, 314, 2142, 19, 14127, 129, 62, 11495};

        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the productID: ");
        int id = input.nextInt();


            if (id == 1605) {
                p.print(30, 0, 0, 1, 0, grossReq1605);

            } else if (id == 118) {
                p.print(0, 50, 2, 2, 0, grossReq118);

            } else if (id == 457) {
                p.print(0, 20, 2, 2, 0, grossReq457);

            } else if (id == 1118) {
                p.print(30, 0, 0, 3, 0, grossReq1118);

            } else if (id == 13122) {
                p.print(0, 70, 3, 1, 40, grossReq13122);

            } else if (id == 48) {
                p.print(30, 0, 0, 3, 30, grossReq48);

            } else if (id == 314) {
                p.print(0, 50, 5, 1, 50, grossReq314);

            } else if (id == 2142) {
                p.print(80, 0, 0, 2, 100, grossReq2142);

            } else if (id == 19) {
                p.print(50, 40, 5, 2, 50, grossReq19);

            } else if (id == 14127) {
                p.print(60, 0, 0, 1, 100, grossReq14127);

            } else if (id == 129) {
                p.print(0, 100, 8, 4, 40, grossReq129);

            } else if (id == 62) {
                p.print(50, 100, 6, 2, 0, grossReq62);

            } else if (id == 11495) {
                p.print(120, 0, 0, 1, 50, grossReq11495);

            }

    }

}
