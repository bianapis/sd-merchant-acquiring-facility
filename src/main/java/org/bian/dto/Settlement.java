package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * Settlement
 */
public class Settlement   {
  private String merchantAcquiringFacilityAccountReference = null;

  private String participantMerchantAcquirerBankReference = null;

  private String participantIssuerBankReference = null;

  private Object cardFinancialSettlementServicePaymentAdviceRecord = null;

  private String participantPaymentTransaction = null;

  private String participantAcquirerBankSettlementAccountStatement = null;

  private Object merchantAcquiringSettlementTaskRecord = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return participantMerchantAcquirerBankReference
  **/

  public String getParticipantMerchantAcquirerBankReference() {
    return participantMerchantAcquirerBankReference;
  }

  public void setParticipantMerchantAcquirerBankReference(String participantMerchantAcquirerBankReference) {
    this.participantMerchantAcquirerBankReference = participantMerchantAcquirerBankReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return participantIssuerBankReference
  **/

  public String getParticipantIssuerBankReference() {
    return participantIssuerBankReference;
  }

  public void setParticipantIssuerBankReference(String participantIssuerBankReference) {
    this.participantIssuerBankReference = participantIssuerBankReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary   
   * @return cardFinancialSettlementServicePaymentAdviceRecord
  **/

  public Object getCardFinancialSettlementServicePaymentAdviceRecord() {
    return cardFinancialSettlementServicePaymentAdviceRecord;
  }

  public void setCardFinancialSettlementServicePaymentAdviceRecord(Object cardFinancialSettlementServicePaymentAdviceRecord) {
    this.cardFinancialSettlementServicePaymentAdviceRecord = cardFinancialSettlementServicePaymentAdviceRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return participantPaymentTransaction
  **/

  public String getParticipantPaymentTransaction() {
    return participantPaymentTransaction;
  }

  public void setParticipantPaymentTransaction(String participantPaymentTransaction) {
    this.participantPaymentTransaction = participantPaymentTransaction;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text       
   * @return participantAcquirerBankSettlementAccountStatement
  **/

  public String getParticipantAcquirerBankSettlementAccountStatement() {
    return participantAcquirerBankSettlementAccountStatement;
  }

  public void setParticipantAcquirerBankSettlementAccountStatement(String participantAcquirerBankSettlementAccountStatement) {
    this.participantAcquirerBankSettlementAccountStatement = participantAcquirerBankSettlementAccountStatement;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return merchantAcquiringSettlementTaskRecord
  **/

  public Object getMerchantAcquiringSettlementTaskRecord() {
    return merchantAcquiringSettlementTaskRecord;
  }

  public void setMerchantAcquiringSettlementTaskRecord(Object merchantAcquiringSettlementTaskRecord) {
    this.merchantAcquiringSettlementTaskRecord = merchantAcquiringSettlementTaskRecord;
  }


}

