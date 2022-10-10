package com.duosasinos.utility;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.duosasinos.pageobjects.ResearchWorkAndIntelligentAlgorithms;

public class ReadConfig {

	public static Properties property;

	public ReadConfig() {

		File src = new File("./Configuration/config.properties");

		try {

			FileInputStream file = new FileInputStream(src);
			property = new Properties();
			property.load(file);

		}
		catch (Exception e) {
			System.out.println("Excetion is" + e.getMessage());
		}
	}
	
	

	public String getBaseURL() {

		String url = property.getProperty("url");
		return url;
	}	
	

	public String getServicesURL() {

		String url = property.getProperty("services");
		return url;
	}	
	
	public String getOutsourcingURL() {

		String url = property.getProperty("outsourcing");
		return url;
	}	
	
	public String getTeamURL() {

		String url = property.getProperty("duosasinosteam");
		return url;
	}	
	
	public String getWorkwithusURL() {

		String url = property.getProperty("workwithus");
		return url;
	}	
	
	public String getBlogURL() {

		String url = property.getProperty("blog");
		return url;
	}	
	
	public String getContactusURL() {

		String url = property.getProperty("contactus");
		return url;
	}	
	public String getSoftwareDevelopmentURL() {

		String url = property.getProperty("softwaredevelopment");
		return url;
	}	
	
	public String getResearchWorkAndIntelligentAlgorithmsURL() {

		String url = property.getProperty("researchworkandintelligentalgorithms");
		return url;
	}	
	public String getPrintDesignURL() {

		String url = property.getProperty("printdesign");
		return url;
	}	
	public String getVisualDesignURL() {

		String url = property.getProperty("visualdesign");
		return url;
	}	
	
	public String getLegacySoftwareURL() {

		String url = property.getProperty("legacysoftware");
		return url;
	}	
	public String getQualityAssuranceURL() {

		String url = property.getProperty("qualityassurance");
		return url;
	}	
	
	
	
}
