package com.apk.georgesproject.models

class Product {

    var Name:String=""
    var Date:String=""
    var Occupation:String=""
    var Brand:String=""
    var id:String=""
    constructor(Name:String,Date:String,Occupation:String,id:String,Brand:String){
        this.Name=Name
        this.Date=Date
        this.Brand=Brand
        this.id=id
        this.Occupation=Occupation
    }
    constructor()
}