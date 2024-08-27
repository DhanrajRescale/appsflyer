package j3;

import java.util.ArrayList;
import java.util.Arrays;
import k3.p;

/* loaded from: classes.dex */
public abstract class j extends d implements i {

    /* renamed from: s0, reason: collision with root package name */
    public d[] f20926s0 = new d[4];

    /* renamed from: t0, reason: collision with root package name */
    public int f20927t0 = 0;

    public final void W(d dVar) {
        if (dVar != this && dVar != null) {
            int i10 = this.f20927t0 + 1;
            d[] dVarArr = this.f20926s0;
            if (i10 > dVarArr.length) {
                this.f20926s0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
            }
            d[] dVarArr2 = this.f20926s0;
            int i11 = this.f20927t0;
            dVarArr2[i11] = dVar;
            this.f20927t0 = i11 + 1;
        }
    }

    public final void X(int i10, p pVar, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f20927t0; i11++) {
            d dVar = this.f20926s0[i11];
            ArrayList arrayList2 = pVar.f22024a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i12 = 0; i12 < this.f20927t0; i12++) {
            yk.j.U0(this.f20926s0[i12], i10, arrayList, pVar);
        }
    }

    @Override // j3.i
    public void a() {
    }
}
