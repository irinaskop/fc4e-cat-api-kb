package org.grnet.knowledgebase.api.graphql.realation;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.*;
import org.grnet.knowledgebase.api.entity.relation.ManagerProvider;
import org.grnet.knowledgebase.api.repository.ManagerProviderRepository;

import java.util.List;

@GraphQLApi
public class ManagerProviderResource {

    @Inject
    ManagerProviderRepository repository;

    @Query("getAllManagerProviders")
    @Description("[relation] Fetches All Manager Providers")
    public List<ManagerProvider> getAllManagerProviders() {
        return ManagerProvider.listAll();
    }

    @Query("getManagerProviderIdentifiersIDs")
    @Description("[relation] Fetches all ManagerProvider objects with embedded provider, manager, and identifier")
    @RolesAllowed({"admin"})
    public List<ManagerProvider> getAllManagerProviderIdentifiersIDs() {
        return repository.getManagerProviderIdentifiersIDs();
    }
}

