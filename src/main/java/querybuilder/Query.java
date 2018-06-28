package querybuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;

import querybuilder.Bool.Builder;

public class Query {
	
	@JsonIgnore
	private Builder boolBuilder;
	
	private Bool bool;
	
	public Query() {
		System.out.println("bool builder Object Create");
		boolBuilder = new Bool.Builder();
	}

	public Builder getBoolBuilder() {
		return boolBuilder;
	}

	public void setBoolBuilder(Builder boolBuilder) {
		this.boolBuilder = boolBuilder;
	}

	public Bool getBool() {
		bool =  boolBuilder.build();
		return bool;
	}

	@Override
	public String toString() {
		return "Query [bool=" + boolBuilder.build() + "]";
	}
	
	
	
}
