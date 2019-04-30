package com.service.forecast.entity.objective1;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringBootConsumerCodegen", date = "2019-04-30T10:43:35.684+08:00")

public class DateListItem   {
  @JsonProperty("date")
  private Long date = null;

  @JsonProperty("image")
  private String image = null;

  @JsonProperty("dateTxt")
  private String dateTxt = null;

  @JsonProperty("temperatureMax")
  private Double temperatureMax = null;

  @JsonProperty("weather")
  private String weather = null;

  @JsonProperty("temperature")
  private Double temperature = null;

  @JsonProperty("temperatureMin")
  private Double temperatureMin = null;

  @JsonProperty("humidity")
  private Double humidity = null;

  @JsonProperty("pressure")
  private Double pressure = null;

  @JsonProperty("windSpeed")
  private Double windSpeed = null;

  @JsonProperty("cloudsDeg")
  private Double cloudsDeg = null;

  @JsonProperty("rain3h")
  private Double rain3h = null;

  public DateListItem date(Long date) {
    this.date = date;
    return this;
  }

  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public DateListItem image(String image) {
    this.image = image;
    return this;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public DateListItem dateTxt(String dateTxt) {
    this.dateTxt = dateTxt;
    return this;
  }

  public String getDateTxt() {
    return dateTxt;
  }

  public void setDateTxt(String dateTxt) {
    this.dateTxt = dateTxt;
  }

  public DateListItem temperatureMax(Double temperatureMax) {
    this.temperatureMax = temperatureMax;
    return this;
  }

  public Double getTemperatureMax() {
    return temperatureMax;
  }

  public void setTemperatureMax(Double temperatureMax) {
    this.temperatureMax = temperatureMax;
  }

  public DateListItem weather(String weather) {
    this.weather = weather;
    return this;
  }

  public String getWeather() {
    return weather;
  }

  public void setWeather(String weather) {
    this.weather = weather;
  }

  public DateListItem temperature(Double temperature) {
    this.temperature = temperature;
    return this;
  }

  public Double getTemperature() {
    return temperature;
  }

  public void setTemperature(Double temperature) {
    this.temperature = temperature;
  }

  public DateListItem temperatureMin(Double temperatureMin) {
    this.temperatureMin = temperatureMin;
    return this;
  }

  public Double getTemperatureMin() {
    return temperatureMin;
  }

  public void setTemperatureMin(Double temperatureMin) {
    this.temperatureMin = temperatureMin;
  }

  public DateListItem humidity(Double humidity) {
    this.humidity = humidity;
    return this;
  }

  public Double getHumidity() {
    return humidity;
  }

  public void setHumidity(Double humidity) {
    this.humidity = humidity;
  }

  public DateListItem pressure(Double pressure) {
    this.pressure = pressure;
    return this;
  }

  public Double getPressure() {
    return pressure;
  }

  public void setPressure(Double pressure) {
    this.pressure = pressure;
  }

  public DateListItem windSpeed(Double windSpeed) {
    this.windSpeed = windSpeed;
    return this;
  }

  public Double getWindSpeed() {
    return windSpeed;
  }

  public void setWindSpeed(Double windSpeed) {
    this.windSpeed = windSpeed;
  }

  public DateListItem cloudsDeg(Double cloudsDeg) {
    this.cloudsDeg = cloudsDeg;
    return this;
  }

  public Double getCloudsDeg() {
    return cloudsDeg;
  }

  public void setCloudsDeg(Double cloudsDeg) {
    this.cloudsDeg = cloudsDeg;
  }

  public DateListItem rain3h(Double rain3h) {
    this.rain3h = rain3h;
    return this;
  }

  public Double getRain3h() {
    return rain3h;
  }

  public void setRain3h(Double rain3h) {
    this.rain3h = rain3h;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateListItem dateListItem = (DateListItem) o;
    return Objects.equals(this.date, dateListItem.date) &&
        Objects.equals(this.image, dateListItem.image) &&
        Objects.equals(this.dateTxt, dateListItem.dateTxt) &&
        Objects.equals(this.temperatureMax, dateListItem.temperatureMax) &&
        Objects.equals(this.weather, dateListItem.weather) &&
        Objects.equals(this.temperature, dateListItem.temperature) &&
        Objects.equals(this.temperatureMin, dateListItem.temperatureMin) &&
        Objects.equals(this.humidity, dateListItem.humidity) &&
        Objects.equals(this.pressure, dateListItem.pressure) &&
        Objects.equals(this.windSpeed, dateListItem.windSpeed) &&
        Objects.equals(this.cloudsDeg, dateListItem.cloudsDeg) &&
        Objects.equals(this.rain3h, dateListItem.rain3h);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, image, dateTxt, temperatureMax, weather, temperature, temperatureMin, humidity, pressure, windSpeed, cloudsDeg, rain3h);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateListItem {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    dateTxt: ").append(toIndentedString(dateTxt)).append("\n");
    sb.append("    temperatureMax: ").append(toIndentedString(temperatureMax)).append("\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    temperatureMin: ").append(toIndentedString(temperatureMin)).append("\n");
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    pressure: ").append(toIndentedString(pressure)).append("\n");
    sb.append("    windSpeed: ").append(toIndentedString(windSpeed)).append("\n");
    sb.append("    cloudsDeg: ").append(toIndentedString(cloudsDeg)).append("\n");
    sb.append("    rain3h: ").append(toIndentedString(rain3h)).append("\n");
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

