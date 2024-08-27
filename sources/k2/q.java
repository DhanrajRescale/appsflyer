package k2;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f21937a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21938b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21939c;

    /* renamed from: d, reason: collision with root package name */
    public final TextPaint f21940d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21941e;

    /* renamed from: f, reason: collision with root package name */
    public final TextDirectionHeuristic f21942f;

    /* renamed from: g, reason: collision with root package name */
    public final Layout.Alignment f21943g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21944h;

    /* renamed from: i, reason: collision with root package name */
    public final TextUtils.TruncateAt f21945i;

    /* renamed from: j, reason: collision with root package name */
    public final int f21946j;

    /* renamed from: k, reason: collision with root package name */
    public final float f21947k;

    /* renamed from: l, reason: collision with root package name */
    public final float f21948l;

    /* renamed from: m, reason: collision with root package name */
    public final int f21949m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f21950n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f21951o;

    /* renamed from: p, reason: collision with root package name */
    public final int f21952p;

    /* renamed from: q, reason: collision with root package name */
    public final int f21953q;

    /* renamed from: r, reason: collision with root package name */
    public final int f21954r;

    /* renamed from: s, reason: collision with root package name */
    public final int f21955s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f21956t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f21957u;

    public q(float f10, float f11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, Layout.Alignment alignment, TextDirectionHeuristic textDirectionHeuristic, r2.d dVar, TextUtils.TruncateAt truncateAt, CharSequence charSequence, boolean z10, boolean z11, int[] iArr, int[] iArr2) {
        this.f21937a = charSequence;
        this.f21938b = i10;
        this.f21939c = i11;
        this.f21940d = dVar;
        this.f21941e = i12;
        this.f21942f = textDirectionHeuristic;
        this.f21943g = alignment;
        this.f21944h = i13;
        this.f21945i = truncateAt;
        this.f21946j = i14;
        this.f21947k = f10;
        this.f21948l = f11;
        this.f21949m = i15;
        this.f21950n = z10;
        this.f21951o = z11;
        this.f21952p = i16;
        this.f21953q = i17;
        this.f21954r = i18;
        this.f21955s = i19;
        this.f21956t = iArr;
        this.f21957u = iArr2;
        if (i10 >= 0 && i10 <= i11) {
            int length = charSequence.length();
            if (i11 < 0 || i11 > length) {
                throw new IllegalArgumentException("invalid end value".toString());
            }
            if (i13 < 0) {
                throw new IllegalArgumentException("invalid maxLines value".toString());
            }
            if (i12 < 0) {
                throw new IllegalArgumentException("invalid width value".toString());
            }
            if (i14 < 0) {
                throw new IllegalArgumentException("invalid ellipsizedWidth value".toString());
            }
            if (f10 < s0.g.f34069a) {
                throw new IllegalArgumentException("invalid lineSpacingMultiplier value".toString());
            }
            return;
        }
        throw new IllegalArgumentException("invalid start value".toString());
    }
}
