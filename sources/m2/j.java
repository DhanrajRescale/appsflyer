package m2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f27283a;

    /* renamed from: b, reason: collision with root package name */
    public final float f27284b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27285c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27286d;

    public j(int i10, float f10, float f11, float f12) {
        this.f27283a = i10;
        this.f27284b = f10;
        this.f27285c = f11;
        this.f27286d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f27286d, this.f27284b, this.f27285c, this.f27283a);
    }
}
