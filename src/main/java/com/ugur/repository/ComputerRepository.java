package com.ugur.repository;

import com.ugur.repository.entity.Computer;
import com.ugur.utility.HibernateUtility;
import com.ugur.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class ComputerRepository extends MyFactoryRepository<Computer,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public ComputerRepository() {
        super(new Computer());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }
}
