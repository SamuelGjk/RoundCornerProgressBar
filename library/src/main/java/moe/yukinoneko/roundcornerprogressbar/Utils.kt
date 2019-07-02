package moe.yukinoneko.roundcornerprogressbar

import android.content.Context
import android.util.TypedValue

/**
 * Created by SamuelGjk on 2019/6/13.
 */
object Utils {
    @JvmStatic
    fun dp2px(context: Context, dp: Float): Float {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.resources.displayMetrics)
    }
}