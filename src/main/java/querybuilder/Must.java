package querybuilder;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import querybuilder.Bool.Builder;

public class Must {
	
	public List<Match> matchParts;
	
	
	public Bool bool;
	
	@JsonIgnore
	public Builder boolBuilder;
	
	private static Must INSTANCE = null;
	
	private  Must() {
		matchParts = new ArrayList<Match>();
		//boolBuilder = new Bool.Builder();
	}
	
	public synchronized static Must getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Must();
		}
		return INSTANCE;
	}
	
	public void setBool() {
		if(boolBuilder != null)
			bool = boolBuilder.build();
	}
	
	@Override
	public String toString() {
		return "Must [matchParts=" + matchParts + ", bool=" + boolBuilder.build() + "]";
	}

	
	
}
