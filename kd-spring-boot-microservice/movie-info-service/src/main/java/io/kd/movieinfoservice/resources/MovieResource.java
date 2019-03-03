package io.kd.movieinfoservice.resources;

import io.kd.movieinfoservice.models.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @Value("${api.key}")
    private String apiKey;
	/*
	 * @Autowired private RestTemplate restTemplate;
	 */

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
    	
    	return 	new Movie(movieId, "test Name", "description");
    			
		/*
		 * MovieSummary movieSummary =
		 * restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId +
		 * "?api_key=" + apiKey, MovieSummary.class); return new Movie(movieId,
		 * movieSummary.getTitle(), movieSummary.getOverview());
		 */

    }

}
