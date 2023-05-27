package com.paynethackathon.dashboard.db;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EXPENSES")
public class ExpensesEntity {

	@Id
	private int expensesId;

	@ManyToOne
	@JoinColumn(name = "userid")
	private int userId;

	@ManyToOne
	@JoinColumn(name = "merchantid")
	private int merchantId;

	@Column(name = "expensesdescription")
	private String expensesDescription;

	@Column(name = "expensesamount", columnDefinition = "Decimal(10,2) default '100.00'")
	private int expensesAmount;

	@Column(name = "expensesdate")
	@Temporal(TemporalType.DATE)
	private Date expensesDate;

	public Date getExpensesDate() {
		return expensesDate;
	}

	public void setExpensesDate(Date expensesDate) {
		this.expensesDate = expensesDate;
	}

	public int getExpensesId() {
		return expensesId;
	}

	public void setExpensesId(int expensesId) {
		this.expensesId = expensesId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}

	public String getExpensesDescription() {
		return expensesDescription;
	}

	public void setExpensesDescription(String expensesDescription) {
		this.expensesDescription = expensesDescription;
	}

	public int getExpensesAmount() {
		return expensesAmount;
	}

	public void setExpensesAmount(int expensesAmount) {
		this.expensesAmount = expensesAmount;
	}

}
