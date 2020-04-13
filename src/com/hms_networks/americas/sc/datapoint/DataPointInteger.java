package com.hms_networks.americas.sc.datapoint;

/**
 * Integer data point class
 *
 * <p>Class object for a DataPoint with a integer value
 *
 * @since 1.0
 * @author HMS Networks, MU Americas Solution Center
 */
public class DataPointInteger extends DataPoint {

  /** Data point value */
  private final int value;

  /**
   * Constructor for a <code>integer</code> data point.
   *
   * @param tagName data point tag name
   * @param value data point value
   * @param time data point timestamp
   */
  public DataPointInteger(String tagName, int value, String time) {
    this.tagName = tagName;
    this.value = value;
    this.timestamp = time;
  }

  /**
   * Get and return the data point value.
   *
   * @return data point value
   */
  public int getValue() {
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
    if (p instanceof DataPointInteger) {
      returnVal =
          p.getTimeStamp().equals(timestamp)
              && ((DataPointInteger) p).getValue() == value
              && p.getTagName().equals(tagName);
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
    if (p instanceof DataPointInteger) {
      returnVal = ((DataPointInteger) p).getValue() == value;
    }
    return returnVal;
  }

  /**
   * Get the data point type.
   *
   * @return data point type
   */
  public DataType getType() {
    return DataType.INTEGER;
  }

  /**
   * Get the string representation of the data point value.
   *
   * @return data point value as a string
   */
  public String getValueString() {
    return ("" + value);
  }
}
