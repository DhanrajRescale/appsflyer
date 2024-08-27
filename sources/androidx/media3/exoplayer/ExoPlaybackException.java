package androidx.media3.exoplayer;

import android.os.Bundle;
import androidx.media3.common.PlaybackException;
import b5.o0;
import b5.v;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import e5.x;
import okhttp3.internal.ws.WebSocketProtocol;
import r5.w;
import yk.j;

/* loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* renamed from: o, reason: collision with root package name */
    public static final String f2060o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f2061p;

    /* renamed from: q, reason: collision with root package name */
    public static final String f2062q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f2063r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f2064s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f2065t;

    /* renamed from: h, reason: collision with root package name */
    public final int f2066h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2067i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2068j;

    /* renamed from: k, reason: collision with root package name */
    public final v f2069k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2070l;

    /* renamed from: m, reason: collision with root package name */
    public final o0 f2071m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2072n;

    static {
        int i10 = x.f15050a;
        f2060o = Integer.toString(1001, 36);
        f2061p = Integer.toString(CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE, 36);
        f2062q = Integer.toString(1003, 36);
        f2063r = Integer.toString(1004, 36);
        f2064s = Integer.toString(WebSocketProtocol.CLOSE_NO_STATUS_CODE, 36);
        f2065t = Integer.toString(1006, 36);
    }

    public ExoPlaybackException(int i10, int i11, Throwable th2) {
        this(i10, th2, i11, null, -1, null, 4, false);
    }

    public final ExoPlaybackException a(w wVar) {
        String message = getMessage();
        int i10 = x.f15050a;
        return new ExoPlaybackException(message, getCause(), this.f2053a, this.f2066h, this.f2067i, this.f2068j, this.f2069k, this.f2070l, wVar, this.f2054b, this.f2072n);
    }

    public ExoPlaybackException(Bundle bundle) {
        super(bundle);
        this.f2066h = bundle.getInt(f2060o, 2);
        this.f2067i = bundle.getString(f2061p);
        this.f2068j = bundle.getInt(f2062q, -1);
        Bundle bundle2 = bundle.getBundle(f2063r);
        this.f2069k = bundle2 == null ? null : (v) v.G0.c(bundle2);
        this.f2070l = bundle.getInt(f2064s, 4);
        this.f2072n = bundle.getBoolean(f2065t, false);
        this.f2071m = null;
    }

    public ExoPlaybackException(String str, Throwable th2, int i10, int i11, String str2, int i12, v vVar, int i13, w wVar, long j10, boolean z10) {
        super(str, th2, i10, j10);
        j.E0(!z10 || i11 == 1);
        j.E0(th2 != null || i11 == 3);
        this.f2066h = i11;
        this.f2067i = str2;
        this.f2068j = i12;
        this.f2069k = vVar;
        this.f2070l = i13;
        this.f2071m = wVar;
        this.f2072n = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExoPlaybackException(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, b5.v r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            r8 = r20
            if (r4 == 0) goto L64
            r0 = 3
            r1 = 1
            if (r4 == r1) goto L17
            if (r4 == r0) goto L14
            java.lang.String r0 = "Unexpected runtime error"
        Ld:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L6c
        L14:
            java.lang.String r0 = "Remote error"
            goto Ld
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r7 = r19
            r2.append(r7)
            java.lang.String r3 = ", format_supported="
            r2.append(r3)
            int r3 = e5.x.f15050a
            if (r8 == 0) goto L5a
            if (r8 == r1) goto L57
            r1 = 2
            if (r8 == r1) goto L54
            if (r8 == r0) goto L51
            r0 = 4
            if (r8 != r0) goto L4b
            java.lang.String r0 = "YES"
            goto L5c
        L4b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L51:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L5c
        L54:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L5c
        L57:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L5c
        L5a:
            java.lang.String r0 = "NO"
        L5c:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L6c
        L64:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L6c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L79
            java.lang.String r1 = ": null"
            java.lang.String r0 = jr.h.r(r0, r1)
        L79:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlaybackException.<init>(int, java.lang.Throwable, int, java.lang.String, int, b5.v, int, boolean):void");
    }
}
