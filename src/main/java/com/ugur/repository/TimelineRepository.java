package com.ugur.repository;

import com.ugur.repository.entity.Timeline;
import com.ugur.utility.HibernateUtility;
import com.ugur.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class TimelineRepository extends MyFactoryRepository<Timeline,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public TimelineRepository() {
        super(new Timeline());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();

    }
}
