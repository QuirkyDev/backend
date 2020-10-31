package be.thomasmore.graduaten.voorbeeld.backend.service;

import be.thomasmore.graduaten.voorbeeld.backend.entity.Klas;
import be.thomasmore.graduaten.voorbeeld.backend.repository.KlasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KlasServiceImpl implements KlasService {

    @Autowired
    KlasRepository klasRepository;

    @Override
    public Klas getKlasById(Long id) {
        return klasRepository.getOne(id);
    }

    @Override
    public List<Klas> getKlassen() {
        return klasRepository.findAll();
    }

    @Override
    public Klas addKlas(Klas klas) {
        return klasRepository.save(klas);
    }
}
