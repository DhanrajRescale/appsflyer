package k2;

import android.os.Build;
import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f21929a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f21930b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21931c;

    /* renamed from: d, reason: collision with root package name */
    public float f21932d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f21933e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f21934f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21935g;

    public h(CharSequence charSequence, r2.d dVar, int i10) {
        this.f21929a = charSequence;
        this.f21930b = dVar;
        this.f21931c = i10;
    }

    public final BoringLayout.Metrics a() {
        BoringLayout.Metrics b10;
        if (!this.f21935g) {
            TextDirectionHeuristic a10 = u.a(this.f21931c);
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f21929a;
            TextPaint textPaint = this.f21930b;
            if (i10 >= 33) {
                b10 = a.b(charSequence, textPaint, a10);
            } else {
                b10 = b.b(charSequence, textPaint, a10);
            }
            this.f21934f = b10;
            this.f21935g = true;
        }
        return this.f21934f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r2.nextSpanTransition(-1, r2.length(), m2.e.class) != r2.length()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r1.getLetterSpacing() == s0.g.f34069a) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float b() {
        /*
            r7 = this;
            float r0 = r7.f21932d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lc
            float r0 = r7.f21932d
            goto L81
        Lc:
            android.text.BoringLayout$Metrics r0 = r7.a()
            if (r0 == 0) goto L1a
            int r0 = r0.width
            float r0 = (float) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L1b
        L1a:
            r0 = 0
        L1b:
            android.text.TextPaint r1 = r7.f21930b
            java.lang.CharSequence r2 = r7.f21929a
            if (r0 != 0) goto L34
            int r0 = r2.length()
            r3 = 0
            float r0 = android.text.Layout.getDesiredWidth(r2, r3, r0, r1)
            double r3 = (double) r0
            double r3 = java.lang.Math.ceil(r3)
            float r0 = (float) r3
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L34:
            float r3 = r0.floatValue()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L3e
            goto L7b
        L3e:
            boolean r3 = r2 instanceof android.text.Spanned
            if (r3 == 0) goto L67
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r3 = r2.length()
            r5 = -1
            java.lang.Class<m2.f> r6 = m2.f.class
            int r3 = r2.nextSpanTransition(r5, r3, r6)
            int r6 = r2.length()
            if (r3 == r6) goto L56
            goto L70
        L56:
            int r3 = r2.length()
            java.lang.Class<m2.e> r6 = m2.e.class
            int r3 = r2.nextSpanTransition(r5, r3, r6)
            int r2 = r2.length()
            if (r3 == r2) goto L67
            goto L70
        L67:
            float r1 = r1.getLetterSpacing()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L70
            goto L7b
        L70:
            float r0 = r0.floatValue()
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L7b:
            float r0 = r0.floatValue()
            r7.f21932d = r0
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.h.b():float");
    }
}
