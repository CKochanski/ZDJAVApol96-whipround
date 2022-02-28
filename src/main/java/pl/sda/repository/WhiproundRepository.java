package pl.sda.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.model.Whipround;

@Repository
public interface WhiproundRepository extends JpaRepository<Whipround , Long> {


}
