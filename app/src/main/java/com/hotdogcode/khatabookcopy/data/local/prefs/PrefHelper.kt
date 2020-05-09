package com.hotdogcode.khatabookcopy.data.local.prefs

import com.hotdogcode.khatabookcopy.data.model.prefs.User

interface PrefHelper {
    fun setUser(user: User)
    fun getUser():User
}