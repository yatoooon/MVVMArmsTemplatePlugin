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

import android.os.Bundle
import com.common.core.base.mvvm.BaseVMFragment
import dagger.hilt.android.AndroidEntryPoint
import ${packageName}.databinding.${moduleName}Fragment${pageName.toLowerCase().capitalize()}Binding
import ${viewModelPackageName}.${pageName}ViewModel
import ${packageName}.R

@AndroidEntryPoint
class ${pageName}Fragment : BaseVMFragment<${moduleName}Fragment${pageName.toLowerCase().capitalize()}Binding, ${pageName}ViewModel>() {
    companion object {
        fun newInstance(): ${pageName}Fragment {
            val args = Bundle()
            val fragment = ${pageName}Fragment()
            fragment.arguments = args
            return fragment
        }
    }
    override fun getLayoutId(): Int {
        return R.layout.${fragmentLayoutName}
    }

    override fun initData() {
    
    }
}

"""