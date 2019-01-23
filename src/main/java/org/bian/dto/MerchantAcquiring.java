package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * MerchantAcquiring
 */
public class MerchantAcquiring   {
  private String productServiceReference = null;

  private String customerReference = null;

  private String partyReference = null;

  private String bankBranchLocationReference = null;

  private String accountCurrency = null;

  private String merchantAcquiringFacilityStatus = null;

  private String merchantAcquiringFacilityLimits = null;

  private String merchantAcquiringFacilityAccountReference = null;

  private String merchantAcquiringFacilityOperationalTerms = null;

  private String merchantAcquiringFacilityFeeConfiguration = null;

  private String taxReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier              
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return accountCurrency
  **/

  public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return merchantAcquiringFacilityStatus
  **/

  public String getMerchantAcquiringFacilityStatus() {
    return merchantAcquiringFacilityStatus;
  }

  public void setMerchantAcquiringFacilityStatus(String merchantAcquiringFacilityStatus) {
    this.merchantAcquiringFacilityStatus = merchantAcquiringFacilityStatus;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount   
   * @return merchantAcquiringFacilityLimits
  **/

  public String getMerchantAcquiringFacilityLimits() {
    return merchantAcquiringFacilityLimits;
  }

  public void setMerchantAcquiringFacilityLimits(String merchantAcquiringFacilityLimits) {
    this.merchantAcquiringFacilityLimits = merchantAcquiringFacilityLimits;
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
   * @return merchantAcquiringFacilityOperationalTerms
  **/

  public String getMerchantAcquiringFacilityOperationalTerms() {
    return merchantAcquiringFacilityOperationalTerms;
  }

  public void setMerchantAcquiringFacilityOperationalTerms(String merchantAcquiringFacilityOperationalTerms) {
    this.merchantAcquiringFacilityOperationalTerms = merchantAcquiringFacilityOperationalTerms;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Rate  
   * @return merchantAcquiringFacilityFeeConfiguration
  **/

  public String getMerchantAcquiringFacilityFeeConfiguration() {
    return merchantAcquiringFacilityFeeConfiguration;
  }

  public void setMerchantAcquiringFacilityFeeConfiguration(String merchantAcquiringFacilityFeeConfiguration) {
    this.merchantAcquiringFacilityFeeConfiguration = merchantAcquiringFacilityFeeConfiguration;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


}

