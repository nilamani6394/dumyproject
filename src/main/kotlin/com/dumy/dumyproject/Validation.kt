package com.dumy.dumyproject

import java.util.regex.Matcher
import java.util.regex.Pattern

/**Validation for email*/
fun isValid(username: String?): Boolean {
    val emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
            "[a-zA-Z0-9_+&*-]+)*@" +
            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
            "A-Z]{2,7}$"
    val pat: Pattern = Pattern.compile(emailRegex)
    return if (username == null) false else pat.matcher(username).matches()
}
/**validation for password*/
fun isValidPassword(password: String?): Boolean {
    val regex = ("^(?=.*[0-9])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*[@#$%^&+=])"
            + "(?=\\S+$).{8,20}$")
    val p = Pattern.compile(regex)
    if (password == null) {
        return false
    }
    val m: Matcher = p.matcher(password)
    return m.matches()
}
/** Validation for PhoneNumber*/
fun isValidContactNumber(s:String):Boolean{
    val p=Pattern.compile("(0|91)?[7-9][0-9]{9}")
    val m=p.matcher(s)
    return m.find() && m.group()==s
}




