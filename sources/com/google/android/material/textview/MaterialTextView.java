package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ap.a;
import dp.b;
import pn.e;

/* loaded from: classes2.dex */
public class MaterialTextView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(@NonNull Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (e.v(context2, com.assetgro.stockgro.prod.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = un.a.F;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int i10 = -1;
            for (int i11 = 0; i11 < 2 && i10 < 0; i11++) {
                i10 = b.n1(context2, obtainStyledAttributes, iArr2[i11], -1);
            }
            obtainStyledAttributes.recycle();
            if (i10 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, un.a.E);
                    Context context3 = getContext();
                    int[] iArr3 = {1, 2};
                    int i12 = -1;
                    for (int i13 = 0; i13 < 2 && i12 < 0; i13++) {
                        i12 = b.n1(context3, obtainStyledAttributes3, iArr3[i13], -1);
                    }
                    obtainStyledAttributes3.recycle();
                    if (i12 >= 0) {
                        setLineHeight(i12);
                    }
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (e.v(context, com.assetgro.stockgro.prod.R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i10, un.a.E);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int i11 = -1;
            for (int i12 = 0; i12 < 2 && i11 < 0; i12++) {
                i11 = b.n1(context2, obtainStyledAttributes, iArr[i12], -1);
            }
            obtainStyledAttributes.recycle();
            if (i11 >= 0) {
                setLineHeight(i11);
            }
        }
    }
}
