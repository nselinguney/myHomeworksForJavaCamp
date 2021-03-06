package day4homework3.concretes;

import day4homework3.abstracts.CampaignService;
import day4homework3.entities.Campaigns;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaigns campaign) {
		
		System.out.println(campaign.getName() + "Kampanyası eklendi.");
	}

	@Override
	public void update(Campaigns campaign) {
			
		System.out.println(campaign.getName() + "Kampanyası güncellendi.");
	}

	@Override
	public void delete(Campaigns campaign) {

		System.out.println(campaign.getName() + "Kampanyası silindi.");
	}

}
