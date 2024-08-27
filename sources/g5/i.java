package g5;

import android.net.Uri;
import b5.l0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f16568k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f16569a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16570b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16571c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f16572d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f16573e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16574f;

    /* renamed from: g, reason: collision with root package name */
    public final long f16575g;

    /* renamed from: h, reason: collision with root package name */
    public final String f16576h;

    /* renamed from: i, reason: collision with root package name */
    public final int f16577i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f16578j;

    static {
        l0.a("media3.datasource");
    }

    public i(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        boolean z10;
        boolean z11;
        byte[] bArr2 = bArr;
        boolean z12 = true;
        if (j10 + j11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        if (j11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        yk.j.E0(z11);
        if (j12 <= 0 && j12 != -1) {
            z12 = false;
        }
        yk.j.E0(z12);
        this.f16569a = uri;
        this.f16570b = j10;
        this.f16571c = i10;
        this.f16572d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f16573e = Collections.unmodifiableMap(new HashMap(map));
        this.f16574f = j11;
        this.f16575g = j12;
        this.f16576h = str;
        this.f16577i = i11;
        this.f16578j = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g5.h, java.lang.Object] */
    public final h a() {
        ?? obj = new Object();
        obj.f16558a = this.f16569a;
        obj.f16559b = this.f16570b;
        obj.f16560c = this.f16571c;
        obj.f16561d = this.f16572d;
        obj.f16562e = this.f16573e;
        obj.f16563f = this.f16574f;
        obj.f16564g = this.f16575g;
        obj.f16565h = this.f16576h;
        obj.f16566i = this.f16577i;
        obj.f16567j = this.f16578j;
        return obj;
    }

    public final i b(long j10) {
        long j11 = this.f16575g;
        long j12 = -1;
        if (j11 != -1) {
            j12 = j11 - j10;
        }
        long j13 = j12;
        if (j10 == 0 && j11 == j13) {
            return this;
        }
        return new i(this.f16569a, this.f16570b, this.f16571c, this.f16572d, this.f16573e, this.f16574f + j10, j13, this.f16576h, this.f16577i, this.f16578j);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f16571c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    str = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str = "POST";
            }
        } else {
            str = "GET";
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.f16569a);
        sb2.append(", ");
        sb2.append(this.f16574f);
        sb2.append(", ");
        sb2.append(this.f16575g);
        sb2.append(", ");
        sb2.append(this.f16576h);
        sb2.append(", ");
        return nn.d.m(sb2, this.f16577i, "]");
    }
}
