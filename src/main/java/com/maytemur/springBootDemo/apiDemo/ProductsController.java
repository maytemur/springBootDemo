package com.maytemur.springBootDemo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*Biz burda MVC kullanıcaz. ModelViewController----> htpp://bisey.com/products ilk önce controller'a
 * geliyor. Controller bizi View'e yönlendiriyor. Model ise bizim Controller'dan View'e veya tersi
 * arasında göndereceğimiz Data transferini yapmaya yarıyor.
 * POM dosyasında spring-boot-devtools ekleyerek bu class'da yaptığımız ve ctrl+s ile kaydettiğimiz
 * değişikliklerin anında yayınlanmasını sağladık  
 * */

@RestController
public class ProductsController {

	@GetMapping("/")
	public String get() {
		return "Laptop";
	}

	@GetMapping("/products")
	public String get2() {
		return "Laptop 6";
	}
}