package tr.edu.pau.pamukkaleuniversitesiapi;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/ders")
public class DersRestApi {

	public static final List<String> DERSLER = new ArrayList<>();
	{
		DERSLER.add("Ders1");
		DERSLER.add("Ders2");
		DERSLER.add("Ders3");
		DERSLER.add("Ders4");
	}

	@GetMapping("/")
	public List<String> listele() {
		return DERSLER;
	}

	@PostMapping("/")
	public boolean ekle(@RequestBody String dersAd) {
		DERSLER.add(dersAd);
		return true;
	}

	@DeleteMapping("/")
	public boolean sil(@RequestBody String dersAd) {
		DERSLER.remove(dersAd);
		return true;
	}
}
