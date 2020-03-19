package Mandrin;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class extentmanager {

	public static ExtentReports getInstance() {

		Date date = new Date();

		String originalDateFormat = date.toString();

		String modifiedDateFormat = originalDateFormat.replace(":","_").replace(" ","_");

		String FileName = modifiedDateFormat+".html";

		String FilePath = "reports//"+FileName;

		ExtentReports report = new ExtentReports(FilePath, true, DisplayOrder.NEWEST_FIRST);

		report.loadConfig(new File("ReportsConfi.xml"));

		report.addSystemInfo("Selenium Version", "2.53.1").addSystemInfo(
		"Environment", "QA");

		return report;

		}

		}


	
	

