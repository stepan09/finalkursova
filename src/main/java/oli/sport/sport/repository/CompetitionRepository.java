/*
 * Copyright by Stepan Oliinyk (c) 2018.
 */

package oli.sport.sport.repository;

import oli.sport.sport.model.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitionRepository extends JpaRepository<Competition, Long> {
}
