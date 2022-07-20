package mvvmarms.androidManifest

fun manifestTemplateXml(packageName:String,activityPackageName:String,activityClass:String) = """
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
	package="${packageName}">

    <application>
	    <activity android:name="${activityPackageName}.${activityClass}"
                  android:exported="false"/>
    </application>
</manifest>
        """
