package hp.dtdd.hoaphuong.controller;

import hp.dtdd.hoaphuong.entity.Item;
import hp.dtdd.hoaphuong.model.ResponseModel;
import hp.dtdd.hoaphuong.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class ItemController {

    private static final Logger log = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    ItemService itemService;

    @RequestMapping(value = "/item", method = RequestMethod.POST)
    public ResponseModel createItem(
            @RequestBody Item item
    ) {
        log.info("receive data {}", item);
        item.setId(null);
        Item result = itemService.createItem(item);
        return ResponseModel.success(result);
    }

    @RequestMapping(value = "/item")
    public ResponseModel getItem(
            @RequestParam(name = "id", required = false) Long id,
            @RequestParam(name = "offset", required = false) Integer offset,
            @RequestParam(name = "limit", required = false) Integer limit,
            @RequestParam(name = "from_date", required = false) Date fromDate,
            @RequestParam(name = "to_date", required = false) Date toDate
    ) {
        log.info("receive data id={}, offset={}, limit={}, from_date={}, to_date={}", id, offset, limit, fromDate, toDate);
        List<Item> result = itemService.getItem(id, offset, limit, fromDate, toDate);
        return ResponseModel.success(result);
    }

}
