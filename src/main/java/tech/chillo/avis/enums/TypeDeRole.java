package tech.chillo.avis;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

import static tech.chillo.avis.TypePermission.*;
@Getter
@AllArgsConstructor
public enum TypeDeRole {
    UTILISATEUR(
            Set.of(UTILISATEUR_CREATE_AVIS)
    ),

    MANAGER(Set.of(
            MANAGER_CREATE,
            MANAGER_READ,
            MANAGER_UPDATE,
            MANAGER_DELETE_AVIS
    )
    ),
    ADMINISTRATEUR(
            Set.of(
                    ADMINISTRATEUR_CREATE,
                    ADMINISTRATEUR_READ,
                    ADMINISTRATEUR_UPDATE,
                    ADMINISTRATEUR_DELETE,

                    MANAGER_CREATE,
                    MANAGER_READ,
                    MANAGER_UPDATE,
                    MANAGER_DELETE_AVIS
            )
    );


    final Set<TypePermission> permissions;
}
