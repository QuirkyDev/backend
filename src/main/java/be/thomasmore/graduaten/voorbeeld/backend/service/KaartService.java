package be.thomasmore.graduaten.voorbeeld.backend.service;

import be.thomasmore.graduaten.voorbeeld.backend.entity.Kaart;

import java.util.List;

public interface KaartService {
    List<Kaart> getKaarten();
    Kaart getKaartById(Long id);
}
