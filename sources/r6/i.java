package r6;

import b5.q0;
import b5.u;
import b5.v;
import e5.p;
import java.util.ArrayList;
import java.util.Arrays;
import lp.o0;

/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f33380o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f33381p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f33382n;

    public static boolean e(p pVar, byte[] bArr) {
        if (pVar.a() < bArr.length) {
            return false;
        }
        int i10 = pVar.f15037b;
        byte[] bArr2 = new byte[bArr.length];
        pVar.e(bArr2, 0, bArr.length);
        pVar.F(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // r6.j
    public final long b(p pVar) {
        byte[] bArr = pVar.f15036a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f33391i * vl.b.y(b11, b10)) / 1000000;
    }

    @Override // r6.j
    public final boolean c(p pVar, long j10, tr.e eVar) {
        if (e(pVar, f33380o)) {
            byte[] copyOf = Arrays.copyOf(pVar.f15036a, pVar.f15038c);
            int i10 = copyOf[9] & 255;
            ArrayList e10 = vl.b.e(copyOf);
            if (((v) eVar.f36361b) != null) {
                return true;
            }
            u uVar = new u();
            uVar.f3600k = "audio/opus";
            uVar.f3613x = i10;
            uVar.f3614y = 48000;
            uVar.f3602m = e10;
            eVar.f36361b = new v(uVar);
            return true;
        }
        if (e(pVar, f33381p)) {
            yk.j.I0((v) eVar.f36361b);
            if (this.f33382n) {
                return true;
            }
            this.f33382n = true;
            pVar.G(8);
            q0 r10 = e5.a.r(o0.r((String[]) e5.a.t(pVar, false, false).f23775c));
            if (r10 == null) {
                return true;
            }
            u a10 = ((v) eVar.f36361b).a();
            q0 q0Var = ((v) eVar.f36361b).f3650j;
            if (q0Var != null) {
                r10 = r10.a(q0Var.f3577a);
            }
            a10.f3598i = r10;
            eVar.f36361b = new v(a10);
            return true;
        }
        yk.j.I0((v) eVar.f36361b);
        return false;
    }

    @Override // r6.j
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f33382n = false;
        }
    }
}
