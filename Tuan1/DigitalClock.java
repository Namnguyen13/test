import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class DigitalClock {
    public static void main(String[] args) {
        //định dạng ngày và giờ
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        //vòng lặp vô hạn 
        while (true) {
            //lấy ngày và giờ từ lớp Calendar
            // Calendar calendar = new GregorianCalendar();
            // int hour = calendar.get(Calendar.HOUR_OF_DAY);
            // int minute = calendar.get(Calendar.MINUTE);
            // int second = calendar.get(Calendar.SECOND);
            Calendar calendar = Calendar.getInstance();
            String dateTime = dateFormat.format(calendar.getTime());

            //in chuỗi thời gian ra màn hình
            // System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
            System.out.println(dateTime);

            //dừng thực thi trong 1s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
