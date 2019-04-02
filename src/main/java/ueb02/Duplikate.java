package ueb02;

class Duplikate {
	/**
	 * Gibt ein StringSet mit den Wörtern zurück, welche mindestens zwei mal im Text vorkommen.
	 * Alle Satzzeichen im Text sollen ignoriert werden.
	 * @param text Eingabetext, kann Satzzeichen enthalten welche ignoriert werden.
	 * @return StringSet mit den Wörtern, welche mind. zwei mal vorkommen.
	 */
	static StringSet findeDuplikate(String text) {

		String[] a = text.replaceAll("!", "").split(" ");
		StringSet b = new StringSetImpl();
		StringSet dupl = new StringSetImpl();
		for (int i = 0; i < a.length; i++) {
			if (!b.contains(a[i]))
				b.add(a[i]);
             else {
        	dupl.add(a[i]);
		     }
	    }
	    return dupl;

     }
}
