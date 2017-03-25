package com.example.vinicius.popularmoviesstage1.server;


import com.example.vinicius.popularmoviesstage1.DTO.MovieDTO;

import java.util.List;

/**
 * Created by vinicius on 12/03/17.
 */

public class GetMoviesResponse
{
	private List<MovieDTO> results;

	public List<MovieDTO> getData()
	{
		return results;
	}
}
