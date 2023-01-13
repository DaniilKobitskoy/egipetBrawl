package com.brawlegypt.edyptianbrawl.initservices

import android.app.Application
import com.brawlegypt.edyptianbrawl.keeeeeyOnMyDick
import com.onesignal.OneSignal
import org.json.JSONObject

class oneinit : Application() {

    override fun onCreate() {
        super.onCreate()
        try {
            OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
            OneSignal.initWithContext(this)
            OneSignal.setAppId(keynumSurvices.lohanto)
            OneSignal.setExternalUserId(keeeeeyOnMyDick!!, object :
                OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(jsonObject: JSONObject) {
                }
                override fun onFailure(externalIdError: OneSignal.ExternalIdError) {

                }
            })

        }catch (e: Exception){

        }
    }
}