package hp.dtdd.hoaphuong.service;

import hp.dtdd.hoaphuong.entity.Item;
import hp.dtdd.hoaphuong.repository.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

@Service
public class ItemService {

    public static final Logger log = LoggerFactory.getLogger(ItemService.class);

    @Autowired
    ItemRepository itemRepository;

    @Transactional
    public Item createItem(Item item) {
        log.info("create item {}", item);
        item = itemRepository.save(item);
        log.info("item's saved - {}", item);
        return item;
    }


    public List<Item> getItem(Long id, Integer offset, Integer limit, Date fromDate, Date toDate) {
        log.info("get items with id={}, offset={}, limit={}, fromDate={}, toDate={}", id, offset, limit, fromDate, toDate);
        List<Item> itemList = itemRepository.findItem(id, offset, limit, fromDate, toDate);
        log.info("item result {}", itemList);
        return itemList;
    }
}
