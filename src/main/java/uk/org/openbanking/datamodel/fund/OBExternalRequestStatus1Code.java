/*
 * Confirmation of Funds API Specification
 * Swagger for Confirmation of Funds API Specification
 *
 * OpenAPI spec version: v3.0.0
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.fund;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the status of consent resource in code form.
 */
public enum OBExternalRequestStatus1Code {
  
  AUTHORISED("Authorised"),
  
  AWAITINGAUTHORISATION("AwaitingAuthorisation"),
  
  REJECTED("Rejected"),
  
  REVOKED("Revoked");

  private String value;

  OBExternalRequestStatus1Code(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalRequestStatus1Code fromValue(String text) {
    for (OBExternalRequestStatus1Code b : OBExternalRequestStatus1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
