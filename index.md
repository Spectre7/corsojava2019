# Corso Java 2019
Benvenuti

# Other books
[mat](https://drive.google.com/drive/folders/0Bx2fZ0r5vhSSSDdvWkVjNG9YQjQ){:target="_blank"}

[info](https://drive.google.com/drive/folders/0B4b1SH9ZbeKnanl0Qk5zMk9WUEE){:target="_blank"}

# Letture consigliate
Da reference/book/JavaEE/Java SE/Beginning Java 8 Fundamentals leggere da pagina 12 in poi.

# Esercizio 1
Define a class called Fraction. This class is used to represent a ratio of two integers.
Include mutator functions that allow the user to set the numerator and the
denominator. Also include a member function that returns the value of numerator
or denominator as a double. Include an additional member function that
outputs the value of the fraction reduced to lowest terms (e.g., instead of outputting
20/60 the method should output 1/3). This will require finding the greatest
common divisor for the numerator and denominator, then dividing both by that
number. Embed your class in a test program.

# Esercizio 2
Define a class named Document that contains a member variable of type String named
text that stores any textual content for the document. Create a method named
toString that returns the text field and also include a method to set this value.  
Next, define a class for Email that is derived from Document and includes
member variables for the sender, recipient, and title of an email message.  
Implement appropriate accessor and mutator methods. The body of the email
message should be stored in the inherited variable text. Redefine the toString
method to concatenate all text fields.  
Similarly, define a class for File that is derived from Document and includes a
member variable for the pathname. The textual contents of the file should be
stored in the inherited variable text. Redefine the toString method to
concatenate all text fields.  
Finally, create several sample objects of type Email and File in your main
method. Test your objects by passing them to the following subroutine that
returns true if the object contains the specified keyword in the text property.

```java
public static boolean ContainsKeyword(Document docObject, String keyword) {
	if (docObject.toString().indexOf(keyword,0) >= 0)
		return true;
	return false;
}
```
