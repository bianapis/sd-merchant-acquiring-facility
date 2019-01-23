/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class MerchantAcquiringFacilityApiController {

	@Autowired
	MerchantAcquiringFacilityApiService service;
	
	@BQ("chargebacks")
	@Fulfill.ExecutePut
	public BianResponse<ChargebackWithIdAndRoot> executePutChargebacks(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<Chargeback> bianRequest) {
		return BianResponse.forSuccess(service.executePutChargebacks(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("chargebacks")
	@Fulfill.ExecutePost
	public BianResponse<ChargebackWithIdAndRoot> executePostChargebacks(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<Chargeback> bianRequest) {
		return BianResponse.forSuccess(service.executePostChargebacks(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("settlements")
	@Fulfill.ExecutePut
	public BianResponse<SettlementWithIdAndRoot> executePutSettlements(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<Settlement> bianRequest) {
		return BianResponse.forSuccess(service.executePutSettlements(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("settlements")
	@Fulfill.ExecutePost
	public BianResponse<SettlementWithIdAndRoot> executePostSettlements(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<Settlement> bianRequest) {
		return BianResponse.forSuccess(service.executePostSettlements(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("clearings")
	@Fulfill.ExecutePut
	public BianResponse<ClearingWithIdAndRoot> executePutClearings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<Clearing> bianRequest) {
		return BianResponse.forSuccess(service.executePutClearings(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("clearings")
	@Fulfill.ExecutePost
	public BianResponse<ClearingWithIdAndRoot> executePostClearings(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<Clearing> bianRequest) {
		return BianResponse.forSuccess(service.executePostClearings(crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<MerchantAcquiringWithRoot> initiate(@RequestBody BianRequest<MerchantAcquiring> bianRequest) {
		return BianResponse.forSuccess(service.initiate(bianRequest.getData()));
	}
	
	@Fulfill.Record
	public BianResponse<MerchantAcquiringRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<MerchantAcquiringRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.RequestPost
	public BianResponse<MerchantAcquiringWithRoot> requestPost(@RequestBody BianRequest<MerchantAcquiring> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Fulfill.RequestPut
	public BianResponse<MerchantAcquiringWithRoot> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<MerchantAcquiring> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("facilityterms")
	@Fulfill.Retrieve
	public BianResponse<FacilityTermsWithIdAndRoot> retrieveFacilityterms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFacilityterms(crReferenceId, bqReferenceId));
	}
	
	@BQ("accounts")
	@Fulfill.Retrieve
	public BianResponse<AccountWithIdAndRoot> retrieveAccounts(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAccounts(crReferenceId, bqReferenceId));
	}
	
	@BQ("chargebacks")
	@Fulfill.Retrieve
	public BianResponse<ChargebackWithIdAndRoot> retrieveChargebacks(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveChargebacks(crReferenceId, bqReferenceId));
	}
	
	@BQ("clearings")
	@Fulfill.Retrieve
	public BianResponse<ClearingWithIdAndRoot> retrieveClearings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveClearings(crReferenceId, bqReferenceId));
	}
	
	@BQ("fees")
	@Fulfill.Retrieve
	public BianResponse<FeesWithIdAndRoot> retrieveFees(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFees(crReferenceId, bqReferenceId));
	}
	
	@BQ("reports")
	@Fulfill.Retrieve
	public BianResponse<ReportsWithIdAndRoot> retrieveReports(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReports(crReferenceId, bqReferenceId));
	}
	
	@BQ("settlements")
	@Fulfill.Retrieve
	public BianResponse<SettlementWithIdAndRoot> retrieveSettlements(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSettlements(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.Retrieve
	public BianResponse<MerchantAcquiringWithRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Fulfill.Terminate
	public BianResponse<Void> terminate(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.terminate(crReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<MerchantAcquiringWithRoot> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<MerchantAcquiring> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
