package com.swabai.mph.request;

import java.math.BigDecimal;
import java.time.LocalDate;

import java.math.BigDecimal;
import java.time.LocalDate;

import java.time.LocalDate;

public class ReturnSummaryRequest {
	private String portfolioId;
	private LocalDate valuationDate;
	private BigDecimal beginningMarketValue;
	private BigDecimal endingMarketValue;
	private BigDecimal netCashFlow;
	private BigDecimal benchmarkReturnPct;
	private String currency;
	private String requestedBy;

	public String getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}

	public LocalDate getValuationDate() {
		return valuationDate;
	}

	public void setValuationDate(LocalDate valuationDate) {
		this.valuationDate = valuationDate;
	}

	public BigDecimal getBeginningMarketValue() {
		return beginningMarketValue;
	}

	public void setBeginningMarketValue(BigDecimal beginningMarketValue) {
		this.beginningMarketValue = beginningMarketValue;
	}

	public BigDecimal getEndingMarketValue() {
		return endingMarketValue;
	}

	public void setEndingMarketValue(BigDecimal endingMarketValue) {
		this.endingMarketValue = endingMarketValue;
	}

	public BigDecimal getNetCashFlow() {
		return netCashFlow;
	}

	public void setNetCashFlow(BigDecimal netCashFlow) {
		this.netCashFlow = netCashFlow;
	}

	public BigDecimal getBenchmarkReturnPct() {
		return benchmarkReturnPct;
	}

	public void setBenchmarkReturnPct(BigDecimal benchmarkReturnPct) {
		this.benchmarkReturnPct = benchmarkReturnPct;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}
}
