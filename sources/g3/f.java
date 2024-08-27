package g3;

import com.google.android.gms.common.api.Api;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: h, reason: collision with root package name */
    public static final String f16480h = new String("FIXED_DIMENSION");

    /* renamed from: i, reason: collision with root package name */
    public static final String f16481i = new String("WRAP_DIMENSION");

    /* renamed from: j, reason: collision with root package name */
    public static final String f16482j = new String("SPREAD_DIMENSION");

    /* renamed from: k, reason: collision with root package name */
    public static final String f16483k = new String("PARENT_DIMENSION");

    /* renamed from: l, reason: collision with root package name */
    public static final String f16484l = new String("PERCENT_DIMENSION");

    /* renamed from: m, reason: collision with root package name */
    public static final String f16485m = new String("RATIO_DIMENSION");

    /* renamed from: f, reason: collision with root package name */
    public Object f16491f;

    /* renamed from: a, reason: collision with root package name */
    public int f16486a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f16487b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: c, reason: collision with root package name */
    public float f16488c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public int f16489d = 0;

    /* renamed from: e, reason: collision with root package name */
    public String f16490e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16492g = false;

    public f(String str) {
        this.f16491f = str;
    }

    public static f b(int i10) {
        f fVar = new f(f16480h);
        fVar.f16491f = null;
        fVar.f16489d = i10;
        return fVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, g3.f] */
    public static f c(String str) {
        ?? obj = new Object();
        obj.f16486a = 0;
        obj.f16487b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        obj.f16488c = 1.0f;
        obj.f16489d = 0;
        obj.f16490e = null;
        obj.f16491f = str;
        obj.f16492g = true;
        return obj;
    }

    public final void a(j3.d dVar, int i10) {
        String str = this.f16490e;
        if (str != null) {
            dVar.L(str);
        }
        String str2 = f16483k;
        String str3 = f16484l;
        String str4 = f16481i;
        int i11 = 2;
        if (i10 == 0) {
            if (this.f16492g) {
                dVar.P(3);
                Object obj = this.f16491f;
                if (obj == str4) {
                    i11 = 1;
                } else if (obj != str3) {
                    i11 = 0;
                }
                dVar.Q(this.f16488c, i11, this.f16486a, this.f16487b);
                return;
            }
            int i12 = this.f16486a;
            if (i12 > 0) {
                if (i12 < 0) {
                    dVar.f20855d0 = 0;
                } else {
                    dVar.f20855d0 = i12;
                }
            }
            int i13 = this.f16487b;
            if (i13 < Integer.MAX_VALUE) {
                dVar.E[0] = i13;
            }
            Object obj2 = this.f16491f;
            if (obj2 == str4) {
                dVar.P(2);
                return;
            }
            if (obj2 == str2) {
                dVar.P(4);
                return;
            } else {
                if (obj2 == null) {
                    dVar.P(1);
                    dVar.T(this.f16489d);
                    return;
                }
                return;
            }
        }
        if (this.f16492g) {
            dVar.R(3);
            Object obj3 = this.f16491f;
            if (obj3 == str4) {
                i11 = 1;
            } else if (obj3 != str3) {
                i11 = 0;
            }
            dVar.S(this.f16488c, i11, this.f16486a, this.f16487b);
            return;
        }
        int i14 = this.f16486a;
        if (i14 > 0) {
            if (i14 < 0) {
                dVar.f20857e0 = 0;
            } else {
                dVar.f20857e0 = i14;
            }
        }
        int i15 = this.f16487b;
        if (i15 < Integer.MAX_VALUE) {
            dVar.E[1] = i15;
        }
        Object obj4 = this.f16491f;
        if (obj4 == str4) {
            dVar.R(2);
            return;
        }
        if (obj4 == str2) {
            dVar.R(4);
        } else if (obj4 == null) {
            dVar.R(1);
            dVar.O(this.f16489d);
        }
    }
}
