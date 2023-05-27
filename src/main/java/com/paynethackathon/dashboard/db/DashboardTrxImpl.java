package com.paynethackathon.dashboard.db;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paynethackathon.dashboard.obj.BankNameAndAmt;
import com.paynethackathon.dashboard.obj.SpendingHistoryByMonth;

@Service
public class DashboardTrxImpl implements DashboardTrx {
	@Autowired
	private UserRepo userRepo;

	@Autowired
	private MerchantRepo merchantRepo;

	@Autowired
	private ExpensesRepo expensesRepo;

	// hard coded!!
	private static final int id = 1;

//	private Optional<UserEntity> optUser = userRepo.findById(id);
//
//	private Optional<MerchantEntity> optMerchant = merchantRepo.findById(id);
//
//	private Optional<ExpensesEntity> optExpenses = expensesRepo.findById(id);

	@Override
	public List<String> getMonthlyLabels() {
		// TODO Auto-generated method stub
		Iterable<ExpensesEntity> optExpenses = expensesRepo.findAll();
		List<Date> expensesDate = new ArrayList<>();
		for (ExpensesEntity ent : optExpenses) {
			expensesDate.add(ent.getExpensesDate());
		}
		Collections.sort(expensesDate);
		List<String> monthLabels = new ArrayList<>();
		for (Date date : expensesDate) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			int month = calendar.get(Calendar.MONTH);
			Month monthType = Month.of(month + 1);
			String monthLabel = monthType.getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault());
			monthLabels.add(monthLabel);
		}

		return monthLabels;
	}

	@Override
	public List<BankNameAndAmt> getBankNameAndAmt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getBalance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getMoneySpent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SpendingHistoryByMonth> getSpendingHistoryByMonth() {
		// TODO Auto-generated method stub
		return null;
	}

}
