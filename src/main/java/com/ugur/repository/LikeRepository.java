package com.ugur.repository;

import com.ugur.repository.entity.Like;
import com.ugur.utility.HibernateUtility;
import com.ugur.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class LikeRepository extends MyFactoryRepository<Like,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public LikeRepository() {
        super(new Like());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }

}
