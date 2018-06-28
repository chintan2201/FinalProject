package conversion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import querybuilder.QueryBuilder;

public class JsonObject {
	
	public static String getJSON(QueryBuilder queryObj) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();

		//Object to JSON in String
		String jsonInString = mapper.writeValueAsString(queryObj);
		
		return jsonInString;
	}
	
}
