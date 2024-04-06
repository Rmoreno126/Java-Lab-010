public class Date {

    private int year;
    private String month;
    private int day;

    public Date() {
        this.day = 01;
        this.month = "February";
        this.year = 2024;
    }

    public Date(int year, String month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return "My birthday is on " + month + " " + day + ", " + year + ".";
    }

    public static void main(String[] args) {
        Date birthday = new Date(1995, "August", 19);
        System.out.println(birthday);

    }
}
