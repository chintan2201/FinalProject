package querybuilder;

public class Bool {
	
	private Must must;
	private Should should;
	
	private Bool(Builder builder) {
		this.must = builder.must;
		this.should = builder.should;
	}

	
	
	
	public Must getMust() {
		return must;
	}



	public Should getShould() {
		return should;
	}



	@Override
	public String toString() {
		return "Bool [must=" + must + ", should=" + should + "]";
	}


	public static class Builder{
		
		private Must must;
		private Should should;
		
		public Builder() {
			
		}
		
		public Builder mustMatch(String key, String value) {
			Must mustPart = Must.getInstance();
			Match matchPart = new Match(key, value);
			mustPart.matchParts.add(matchPart);
			mustPart.setBool();
			this.must = mustPart;
			return this;
		}
		
		public Builder shouldMatch(String key, String value) {
			Should shouldPart = Should.getInstance();
			Match matchPart = new Match(key, value);
			shouldPart.matchParts.add(matchPart);
			shouldPart.setBool();
			this.should = shouldPart;
			return this;
		}
		
		
		public Should CreateShouldBool() {
			this.should.boolBuilder = new Bool.Builder();
			return should;
		}
		
		public Must CreateMustBool() {
			this.must.boolBuilder = new Bool.Builder();
			return must;
		}
		
		
		
		@Override
		public String toString() {
			return "Builder [must=" + must + ", should=" + should + "]";
		}

		public Bool build() {
			return new Bool(this);
		}
	}
	
}
