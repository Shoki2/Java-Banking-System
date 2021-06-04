package Security;

import java.util.HashMap;

import java.util.Scanner;
import static ATM.ATM.selectAccount;;

public class Pins {
	public void retrivePin(Integer pin, Integer d) {
		HashMap<Integer, Integer> unicodePins = new HashMap<Integer, Integer>();// Check from an HashMap for a matching
																				// pin
		unicodePins.put(82, 7789);
		unicodePins.put(83, 1962);
		unicodePins.put(18, 1989);
		unicodePins.put(53, 3007);
		// unicodePins.put(key, value);
		if (pin.equals(unicodePins.get(d))) {// Checks if the key(digits) and value(pin) match
			selectAccount();

		} else {
			throw new RuntimeException("Wrong Pin");
		}
	}

	public static void main(String[] args) {
    
	}
}