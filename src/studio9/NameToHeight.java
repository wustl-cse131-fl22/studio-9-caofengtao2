package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// FIXME
		Map<String, Double> nameToHeight = new HashMap<>();
		nameToHeight.put("a", 1.7);
		nameToHeight.put("b", 1.8);
		nameToHeight.put("c", 1.85);
		String input = "";
		while(!input.equals("quit")) {
			input = in.next();
			if(nameToHeight.containsKey(input)) {
				System.out.println(input+" : "+nameToHeight.get(input));
			}
		}

	}
}
