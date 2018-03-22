/*
 * Copyright by Stepan Oliinyk (c) 2018.
 */

package oli.sport.sport.repository;

import oli.sport.sport.model.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface StadiumRepository extends JpaRepository<Stadium, Long> {
}
