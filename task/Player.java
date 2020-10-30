package task;

public class Player implements Comparable {
	private String klasse;
	private Integer punkte;
	private String name;

	public Player(String klasse, String name) {
		this.klasse = klasse;
		this.punkte = 0;
		this.name = name;
	}

	public String getKlasse() {
		return klasse;
	}

	public Integer getPunkte() {
		return punkte;
	}

	public String getName() {
		return name;
	}

	public void setKlasse(String pKlasse) {
		this.klasse = pKlasse;
	}

	public void setPunkte(int ppunkte) {
		this.punkte = this.punkte + ppunkte;
	}

	public void setName(String s) {
		this.name = s;
	}

	@Override
	public int compareTo(Object e) {
		int compareage = ((Player) e).getPunkte();
		// aufsteigend
		return compareage - this.punkte;
	}

}
