package zw.co.afrosoft.couponservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zw.co.afrosoft.couponservice.domain.Coupon;
import zw.co.afrosoft.couponservice.repository.CouponRepository;

@RestController
@RequestMapping("/api")
public class CouponRestController {
    @Autowired
    CouponRepository repo;
    @PostMapping("/create-coupon")
    public Coupon create(@RequestBody Coupon coupon){
        return repo.save(coupon);
    }
    @GetMapping("/coupons/{code}")
    public Coupon getCoupon(@PathVariable String code){
        return repo.findByCode(code);
    }
}
