package Activities;

 abstract class Book {
    // Field to hold the title
   String title;

    // Abstract method - must be implemented in subclass
  abstract void setTitle(String s);

    // Concrete method - implemented here and can be used by subclass
    public String getTitle() {
        return title;
    }
}
