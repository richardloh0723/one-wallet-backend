package com.paynethackathon.dashboard.db;

import java.util.List;

import com.paynethackathon.dashboard.obj.BankNameAndAmt;
import com.paynethackathon.dashboard.obj.SpendingHistoryByMonth;

public interface DashboardTrx {
	List<String> getMonthlyLabels();

	List<BankNameAndAmt> getBankNameAndAmt();

	Double getBalance();

	Double getMoneySpent();

	List<SpendingHistoryByMonth> getSpendingHistoryByMonth();

}
