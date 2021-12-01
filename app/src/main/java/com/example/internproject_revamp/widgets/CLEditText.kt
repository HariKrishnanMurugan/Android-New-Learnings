package com.example.internproject_revamp.widgets

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.ContextCompat
import com.example.internproject_revamp.R

/**
 * View that extends EditText and handled the common functionality across modules
 */
class CLEditText : AppCompatEditText {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    init {
        this.background =
            ContextCompat.getDrawable(this.context, R.drawable.cl_background_rounded_corner_grey)
    }

    /**
     * To get the string of edittext
     *
     * @return text of edittext
     */
    fun getString(): String = text.toString().trim()
}