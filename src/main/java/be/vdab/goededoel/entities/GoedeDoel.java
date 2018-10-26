package be.vdab.goededoel.entities;

import java.math.BigDecimal;

/**
 * Een <strong> goed doel waarvoor men cash inzamelt.
 * TOMCAT DEPLOYMENT
 * @author Stijn.Verholen
 *
 */
public class GoedeDoel {
	private final String naam;
	private BigDecimal opgebracht = BigDecimal.ZERO;
	/**
	 * Instantiates a GoedeDoel object.
	 * @param naam the charity's name.
	 */
	public GoedeDoel(String naam) {
		this.naam = naam;
	}
	/**
	 * Returns the charity's name
	 * @return the charity's name
	 */
	public String getNaam() {
		return naam;
	}
	/**
	 * Return the amount that was donated.
	 * @return the amount that was donated.
	 */
	public BigDecimal getOpgebracht() {
		return opgebracht;
	}
	
	@Override
	public boolean equals(final Object object) {
		if (!(object instanceof GoedeDoel))
			return false;
		
		return ((GoedeDoel)object).naam.equalsIgnoreCase(naam);
	}
	
	@Override
	public int hashCode() {
	return this.naam.toUpperCase().hashCode();
	}
}
