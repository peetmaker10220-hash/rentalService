package th.co.scb.ngage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.co.scb.ngage.model.common.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // สามารถเพิ่ม custom query method ได้ที่นี่

}
