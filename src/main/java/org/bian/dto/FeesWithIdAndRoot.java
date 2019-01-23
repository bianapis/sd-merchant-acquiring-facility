package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FeesWithIdAndRoot
 */
public class FeesWithIdAndRoot   {
  private String merchantAcquiringFeeReference = null;

  private String productInstanceReference = null;

  private String merchantAcquiringFeeConfiguration = null;

  private String merchantAcquiringFeeType = null;

  private String merchantAcquiringFeeCharge = null;

  private String merchantAcquiringDateTime = null;

  private String merchantAcquiringFeeProjectionsCommitments = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return merchantAcquiringFeeReference
  **/

  public String getMerchantAcquiringFeeReference() {
    return merchantAcquiringFeeReference;
  }

  public void setMerchantAcquiringFeeReference(String merchantAcquiringFeeReference) {
    this.merchantAcquiringFeeReference = merchantAcquiringFeeReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return merchantAcquiringFeeConfiguration
  **/

  public String getMerchantAcquiringFeeConfiguration() {
    return merchantAcquiringFeeConfiguration;
  }

  public void setMerchantAcquiringFeeConfiguration(String merchantAcquiringFeeConfiguration) {
    this.merchantAcquiringFeeConfiguration = merchantAcquiringFeeConfiguration;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return merchantAcquiringFeeType
  **/

  public String getMerchantAcquiringFeeType() {
    return merchantAcquiringFeeType;
  }

  public void setMerchantAcquiringFeeType(String merchantAcquiringFeeType) {
    this.merchantAcquiringFeeType = merchantAcquiringFeeType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount 
   * @return merchantAcquiringFeeCharge
  **/

  public String getMerchantAcquiringFeeCharge() {
    return merchantAcquiringFeeCharge;
  }

  public void setMerchantAcquiringFeeCharge(String merchantAcquiringFeeCharge) {
    this.merchantAcquiringFeeCharge = merchantAcquiringFeeCharge;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return merchantAcquiringDateTime
  **/

  public String getMerchantAcquiringDateTime() {
    return merchantAcquiringDateTime;
  }

  public void setMerchantAcquiringDateTime(String merchantAcquiringDateTime) {
    this.merchantAcquiringDateTime = merchantAcquiringDateTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return merchantAcquiringFeeProjectionsCommitments
  **/

  public String getMerchantAcquiringFeeProjectionsCommitments() {
    return merchantAcquiringFeeProjectionsCommitments;
  }

  public void setMerchantAcquiringFeeProjectionsCommitments(String merchantAcquiringFeeProjectionsCommitments) {
    this.merchantAcquiringFeeProjectionsCommitments = merchantAcquiringFeeProjectionsCommitments;
  }


}

