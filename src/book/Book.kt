package book

open class Book(title: String, author: String) {

    private var currentPage = 10

    open fun readPage() {
        currentPage + 1
    }
}

class EBook : Book("", "") {
    private var wordCount: Int = 0
    override fun readPage() {
        super.readPage()
        wordCount += 250
    }
}