package m2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class l extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27288a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27289b;

    public l(boolean z10, boolean z11) {
        this.f27288a = z10;
        this.f27289b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f27288a);
        textPaint.setStrikeThruText(this.f27289b);
    }
}
