public class BonusMilesService {
    int miles;

    public int calculate(int cost) {
        if (cost > 20) {
            miles = cost / 20;
        } else {
            System.out.println("Сумма покупки меньше 20 руб.");
        }
        return miles;
    }
}
