package com.yas.javaspringbootresttemplate.response;

public class UnicornResponse
{
  private String _id;
  private String name;
  private int age;
  private String colour;

  public String get_id()
  {
    return _id;
  }

  public void set_id(String _id)
  {
    this._id = _id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public String getColour()
  {
    return colour;
  }

  public void setColour(String colour)
  {
    this.colour = colour;
  }
}
