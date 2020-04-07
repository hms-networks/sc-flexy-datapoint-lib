package se.hms.solutioncenter.datapoint;

/**
 * Abstract data point class. Stores tag value
 * and data timestamp from historical logs.
 *
 * @since 1.0
 * @author HMS Networks, MU Americas Solution Center
 */
public abstract class DataPoint {

  /**
   * Timestamp of data point
   */
  protected String timestamp;

  /**
   * Get the string representation of the time stamp.
   *
   * @return the timestamp as a string.
   */
  public String getTimeStamp() {
    return timestamp;
  }

  /**
   * Get the timestamp and the value returned as a string.
   *
   * @return timestamp and value in a string with a space in between
   */
  public String toString() {
    return timestamp + " " + getValueString();
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
