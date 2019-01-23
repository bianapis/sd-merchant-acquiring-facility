/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class MerchantAcquiringFacilityApiServiceImpl implements MerchantAcquiringFacilityApiService {

	public ChargebackWithIdAndRoot executePutChargebacks(String crReferenceId, String bqReferenceId, Chargeback request){
		return JsonReader.read("executePut-ChargebackWithIdAndRoot.json",new TypeReference<ChargebackWithIdAndRoot>(){});
	}
	
	public ChargebackWithIdAndRoot executePostChargebacks(String crReferenceId, Chargeback request){
		return JsonReader.read("executePost-ChargebackWithIdAndRoot.json",new TypeReference<ChargebackWithIdAndRoot>(){});
	}
	
	public SettlementWithIdAndRoot executePutSettlements(String crReferenceId, String bqReferenceId, Settlement request){
		return JsonReader.read("executePut-SettlementWithIdAndRoot.json",new TypeReference<SettlementWithIdAndRoot>(){});
	}
	
	public SettlementWithIdAndRoot executePostSettlements(String crReferenceId, Settlement request){
		return JsonReader.read("executePost-SettlementWithIdAndRoot.json",new TypeReference<SettlementWithIdAndRoot>(){});
	}
	
	public ClearingWithIdAndRoot executePutClearings(String crReferenceId, String bqReferenceId, Clearing request){
		return JsonReader.read("executePut-ClearingWithIdAndRoot.json",new TypeReference<ClearingWithIdAndRoot>(){});
	}
	
	public ClearingWithIdAndRoot executePostClearings(String crReferenceId, Clearing request){
		return JsonReader.read("executePost-ClearingWithIdAndRoot.json",new TypeReference<ClearingWithIdAndRoot>(){});
	}
	
	public MerchantAcquiringWithRoot initiate(MerchantAcquiring request){
		return JsonReader.read("initiate-MerchantAcquiringWithRoot.json",new TypeReference<MerchantAcquiringWithRoot>(){});
	}
	
	public MerchantAcquiringRecordResponse record(String crReferenceId, MerchantAcquiringRecordRequest request){
		return JsonReader.read("record-MerchantAcquiringRecordResponse.json",new TypeReference<MerchantAcquiringRecordResponse>(){});
	}
	
	public MerchantAcquiringWithRoot requestPost(MerchantAcquiring request){
		return JsonReader.read("requestPost-MerchantAcquiringWithRoot.json",new TypeReference<MerchantAcquiringWithRoot>(){});
	}
	
	public MerchantAcquiringWithRoot requestPut(String crReferenceId, MerchantAcquiring request){
		return JsonReader.read("requestPut-MerchantAcquiringWithRoot.json",new TypeReference<MerchantAcquiringWithRoot>(){});
	}
	
	public FacilityTermsWithIdAndRoot retrieveFacilityterms(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FacilityTermsWithIdAndRoot.json",new TypeReference<FacilityTermsWithIdAndRoot>(){});
	}
	
	public AccountWithIdAndRoot retrieveAccounts(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AccountWithIdAndRoot.json",new TypeReference<AccountWithIdAndRoot>(){});
	}
	
	public ChargebackWithIdAndRoot retrieveChargebacks(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ChargebackWithIdAndRoot.json",new TypeReference<ChargebackWithIdAndRoot>(){});
	}
	
	public ClearingWithIdAndRoot retrieveClearings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ClearingWithIdAndRoot.json",new TypeReference<ClearingWithIdAndRoot>(){});
	}
	
	public FeesWithIdAndRoot retrieveFees(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FeesWithIdAndRoot.json",new TypeReference<FeesWithIdAndRoot>(){});
	}
	
	public ReportsWithIdAndRoot retrieveReports(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ReportsWithIdAndRoot.json",new TypeReference<ReportsWithIdAndRoot>(){});
	}
	
	public SettlementWithIdAndRoot retrieveSettlements(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SettlementWithIdAndRoot.json",new TypeReference<SettlementWithIdAndRoot>(){});
	}
	
	public MerchantAcquiringWithRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-MerchantAcquiringWithRoot.json",new TypeReference<MerchantAcquiringWithRoot>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public Void terminate(String crReferenceId){
		return null;
	}
	
	public MerchantAcquiringWithRoot update(String crReferenceId, MerchantAcquiring request){
		return JsonReader.read("update-MerchantAcquiringWithRoot.json",new TypeReference<MerchantAcquiringWithRoot>(){});
	}
	
}
