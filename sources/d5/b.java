package d5;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import b5.k;
import b5.s0;
import e5.x;
import java.util.Arrays;
import okhttp3.HttpUrl;
import yk.j;

/* loaded from: classes.dex */
public final class b implements k {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final s0 J;

    /* renamed from: r, reason: collision with root package name */
    public static final b f13894r = new b(HttpUrl.FRAGMENT_ENCODE_SET, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, s0.g.f34069a);

    /* renamed from: s, reason: collision with root package name */
    public static final String f13895s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f13896t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f13897u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f13898v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f13899w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f13900x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f13901y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f13902z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f13903a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f13904b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f13905c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f13906d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13907e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13908f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13909g;

    /* renamed from: h, reason: collision with root package name */
    public final float f13910h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13911i;

    /* renamed from: j, reason: collision with root package name */
    public final float f13912j;

    /* renamed from: k, reason: collision with root package name */
    public final float f13913k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f13914l;

    /* renamed from: m, reason: collision with root package name */
    public final int f13915m;

    /* renamed from: n, reason: collision with root package name */
    public final int f13916n;

    /* renamed from: o, reason: collision with root package name */
    public final float f13917o;

    /* renamed from: p, reason: collision with root package name */
    public final int f13918p;

    /* renamed from: q, reason: collision with root package name */
    public final float f13919q;

    static {
        int i10 = x.f15050a;
        f13895s = Integer.toString(0, 36);
        f13896t = Integer.toString(1, 36);
        f13897u = Integer.toString(2, 36);
        f13898v = Integer.toString(3, 36);
        f13899w = Integer.toString(4, 36);
        f13900x = Integer.toString(5, 36);
        f13901y = Integer.toString(6, 36);
        f13902z = Integer.toString(7, 36);
        A = Integer.toString(8, 36);
        B = Integer.toString(9, 36);
        C = Integer.toString(10, 36);
        D = Integer.toString(11, 36);
        E = Integer.toString(12, 36);
        F = Integer.toString(13, 36);
        G = Integer.toString(14, 36);
        H = Integer.toString(15, 36);
        I = Integer.toString(16, 36);
        J = new s0(17);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            j.E0(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f13903a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f13903a = charSequence.toString();
        } else {
            this.f13903a = null;
        }
        this.f13904b = alignment;
        this.f13905c = alignment2;
        this.f13906d = bitmap;
        this.f13907e = f10;
        this.f13908f = i10;
        this.f13909g = i11;
        this.f13910h = f11;
        this.f13911i = i12;
        this.f13912j = f13;
        this.f13913k = f14;
        this.f13914l = z10;
        this.f13915m = i14;
        this.f13916n = i13;
        this.f13917o = f12;
        this.f13918p = i15;
        this.f13919q = f15;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, d5.a] */
    public final a a() {
        ?? obj = new Object();
        obj.f13877a = this.f13903a;
        obj.f13878b = this.f13906d;
        obj.f13879c = this.f13904b;
        obj.f13880d = this.f13905c;
        obj.f13881e = this.f13907e;
        obj.f13882f = this.f13908f;
        obj.f13883g = this.f13909g;
        obj.f13884h = this.f13910h;
        obj.f13885i = this.f13911i;
        obj.f13886j = this.f13916n;
        obj.f13887k = this.f13917o;
        obj.f13888l = this.f13912j;
        obj.f13889m = this.f13913k;
        obj.f13890n = this.f13914l;
        obj.f13891o = this.f13915m;
        obj.f13892p = this.f13918p;
        obj.f13893q = this.f13919q;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (TextUtils.equals(this.f13903a, bVar.f13903a) && this.f13904b == bVar.f13904b && this.f13905c == bVar.f13905c) {
            Bitmap bitmap = bVar.f13906d;
            Bitmap bitmap2 = this.f13906d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f13907e == bVar.f13907e && this.f13908f == bVar.f13908f && this.f13909g == bVar.f13909g && this.f13910h == bVar.f13910h && this.f13911i == bVar.f13911i && this.f13912j == bVar.f13912j && this.f13913k == bVar.f13913k && this.f13914l == bVar.f13914l && this.f13915m == bVar.f13915m && this.f13916n == bVar.f13916n && this.f13917o == bVar.f13917o && this.f13918p == bVar.f13918p && this.f13919q == bVar.f13919q) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13903a, this.f13904b, this.f13905c, this.f13906d, Float.valueOf(this.f13907e), Integer.valueOf(this.f13908f), Integer.valueOf(this.f13909g), Float.valueOf(this.f13910h), Integer.valueOf(this.f13911i), Float.valueOf(this.f13912j), Float.valueOf(this.f13913k), Boolean.valueOf(this.f13914l), Integer.valueOf(this.f13915m), Integer.valueOf(this.f13916n), Float.valueOf(this.f13917o), Integer.valueOf(this.f13918p), Float.valueOf(this.f13919q)});
    }
}
