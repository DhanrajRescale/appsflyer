package r5;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class m implements g5.f {

    /* renamed from: a, reason: collision with root package name */
    public final g5.f f33211a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33212b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f33213c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f33214d;

    /* renamed from: e, reason: collision with root package name */
    public int f33215e;

    public m(g5.t tVar, int i10, i0 i0Var) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        this.f33211a = tVar;
        this.f33212b = i10;
        this.f33213c = i0Var;
        this.f33214d = new byte[1];
        this.f33215e = i10;
    }

    @Override // g5.f
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // g5.f
    public final Map h() {
        return this.f33211a.h();
    }

    @Override // g5.f
    public final Uri l() {
        return this.f33211a.l();
    }

    @Override // g5.f
    public final void m(g5.u uVar) {
        uVar.getClass();
        this.f33211a.m(uVar);
    }

    @Override // g5.f
    public final long o(g5.i iVar) {
        throw new UnsupportedOperationException();
    }

    @Override // b5.o
    public final int read(byte[] bArr, int i10, int i11) {
        long max;
        int i12 = this.f33215e;
        g5.f fVar = this.f33211a;
        if (i12 == 0) {
            byte[] bArr2 = this.f33214d;
            int i13 = 0;
            if (fVar.read(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int read = fVar.read(bArr3, i13, i15);
                        if (read != -1) {
                            i13 += read;
                            i15 -= read;
                        }
                    }
                    while (i14 > 0 && bArr3[i14 - 1] == 0) {
                        i14--;
                    }
                    if (i14 > 0) {
                        e5.p pVar = new e5.p(bArr3, i14);
                        i0 i0Var = this.f33213c;
                        if (!i0Var.f33192l) {
                            max = i0Var.f33189i;
                        } else {
                            max = Math.max(i0Var.f33193m.l(true), i0Var.f33189i);
                        }
                        long j10 = max;
                        int a10 = pVar.a();
                        u0 u0Var = i0Var.f33191k;
                        u0Var.getClass();
                        u0Var.c(a10, pVar);
                        u0Var.b(j10, 1, a10, 0, null);
                        i0Var.f33192l = true;
                    }
                }
                this.f33215e = this.f33212b;
            }
            return -1;
        }
        int read2 = fVar.read(bArr, i10, Math.min(this.f33215e, i11));
        if (read2 != -1) {
            this.f33215e -= read2;
        }
        return read2;
    }
}
