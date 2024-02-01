enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(var nome : String, val idade : Int)

data class ConteudoEducacional(var nome: String, val duracao: Int, var nivel : Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {        
        inscritos.add(usuario)
    }
}

fun main() {
    val conteudo = ConteudoEducacional("teste", 30, Nivel.BASICO)
    val conteudos = mutableListOf<ConteudoEducacional>()
    val testeUsuario = Usuario("testeUsuario", 20)
    
    conteudos.add(conteudo)
    
    val formacao = Formacao("teste", conteudos )
    
    formacao.matricular(testeUsuario)
    
}
