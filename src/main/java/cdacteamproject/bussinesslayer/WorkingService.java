package cdacteamproject.bussinesslayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkingService {

	@Autowired
	private DaoConnection d;
	public Emp find(int id)
	{
		return d.findById(id).get();
	}
	public List<Emp> findall() {
		// TODO Auto-generated method stub
		return d.findAll();
	}
}
