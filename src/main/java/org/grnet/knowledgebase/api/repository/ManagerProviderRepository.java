package org.grnet.knowledgebase.api.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.grnet.knowledgebase.api.entity.relation.ManagerProvider;

import java.util.List;

@ApplicationScoped
public class ManagerProviderRepository implements PanacheRepository<ManagerProvider> {

    public List<ManagerProvider> findByPage(int page, int size) {
        return findAll().page(page, size).list();
    }

    public List<ManagerProvider> getManagerProviderIdentifiersIDs() {
        return findAll().list();
    }
}