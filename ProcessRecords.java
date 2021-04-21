import java.util.List;
import java.util.Map;

public class ProcessRecords {
    
    public static void main(String[] args) {
        
    }

    /**
	 * Given the following class...
	 */
	public static class RecordsReport {
		public int fooCounter;
		public int barCounter;
		public int bazCounter;

		public RecordsReport(int fooCounter, int barCounter, int bazCounter) {
			this.fooCounter = fooCounter;
			this.barCounter = barCounter;
			this.bazCounter = bazCounter;
		}
	}
	/**
	 * And given a list of records (each represented by a Map object), implement processRecords
	 * using the following rules:
	 *
	 * 1) When a record is encountered where X > 3, add 1 to the foo counter
	 * 2) When a record is encountered where Z = 5, add 1 to the bar counter
	 * 3) When a record is encountered where X > 0 and Y < 0, add 1 to the baz counter and ignore Rule 1
	 * 4) When a record is encountered where X = Z, add 1 to the bar counter and ignore Rule 1
	 *
	 * Make sure that all the counters are initially set to 0.
	 */

    public RecordsReport processRecords(List<Map<String,Integer>> records) {
        
		return null;
	}

}
