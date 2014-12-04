package eu.europeana.api.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.github.jsonldjava.core.JsonLdError;
import com.github.jsonldjava.core.JsonLdOptions;
import com.github.jsonldjava.core.JsonLdProcessor;
import com.github.jsonldjava.utils.JsonUtils;

public class JsonToJsonld {
	@Test
	public void testSimpleJsonToJsonld() throws JsonLdError, IOException{
	
	// Open a valid json(-ld) input file
	InputStream inputStream = new FileInputStream("input.json");
	System.out.println("find file");
	// Read the file into an Object (The type of this object will be a List, Map, String, Boolean,
	// Number or null depending on the root object in the file).
	Object jsonObject = JsonUtils.fromInputStream(inputStream);
	System.out.println("context JSON");
	// Create a context JSON map containing prefixes and definitions
	Map context = new HashMap();
	System.out.println("Customise context");
	// Customise context...
	// Create an instance of JsonLdOptions with the standard JSON-LD options
	JsonLdOptions options = new JsonLdOptions();
	System.out.println(jsonObject);
	// Customise options...
	// Call whichever JSONLD function you want! (e.g. compact)
	final JsonLdOptions opts = new JsonLdOptions("urn:test:");
	Object compact = JsonLdProcessor.compact(jsonObject, context, opts);
	// Print out the result (or don't, it's your call!)
	System.out.println(JsonUtils.toPrettyString(compact));

	}
	
}	
