package com.ugur.repository;

import com.ugur.repository.entity.Post;
import com.ugur.utility.HibernateUtility;
import com.ugur.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public class PostRepository extends MyFactoryRepository<Post,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public PostRepository() {
        super(new Post());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }

    public List<Post> birKisiyeAitPostlar(Long userId) {
        String sql = ("SELECT * FROM tbl_post as p WHERE p.id =:userId");
        Query query = entityManager.createNativeQuery(sql, Post.class);
        query.setParameter("userId",userId);
        List<Post> postList = query.getResultList();
        return postList;
    }
}
