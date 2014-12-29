package eu.europeana.api.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.europeana.api.client.result.EuropeanaApi2Item;
import eu.europeana.api.client.result.EuropeanaApi2Results;

public class BaseSearchUtils {
	private final Logger log = LoggerFactory.getLogger(getClass());
	public void printSearchResults(EuropeanaApi2Results res) {
		System.out.println("Results: " + res.getItemCount() + " / " + res.getTotalResults());
	    
	    int count = 0;
	    for (EuropeanaApi2Item item : res.getAllItems()) {
	    	
	    	log.error("**** " + (count++ + 1));
	    	log.error("Title: " + item.getTitle());
	    	log.error("Europeana URL: " + item.getObjectURL());
	    	log.error("Type: " + item.getType());
	    	log.error("Creator(s): " + item.getDcCreator());
	    	log.error("Thumbnail(s): " + item.getEdmPreview());
	        log.error("Data provider: "
	                 + item.getDataProvider());
		}
	}

}
