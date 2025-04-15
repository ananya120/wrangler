public class TimeDuration extends Token {
  private final long milliseconds;

  public TimeDuration(String value) {
    super(value);
    String unit = value.replaceAll("[0-9.]", "").toLowerCase();
    double number = Double.parseDouble(value.replaceAll("[^0-9.]", ""));
    switch (unit) {
      case "s": milliseconds = (long)(number * 1000); break;
      case "m": milliseconds = (long)(number * 60 * 1000); break;
      case "h": milliseconds = (long)(number * 60 * 60 * 1000); break;
      default: milliseconds = (long)number; // ms
    }
  }

  public long getMilliseconds() { return milliseconds; }
}
