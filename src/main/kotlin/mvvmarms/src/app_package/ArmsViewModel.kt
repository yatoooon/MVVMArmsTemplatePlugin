package mvvmarms.src.app_package


fun armsViewModelKt(
    pageName: String,
    viewModelPackageName: String,
) = """
package $viewModelPackageName


import android.app.Application
import com.common.core.base.BaseModel
import com.common.core.base.mvvm.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ${pageName}ViewModel @Inject constructor(
    application: Application
) : BaseViewModel<BaseModel>(application) {

}
"""
