package be.thomasmore.graduaten.voorbeeld.backend.service;

import be.thomasmore.graduaten.voorbeeld.backend.entity.Klas;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface KlasService {
    Klas getKlasById(Long id);
    List<Klas> getKlassen();
    Klas addKlas(Klas klas);
}
