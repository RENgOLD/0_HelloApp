public class Program {
    public static void main(String[] args){

        int population = 10000000;
        int incPop = 14;
        int decPop = 8;
        int deltaPop;

        for (int i = 1; i <= 10; i++) {

            deltaPop = (population / 1000) * (incPop - decPop);

            population += deltaPop;

            if (incPop <= 7) incPop = 7; else incPop -= 1;
            if (decPop <= 6) decPop = 6; else decPop -= 1;
        }
        System.out.println(population);
    }
}
