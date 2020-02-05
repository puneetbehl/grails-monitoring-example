package example

import grails.databinding.BindingFormat

class Book {

    String title
    String author

    @BindingFormat('MMddyyyy')
    Date releaseDate
    Integer pages

    static mapping = {
        caching true
    }
}
