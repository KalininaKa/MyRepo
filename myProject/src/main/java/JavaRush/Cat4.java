package JavaRush;

/* Реализовать метод setName
Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной private String fullName равное значению локальной переменной String fullName.
*/

public class Cat4 {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        this.fullName = fullName;
    }
}
