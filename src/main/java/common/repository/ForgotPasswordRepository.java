package common.repository;

import common.model.ForgotPassword;
import common.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ForgotPasswordRepository extends JpaRepository<ForgotPassword,Integer> {

    Optional<ForgotPassword> findByOtpAndUser(Integer integer, User user);
    Optional<ForgotPassword> findByUser(User user);
}
