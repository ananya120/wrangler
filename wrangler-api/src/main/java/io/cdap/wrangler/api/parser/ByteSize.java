public class ByteSize extends Token {
  private final long bytes;

  public ByteSize(String value) {
    super(value);
    String unit = value.replaceAll("[0-9.]", "").toUpperCase();
    double number = Double.parseDouble(value.replaceAll("[^0-9.]", ""));
    switch (unit) {
      case "KB": bytes = (long)(number * 1024); break;
      case "MB": bytes = (long)(number * 1024 * 1024); break;
      case "GB": bytes = (long)(number * 1024 * 1024 * 1024); break;
      case "TB": bytes = (long)(number * 1024L * 1024L * 1024L * 1024L); break;
      default: bytes = (long)number;
    }
  }

  public long getBytes() { return bytes; }
}
