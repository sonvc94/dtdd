package hp.dtdd.hoaphuong.repository;

import hp.dtdd.hoaphuong.entity.Item;
import hp.dtdd.hoaphuong.repository.custom.ItemRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>, ItemRepositoryCustom {
}
