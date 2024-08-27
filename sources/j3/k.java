package j3;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f20928a = new boolean[3];

    public static void a(e eVar, c3.d dVar, d dVar2) {
        dVar2.f20879q = -1;
        dVar2.f20881r = -1;
        int i10 = eVar.f20882r0[0];
        int[] iArr = dVar2.f20882r0;
        if (i10 != 2 && iArr[0] == 4) {
            c cVar = dVar2.K;
            int i11 = cVar.f20845g;
            int s7 = eVar.s();
            c cVar2 = dVar2.M;
            int i12 = s7 - cVar2.f20845g;
            cVar.f20847i = dVar.k(cVar);
            cVar2.f20847i = dVar.k(cVar2);
            dVar.d(cVar.f20847i, i11);
            dVar.d(cVar2.f20847i, i12);
            dVar2.f20879q = 2;
            dVar2.f20849a0 = i11;
            int i13 = i12 - i11;
            dVar2.W = i13;
            int i14 = dVar2.f20855d0;
            if (i13 < i14) {
                dVar2.W = i14;
            }
        }
        if (eVar.f20882r0[1] != 2 && iArr[1] == 4) {
            c cVar3 = dVar2.L;
            int i15 = cVar3.f20845g;
            int m10 = eVar.m();
            c cVar4 = dVar2.N;
            int i16 = m10 - cVar4.f20845g;
            cVar3.f20847i = dVar.k(cVar3);
            cVar4.f20847i = dVar.k(cVar4);
            dVar.d(cVar3.f20847i, i15);
            dVar.d(cVar4.f20847i, i16);
            if (dVar2.f20853c0 > 0 || dVar2.f20865i0 == 8) {
                c cVar5 = dVar2.O;
                c3.g k10 = dVar.k(cVar5);
                cVar5.f20847i = k10;
                dVar.d(k10, dVar2.f20853c0 + i15);
            }
            dVar2.f20881r = 2;
            dVar2.f20851b0 = i15;
            int i17 = i16 - i15;
            dVar2.X = i17;
            int i18 = dVar2.f20857e0;
            if (i17 < i18) {
                dVar2.X = i18;
            }
        }
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
