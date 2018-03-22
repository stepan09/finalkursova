/*
 * Copyright by Stepan Oliinyk (c) 2018.
 */

package oli.sport.sport.repository;

import oli.sport.sport.model.SportClub;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportClubRepository extends JpaRepository<SportClub, Long>{
}
