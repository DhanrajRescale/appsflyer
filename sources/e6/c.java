package e6;

import yk.j;
import z5.q;

/* loaded from: classes.dex */
public final class c implements q {

    /* renamed from: a, reason: collision with root package name */
    public final q f15077a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15078b;

    public c(q qVar, long j10) {
        boolean z10;
        this.f15077a = qVar;
        if (qVar.getPosition() >= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        j.E0(z10);
        this.f15078b = j10;
    }

    @Override // z5.q
    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f15077a.a(bArr, i10, i11, z10);
    }

    @Override // z5.q
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f15077a.b(bArr, i10, i11, z10);
    }

    @Override // z5.q
    public final long c() {
        return this.f15077a.c() - this.f15078b;
    }

    @Override // z5.q
    public final void d(int i10) {
        this.f15077a.d(i10);
    }

    @Override // z5.q
    public final int e(int i10) {
        return this.f15077a.e(i10);
    }

    @Override // z5.q
    public final long f() {
        return this.f15077a.f() - this.f15078b;
    }

    @Override // z5.q
    public final int g(byte[] bArr, int i10, int i11) {
        return this.f15077a.g(bArr, i10, i11);
    }

    @Override // z5.q
    public final long getPosition() {
        return this.f15077a.getPosition() - this.f15078b;
    }

    @Override // z5.q
    public final void i() {
        this.f15077a.i();
    }

    @Override // z5.q
    public final void j(int i10) {
        this.f15077a.j(i10);
    }

    @Override // z5.q
    public final boolean k(int i10, boolean z10) {
        return this.f15077a.k(i10, z10);
    }

    @Override // z5.q
    public final void n(byte[] bArr, int i10, int i11) {
        this.f15077a.n(bArr, i10, i11);
    }

    @Override // b5.o
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f15077a.read(bArr, i10, i11);
    }

    @Override // z5.q
    public final void readFully(byte[] bArr, int i10, int i11) {
        this.f15077a.readFully(bArr, i10, i11);
    }
}
