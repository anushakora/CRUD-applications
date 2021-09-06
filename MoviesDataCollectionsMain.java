package com.learnclearly.clent;

import com.learnclearly.dto.MoviesData;
import com.learnclearly.service.MoviesDataService;
import com.learnclearly.service.MoviesDataServiceImpl;

public class MoviesDataCollectionsMain {


public static void main(String[]args) throws Exception {
	MoviesDataService  mservice = new MoviesDataServiceImpl();
	
	mservice.addNewMoviesData(new MoviesData("Joker", "Joaquin", "Zazie", "Todd", 2019 ));
	mservice.addNewMoviesData(new MoviesData("Tenet", "John", "Elizabeth", "Christopher", 2020 ));
	mservice.addNewMoviesData(new MoviesData("Aftermath", "Shawn", "Ashley", "peter", 2021 ));
	mservice.addNewMoviesData(new MoviesData("Parasite", "Songkang", "Leesun", "BongJoon", 2019 ));
	mservice.addNewMoviesData(new MoviesData("Annabelle", "Annabellewallis", "Patrick", "John", 2014 ));
	
	
	java.util.List<MoviesData> dataList = mservice.showAllMovies();
	
	
	for(MoviesData act: dataList) {
		 
		System.out.println(act.getMovieName()+" "+act.getActorName()+" "+act.getActressName()+" "+act.getDirectorName()+" "+act.getActYear());
	}
	
	 MoviesData temp = new MoviesData("Joker", "Joaquin","Zazie " , "Todd", 2019);
	 mservice.updateMoviesData(temp);
	 
	 System.out.println("updated list after update operation..");
	 dataList = mservice.showAllMovies();
	 for(MoviesData act: dataList) {
		 
			System.out.println(act.getMovieName()+" "+act.getActorName()+" "+act.getActressName()+" "+act.getDirectorName()+" "+act.getActYear());
		}
	 MoviesData temp1 = new MoviesData("Joker", "Joaquin","Zazie", "Todd", 2019);
	 mservice.removeMoviesData(temp1);
	 dataList = mservice.showAllMovies();
	     System.out.println("list after removing the record..");
	 for(MoviesData act: dataList) {
		 
			System.out.println(act.getMovieName()+" "+act.getActorName()+" "+act.getActressName()+" "+act.getDirectorName()+" "+act.getActYear());
		}
	 
}

}
