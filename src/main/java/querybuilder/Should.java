package querybuilder;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.util.ArrayBuilders.BooleanBuilder;

import querybuilder.Bool.Builder;


public class Should {

	public List<Match> matchParts;
	
	public Bool bool;
	
	@JsonIgnore
	public Builder boolBuilder;
	
	private static Should INSTANCE = null;
	
	private Should() {
		matchParts = new ArrayList<Match>();
		//boolBuilder = new Bool.Builder();
	}
	
	public synchronized static Should getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Should();
		}
		return INSTANCE;
	}
	
	public void setBool() {
		if(this.boolBuilder != null)
			this.bool = this.boolBuilder.build();
	}
	

	@Override
	public String toString() {
		return "Should [matchParts=" + matchParts + ", bool=" + boolBuilder.build() +"]";
	}


}
