package se.hms.solutioncenter.datapoint;

/**
 * Boolean data point class
 * <p>
 * Class object for a DataPoint with a boolean value
 *
 * @since 1.0
 * @author HMS Networks, MU Americas Solution Center
 */
public class DataPointBoolean extends DataPoint {

  /**
   * Data point value
   */
  private final boolean value;

  /**
   * Constructor for a <code>boolean</code> data point.
   *
   * @param value data point value
   * @param time data point timestamp
   */
  public DataPointBoolean(boolean value, String time) {
    this.value = value;
    this.timestamp = time;
  }

  /**
   * Get and return the data point value.
   *
   * @return data point value
   */
  public boolean getValue() {
    return value;
  }

  /**
   * Compares the data point to another data point.
   *
   * @param p data point to compare
   * @return true if the timestamp, type, and value are the same
   */
  public boolean equals(DataPoint p) {
    boolean returnVal = false;
    if (p instanceof DataPointBoolean) {
      returnVal = p.getTimeStamp().equals(timestamp)
          && ((DataPointBoolean) p).getValue() == value;
    }
    return returnVal;
  }

  /**
   * Compares the data point's value to another data point's value.
   *
   * @param p data point to compare
   * @return true if values are equal
   */
  public boolean valueEquals(DataPoint p) {
    boolean returnVal = false;
    if (p instanceof DataPointBoolean) {
      returnVal = ((DataPointBoolean) p).getValue() == value;
    }
    return returnVal;
  }

  /**
   * Get the data point type.
   *
   * @return data point type
   */
  public DataType getType() {
    return DataType.BOOLEAN;
  }

  /**
   * Get the string representation of the data point value.
   *
   * @return data point value as a string
   */
  public String getValueString() {
    return value ? "1" : "0";
  }
}
