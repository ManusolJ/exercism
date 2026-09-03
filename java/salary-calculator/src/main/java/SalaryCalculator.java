public class SalaryCalculator {

    private final double BASE_SALARY = 1000.00;
    private final double MAXIMUM_SALARY = 2000.00;

    private final int MAXIMUM_SKIPPABLE_DAYS = 5;
    private final int BASE_SALARY_MULTIPLIER = 1;
    private final double REDUCE_SALARY_MULTIPLIER_FOR_SKIPPED_DAYS = 0.85;

    private final int BASE_PRODUCT_SOLD_BONUS = 10;
    private final int INCREASED_PRODUCT_SOLD_BONUS = 13;
    private final int MINIMUM_PRODUCT_SOLD_FOR_BONUS_INCREASE = 20;

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < MAXIMUM_SKIPPABLE_DAYS ? BASE_SALARY_MULTIPLIER : REDUCE_SALARY_MULTIPLIER_FOR_SKIPPED_DAYS;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold < MINIMUM_PRODUCT_SOLD_FOR_BONUS_INCREASE ? BASE_PRODUCT_SOLD_BONUS: INCREASED_PRODUCT_SOLD_BONUS;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = BASE_SALARY * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return salary < MAXIMUM_SALARY ? salary : MAXIMUM_SALARY;
    } 
}
