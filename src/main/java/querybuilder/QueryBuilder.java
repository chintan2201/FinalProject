package querybuilder;

public class QueryBuilder {
	
	//private String key = "Query";
	private Query query;
	
	public QueryBuilder() {
		System.out.println("Query Object Create");
		this.query = new Query();
	}

	public Query getQuery() {
		return query;
	}

	@Override
	public String toString() {
		return "QueryBuilder [query=" + query + "]";
	}
	
	
}
