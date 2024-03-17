public class Program {
    public static void main(String[] args){

        int population = 10000000;
        int incPop = 14;
        int decPop = 8;
        int deltaPop = incPop - decPop;

        for (int i = 1; i <= 10; i++) {
            incPop = (population / 1000) * deltaPop;

            population += incPop;

        }
        System.out.println(population);
    }
}
