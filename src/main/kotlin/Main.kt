fun main(){
    information("Jimin",26,"Purple")
    temperature(30.0)
    area(8,9)
    nums(arrayOf(234,22,789,89,3,77888,888,9643,567))
    reverse("Hello world")
}
//Write a program that prompts the user to enter their name,
// age, and favourite colour, and then prints out a message including all of that information.
fun information(name:String,age:Int,color:String){
    var sentence = "My name is $name, I am $age years old and my favourite color is $color"
    println(sentence)
}

//Write a program that converts temperature from Celsius to Fahrenheit. The user should be prompted to
// enter the temperature in Celsius.
fun temperature(temp:Double){
    var newtemp=(temp*9/5)+32
    println(newtemp)
}

//Write a program that calculates the area of a rectangle. The user should be prompted
// to enter the length and width of the rectangle.
fun area(length:Int,width:Int){
    var areaRectangle = length*width
    println(areaRectangle)

}
//Write a program that reads in a list of integers and
// finds the maximum and minimum values in the list.

fun nums(numbers:Array<Int>){
    println(numbers.minOrNull())
    println(numbers.maxOrNull())
}
//Write a program that takes a string as input and
// reverses the order of the words in the string. For example,
// "Hello world" should become "world Hello".

fun reverse(word:String){
    var words = word.reversed()
    println(words)
}





