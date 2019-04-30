package com.service.forecast.entity.util;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringBootProviderCodegen", date = "2019-04-30T15:23:21.501+08:00")

public class MultiResponse   {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("message")
  private String message = null;

  public MultiResponse code(Integer code) {
    this.code = code;
    return this;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public MultiResponse message(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiResponse multiResponse = (MultiResponse) o;
    return Objects.equals(this.code, multiResponse.code) &&
        Objects.equals(this.message, multiResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

