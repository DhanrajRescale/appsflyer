package a6;

import androidx.media3.common.ParserException;
import e5.x;
import java.nio.charset.Charset;
import java.util.Arrays;
import kp.e;
import z5.b0;
import z5.k;
import z5.p;
import z5.q;
import z5.r;
import z5.y;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f180p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f181q;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f182r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f183s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f184t;

    /* renamed from: c, reason: collision with root package name */
    public boolean f187c;

    /* renamed from: d, reason: collision with root package name */
    public long f188d;

    /* renamed from: e, reason: collision with root package name */
    public int f189e;

    /* renamed from: f, reason: collision with root package name */
    public int f190f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f191g;

    /* renamed from: h, reason: collision with root package name */
    public long f192h;

    /* renamed from: j, reason: collision with root package name */
    public int f194j;

    /* renamed from: k, reason: collision with root package name */
    public long f195k;

    /* renamed from: l, reason: collision with root package name */
    public r f196l;

    /* renamed from: m, reason: collision with root package name */
    public b0 f197m;

    /* renamed from: n, reason: collision with root package name */
    public y f198n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f199o;

    /* renamed from: b, reason: collision with root package name */
    public final int f186b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f185a = new byte[1];

    /* renamed from: i, reason: collision with root package name */
    public int f193i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f181q = iArr;
        int i10 = x.f15050a;
        Charset charset = e.f23433c;
        f182r = "#!AMR\n".getBytes(charset);
        f183s = "#!AMR-WB\n".getBytes(charset);
        f184t = iArr[8];
    }

    public final int a(q qVar) {
        String str;
        boolean z10;
        qVar.i();
        byte[] bArr = this.f185a;
        qVar.n(bArr, 0, 1);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i10 = (b10 >> 3) & 15;
            if (i10 >= 0 && i10 <= 15 && (((z10 = this.f187c) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
                if (z10) {
                    return f181q[i10];
                }
                return f180p[i10];
            }
            StringBuilder sb2 = new StringBuilder("Illegal AMR ");
            if (this.f187c) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb2.append(str);
            sb2.append(" frame type ");
            sb2.append(i10);
            throw ParserException.a(sb2.toString(), null);
        }
        throw ParserException.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    public final boolean b(q qVar) {
        qVar.i();
        byte[] bArr = f182r;
        byte[] bArr2 = new byte[bArr.length];
        qVar.n(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f187c = false;
            qVar.j(bArr.length);
            return true;
        }
        qVar.i();
        byte[] bArr3 = f183s;
        byte[] bArr4 = new byte[bArr3.length];
        qVar.n(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f187c = true;
        qVar.j(bArr3.length);
        return true;
    }

    @Override // z5.p
    public final void d(r rVar) {
        this.f196l = rVar;
        this.f197m = rVar.f(0, 1);
        rVar.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    @Override // z5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(z5.q r14, mj.b r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.a.e(z5.q, mj.b):int");
    }

    @Override // z5.p
    public final void f(long j10, long j11) {
        this.f188d = 0L;
        this.f189e = 0;
        this.f190f = 0;
        if (j10 != 0) {
            y yVar = this.f198n;
            if (yVar instanceof k) {
                this.f195k = (Math.max(0L, j10 - ((k) yVar).f42097b) * 8000000) / r0.f42100e;
                return;
            }
        }
        this.f195k = 0L;
    }

    @Override // z5.p
    public final boolean g(q qVar) {
        return b(qVar);
    }

    @Override // z5.p
    public final void release() {
    }
}
