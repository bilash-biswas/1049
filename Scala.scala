import java.util.Scanner;
object Main {
  def main(args:Array[String]){ 
    val input = new Scanner(System.in)
    var a = input.next()
    var b = input.next()
    var c = input.next()
    if(a == "vertebrado"){
        if(b == "ave"){
            if(c == "carnivoro"){
                println("aguia")
            }else if(c == "onivoro"){
                println("pomba")
            }
        }else if(b == "mamifero"){
            if(c == "onivoro"){
                println("homem")
            }else if(c == "herbivoro"){
                println("vaca")
            }
        }
    }else if(a == "invertebrado"){
        if(b == "inseto"){
            if(c == "hematofago"){
                println("pulga")
            }else if(c == "herbivoro"){
                println("lagarta")
            }
        }else if(b == "anelideo"){
            if(c == "hematofago"){
                println("sanguessuga")
            }else if(c == "onivoro"){
                println("minhoca")
            }
        }
    }
  }
}
