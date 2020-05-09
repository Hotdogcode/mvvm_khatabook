package com.hotdogcode.khatabookcopy.data.model.prefs

data class User(
    var user_id:String,
    var user_phone:String,
    var business_name:String=""
)
{
    override fun toString(): String {
        return "User->$user_id, Phone->$user_phone, Business Name->$business_name"
    }
}