package hp.dtdd.hoaphuong.repository;

import hp.dtdd.hoaphuong.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

    @Query("select t from phone t where t.id = :id")
    Phone findPhoneById(@Param("id") Long id);

}
