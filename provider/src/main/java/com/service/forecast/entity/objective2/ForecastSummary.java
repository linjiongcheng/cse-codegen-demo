package com.service.forecast.entity.objective2;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.service.forecast.entity.objective1.DateListItem;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringBootProviderCodegen", date = "2019-04-30T10:43:36.104+08:00")

public class ForecastSummary   {
  @JsonProperty("country")
  private String country = null;

  @JsonProperty("cityName")
  private String cityName = null;

  @JsonProperty("coordinatesLon")
  private Double coordinatesLon = null;

  @JsonProperty("coordinatesLat")
  private Double coordinatesLat = null;

  @JsonProperty("dateList")
  private List<DateListItem> dateList = new ArrayList<DateListItem>();

  @JsonProperty("currentTime")
  private Long currentTime = null;

  public ForecastSummary country(String country) {
    this.country = country;
    return this;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ForecastSummary cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public ForecastSummary coordinatesLon(Double coordinatesLon) {
    this.coordinatesLon = coordinatesLon;
    return this;
  }

  public Double getCoordinatesLon() {
    return coordinatesLon;
  }

  public void setCoordinatesLon(Double coordinatesLon) {
    this.coordinatesLon = coordinatesLon;
  }

  public ForecastSummary coordinatesLat(Double coordinatesLat) {
    this.coordinatesLat = coordinatesLat;
    return this;
  }

  public Double getCoordinatesLat() {
    return coordinatesLat;
  }

  public void setCoordinatesLat(Double coordinatesLat) {
    this.coordinatesLat = coordinatesLat;
  }

  public ForecastSummary dateList(List<DateListItem> dateList) {
    this.dateList = dateList;
    return this;
  }

  public ForecastSummary addDateListItem(DateListItem dateListItem) {
    this.dateList.add(dateListItem);
    return this;
  }

  public List<DateListItem> getDateList() {
    return dateList;
  }

  public void setDateList(List<DateListItem> dateList) {
    this.dateList = dateList;
  }

  public ForecastSummary currentTime(Long currentTime) {
    this.currentTime = currentTime;
    return this;
  }

  public Long getCurrentTime() {
    return currentTime;
  }

  public void setCurrentTime(Long currentTime) {
    this.currentTime = currentTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastSummary forecastSummary = (ForecastSummary) o;
    return Objects.equals(this.country, forecastSummary.country) &&
        Objects.equals(this.cityName, forecastSummary.cityName) &&
        Objects.equals(this.coordinatesLon, forecastSummary.coordinatesLon) &&
        Objects.equals(this.coordinatesLat, forecastSummary.coordinatesLat) &&
        Objects.equals(this.dateList, forecastSummary.dateList) &&
        Objects.equals(this.currentTime, forecastSummary.currentTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, cityName, coordinatesLon, coordinatesLat, dateList, currentTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastSummary {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    coordinatesLon: ").append(toIndentedString(coordinatesLon)).append("\n");
    sb.append("    coordinatesLat: ").append(toIndentedString(coordinatesLat)).append("\n");
    sb.append("    dateList: ").append(toIndentedString(dateList)).append("\n");
    sb.append("    currentTime: ").append(toIndentedString(currentTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

