public class BmiService {

    public int calculate(int weight, int growth) {
        int result; {
            result = weight / (growth*growth/10000) ;
        }
        return result;
    }
}
