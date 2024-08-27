package com.webengage.sdk.android.utils.htmlspanner.m;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* loaded from: classes2.dex */
public class h implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12866a = com.webengage.sdk.android.utils.htmlspanner.c.f12732b;

    /* renamed from: b, reason: collision with root package name */
    private static final int f12867b = com.webengage.sdk.android.utils.htmlspanner.c.f12731a;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12868c = com.webengage.sdk.android.utils.htmlspanner.c.f12733c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12869d;

    public h() {
        this.f12869d = -1;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i15) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            if (this.f12869d != -1) {
                canvas.drawText(nn.d.m(new StringBuilder(), this.f12869d, "."), i10 + i11, i13, paint);
            } else {
                canvas.drawText("•", i10 + i11, i13, paint);
            }
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return (this.f12869d != -1 ? f12867b : f12866a) + f12868c;
    }

    public h(int i10) {
        this.f12869d = i10;
    }
}
