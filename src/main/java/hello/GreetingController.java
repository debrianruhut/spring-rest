package hello;

import static org.assertj.core.api.Assertions.linesOf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.model.Greeting;
import hello.model.TblGuru;
import hello.model.TblMataPelajaran;
import hello.model.TblSiswa;

@RestController
@RequestMapping("/great")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private Greeting x;
    @Autowired
    private EntityManagerFactory em;
    
    @PostMapping("/addGuru")
    public int addGuru() {
    	int hasil = 0;
		try {
			EntityManager e = em.createEntityManager();
			e.getTransaction().begin();
			
			TblGuru guru = new TblGuru();
			guru.setNip("198906012012101002");
			guru.setPassword("Dosen");
			guru.setNmGuru("Suminah");
			guru.setAlamat("Jalan Pemuda");
			guru.setTempatLahir("Jakarta");
			guru.setTanggalLahir("11-11-2011");
			guru.setJenisKelamin("Perempuan");
			guru.setFoto("test.jpg");
			guru.setTelpon("02192382");
			guru.setAgama("Kristen");
			guru.setJabatan("Guru KWN");
			guru.setGol("IV/a");
			guru.setTamatan("SI/AIV/PMP/90");
			guru.setLevel("dosen");
			
			e.persist(guru);
			e.getTransaction().commit();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			hasil = -1;
		}
		return hasil;
    }
    
    @GetMapping("/editGuru")
	  public int editGuru(@RequestParam("nip") String nip) {
	  	int hasil = 0;
			try {
				
				EntityManager e = em.createEntityManager();
				e.getTransaction().begin();
				
				TblGuru guru = e.find(TblGuru.class, nip);
				guru.setNip("198906012012101002");
				guru.setPassword("Dosen 1");
				guru.setNmGuru("Suminah 1");
				guru.setAlamat("Jalan Pemuda 1");
				guru.setTempatLahir("Jakarta 1");
				guru.setTanggalLahir("11-11-2011");
				guru.setJenisKelamin("Perempuan 1");
				guru.setFoto("test.jpg");
				guru.setTelpon("02192382");
				guru.setAgama("Kristen");
				guru.setJabatan("Guru KWN 2");
				guru.setGol("IV/a");
				guru.setTamatan("SI/AIV/PMP/90");
				guru.setLevel("dosen 1");

				e.getTransaction().commit();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				hasil = -1;
			}
			return hasil;
	  }
    @PostMapping("/addMapel")
    public int addMapel() {
    	int hasil = 0;
		try {
			EntityManager e = em.createEntityManager();
			e.getTransaction().begin();
			
			TblMataPelajaran mapel = new TblMataPelajaran();
			mapel.setKdPelajaran("1217");
			mapel.setNmMapel("Bahasa Inggris");
			mapel.setNip("198906012012101006");


			e.persist(mapel);
			e.getTransaction().commit();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			hasil = -1;
		}
		return hasil;
    }    
    
    @CrossOrigin(origins= {"*"})
    @RequestMapping("/guru")
    public List<TblGuru> allGurus(){
    	return em .createEntityManager().createQuery("from TblGuru").getResultList();
    }
    @RequestMapping("/siswa")
    public List<TblSiswa> allSiswas(){
    	return em .createEntityManager().createQuery("from TblSiswa").getResultList();
    }
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
//        return new Greeting(counter.incrementAndGet(),
//                            String.format(template, name));
    	return x;
    }
    @RequestMapping("/data")
    public List<String> dataNegara(
    		@RequestParam("q") int prefix){
    	List<String> data = new ArrayList<String>();
    	data.add("Indonesia");
    	data.add("Malaysia");
    	data.add("Brunei");
    	data.add(("Timor Leste"));
    	
    	return data.stream()
//    			.filter(line->line.startsWith(prefix))
    			.filter(line->line.length() >= prefix)
    			.collect(Collectors.toList());
    }
    @RequestMapping("/countries")
    public String getCountries() throws IOException {
    	URL url = new URL("http://www.webservicex.net/globalweather.asmx/GetCitiesByCountry?CountryName=Indonesia");
    	URLConnection connection = url.openConnection();
    	connection.setDoOutput(true);
    	connection.setRequestProperty("Content-Type", "text/xml");
    	connection.setRequestProperty("charset", "utf-8");
    	connection.setRequestProperty("Content-Length", "0");
    	InputStream stream = connection.getInputStream();
    	
    	InputStreamReader reader = new InputStreamReader(stream);
    	BufferedReader buffer = new BufferedReader(reader);
    	
    	String line;
    	StringBuilder builder = new StringBuilder();
    	
    	while((line = buffer.readLine()) !=null) {
    		builder.append(line);
    	}
    	
    	return builder.toString();
    }
}
