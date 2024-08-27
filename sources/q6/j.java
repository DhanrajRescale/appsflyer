package q6;

import e5.x;
import z5.b0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f31687a;

    /* renamed from: d, reason: collision with root package name */
    public t f31690d;

    /* renamed from: e, reason: collision with root package name */
    public g f31691e;

    /* renamed from: f, reason: collision with root package name */
    public int f31692f;

    /* renamed from: g, reason: collision with root package name */
    public int f31693g;

    /* renamed from: h, reason: collision with root package name */
    public int f31694h;

    /* renamed from: i, reason: collision with root package name */
    public int f31695i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f31698l;

    /* renamed from: b, reason: collision with root package name */
    public final s f31688b = new s();

    /* renamed from: c, reason: collision with root package name */
    public final e5.p f31689c = new e5.p();

    /* renamed from: j, reason: collision with root package name */
    public final e5.p f31696j = new e5.p(1);

    /* renamed from: k, reason: collision with root package name */
    public final e5.p f31697k = new e5.p();

    public j(b0 b0Var, t tVar, g gVar) {
        this.f31687a = b0Var;
        this.f31690d = tVar;
        this.f31691e = gVar;
        this.f31690d = tVar;
        this.f31691e = gVar;
        b0Var.e(tVar.f31797a.f31769f);
        d();
    }

    public final r a() {
        if (!this.f31698l) {
            return null;
        }
        s sVar = this.f31688b;
        g gVar = sVar.f31780a;
        int i10 = x.f15050a;
        int i11 = gVar.f31679a;
        r rVar = sVar.f31792m;
        if (rVar == null) {
            r[] rVarArr = this.f31690d.f31797a.f31774k;
            if (rVarArr == null) {
                rVar = null;
            } else {
                rVar = rVarArr[i11];
            }
        }
        if (rVar == null || !rVar.f31775a) {
            return null;
        }
        return rVar;
    }

    public final boolean b() {
        this.f31692f++;
        if (!this.f31698l) {
            return false;
        }
        int i10 = this.f31693g + 1;
        this.f31693g = i10;
        int[] iArr = this.f31688b.f31786g;
        int i11 = this.f31694h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.f31694h = i11 + 1;
        this.f31693g = 0;
        return false;
    }

    public final int c(int i10, int i11) {
        e5.p pVar;
        boolean z10;
        boolean z11;
        int i12;
        r a10 = a();
        if (a10 == null) {
            return 0;
        }
        s sVar = this.f31688b;
        int i13 = a10.f31778d;
        if (i13 != 0) {
            pVar = sVar.f31793n;
        } else {
            int i14 = x.f15050a;
            byte[] bArr = a10.f31779e;
            int length = bArr.length;
            e5.p pVar2 = this.f31697k;
            pVar2.D(length, bArr);
            i13 = bArr.length;
            pVar = pVar2;
        }
        int i15 = this.f31692f;
        if (sVar.f31790k && sVar.f31791l[i15]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        e5.p pVar3 = this.f31696j;
        byte[] bArr2 = pVar3.f15036a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        pVar3.F(0);
        b0 b0Var = this.f31687a;
        b0Var.c(1, pVar3);
        b0Var.c(i13, pVar);
        if (!z11) {
            return i13 + 1;
        }
        e5.p pVar4 = this.f31689c;
        if (!z10) {
            pVar4.C(8);
            byte[] bArr3 = pVar4.f15036a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) ((i11 >> 8) & 255);
            bArr3[3] = (byte) (i11 & 255);
            bArr3[4] = (byte) ((i10 >> 24) & 255);
            bArr3[5] = (byte) ((i10 >> 16) & 255);
            bArr3[6] = (byte) ((i10 >> 8) & 255);
            bArr3[7] = (byte) (i10 & 255);
            b0Var.c(8, pVar4);
            return i13 + 9;
        }
        e5.p pVar5 = sVar.f31793n;
        int z12 = pVar5.z();
        pVar5.G(-2);
        int i16 = (z12 * 6) + 2;
        if (i11 != 0) {
            pVar4.C(i16);
            byte[] bArr4 = pVar4.f15036a;
            pVar5.e(bArr4, 0, i16);
            int i17 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i11;
            bArr4[2] = (byte) ((i17 >> 8) & 255);
            bArr4[3] = (byte) (i17 & 255);
        } else {
            pVar4 = pVar5;
        }
        b0Var.c(i16, pVar4);
        return i13 + 1 + i16;
    }

    public final void d() {
        s sVar = this.f31688b;
        sVar.f31783d = 0;
        sVar.f31795p = 0L;
        sVar.f31796q = false;
        sVar.f31790k = false;
        sVar.f31794o = false;
        sVar.f31792m = null;
        this.f31692f = 0;
        this.f31694h = 0;
        this.f31693g = 0;
        this.f31695i = 0;
        this.f31698l = false;
    }
}
