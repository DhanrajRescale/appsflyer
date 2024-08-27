package com.webengage.sdk.android.utils.htmlspanner.m;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public class e extends TypefaceSpan {

    /* renamed from: a, reason: collision with root package name */
    private final com.webengage.sdk.android.utils.htmlspanner.a f12858a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12859b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12860c;

    public e(com.webengage.sdk.android.utils.htmlspanner.a aVar) {
        super(aVar == null ? null : aVar.e());
        this.f12858a = aVar;
    }

    public com.webengage.sdk.android.utils.htmlspanner.a a() {
        return this.f12858a;
    }

    public void b(boolean z10) {
        this.f12860c = z10;
    }

    public boolean c() {
        return this.f12860c;
    }

    @Override // android.text.style.TypefaceSpan
    public String toString() {
        StringBuilder sb2 = new StringBuilder("{\n");
        if (this.f12858a != null) {
            sb2.append("  font-family: " + this.f12858a.e() + "\n");
        }
        sb2.append("  bold: " + b() + "\n");
        sb2.append("  italic: " + c() + "\n");
        sb2.append(UrlTreeKt.componentParamSuffix);
        return sb2.toString();
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint, this.f12858a);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint, this.f12858a);
    }

    private void a(Paint paint, com.webengage.sdk.android.utils.htmlspanner.a aVar) {
        paint.setAntiAlias(true);
        paint.setTypeface(aVar.c());
        if (this.f12859b) {
            if (aVar.f()) {
                paint.setFakeBoldText(true);
            } else {
                paint.setTypeface(aVar.b());
            }
        }
        if (this.f12860c) {
            if (aVar.g()) {
                paint.setTextSkewX(-0.25f);
            } else {
                paint.setTypeface(aVar.d());
            }
        }
        if (this.f12859b && this.f12860c && aVar.a() != null) {
            paint.setTypeface(aVar.a());
        }
    }

    public boolean b() {
        return this.f12859b;
    }

    public void a(boolean z10) {
        this.f12859b = z10;
    }
}
