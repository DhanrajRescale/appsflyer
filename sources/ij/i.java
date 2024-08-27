package ij;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f20070a;

    public i(Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.f20070a = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.setTypeface(this.f20070a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.setTypeface(this.f20070a);
    }
}
