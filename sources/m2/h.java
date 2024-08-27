package m2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f27261a;

    /* renamed from: c, reason: collision with root package name */
    public final int f27263c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27264d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27265e;

    /* renamed from: f, reason: collision with root package name */
    public final float f27266f;

    /* renamed from: k, reason: collision with root package name */
    public int f27271k;

    /* renamed from: l, reason: collision with root package name */
    public int f27272l;

    /* renamed from: b, reason: collision with root package name */
    public final int f27262b = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f27267g = Integer.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public int f27268h = Integer.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f27269i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public int f27270j = Integer.MIN_VALUE;

    public h(float f10, int i10, boolean z10, boolean z11, float f11) {
        this.f27261a = f10;
        this.f27263c = i10;
        this.f27264d = z10;
        this.f27265e = z11;
        this.f27266f = f11;
        if ((s0.g.f34069a <= f11 && f11 <= 1.0f) || f11 == -1.0f) {
        } else {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        int i14;
        int i15;
        double ceil;
        int i16 = fontMetricsInt.descent;
        int i17 = fontMetricsInt.ascent;
        if (i16 - i17 <= 0) {
            return;
        }
        boolean z11 = false;
        if (i10 == this.f27262b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == this.f27263c) {
            z11 = true;
        }
        boolean z12 = this.f27265e;
        boolean z13 = this.f27264d;
        if (z10 && z11 && z13 && z12) {
            return;
        }
        if (this.f27267g == Integer.MIN_VALUE) {
            int i18 = i16 - i17;
            int ceil2 = (int) Math.ceil(this.f27261a);
            int i19 = ceil2 - i18;
            float f10 = this.f27266f;
            if (f10 == -1.0f) {
                f10 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            if (i19 <= 0) {
                ceil = Math.ceil(i19 * f10);
            } else {
                ceil = Math.ceil((1.0f - f10) * i19);
            }
            int i20 = (int) ceil;
            int i21 = fontMetricsInt.descent;
            int i22 = i20 + i21;
            this.f27269i = i22;
            int i23 = i22 - ceil2;
            this.f27268h = i23;
            if (z13) {
                i23 = fontMetricsInt.ascent;
            }
            this.f27267g = i23;
            if (z12) {
                i22 = i21;
            }
            this.f27270j = i22;
            this.f27271k = fontMetricsInt.ascent - i23;
            this.f27272l = i22 - i21;
        }
        if (z10) {
            i14 = this.f27267g;
        } else {
            i14 = this.f27268h;
        }
        fontMetricsInt.ascent = i14;
        if (z11) {
            i15 = this.f27270j;
        } else {
            i15 = this.f27269i;
        }
        fontMetricsInt.descent = i15;
    }
}
