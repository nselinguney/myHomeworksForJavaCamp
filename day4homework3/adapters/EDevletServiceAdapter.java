package day4homework3.adapters;

import day4homework3.abstracts.GamerCheckService;
import day4homework3.entities.Gamers;

public class EDevletServiceAdapter implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamers gamer) {

		System.out.println("Kişi E-Devlet tarafından doğrulanmıştır.");
		return true;
	}

}
