package com.hotel.search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HotelController {

	@Autowired
	private HotelDao hotelDao;

	@RequestMapping("/")
	public ModelAndView showIndex() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("cities", hotelDao.findCityList());
		return mav;
	}

	@GetMapping("/list")
	public ModelAndView citySearch(@RequestParam(name = "city") String city) {
		ModelAndView mav = new ModelAndView("results");
		mav.addObject("city", city);

		mav.addObject("hotelList", hotelDao.findHotelList(city));

		return mav;
	}
}
