/**
 * The MIT License
 * Copyright (c) 2014 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.example.design.pattern.builder;

/**
 * 
 * Pizza, the class with many parameters.
 * 
 */
public final class Pizza {

  private final String cheeseType;
  private final String sauce;
  private final String tomatoes;
  private final String sausage;

  private Pizza(Builder builder) {
    this.cheeseType = builder.cheeseType;
    this.sauce = builder.sauce;
    this.tomatoes = builder.tomatoes;
    this.sausage = builder.sausage;
  }

  public String getCheeseType() {
    return cheeseType;
  }

  public String getSauce() {
    return sauce;
  }

  public String getTomatoes() {
    return tomatoes;
  }

  public String getSausage() {
    return sausage;
  }


  /**
   * 
   * The builder class.
   * 
   */
  public static class Builder {

    private final String cheeseType;
    private final String sauce;
    private  String tomatoes;
    private  String sausage;

    /**
     * Constructor
     */
    public Builder(String cheeseType, String sauce) {
      if (cheeseType == null || sauce == null) {
        throw new IllegalArgumentException("cheeseType and sauce can not be null");
      }
      this.cheeseType = cheeseType;
      this.sauce = sauce;
    }

    public Builder withTomatoes(String tomatoes) {
      this.tomatoes = tomatoes;
      return this;
    }

    public Builder withSausage(String sausage) {
      this.sausage = sausage;
      return this;
    }


    public Pizza build() {
      return new Pizza(this);
    }
  }
}
