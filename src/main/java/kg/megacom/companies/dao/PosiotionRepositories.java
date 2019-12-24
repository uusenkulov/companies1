package kg.megacom.companies.dao;

import kg.megacom.companies.entities.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosiotionRepositories extends JpaRepository<Position, Long> {
}
