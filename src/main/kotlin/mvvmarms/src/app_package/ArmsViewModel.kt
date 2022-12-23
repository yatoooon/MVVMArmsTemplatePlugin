package mvvmarms.src.app_package


fun armsViewModelKt(
    pageName: String,
    viewModelPackageName: String,
    modelPackageName: String
) = """
package $viewModelPackageName


import android.app.Application
import $modelPackageName.${pageName}Model
import com.common.core.base.mvvm.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ${pageName}ViewModel @Inject constructor(
    application: Application,${pageName.decapitalize()}Model:${pageName}Model
) : BaseViewModel<${pageName}Model>(application,${pageName.decapitalize()}Model) {

}
"""
