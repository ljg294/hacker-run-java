import java.io.*;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

//Java Date and Time
class Result {

    public static String findDay(int month, int day, int year) {
        String dayNames[] = new DateFormatSymbols().getWeekdays();
        Calendar calendar = new GregorianCalendar(year, month-1, day);
        return dayNames[calendar.get(Calendar.DAY_OF_WEEK)].toUpperCase();
    }

}

public class Problem12 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
