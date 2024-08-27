package z5;

import b5.q0;
import java.util.Collections;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f42119a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42120b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42121c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42122d;

    /* renamed from: e, reason: collision with root package name */
    public final int f42123e;

    /* renamed from: f, reason: collision with root package name */
    public final int f42124f;

    /* renamed from: g, reason: collision with root package name */
    public final int f42125g;

    /* renamed from: h, reason: collision with root package name */
    public final int f42126h;

    /* renamed from: i, reason: collision with root package name */
    public final int f42127i;

    /* renamed from: j, reason: collision with root package name */
    public final long f42128j;

    /* renamed from: k, reason: collision with root package name */
    public final tr.e f42129k;

    /* renamed from: l, reason: collision with root package name */
    public final q0 f42130l;

    public u(byte[] bArr, int i10) {
        b5.m mVar = new b5.m(bArr, 1, (Object) null);
        mVar.p(i10 * 8);
        this.f42119a = mVar.i(16);
        this.f42120b = mVar.i(16);
        this.f42121c = mVar.i(24);
        this.f42122d = mVar.i(24);
        int i11 = mVar.i(20);
        this.f42123e = i11;
        this.f42124f = d(i11);
        this.f42125g = mVar.i(3) + 1;
        int i12 = mVar.i(5) + 1;
        this.f42126h = i12;
        this.f42127i = a(i12);
        int i13 = mVar.i(4);
        int i14 = mVar.i(32);
        int i15 = e5.x.f15050a;
        this.f42128j = ((i13 & 4294967295L) << 32) | (i14 & 4294967295L);
        this.f42129k = null;
        this.f42130l = null;
    }

    public static int a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j10 = this.f42128j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f42123e;
    }

    public final b5.v c(byte[] bArr, q0 q0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f42122d;
        if (i10 <= 0) {
            i10 = -1;
        }
        q0 q0Var2 = this.f42130l;
        if (q0Var2 != null) {
            if (q0Var == null) {
                q0Var = q0Var2;
            } else {
                q0Var = q0Var2.a(q0Var.f3577a);
            }
        }
        b5.u uVar = new b5.u();
        uVar.f3600k = "audio/flac";
        uVar.f3601l = i10;
        uVar.f3613x = this.f42125g;
        uVar.f3614y = this.f42123e;
        uVar.f3602m = Collections.singletonList(bArr);
        uVar.f3598i = q0Var;
        return new b5.v(uVar);
    }

    public u(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, tr.e eVar, q0 q0Var) {
        this.f42119a = i10;
        this.f42120b = i11;
        this.f42121c = i12;
        this.f42122d = i13;
        this.f42123e = i14;
        this.f42124f = d(i14);
        this.f42125g = i15;
        this.f42126h = i16;
        this.f42127i = a(i16);
        this.f42128j = j10;
        this.f42129k = eVar;
        this.f42130l = q0Var;
    }
}
