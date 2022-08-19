package com.investmentapp.service;

import java.util.List;

import com.investmentapp.exceprion.PlanNotFoundException;
import com.investmentapp.model.Investment;

public interface IInvestmentService {
	
	void addInvestment(Investment investment);
	void updateInvestment(int plaId,double amount)throws PlanNotFoundException ;
	void deleteInvestment(int planId);
	
	List<Investment> getByRiskAndTerm(String risk, int term);
	List<Investment> getByType(String type);
	List<Investment> getByPurpose(String type);
	List<Investment> getAll();
	
	Investment getById(int planId);
	//double getById(Investment investment);

	
	double calculateMaturity(Investment investment);
}
