package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FacilityTermsWithIdAndRoot
 */
public class FacilityTermsWithIdAndRoot   {
  private String merchantAcquiringFacilityOperationalTermsAccessReference = null;

  private String productInstanceReference = null;

  private String merchantAcquiringFacilityOperationalTerms = null;

  private Object merchantAcquiringFacilityOperationalTermsAccessRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return merchantAcquiringFacilityOperationalTermsAccessReference
  **/

  public String getMerchantAcquiringFacilityOperationalTermsAccessReference() {
    return merchantAcquiringFacilityOperationalTermsAccessReference;
  }

  public void setMerchantAcquiringFacilityOperationalTermsAccessReference(String merchantAcquiringFacilityOperationalTermsAccessReference) {
    this.merchantAcquiringFacilityOperationalTermsAccessReference = merchantAcquiringFacilityOperationalTermsAccessReference;
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
   * @return merchantAcquiringFacilityOperationalTerms
  **/

  public String getMerchantAcquiringFacilityOperationalTerms() {
    return merchantAcquiringFacilityOperationalTerms;
  }

  public void setMerchantAcquiringFacilityOperationalTerms(String merchantAcquiringFacilityOperationalTerms) {
    this.merchantAcquiringFacilityOperationalTerms = merchantAcquiringFacilityOperationalTerms;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return merchantAcquiringFacilityOperationalTermsAccessRecord
  **/

  public Object getMerchantAcquiringFacilityOperationalTermsAccessRecord() {
    return merchantAcquiringFacilityOperationalTermsAccessRecord;
  }

  public void setMerchantAcquiringFacilityOperationalTermsAccessRecord(Object merchantAcquiringFacilityOperationalTermsAccessRecord) {
    this.merchantAcquiringFacilityOperationalTermsAccessRecord = merchantAcquiringFacilityOperationalTermsAccessRecord;
  }


}

