/*Example02. Write a Java program that displays the current time in GMT (Greenwich
Mean Time) in the format hour : minute : second, such as 13:19:8.*/
public class Example02Lap3{
    public static void main(String[] args)
      {
  // Obtain the total milliseconds since midnight, Jan 1, 1970
      long totalMilliseconds = System.currentTimeMillis();
      // Obtain the total seconds since midnight, Jan 1, 1970
      long totalSeconds = totalMilliseconds / 1000;
      // Compute the current second in the minute in the hour
      long currentSecond = totalSeconds % 60;
      // Obtain the total minutes
      long totalMinutes = totalSeconds / 60;
      // Compute the current minute in the hour
      long currentMinute = totalMinutes % 60;
      // Obtain the total hours
      long totalHours = totalMinutes / 60;
      // Compute the current hour
      long currentHour = totalHours % 24;
      // Display results
      System.out.println("Current time is " + currentHour + ":"
        + currentMinute + ":" + currentSecond + " GMT");
      }
  } 