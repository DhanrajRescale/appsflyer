package k2;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21961a;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21963c;

    /* renamed from: d, reason: collision with root package name */
    public final Layout f21964d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21965e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21966f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21967g;

    /* renamed from: h, reason: collision with root package name */
    public final float f21968h;

    /* renamed from: i, reason: collision with root package name */
    public final float f21969i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f21970j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint.FontMetricsInt f21971k;

    /* renamed from: l, reason: collision with root package name */
    public final int f21972l;

    /* renamed from: m, reason: collision with root package name */
    public final m2.h[] f21973m;

    /* renamed from: o, reason: collision with root package name */
    public final ut.g f21975o;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21962b = true;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f21974n = new Rect();

    /* JADX WARN: Code restructure failed: missing block: B:109:0x017c, code lost:
    
        if (r11 >= 28) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0177, code lost:
    
        if (r10 == false) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t(java.lang.CharSequence r48, float r49, r2.d r50, int r51, android.text.TextUtils.TruncateAt r52, int r53, boolean r54, int r55, int r56, int r57, int r58, int r59, int r60, k2.h r61) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.t.<init>(java.lang.CharSequence, float, r2.d, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, k2.h):void");
    }

    public final int a() {
        int height;
        boolean z10 = this.f21963c;
        Layout layout = this.f21964d;
        if (z10) {
            height = layout.getLineBottom(this.f21965e - 1);
        } else {
            height = layout.getHeight();
        }
        return height + this.f21966f + this.f21967g + this.f21972l;
    }

    public final float b(int i10) {
        return i10 == this.f21965e + (-1) ? this.f21968h + this.f21969i : s0.g.f34069a;
    }

    public final float c(int i10) {
        float lineBaseline;
        Paint.FontMetricsInt fontMetricsInt;
        float f10 = this.f21966f;
        if (i10 == this.f21965e - 1 && (fontMetricsInt = this.f21971k) != null) {
            lineBaseline = f(i10) - fontMetricsInt.ascent;
        } else {
            lineBaseline = this.f21964d.getLineBaseline(i10);
        }
        return f10 + lineBaseline;
    }

    public final float d(int i10) {
        int i11;
        Paint.FontMetricsInt fontMetricsInt;
        int i12 = this.f21965e;
        int i13 = i12 - 1;
        Layout layout = this.f21964d;
        if (i10 == i13 && (fontMetricsInt = this.f21971k) != null) {
            return layout.getLineBottom(i10 - 1) + fontMetricsInt.bottom;
        }
        float lineBottom = this.f21966f + layout.getLineBottom(i10);
        if (i10 == i12 - 1) {
            i11 = this.f21967g;
        } else {
            i11 = 0;
        }
        return lineBottom + i11;
    }

    public final int e(int i10) {
        Layout layout = this.f21964d;
        if (layout.getEllipsisStart(i10) == 0) {
            return layout.getLineEnd(i10);
        }
        return layout.getText().length();
    }

    public final float f(int i10) {
        int i11;
        float lineTop = this.f21964d.getLineTop(i10);
        if (i10 == 0) {
            i11 = 0;
        } else {
            i11 = this.f21966f;
        }
        return lineTop + i11;
    }

    public final float g(int i10, boolean z10) {
        return b(this.f21964d.getLineForOffset(i10)) + ((g) this.f21975o.getValue()).b(i10, true, z10);
    }

    public final float h(int i10, boolean z10) {
        return b(this.f21964d.getLineForOffset(i10)) + ((g) this.f21975o.getValue()).b(i10, false, z10);
    }
}
