/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface MerchantAcquiringFacilityApiService {

	ChargebackWithIdAndRoot executePutChargebacks(String crReferenceId, String bqReferenceId, Chargeback request);
	
	ChargebackWithIdAndRoot executePostChargebacks(String crReferenceId, Chargeback request);
	
	SettlementWithIdAndRoot executePutSettlements(String crReferenceId, String bqReferenceId, Settlement request);
	
	SettlementWithIdAndRoot executePostSettlements(String crReferenceId, Settlement request);
	
	ClearingWithIdAndRoot executePutClearings(String crReferenceId, String bqReferenceId, Clearing request);
	
	ClearingWithIdAndRoot executePostClearings(String crReferenceId, Clearing request);
	
	MerchantAcquiringWithRoot initiate(MerchantAcquiring request);
	
	MerchantAcquiringRecordResponse record(String crReferenceId, MerchantAcquiringRecordRequest request);
	
	MerchantAcquiringWithRoot requestPost(MerchantAcquiring request);
	
	MerchantAcquiringWithRoot requestPut(String crReferenceId, MerchantAcquiring request);
	
	FacilityTermsWithIdAndRoot retrieveFacilityterms(String crReferenceId, String bqReferenceId);
	
	AccountWithIdAndRoot retrieveAccounts(String crReferenceId, String bqReferenceId);
	
	ChargebackWithIdAndRoot retrieveChargebacks(String crReferenceId, String bqReferenceId);
	
	ClearingWithIdAndRoot retrieveClearings(String crReferenceId, String bqReferenceId);
	
	FeesWithIdAndRoot retrieveFees(String crReferenceId, String bqReferenceId);
	
	ReportsWithIdAndRoot retrieveReports(String crReferenceId, String bqReferenceId);
	
	SettlementWithIdAndRoot retrieveSettlements(String crReferenceId, String bqReferenceId);
	
	MerchantAcquiringWithRoot retrieve(String crReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveRefIds();
	
	Void terminate(String crReferenceId);
	
	MerchantAcquiringWithRoot update(String crReferenceId, MerchantAcquiring request);
	
}
