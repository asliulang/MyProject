package com.dao;

public class ComputerDAOimpl implements IComputerDAO {

	@Override
	public int add(int a, int b) {
		int result = a+b;
		return result;
	}

	@Override
	public int subtract(int a, int b) {
		int result = a-b;
		return result;
	}

	@Override
	public double mul(double a, double b) {
		double result = a*b;
		return result;
	}

	@Override
	public double division(double a, double b) {
		double result = a/b;
		return result;
	}

}
