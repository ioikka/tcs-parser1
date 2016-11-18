package io.ikka.invest.model;

/**
 * todo@shapoval add class description
 * <p>
 * date: 18.11.2016
 *
 * @author p.shapoval
 */
public class Stock {
  private String companyName;
  private String dayChange;
  private String yearChange;
  private String price;

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getDayChange() {
    return dayChange;
  }

  public void setDayChange(String dayChange) {
    this.dayChange = dayChange;
  }

  public String getYearChange() {
    return yearChange;
  }

  public void setYearChange(String yearChange) {
    this.yearChange = yearChange;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }
}
