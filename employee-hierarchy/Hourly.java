/**
 * Hourly employee — pay is based on hours worked * rate.
 * Gets 2 extra vacation days on top of the base.
 */
public class Hourly extends Employee {
    private int hoursWorked;
    private int EXTRA_VAC_DAYS = 2;

    public Hourly(String eName, String eAddress, String ePhone,
                  String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        hoursWorked = 0;
    }

    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    public double pay() {
        double payment = payRate * hoursWorked;
        hoursWorked = 0;  // reset after paying
        return payment;
    }

    public String toString() {
        String result = super.toString();
        result += "\nCurrent hours: " + hoursWorked;
        return result;
    }

    @Override
    public double getVacationDays() {
        return super.getVacationDays() + EXTRA_VAC_DAYS;
    }
}
