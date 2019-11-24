package hp.dtdd.hoaphuong.service;

import hp.dtdd.hoaphuong.entity.Phone;
import hp.dtdd.hoaphuong.repository.PhoneRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService {


    private static final Logger log = LogManager.getLogger(PhoneService.class);


    @Autowired
    private PhoneRepository phoneRepository;

    public List<Phone> getAllPhone(){
        return phoneRepository.findAll();
    }

    public Phone getPhoneById(Long id){
        Phone phone = phoneRepository.findPhoneById(id);
        return phone;
    }

    public Phone createPhone(Phone phone){
        return phoneRepository.save(phone);
    }


}
