package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import eo.b;
import h.j0;
import m.r;
import m.t;
import po.a;

/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends j0 {
    @Override // h.j0
    public final r a(Context context, AttributeSet attributeSet) {
        return new zo.r(context, attributeSet);
    }

    @Override // h.j0
    public final t b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // h.j0
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // h.j0
    public final AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // h.j0
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
