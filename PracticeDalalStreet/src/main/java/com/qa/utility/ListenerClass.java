package com.qa.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testBase.TestBase;

public class ListenerClass extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		
		logger.info("Text execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Text execution completed");
		logger.info("Text execution completed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Util.screenshot(result.getName());
		logger.info("Text execution failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	@Override
	public void setup() {
		
	}

	@Override
	public void tearDown() {
		
		super.tearDown();
	}

	@Override
	public int hashCode() {
	
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}

	@Override
	public String toString() {
		
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		
	}

}
