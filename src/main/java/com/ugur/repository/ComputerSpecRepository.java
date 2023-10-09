package com.ugur.repository;

import com.ugur.repository.entity.ComputerSpec;
import com.ugur.utility.HibernateUtility;
import com.ugur.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class ComputerSpecRepository extends MyFactoryRepository<ComputerSpec,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public ComputerSpecRepository() {
        super(new ComputerSpec());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }
}
