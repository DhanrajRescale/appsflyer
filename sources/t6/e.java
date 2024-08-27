package t6;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {
    public static final int[] A;
    public static final boolean[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;

    /* renamed from: w, reason: collision with root package name */
    public static final int f35396w = c(2, 2, 2, 0);

    /* renamed from: x, reason: collision with root package name */
    public static final int f35397x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f35398y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f35399z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f35400a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f35401b = new SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f35402c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f35403d;

    /* renamed from: e, reason: collision with root package name */
    public int f35404e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35405f;

    /* renamed from: g, reason: collision with root package name */
    public int f35406g;

    /* renamed from: h, reason: collision with root package name */
    public int f35407h;

    /* renamed from: i, reason: collision with root package name */
    public int f35408i;

    /* renamed from: j, reason: collision with root package name */
    public int f35409j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35410k;

    /* renamed from: l, reason: collision with root package name */
    public int f35411l;

    /* renamed from: m, reason: collision with root package name */
    public int f35412m;

    /* renamed from: n, reason: collision with root package name */
    public int f35413n;

    /* renamed from: o, reason: collision with root package name */
    public int f35414o;

    /* renamed from: p, reason: collision with root package name */
    public int f35415p;

    /* renamed from: q, reason: collision with root package name */
    public int f35416q;

    /* renamed from: r, reason: collision with root package name */
    public int f35417r;

    /* renamed from: s, reason: collision with root package name */
    public int f35418s;

    /* renamed from: t, reason: collision with root package name */
    public int f35419t;

    /* renamed from: u, reason: collision with root package name */
    public int f35420u;

    /* renamed from: v, reason: collision with root package name */
    public int f35421v;

    static {
        int c10 = c(0, 0, 0, 0);
        f35397x = c10;
        int c11 = c(0, 0, 0, 3);
        f35398y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f35399z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{c10, c11, c10, c10, c11, c10, c10};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{c10, c10, c10, c10, c10, c11, c11};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            yk.j.G0(r4, r0)
            yk.j.G0(r5, r0)
            yk.j.G0(r6, r0)
            yk.j.G0(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L1b
            if (r7 == r1) goto L1b
            r3 = 2
            if (r7 == r3) goto L1f
            r3 = 3
            if (r7 == r3) goto L1d
        L1b:
            r7 = r2
            goto L21
        L1d:
            r7 = r0
            goto L21
        L1f:
            r7 = 127(0x7f, float:1.78E-43)
        L21:
            if (r4 <= r1) goto L25
            r4 = r2
            goto L26
        L25:
            r4 = r0
        L26:
            if (r5 <= r1) goto L2a
            r5 = r2
            goto L2b
        L2a:
            r5 = r0
        L2b:
            if (r6 <= r1) goto L2e
            r0 = r2
        L2e:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.e.c(int, int, int, int):int");
    }

    public final void a(char c10) {
        SpannableStringBuilder spannableStringBuilder = this.f35401b;
        if (c10 == '\n') {
            ArrayList arrayList = this.f35400a;
            arrayList.add(b());
            spannableStringBuilder.clear();
            if (this.f35415p != -1) {
                this.f35415p = 0;
            }
            if (this.f35416q != -1) {
                this.f35416q = 0;
            }
            if (this.f35417r != -1) {
                this.f35417r = 0;
            }
            if (this.f35419t != -1) {
                this.f35419t = 0;
            }
            while (true) {
                if ((this.f35410k && arrayList.size() >= this.f35409j) || arrayList.size() >= 15) {
                    arrayList.remove(0);
                } else {
                    return;
                }
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f35401b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f35415p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f35415p, length, 33);
            }
            if (this.f35416q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f35416q, length, 33);
            }
            if (this.f35417r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f35418s), this.f35417r, length, 33);
            }
            if (this.f35419t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f35420u), this.f35419t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f35400a.clear();
        this.f35401b.clear();
        this.f35415p = -1;
        this.f35416q = -1;
        this.f35417r = -1;
        this.f35419t = -1;
        this.f35421v = 0;
        this.f35402c = false;
        this.f35403d = false;
        this.f35404e = 4;
        this.f35405f = false;
        this.f35406g = 0;
        this.f35407h = 0;
        this.f35408i = 0;
        this.f35409j = 15;
        this.f35410k = true;
        this.f35411l = 0;
        this.f35412m = 0;
        this.f35413n = 0;
        int i10 = f35397x;
        this.f35414o = i10;
        this.f35418s = f35396w;
        this.f35420u = i10;
    }

    public final void e(boolean z10, boolean z11) {
        int i10 = this.f35415p;
        SpannableStringBuilder spannableStringBuilder = this.f35401b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f35415p, spannableStringBuilder.length(), 33);
                this.f35415p = -1;
            }
        } else if (z10) {
            this.f35415p = spannableStringBuilder.length();
        }
        if (this.f35416q != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f35416q, spannableStringBuilder.length(), 33);
                this.f35416q = -1;
                return;
            }
            return;
        }
        if (z11) {
            this.f35416q = spannableStringBuilder.length();
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f35417r;
        SpannableStringBuilder spannableStringBuilder = this.f35401b;
        if (i12 != -1 && this.f35418s != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f35418s), this.f35417r, spannableStringBuilder.length(), 33);
        }
        if (i10 != f35396w) {
            this.f35417r = spannableStringBuilder.length();
            this.f35418s = i10;
        }
        if (this.f35419t != -1 && this.f35420u != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f35420u), this.f35419t, spannableStringBuilder.length(), 33);
        }
        if (i11 != f35397x) {
            this.f35419t = spannableStringBuilder.length();
            this.f35420u = i11;
        }
    }
}
