package b5;

import java.util.Arrays;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class j1 implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final String f3373f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f3374g;

    /* renamed from: h, reason: collision with root package name */
    public static final s0 f3375h;

    /* renamed from: a, reason: collision with root package name */
    public final int f3376a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3377b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3378c;

    /* renamed from: d, reason: collision with root package name */
    public final v[] f3379d;

    /* renamed from: e, reason: collision with root package name */
    public int f3380e;

    static {
        int i10 = e5.x.f15050a;
        f3373f = Integer.toString(0, 36);
        f3374g = Integer.toString(1, 36);
        f3375h = new s0(11);
    }

    public j1(String str, v... vVarArr) {
        boolean z10;
        if (vVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        this.f3377b = str;
        this.f3379d = vVarArr;
        this.f3376a = vVarArr.length;
        int h10 = r0.h(vVarArr[0].f3652l);
        this.f3378c = h10 == -1 ? r0.h(vVarArr[0].f3651k) : h10;
        String str2 = vVarArr[0].f3643c;
        str2 = (str2 == null || str2.equals("und")) ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        int i10 = vVarArr[0].f3645e | Http2.INITIAL_MAX_FRAME_SIZE;
        for (int i11 = 1; i11 < vVarArr.length; i11++) {
            String str3 = vVarArr[i11].f3643c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? HttpUrl.FRAGMENT_ENCODE_SET : str3)) {
                a("languages", vVarArr[0].f3643c, vVarArr[i11].f3643c, i11);
                return;
            } else {
                if (i10 != (vVarArr[i11].f3645e | Http2.INITIAL_MAX_FRAME_SIZE)) {
                    a("role flags", Integer.toBinaryString(vVarArr[0].f3645e), Integer.toBinaryString(vVarArr[i11].f3645e), i11);
                    return;
                }
            }
        }
    }

    public static void a(String str, String str2, String str3, int i10) {
        StringBuilder l10 = v.e.l("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        l10.append(str3);
        l10.append("' (track ");
        l10.append(i10);
        l10.append(")");
        e5.m.d("TrackGroup", HttpUrl.FRAGMENT_ENCODE_SET, new IllegalStateException(l10.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j1.class != obj.getClass()) {
            return false;
        }
        j1 j1Var = (j1) obj;
        if (this.f3377b.equals(j1Var.f3377b) && Arrays.equals(this.f3379d, j1Var.f3379d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f3380e == 0) {
            this.f3380e = jr.h.g(this.f3377b, 527, 31) + Arrays.hashCode(this.f3379d);
        }
        return this.f3380e;
    }
}
