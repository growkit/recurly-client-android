package com.recurly.androidsdk.data.model

/**
 *
 * The Credit Card Data is stored in this Singleton object, with the purpose to limit client access
 * to the data that the final user will introduce
 *
 */

 object CreditCardData {

    /**
     * Every variable has its own getters and setters
     */

     var cardNumber: Long = 0
     var expirationMonth: Int = 0
     var expirationYear: Int = 0
     var cvvCode: Int = 0
     var cvvLength = 3

     fun getCardNumber(): Long{
        return cardNumber
    }

     fun setCardNumber(number: Long){
        cardNumber = number
    }

     fun getExpirationMonth(): Int{
        return expirationMonth
    }

     fun setExpirationMonth(month: Int){
        expirationMonth = month
    }

     fun getExpirationYear(): Int{
        return expirationYear
    }

     fun setExpirationYear(year: Int){
        expirationYear = year
    }

     fun getCvvCode(): Int{
        return cvvCode
    }

     fun setCvvCode(cvv: Int){
        cvvCode = cvv
    }

     fun getCvvLength(): Int{
        return cvvLength
    }

     fun setCvvLength(length: Int){
        cvvLength = length
    }

}