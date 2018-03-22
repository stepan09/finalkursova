/*
 * Copyright by Stepan Oliinyk (c) 2018.
 */

package oli.sport.sport.repository;

import oli.sport.sport.model.Gym;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymRepository extends JpaRepository<Gym, Long> {
}
