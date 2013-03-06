package org.cowboycoders.cyclisimo.content;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
  
  public User() {
    
  }
  
  private String name;
  
  private long id = -1L;
  
  private double weight = -1l;
  
  private User(Parcel in) {
    id = in.readLong();
    name = in.readString();
    weight = in.readDouble();
  }
  
  
  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeLong(id);
    dest.writeString(name);
    dest.writeDouble(weight);
  }
  
  public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
    @Override
  public User createFromParcel(Parcel in) {
    return new User(in);
  }

    @Override
  public User[] newArray(int size) {
    return new User[size];
  }

    
};
  
/**
 * User name
 * @return
 */
  public String getName() {
    return name;
  }

  /**
   * Username
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Weight in kg
   * @return weight
   */
  public double getWeight() {
    return weight;
  }

  /**
   * Weight in kg
   * @param weight
   */
  public void setWeight(double weight) {
    this.weight = weight;
  }


  public long getId() {
    return id;
  }


  public void setId(long id) {
    this.id = id;
  }
  

  
  

}
