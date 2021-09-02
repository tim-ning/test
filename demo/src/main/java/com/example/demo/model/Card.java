package com.example.demo.model;

public class Card {

	private Long id;
	private String cardName;
	private Float annualFee, apr, foodiesPointsPercentages, cashBack, lateFee;

	public Card(Long id, String cardName, Float annualFee, Float apr, Float foodiesPointsPercentages, Float cashBack,
			Float lateFee) {
		super();
		this.id = id;
		this.cardName = cardName;
		this.annualFee = annualFee;
		this.apr = apr;
		this.foodiesPointsPercentages = foodiesPointsPercentages;
		this.cashBack = cashBack;
		this.lateFee = lateFee;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public Float getAnnualFee() {
		return annualFee;
	}

	public void setAnnualFee(Float annualFee) {
		this.annualFee = annualFee;
	}

	public Float getApr() {
		return apr;
	}

	public void setApr(Float apr) {
		this.apr = apr;
	}

	public Float getFoodiesPointsPercentages() {
		return foodiesPointsPercentages;
	}

	public void setFoodiesPointsPercentages(Float foodiesPointsPercentages) {
		this.foodiesPointsPercentages = foodiesPointsPercentages;
	}

	public Float getCashBack() {
		return cashBack;
	}

	public void setCashBack(Float cashBack) {
		this.cashBack = cashBack;
	}

	public Float getLateFee() {
		return lateFee;
	}

	public void setLateFee(Float lateFee) {
		this.lateFee = lateFee;
	}

}
