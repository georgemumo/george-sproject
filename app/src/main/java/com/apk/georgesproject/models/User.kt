package com.apk.georgesproject.models

class User {
    var email:String=""
    var password:String=""
    var userid:String=""
    var confirmpassword:String=""

    constructor(email:String,confirmpassword:String,password:String,userid:String){
        this.email=email
        this.password=password
        this.userid=userid
        this.confirmpassword=confirmpassword
    }
    constructor()
}