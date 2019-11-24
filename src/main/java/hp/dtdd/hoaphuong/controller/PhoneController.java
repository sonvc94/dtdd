package hp.dtdd.hoaphuong.controller;

import hp.dtdd.hoaphuong.entity.Phone;
import hp.dtdd.hoaphuong.model.ResponseModel;
import hp.dtdd.hoaphuong.service.PhoneService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(value = "/rest")
public class PhoneController {

    private static final Logger log = LogManager.getLogger(PhoneController.class);

    @Autowired
    private PhoneService phoneService;

    @RequestMapping(value = "/phone/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getPhoneById(@PathVariable("id") Long id){
        Phone phone = phoneService.getPhoneById(id);
        return new ResponseEntity<>(ResponseModel.success(phone), HttpStatus.OK);
    }

    @RequestMapping(value = "/phone", method = RequestMethod.POST)
    public ResponseEntity<?> createPhone(@RequestBody Phone phone){
        phone.setId(null);
        Phone result = phoneService.createPhone(phone);
        return new ResponseEntity<>(ResponseModel.success(result), HttpStatus.OK);
    }

    @RequestMapping(value = "/phone", method = RequestMethod.PUT)
    public ResponseEntity<?> updatePhone(@RequestBody Phone phone){
        Phone result = phoneService.createPhone(phone);
        return new ResponseEntity<>(ResponseModel.success(result), HttpStatus.OK);
    }

}
