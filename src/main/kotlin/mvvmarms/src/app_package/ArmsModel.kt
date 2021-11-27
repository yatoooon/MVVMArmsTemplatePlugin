package mvvmarms.src.app_package


fun armsModelKt(
        pageName: String,
        modelPackageName: String,
) = """
package $modelPackageName


import com.common.core.base.BaseModel
import com.common.core.base.BaseRepository
import javax.inject.Inject

class ${pageName}Model @Inject constructor(repository: BaseRepository) : BaseModel(repository) {

}

"""