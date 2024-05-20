package com.apk.georgesproject.models

class Upload {
    var Name: String= ""
    var Brand: String= ""
    var Occupation: String= ""
    var imageUrl: String= ""
    var id: String= ""
    var Date:String=""
    constructor(Name: String, Brand: String, Occupation: String, imageUrl: String, id: String,Date:String){
        this.Name=Name
        this.Brand=Brand
        this.Occupation=Occupation
        this.Date=Date
        this.imageUrl=imageUrl
        this.id=id
    }
    constructor()
}