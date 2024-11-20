package org.hbrs.se1.ws24.demo.kapitel6;

import java.util.List;

/**
 * Example for a chatty interface (chapter 6, section 2):
 * 
 * Is this interface chatty? If yes, how would you decompose it?
 * 
 * @author saschaalda
 *
 */

public interface ReportDistributor {
	
	public List getWheatherReports(int x, int y);
	
	public List getStockReports(int data);
	
	public List getHealthReports(String data);
	
	public List getClimateReports(int data, int x);
	
    public void addWheatherReports(List report);
	
	public void addStockReport(List report);
	
	public void addHealthReport(List report);
	
	public void addClimateReport(List report);

}
