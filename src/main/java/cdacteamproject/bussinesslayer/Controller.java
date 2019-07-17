package cdacteamproject.bussinesslayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private WorkingService w;
	@GetMapping("/find")
	public Emp find(@RequestParam("id") int id)
	{
		return w.find(id);
	}
	@GetMapping("/findall")
	public List<Emp> findall()
	{
		return w.findall();
	}
}
