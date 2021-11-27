package mvvmarms.src.app_package


fun armsFragmentKt(
    pageName: String,
    packageName: String,
    moduleName: String,
    fragmentPackageName: String,
    fragmentLayoutName: String,
    viewModelPackageName: String
) = """
package $fragmentPackageName

import com.common.core.base.mvvm.BaseVMFragment
import dagger.hilt.android.AndroidEntryPoint
import ${packageName}.databinding.${moduleName}Fragment${pageName}Binding
import ${viewModelPackageName}.${pageName}ViewModel
import ${packageName}.R

@AndroidEntryPoint
class ${pageName}Fragment : BaseVMFragment<${moduleName}Fragment${pageName}Binding, ${pageName}ViewModel>() {

    override fun getLayoutId(): Int {
        return R.layout.${fragmentLayoutName}
    }

    override fun initData() {
    
    }
}

"""