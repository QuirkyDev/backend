package be.thomasmore.graduaten.voorbeeld.backend.service;

import be.thomasmore.graduaten.voorbeeld.backend.entity.Kaart;
import be.thomasmore.graduaten.voorbeeld.backend.repository.KaartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KaartServiceImpl implements KaartService {

    @Autowired
    KaartRepository kaartRepository;

    @Override
    public List<Kaart> getKaarten() {
        return kaartRepository.findAll();
    }

    @Override
    public Kaart getKaartById(Long id) {
        return kaartRepository.getOne(id);
    }
}
