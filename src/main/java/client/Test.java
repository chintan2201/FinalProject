package client;

import com.fasterxml.jackson.core.JsonProcessingException;

import conversion.JsonObject;
import querybuilder.Bool;
import querybuilder.QueryBuilder;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Started...!!");
		
		QueryBuilder builder = new QueryBuilder();

		//builder.getQuery().getBoolBuilder().mustMatch("item", "Milk").mustMatch("item_type", "Dairy");
		
		//builder.getQuery().getBoolBuilder().shouldMatch("product_location", "New Mexico").shouldMatch("warehouse_number", "37");
		
		builder.getQuery().getBoolBuilder().shouldMatch("lot_number", "307").
		CreateShouldBool().boolBuilder.mustMatch("expiry_date", "Jan 2020").build();
		
		
		
		//System.out.println(builder);
		
		try {
			
			System.out.println(JsonObject.getJSON(builder));
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
