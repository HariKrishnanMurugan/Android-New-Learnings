package com.example.internproject_revamp.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat
import com.example.internproject_revamp.R
import com.google.android.material.button.MaterialButton

/**
 * View that extends Material Button and handled the common functionality across modules
 */
class CLMaterialButton : MaterialButton {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context, attrs, defStyleAttr
    )

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val inputMethodManager =
            context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
        return super.onTouchEvent(event)
    }

    /**
     * To enable the button
     */
    fun enable() {
        backgroundTintList = ContextCompat.getColorStateList(context, R.color.colorAccent)
        isEnabled = true
    }

    /**
     * To disable the button
     */
    fun disable() {
        backgroundTintList =
            ContextCompat.getColorStateList(context, R.color.dustyGray)
        isEnabled = false
    }
}