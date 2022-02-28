package pl.sda.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.model.Donation;
import pl.sda.model.Whipround;
import pl.sda.repository.WhiproundRepository;
import pl.sda.service.WhiproundService;

@RestController
@RequiredArgsConstructor
public class WhiproundController {

    private final WhiproundService whiproundService;
    @PostMapping("api/whipround")
    public long add(@RequestBody Whipround whipround){
        return whiproundService.add(whipround);
    }

    @PostMapping("api/donation")
    public void addDonation(@RequestBody Donation donation){
        whiproundService.addDonation(donation);
    }

}
