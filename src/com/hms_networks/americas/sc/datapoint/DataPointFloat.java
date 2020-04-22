package com.hms_networks.americas.sc.datapoint;

/**
 * Float data point class
 *
 * <p>Class object for a DataPoint with a float value
 *
 * @since 1.0
 * @author HMS Networks, MU Americas Solution Center
 */
public class DataPointFloat extends DataPoint {

  /** Data point value */
  private final float value;

  /**
   * Constructor for a <code>double</code> data point.
   *
   * @param tagName data point tag name
   * @param tagId data point tag ID
   * @param value data point value
   * @param time data point timestamp
   */
  public DataPointFloat(String tagName, int tagId, float value, String time) {
    this.tagName = tagName;
    this.tagId = tagId;
    this.value = value;
    this.timestamp = time;
  }

  /**
   * Get and return the data point value.
   *
   * @return data point value
   */
  public double getValue() {
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
    if (p instanceof DataPointFloat) {
      returnVal =
          p.getTimeStamp().equals(timestamp)
              && ((DataPointFloat) p).getValue() == value
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
    if (p instanceof DataPointFloat) {
      returnVal = ((DataPointFloat) p).getValue() == value;
    }
    return returnVal;
  }

  /**
   * Get the data point type.
   *
   * @return data point type
   */
  public DataType getType() {
    return DataType.FLOAT;
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
