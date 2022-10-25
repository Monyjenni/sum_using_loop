import java.math.BigDecimal

fun main(args: Array<String>) {

    val listTransactions = mutableListOf(

        transaction(id=1, amount =10, description = "not null"),
        transaction(id = 2, amount=20, description = "not null"),
        transaction(id=3, amount = 30),
        transaction(id=4, amount = 40),
        transaction(id=5, amount =50)
    )


// sum all the amounts of the list above

    var sum : Int = 0

    for (i in listTransactions){
        sum += i.amount
    }
    println("This is the total amounts in list : $sum")


// filter and get only the amounts which are greater than 35 and make it i

    val filterAmount = listTransactions.filter { it.amount >35 }

    println("This is the list of amounts which are greater than 35 $filterAmount")

// sum the amounts which are greater than 35 tgt

    var sumByFilter : Int = 0

    for (j in filterAmount){

        sumByFilter += j.amount
    }
    println("This is the total amounts which are greater than 35 in list : $sumByFilter")

// Map through the null descriptions and get their Ids and Amounts to sum tgt

    val modifyList = listTransactions.map{
            transaction ->

        if(transaction.description == null){
            println(" It has null des so : ${transaction.id + transaction.amount}")

            val newTransaction = "${transaction.id} - ${transaction.amount}"
            transaction.description= newTransaction
            transaction

        }else {
            println("It's not null.")
        }


    }


}
