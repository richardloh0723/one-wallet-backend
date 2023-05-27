package com.paynethackathon.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paynethackathon.dashboard.db.DashboardTrx;
// rest api
@Controller
@RequestMapping("/dashboard")
public class DashboardController {

	@Autowired
	private DashboardTrx trx;
	
//	@GetMapping("getMonthlyLabels")
//	
//	@GetMapping("getBankNameAndAmt")
//	
//	@GetMapping("getBalance")
//	
//	@GetMapping("getMoneySpent")
//	
//	@GetMapping("getSpendingHistoryByMonth")
	
	
	
	
}
