package com.webengage.sdk.android.utils.htmlspanner.m;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes2.dex */
public class i implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    private final Float f12870a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f12871b;

    public i(Float f10) {
        this.f12870a = f10;
        this.f12871b = null;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int abs = Math.abs(fontMetricsInt.descent - fontMetricsInt.ascent);
        Float f10 = this.f12870a;
        if (f10 != null) {
            abs = (int) (f10.floatValue() * abs);
        } else {
            Integer num = this.f12871b;
            if (num != null) {
                abs = num.intValue();
            }
        }
        fontMetricsInt.descent = fontMetricsInt.ascent + abs;
    }

    public i(Integer num) {
        this.f12871b = num;
        this.f12870a = null;
    }
}
