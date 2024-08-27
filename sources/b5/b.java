package b5;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final b f3203g = new b(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final a f3204h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f3205i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f3206j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f3207k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f3208l;

    /* renamed from: m, reason: collision with root package name */
    public static final i5.w f3209m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3210a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3211b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3212c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3213d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3214e;

    /* renamed from: f, reason: collision with root package name */
    public final a[] f3215f;

    static {
        a aVar = new a(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = aVar.f3198e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aVar.f3199f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        f3204h = new a(aVar.f3194a, 0, aVar.f3196c, copyOf, (Uri[]) Arrays.copyOf(aVar.f3197d, 0), copyOf2, aVar.f3200g, aVar.f3201h);
        int i10 = e5.x.f15050a;
        f3205i = Integer.toString(1, 36);
        f3206j = Integer.toString(2, 36);
        f3207k = Integer.toString(3, 36);
        f3208l = Integer.toString(4, 36);
        f3209m = new i5.w(12);
    }

    public b(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f3210a = obj;
        this.f3212c = j10;
        this.f3213d = j11;
        this.f3211b = aVarArr.length + i10;
        this.f3215f = aVarArr;
        this.f3214e = i10;
    }

    public final a a(int i10) {
        int i11 = this.f3214e;
        if (i10 < i11) {
            return f3204h;
        }
        return this.f3215f[i10 - i11];
    }

    public final boolean b(int i10) {
        if (i10 == this.f3211b - 1) {
            a a10 = a(i10);
            if (a10.f3201h && a10.f3194a == Long.MIN_VALUE && a10.f3195b == -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (e5.x.a(this.f3210a, bVar.f3210a) && this.f3211b == bVar.f3211b && this.f3212c == bVar.f3212c && this.f3213d == bVar.f3213d && this.f3214e == bVar.f3214e && Arrays.equals(this.f3215f, bVar.f3215f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = this.f3211b * 31;
        Object obj = this.f3210a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((((((((i10 + hashCode) * 31) + ((int) this.f3212c)) * 31) + ((int) this.f3213d)) * 31) + this.f3214e) * 31) + Arrays.hashCode(this.f3215f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f3210a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f3212c);
        sb2.append(", adGroups=[");
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f3215f;
            if (i10 < aVarArr.length) {
                sb2.append("adGroup(timeUs=");
                sb2.append(aVarArr[i10].f3194a);
                sb2.append(", ads=[");
                for (int i11 = 0; i11 < aVarArr[i10].f3198e.length; i11++) {
                    sb2.append("ad(state=");
                    int i12 = aVarArr[i10].f3198e[i11];
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 != 3) {
                                    if (i12 != 4) {
                                        sb2.append('?');
                                    } else {
                                        sb2.append('!');
                                    }
                                } else {
                                    sb2.append('P');
                                }
                            } else {
                                sb2.append('S');
                            }
                        } else {
                            sb2.append('R');
                        }
                    } else {
                        sb2.append('_');
                    }
                    sb2.append(", durationUs=");
                    sb2.append(aVarArr[i10].f3199f[i11]);
                    sb2.append(')');
                    if (i11 < aVarArr[i10].f3198e.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append("])");
                if (i10 < aVarArr.length - 1) {
                    sb2.append(", ");
                }
                i10++;
            } else {
                sb2.append("])");
                return sb2.toString();
            }
        }
    }
}
