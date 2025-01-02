public class Date{
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year){
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public void setMonth(int month){
        if (month >= 1 && month <= 12){
            this.month = month;
        }else{
            this.month = 1;
        }
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void displayDate(){
        System.out.println(month + "/" + day + "/" + year);
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public int getYear(){
        return year;
    }

    public static void main(String[] args) {
        Date date1 = new Date(12, 20, 2024);
        Date date2 = new Date(13, 10, 2024);

        System.out.print("\nDATE 1: ");
        date1.displayDate();
        System.out.print("DATE 2: "); 
        date2.displayDate();

        System.out.print("\n");

    }
}
