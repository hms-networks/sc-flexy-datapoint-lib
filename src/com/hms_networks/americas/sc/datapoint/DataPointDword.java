package com.hms_networks.americas.sc.datapoint;

/**
 * DWORD data point class
 * <p>
 * Class object for a DataPoint with a DWORD value
 *
 * @since 1.0
 * @author HMS Networks, MU Americas Solution Center
 */
public class DataPointDword extends DataPoint {

  /**
   * Data point value
   */
  private final long value;

  /**
   * Constructor for a DWORD data point.
   *
   * @param value data point value
   * @param time data point timestamp
   */
  public DataPointDword(long value, String time) {
    this.value = value;
    this.timestamp = time;
  }

  /**
   * Get and return the data point value.
   *
   * @return data point value
   */
  public long getValue() {
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
    if (p instanceof DataPointDword) {
      returnVal = p.getTimeStamp().equals(timestamp) && ((DataPointDword) p).getValue() == value;
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
    if (p instanceof DataPointDword) {
      returnVal = ((DataPointDword) p).getValue() == value;
    }
    return returnVal;
  }

  /**
   * Get the data point type.
   *
   * @return data point type
   */
  public DataType getType() {
    return DataType.DWORD;
  }

  /**
   * Get the string representation of the data point value.
   *
   * @return data point value as a string
   */
  public String getValueString() {
    return Long.toString(value);
  }
}
