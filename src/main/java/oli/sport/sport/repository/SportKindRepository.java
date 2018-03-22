/*
 * Copyright by Stepan Oliinyk (c) 2018.
 */

package oli.sport.sport.repository;

import oli.sport.sport.model.SportKind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportKindRepository extends JpaRepository<SportKind, Long> {
}
