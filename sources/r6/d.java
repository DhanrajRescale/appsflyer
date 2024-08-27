package r6;

import b5.v;
import e5.p;
import java.util.Arrays;
import z5.u;

/* loaded from: classes.dex */
public final class d extends j {

    /* renamed from: n, reason: collision with root package name */
    public u f33363n;

    /* renamed from: o, reason: collision with root package name */
    public c f33364o;

    @Override // r6.j
    public final long b(p pVar) {
        byte[] bArr = pVar.f15036a;
        if (bArr[0] == -1) {
            int i10 = (bArr[2] & 255) >> 4;
            if (i10 == 6 || i10 == 7) {
                pVar.G(4);
                pVar.A();
            }
            int c02 = vl.b.c0(i10, pVar);
            pVar.F(0);
            return c02;
        }
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, r6.c] */
    @Override // r6.j
    public final boolean c(p pVar, long j10, tr.e eVar) {
        byte[] bArr = pVar.f15036a;
        u uVar = this.f33363n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f33363n = uVar2;
            eVar.f36361b = uVar2.c(Arrays.copyOfRange(bArr, 9, pVar.f15038c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            tr.e s7 = e5.a.s(pVar);
            u uVar3 = new u(uVar.f42119a, uVar.f42120b, uVar.f42121c, uVar.f42122d, uVar.f42123e, uVar.f42125g, uVar.f42126h, uVar.f42128j, s7, uVar.f42130l);
            this.f33363n = uVar3;
            ?? obj = new Object();
            obj.f33359a = uVar3;
            obj.f33360b = s7;
            obj.f33361c = -1L;
            obj.f33362d = -1L;
            this.f33364o = obj;
            return true;
        }
        if (b10 != -1) {
            return true;
        }
        c cVar = this.f33364o;
        if (cVar != null) {
            cVar.f33361c = j10;
            eVar.f36362c = cVar;
        }
        ((v) eVar.f36361b).getClass();
        return false;
    }

    @Override // r6.j
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f33363n = null;
            this.f33364o = null;
        }
    }
}
