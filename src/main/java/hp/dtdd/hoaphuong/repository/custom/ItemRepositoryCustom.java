package hp.dtdd.hoaphuong.repository.custom;

import hp.dtdd.hoaphuong.entity.Item;

import java.sql.Date;
import java.util.List;

public interface ItemRepositoryCustom {
    List<Item> findItem(Long id, Integer offset, Integer limit, Date fromDate, Date toDate);
}
