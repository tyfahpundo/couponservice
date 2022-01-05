package zw.co.afrosoft.couponservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.couponservice.domain.Coupon;

public interface CouponRepository extends JpaRepository<Coupon,Long> {
    Coupon findByCode(String code);
}
