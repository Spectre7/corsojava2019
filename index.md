# Corso Java 2019
Benvenuti

# Notes

 - [Lang](pages/lang)
 - [Files](pages/files)
 - [Exceptions](pages/exceptions)
 - [Intefaces](pages/interfaces)
 - [Threads](pages/threads)
 - [Generics](pages/generics)
 - [Lambda Expressions](pages/lambda)
 - [Design Patterns](pages/patterns)
 - [Eclipse](pages/eclipse)
 - [WebScraping](pages/webscraping)
 - [Handling Excel Files](pages/excel)
 - [Off-topics](pages/offtopics)
 
[//]: # (https://drive.google.com/drive/folders/0Bx2fZ0r5vhSSSDdvWkVjNG9YQjQ)

[//]: # (https://drive.google.com/drive/folders/0B4b1SH9ZbeKnanl0Qk5zMk9WUEE)

# Links
[animations and others](http://www.java2s.com/Code/Java/2D-Graphics-GUI/BouncingCircle.htm)
[animations in swing](https://codereview.stackexchange.com/questions/29630/simple-java-animation-with-swing)
[graphics](https://docs.oracle.com/javase/tutorial/2d/basic2d/index.html)
[jsoup](https://jsoup.org/)

# Letture consigliate
Beginning Java 8 Fundamentals leggere da pagina 12 in poi.

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

# Esercizio 3
The following is some code designed by J. Hacker for a video game. There is an
Alien class to represent a monster and an AlienPack class that represents a band
of aliens and how much damage they can inflict:

```java
class Alien {
	public static final int SNAKE_ALIEN = 0;
	public static final int OGRE_ALIEN = 1;
	public static final int MARSHMALLOW_MAN_ALIEN = 2;
	public int type; // Stores one of the three above types
	public int health; // 0=dead, 100=full strength
	public String name;

	public Alien(int type, int health, String name) {
		this.type = type;
		this.health = health;
		this.name = name;
	}
}

public class AlienPack {
	private Alien[] aliens;
	public AlienPack(int numAliens) {
		aliens = new Alien[numAliens];
	}

	public void addAlien(Alien newAlien, int index) {
		aliens[index] = newAlien;
	}

	public Alien[] getAliens() {
		return aliens;
	}

	public int calculateDamage() {
		int damage = 0;
		for (int i=0; i < aliens.length; i++) {
			if (aliens[i].type==Alien.SNAKE_ALIEN) {
				damage +=10;// Snake does 10 damage
			} else if (aliens[i].type==Alien.OGRE_ALIEN) {
				damage +=6;// Ogre does 6 damage
			} else if (aliens[i].type==Alien.MARSHMALLOW_MAN_ALIEN) {
				damage +=1;
			// Marshmallow Man does 1 damage
			}
		}
		return damage;
	}
}
```

The code is not very object-oriented and does not support information hiding in
the Alien class. Rewrite the code so that inheritance is used to represent the
different types of aliens instead of the "type" parameter. This should result in
deletion of the "type" parameter. Also rewrite the Alien class to hide the member
variables and create a "getDamage" method for each derived class that returns
the amount of damage the alien inflicts. Finally, rewrite the calculateDamage
method to use getDamage and write a main method that tests the code.


![panter](pages/img/panter.png "panter")
