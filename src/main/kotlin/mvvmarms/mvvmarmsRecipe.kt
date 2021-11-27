package mvvmarms

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import mvvmarms.androidManifest.manifestTemplateXml
import mvvmarms.src.app_package.*
import mvvmarms.res.layout.armsXml

/**
 * @CreateDate:     2021/4/1
 * @Author:         Creator
 * @Description:    菜单
 */
fun RecipeExecutor.mvvmarmsRecipe(
    moduleData: ModuleTemplateData,
    pageName: String,
    packageName: String,
    moduleName: String,
    needActivity: Boolean,
    activityLayoutName: String,
    generateActivityLayout: Boolean,
    activityPackageName: String,
    needFragment: Boolean,
    fragmentLayoutName: String,
    generateFragmentLayout: Boolean,
    fragmentPackageName: String,
    needModel: Boolean,
    modelPackageName: String,
    needViewModel: Boolean,
    viewModelPackageName: String
) {

    val (projectData, srcOut, resOut, manifestOut) = moduleData


    if (needActivity && needFragment) {
        throw IllegalArgumentException("activity和fragment不可同时选择")
    }


    if (needActivity) {
        mergeXml(
            manifestTemplateXml(packageName, activityPackageName, "${pageName}Activity"),
            manifestOut.resolve("AndroidManifest.xml")
        )
    }

    if (needActivity && generateActivityLayout) {
        save(armsXml(), resOut.resolve("layout/${activityLayoutName}.xml"))
    }

    if (needFragment && generateFragmentLayout) {
        save(armsXml(), resOut.resolve("layout/${fragmentLayoutName}.xml"))
    }

    if (needActivity) {
        save(
            armsActivityKt(
                pageName,
                packageName,
                moduleName,
                activityPackageName,
                activityLayoutName,
                viewModelPackageName
            ), srcOut.resolve("mvvm/activity/${pageName}Activity.kt")
        )
    }

    if (needFragment) {
        save(
            armsFragmentKt(
                pageName,
                packageName,
                moduleName,
                fragmentPackageName,
                fragmentLayoutName,
                viewModelPackageName
            ), srcOut.resolve("mvvm/fragment/${pageName}Fragment.kt")
        )
    }

    if (needModel) {
        save(
            armsModelKt(
                pageName,
                modelPackageName
            ), srcOut.resolve("mvvm/model/${pageName}Model.kt")
        )
    }

    if (needViewModel) {
        save(
            armsViewModelKt(
                pageName,
                viewModelPackageName
            ), srcOut.resolve("mvvm/vm/${pageName}ViewModel.kt")
        )
    }


}