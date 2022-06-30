package com.yahui.springdi.bean;

/**
 * @author houyahui1
 * @description
 * @date 2022/6/29 19:14
 */
public class SimpleMovieLister {

    private Integer year;

    private String name;

    private MovieFinder movieFinder;

    private InnerClass innerClass;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieFinder getMovieFinder() {
        return movieFinder;
    }

    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public InnerClass getInnerClass() {
        return innerClass;
    }

    public void setInnerClass(InnerClass innerClass) {
        this.innerClass = innerClass;
    }
/*public SimpleMovieLister(Integer year, MovieFinder movieFinder) {
        this.year = year;
        this.movieFinder = movieFinder;
    }*/

    @Override
    public String toString() {
        return "SimpleMovieLister{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", movieFinder=" + movieFinder +
                ", innerClass=" + innerClass +
                '}';
    }

     class InnerClass{

        private Integer innerYear;

        private String innerName;

         public InnerClass() {
         }

         public Integer getInnerYear() {
            return innerYear;
        }

        public void setInnerYear(Integer innerYear) {
            this.innerYear = innerYear;
        }

        public String getInnerName() {
            return innerName;
        }

        public void setInnerName(String innerName) {
            this.innerName = innerName;
        }

        @Override
        public String toString() {
            return "InnerClass{" +
                    "innerYear=" + innerYear +
                    ", innerName='" + innerName + '\'' +
                    '}';
        }
    }
}
