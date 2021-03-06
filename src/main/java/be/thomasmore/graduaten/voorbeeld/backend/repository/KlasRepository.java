package be.thomasmore.graduaten.voorbeeld.backend.repository;

import be.thomasmore.graduaten.voorbeeld.backend.entity.Klas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlasRepository extends JpaRepository<Klas, Long> {
}
