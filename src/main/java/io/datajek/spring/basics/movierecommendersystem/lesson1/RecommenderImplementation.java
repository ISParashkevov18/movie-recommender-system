package io.datajek.spring.basics.movierecommendersystem.lesson1;

import io.datajek.spring.basics.movierecommendersystem.lesson3.ContentBasedFilter;

public class RecommenderImplementation {
    public String[] recommendMovies (String movie){

        //user content based filter to find similar movies
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations("Finding Dory");
        //return new String[] {"M1", "M2", "M3"};
        return results;
    }
}