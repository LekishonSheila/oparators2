fun main() {
    greeting("Sheila")
    division(50,4)
    var p=addition(20,34)
    var o=addition(15,40)
    fact()

}
fun greeting(name: String){
    println("hello"+name)
}
fun division (num1: Int,num2: Int){
    var div= (num1/num2)
    println(div)




}
fun addition(num1: Int,num2:Int):Int{
    var sum=num1+num2
    return(sum)



}
fun fact(){
   var myself="simple"
    println(myself)
}