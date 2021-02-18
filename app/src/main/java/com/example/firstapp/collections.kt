package com.example.firstapp

//Language: French

//mutable signifie que les elements peuvent être mis à jour, ajoutés ou supprimés et il contient
//une plétore de fonctions. ça s'applique sur la liste par la fonction mutableList<type> puis on assigne
//un ensemble de fonctions, dans le array on il est appliqué par arrayListOf<type>


//la difference entre une list et array est qu'une liste est typé et doit impérativement préciser
//son type de donnée par contre un array est non typé pas besoin de préciser le type des éléments.
//De plus une liste ne peut être que lue pas de d'ajout ou modification' possible alorsque dans un
//array une valeur peut etre mise à jour.
//
//Une liste doit être utilisée pour les valeurs non changeable dont comme des constantes pourtant
//un array peut être utilisé comme variable car on peut mettre à jour un élément à un instant donné


fun main(args: Array<String>) {
    val continents = listOf<String>("Europe", "Afrique", "Asie", "Amérique ", "Océanie")
    println("Five continents  are "+ continents)
    var afrique: String = continents.get(1)
    println("At position 1 there is "+ afrique)

    var colorsUses = arrayOf("bleu", "rouge", "orange", "blanc", "vert", "orange")
    println("List of actual colors "+ colorsUses.contentToString())
    var green: String = "gris"
    colorsUses.set(4, green)
    println("Colors after set change vert to green "+ colorsUses.contentToString())
}