package eu.europeana.api.client.test;

import java.io.IOException;

import eu.europeana.api.client.Api2Query;
import eu.europeana.api.client.EuropeanaComplexQuery;
import eu.europeana.api.client.connection.EuropeanaApi2Client;
import eu.europeana.api.client.exception.EuropeanaApiProblem;
import eu.europeana.api.client.result.EuropeanaApi2Results;

public class SearchUrban {
	
	
	public static void main(String[] arg) throws IOException, EuropeanaApiProblem{
		 //create the query object
		Api2Query europeanaQuery = new Api2Query();
        europeanaQuery.setTitle("vooravond");
        europeanaQuery.setType(EuropeanaComplexQuery.TYPE.TEXT);
        europeanaQuery.setDate("2010/10/01");
        europeanaQuery.setSubject("opera Gernier");
        
        //perform search
        EuropeanaApi2Client europeanaClient = new EuropeanaApi2Client();
        final int RESULTS_SIZE = 5;
		EuropeanaApi2Results res = europeanaClient.searchApi2(europeanaQuery, RESULTS_SIZE, 0);
		
	}

}
