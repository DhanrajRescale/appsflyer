package b5;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: i, reason: collision with root package name */
    public static final String f3185i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f3186j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f3187k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f3188l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f3189m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f3190n;

    /* renamed from: o, reason: collision with root package name */
    public static final String f3191o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f3192p;

    /* renamed from: q, reason: collision with root package name */
    public static final i5.w f3193q;

    /* renamed from: a, reason: collision with root package name */
    public final long f3194a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3195b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3196c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri[] f3197d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f3198e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f3199f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3200g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3201h;

    static {
        int i10 = e5.x.f15050a;
        f3185i = Integer.toString(0, 36);
        f3186j = Integer.toString(1, 36);
        f3187k = Integer.toString(2, 36);
        f3188l = Integer.toString(3, 36);
        f3189m = Integer.toString(4, 36);
        f3190n = Integer.toString(5, 36);
        f3191o = Integer.toString(6, 36);
        f3192p = Integer.toString(7, 36);
        f3193q = new i5.w(13);
    }

    public a(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
        boolean z11;
        if (iArr.length == uriArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        yk.j.E0(z11);
        this.f3194a = j10;
        this.f3195b = i10;
        this.f3196c = i11;
        this.f3198e = iArr;
        this.f3197d = uriArr;
        this.f3199f = jArr;
        this.f3200g = j11;
        this.f3201h = z10;
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f3198e;
            if (i12 >= iArr.length || this.f3201h || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3194a == aVar.f3194a && this.f3195b == aVar.f3195b && this.f3196c == aVar.f3196c && Arrays.equals(this.f3197d, aVar.f3197d) && Arrays.equals(this.f3198e, aVar.f3198e) && Arrays.equals(this.f3199f, aVar.f3199f) && this.f3200g == aVar.f3200g && this.f3201h == aVar.f3201h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((this.f3195b * 31) + this.f3196c) * 31;
        long j10 = this.f3194a;
        int hashCode = (Arrays.hashCode(this.f3199f) + ((Arrays.hashCode(this.f3198e) + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f3197d)) * 31)) * 31)) * 31;
        long j11 = this.f3200g;
        return ((hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f3201h ? 1 : 0);
    }
}
