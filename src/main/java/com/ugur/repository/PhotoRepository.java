package com.ugur.repository;

import com.ugur.repository.entity.Photo;
import com.ugur.utility.HibernateUtility;
import com.ugur.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class PhotoRepository extends MyFactoryRepository<Photo,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;


    public PhotoRepository() {
        super(new Photo());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }
}
