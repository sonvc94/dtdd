package hp.dtdd.hoaphuong.repository.custom.impl;

import hp.dtdd.hoaphuong.entity.Item;
import hp.dtdd.hoaphuong.repository.custom.ItemRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.sql.Date;
import java.util.List;

public class ItemRepositoryCustomImpl implements ItemRepositoryCustom {

    @Autowired
    EntityManagerFactory emf;

    @Override
    public List<Item> findItem(Long id, Integer offset, Integer limit, Date fromDate, Date toDate) {
        EntityManager em = emf.createEntityManager();
        StringBuilder queryStr = new StringBuilder("select t from Item t where 1 = 1 ");
        if (id != null) {
            queryStr.append(" and t.id = :id");
        }
        if (fromDate != null){
            queryStr.append(" and t.createDate >= :fromDate");
        }
        if (toDate != null){
            queryStr.append(" and t.createDate <= :toDate");
        }
        Query query =  em.createQuery(queryStr.toString());
        if (id != null){
            query.setParameter("id", id);
        }
        if (fromDate != null){
            query.setParameter("fromDate", fromDate);
        }
        if (toDate != null){
            query.setParameter("toDate", toDate);
        }
        if (offset != null){
            query.setFirstResult(offset);
        }
        if (limit != null){
            query.setMaxResults(limit);
        }
        List<Item> itemList = query.getResultList();
        em.close();
        return itemList;
    }
}
