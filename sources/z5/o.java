package z5;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class o implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f42114a = new byte[4096];

    @Override // z5.b0
    public final int a(b5.o oVar, int i10, boolean z10) {
        byte[] bArr = this.f42114a;
        int read = oVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override // z5.b0
    public final void b(long j10, int i10, int i11, int i12, a0 a0Var) {
    }

    @Override // z5.b0
    public final void c(int i10, e5.p pVar) {
        pVar.G(i10);
    }

    @Override // z5.b0
    public final void e(b5.v vVar) {
    }
}
