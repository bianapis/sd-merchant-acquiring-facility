package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AccountWithIdAndRoot
 */
public class AccountWithIdAndRoot   {
  private String merchantAcquiringAccountAccessReference = null;

  private String productInstanceReference = null;

  private String merchantAcquiringFacilityAccountReference = null;

  private String merchantAcquiringAccountPostingPurpose = null;

  private String merchantAcquiringAccountPostingAmount = null;

  private String merchantAcquiringAccountPostingValueDate = null;

  private String merchantAcquiringAccountPostingResult = null;

  private Object merchantAcquiringAccountAccessRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return merchantAcquiringAccountAccessReference
  **/

  public String getMerchantAcquiringAccountAccessReference() {
    return merchantAcquiringAccountAccessReference;
  }

  public void setMerchantAcquiringAccountAccessReference(String merchantAcquiringAccountAccessReference) {
    this.merchantAcquiringAccountAccessReference = merchantAcquiringAccountAccessReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return merchantAcquiringFacilityAccountReference
  **/

  public String getMerchantAcquiringFacilityAccountReference() {
    return merchantAcquiringFacilityAccountReference;
  }

  public void setMerchantAcquiringFacilityAccountReference(String merchantAcquiringFacilityAccountReference) {
    this.merchantAcquiringFacilityAccountReference = merchantAcquiringFacilityAccountReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return merchantAcquiringAccountPostingPurpose
  **/

  public String getMerchantAcquiringAccountPostingPurpose() {
    return merchantAcquiringAccountPostingPurpose;
  }

  public void setMerchantAcquiringAccountPostingPurpose(String merchantAcquiringAccountPostingPurpose) {
    this.merchantAcquiringAccountPostingPurpose = merchantAcquiringAccountPostingPurpose;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount 
   * @return merchantAcquiringAccountPostingAmount
  **/

  public String getMerchantAcquiringAccountPostingAmount() {
    return merchantAcquiringAccountPostingAmount;
  }

  public void setMerchantAcquiringAccountPostingAmount(String merchantAcquiringAccountPostingAmount) {
    this.merchantAcquiringAccountPostingAmount = merchantAcquiringAccountPostingAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date       
   * @return merchantAcquiringAccountPostingValueDate
  **/

  public String getMerchantAcquiringAccountPostingValueDate() {
    return merchantAcquiringAccountPostingValueDate;
  }

  public void setMerchantAcquiringAccountPostingValueDate(String merchantAcquiringAccountPostingValueDate) {
    this.merchantAcquiringAccountPostingValueDate = merchantAcquiringAccountPostingValueDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text       
   * @return merchantAcquiringAccountPostingResult
  **/

  public String getMerchantAcquiringAccountPostingResult() {
    return merchantAcquiringAccountPostingResult;
  }

  public void setMerchantAcquiringAccountPostingResult(String merchantAcquiringAccountPostingResult) {
    this.merchantAcquiringAccountPostingResult = merchantAcquiringAccountPostingResult;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary   
   * @return merchantAcquiringAccountAccessRecord
  **/

  public Object getMerchantAcquiringAccountAccessRecord() {
    return merchantAcquiringAccountAccessRecord;
  }

  public void setMerchantAcquiringAccountAccessRecord(Object merchantAcquiringAccountAccessRecord) {
    this.merchantAcquiringAccountAccessRecord = merchantAcquiringAccountAccessRecord;
  }


}

