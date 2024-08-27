package jv;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.search.SearchAuth;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public class i implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f21688f = {0, 10, 100, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, SearchAuth.StatusCodes.AUTH_DISABLED, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    /* renamed from: a, reason: collision with root package name */
    public final lv.m f21689a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21690b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21691c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21692d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21693e;

    public i(lv.m mVar, int i10, int i11, int i12) {
        this.f21689a = mVar;
        this.f21690b = i10;
        this.f21691c = i11;
        this.f21692d = i12;
        this.f21693e = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (r12 != 4) goto L41;
     */
    @Override // jv.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(e5.o r12, java.lang.StringBuilder r13) {
        /*
            r11 = this;
            lv.m r0 = r11.f21689a
            java.lang.Long r1 = r12.e(r0)
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            long r3 = r1.longValue()
            long r3 = r11.b(r12, r3)
            java.lang.Object r12 = r12.f15032e
            jv.v r12 = (jv.v) r12
            r5 = -9223372036854775808
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L1f
            java.lang.String r1 = "9223372036854775808"
            goto L27
        L1f:
            long r5 = java.lang.Math.abs(r3)
            java.lang.String r1 = java.lang.Long.toString(r5)
        L27:
            int r5 = r1.length()
            java.lang.String r6 = " cannot be printed as the value "
            java.lang.String r7 = "Field "
            int r8 = r11.f21691c
            if (r5 > r8) goto La6
            r12.getClass()
            r8 = 0
            int r12 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            r5 = 1
            int r8 = r11.f21690b
            r9 = 4
            int r10 = r11.f21692d
            if (r12 < 0) goto L62
            int r12 = w.k.e(r10)
            r0 = 43
            if (r12 == r5) goto L5e
            if (r12 == r9) goto L4d
            goto L92
        L4d:
            r12 = 19
            if (r8 >= r12) goto L92
            int[] r12 = jv.i.f21688f
            r12 = r12[r8]
            long r6 = (long) r12
            int r12 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r12 < 0) goto L92
            r13.append(r0)
            goto L92
        L5e:
            r13.append(r0)
            goto L92
        L62:
            int r12 = w.k.e(r10)
            if (r12 == 0) goto L8d
            if (r12 == r5) goto L8d
            r10 = 3
            if (r12 == r10) goto L70
            if (r12 == r9) goto L8d
            goto L92
        L70:
            org.threeten.bp.DateTimeException r12 = new org.threeten.bp.DateTimeException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r7)
            r13.append(r0)
            r13.append(r6)
            r13.append(r3)
            java.lang.String r0 = " cannot be negative according to the SignStyle"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L8d:
            r12 = 45
            r13.append(r12)
        L92:
            int r12 = r1.length()
            int r12 = r8 - r12
            if (r2 >= r12) goto La2
            r12 = 48
            r13.append(r12)
            int r2 = r2 + 1
            goto L92
        La2:
            r13.append(r1)
            return r5
        La6:
            org.threeten.bp.DateTimeException r12 = new org.threeten.bp.DateTimeException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r7)
            r13.append(r0)
            r13.append(r6)
            r13.append(r3)
            java.lang.String r0 = " exceeds the maximum print width of "
            r13.append(r0)
            r13.append(r8)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.i.a(e5.o, java.lang.StringBuilder):boolean");
    }

    public long b(e5.o oVar, long j10) {
        return j10;
    }

    public i c() {
        if (this.f21693e == -1) {
            return this;
        }
        return new i(this.f21689a, this.f21690b, this.f21691c, this.f21692d, -1);
    }

    public i d(int i10) {
        return new i(this.f21689a, this.f21690b, this.f21691c, this.f21692d, this.f21693e + i10);
    }

    public String toString() {
        lv.m mVar = this.f21689a;
        int i10 = this.f21692d;
        int i11 = this.f21691c;
        int i12 = this.f21690b;
        if (i12 == 1 && i11 == 19 && i10 == 1) {
            return "Value(" + mVar + ")";
        }
        if (i12 == i11 && i10 == 4) {
            return "Value(" + mVar + "," + i12 + ")";
        }
        return "Value(" + mVar + "," + i12 + "," + i11 + "," + jr.h.x(i10) + ")";
    }

    public i(lv.m mVar, int i10, int i11, int i12, int i13) {
        this.f21689a = mVar;
        this.f21690b = i10;
        this.f21691c = i11;
        this.f21692d = i12;
        this.f21693e = i13;
    }
}
