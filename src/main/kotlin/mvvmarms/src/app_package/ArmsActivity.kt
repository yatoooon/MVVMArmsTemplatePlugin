package mvvmarms.src.app_package


fun armsActivityKt(
    pageName: String,
    packageName: String,
    moduleName: String,
    activityPackageName: String,
    activityLayoutName: String,
    viewModelPackageName: String
) = """
package $activityPackageName

import com.common.core.base.mvvm.BaseVMActivity
import dagger.hilt.android.AndroidEntryPoint
import ${packageName}.databinding.${moduleName}Activity${pageName}Binding
import ${viewModelPackageName}.${pageName}ViewModel
import ${packageName}.R

@AndroidEntryPoint
class ${pageName}Activity : BaseVMActivity<${moduleName}Activity${pageName}Binding,${pageName}ViewModel>() {

    override fun getLayoutId():Int {
              return R.layout.${activityLayoutName}
    }

    override fun initData() {

    }
}

"""