package pl.sda.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.model.Donation;
import pl.sda.model.Whipround;
import pl.sda.repository.WhiproundRepository;
@RequiredArgsConstructor
@Service
public class WhiproundService {

    private final WhiproundRepository whiproundRepository;

    public long add (Whipround whipround){

        return  whiproundRepository.save(whipround).getId();
    }
    public void addDonation (Donation donation){
        Whipround whipround = whiproundRepository.getOne(donation.getWhipround().getId());
        whipround.getDonationList().add(donation);
        whiproundRepository.save(whipround);
    }
}
