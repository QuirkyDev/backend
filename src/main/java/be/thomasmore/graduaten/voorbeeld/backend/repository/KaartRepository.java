package be.thomasmore.graduaten.voorbeeld.backend.repository;

import be.thomasmore.graduaten.voorbeeld.backend.entity.Kaart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KaartRepository extends JpaRepository<Kaart, Long> {
}
