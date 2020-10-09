package com.hms_networks.americas.sc.datapoint;

/**
 * Abstract data point class. Stores tag value and data timestamp from historical logs.
 *
 * @author HMS Networks, MU Americas Solution Center
 * @since 1.0
 */
public abstract class DataPoint {

  /** Name of data point tag */
  protected String tagName;

  /** ID of data point tag */
  protected int tagId;

  /** Timestamp of data point */
  protected String timestamp;

  /** Quality of data point value */
  protected DataQuality quality;

  /**
   * Get the name of the data point tag
   *
   * @return name of data point tag
   */
  public String getTagName() {
    return tagName;
  }

  /**
   * Get the ID of the data point tag
   *
   * @return ID of data point tag
   */
  public int getTagId() {
    return tagId;
  }

  /**
   * Get the string representation of the time stamp.
   *
   * @return the timestamp as a string.
   */
  public String getTimeStamp() {
    return timestamp;
  }

  /**
   * Get the quality of the data point value
   *
   * @return quality of data point value
   */
  public DataQuality getQuality() {
    return quality;
  }

  /**
   * Get the tag name, timestamp and the value returned as a string.
   *
   * @return tag name, timestamp and value in a string with spaces in between
   */
  public String toString() {
    return tagName + " " + timestamp + " " + getValueString();
  }

  /**
   * Compares the data point to another data point.
   *
   * @param p data point to compare
   * @return true if the timestamp, type, and value are the same
   */
  public abstract boolean equals(DataPoint p);

  /**
   * Compares the data point's value to another data point's value.
   *
   * @param p data point to compare
   * @return true if values are equal
   */
  public abstract boolean valueEquals(DataPoint p);

  /**
   * Get the data point type.
   *
   * @return data point type
   */
  public abstract DataType getType();

  /**
   * Get the string representation of the data point value.
   *
   * @return data point value as a string
   */
  public abstract String getValueString();
}
