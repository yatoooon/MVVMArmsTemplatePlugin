package mvvmarms.res.layout

fun armsXml(
    pageName: String, viewModelPackageName: String
) = """
<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android">

    <data>
        <variable
            name="model"
            type="${viewModelPackageName}.${pageName}ViewModel"
            />
    </data>

    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

    </androidx.constraintlayout.widget.ConstraintLayout>
</layout>
        """
