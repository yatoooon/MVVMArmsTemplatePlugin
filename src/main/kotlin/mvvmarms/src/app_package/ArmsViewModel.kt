package mvvmarms.src.app_package


fun armsViewModelKt(
    pageName: String,
    viewModelPackageName: String,
) = """
package $viewModelPackageName


import android.app.Application
import androidx.hilt.lifecycle.ViewModelInject
import com.common.core.base.BaseModel
import com.common.core.base.mvvm.BaseViewModel

class ${pageName}ViewModel @ViewModelInject constructor(
    application: Application
) : BaseViewModel<BaseModel>(application) {

}
"""