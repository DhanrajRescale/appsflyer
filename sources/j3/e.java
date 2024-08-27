package j3;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import k3.q;

/* loaded from: classes.dex */
public final class e extends m {
    public int A0;
    public int B0;
    public int C0;
    public b[] D0;
    public b[] E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public WeakReference I0;
    public WeakReference J0;
    public WeakReference K0;
    public WeakReference L0;
    public HashSet M0;
    public k3.b N0;

    /* renamed from: t0, reason: collision with root package name */
    public h.c f20891t0;

    /* renamed from: u0, reason: collision with root package name */
    public k3.f f20892u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f20893v0;

    /* renamed from: w0, reason: collision with root package name */
    public k3.c f20894w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f20895x0;

    /* renamed from: y0, reason: collision with root package name */
    public c3.d f20896y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f20897z0;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, k3.b] */
    public e() {
        this.f20935s0 = new ArrayList();
        this.f20891t0 = new h.c(this);
        this.f20892u0 = new k3.f(this);
        this.f20894w0 = null;
        this.f20895x0 = false;
        this.f20896y0 = new c3.d();
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = new b[4];
        this.E0 = new b[4];
        this.F0 = 257;
        this.G0 = false;
        this.H0 = false;
        this.I0 = null;
        this.J0 = null;
        this.K0 = null;
        this.L0 = null;
        this.M0 = new HashSet();
        this.N0 = new Object();
    }

    public static void c0(d dVar, k3.c cVar, k3.b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        if (cVar == null) {
            return;
        }
        if (dVar.f20865i0 != 8 && !(dVar instanceof h) && !(dVar instanceof a)) {
            int[] iArr = dVar.f20882r0;
            bVar.f21978a = iArr[0];
            bVar.f21979b = iArr[1];
            bVar.f21980c = dVar.s();
            bVar.f21981d = dVar.m();
            bVar.f21986i = false;
            bVar.f21987j = 0;
            if (bVar.f21978a == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bVar.f21979b == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && dVar.Y > s0.g.f34069a) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 && dVar.Y > s0.g.f34069a) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z10 && dVar.v(0) && dVar.f20884t == 0 && !z12) {
                bVar.f21978a = 2;
                if (z11 && dVar.f20885u == 0) {
                    bVar.f21978a = 1;
                }
                z10 = false;
            }
            if (z11 && dVar.v(1) && dVar.f20885u == 0 && !z13) {
                bVar.f21979b = 2;
                if (z10 && dVar.f20884t == 0) {
                    bVar.f21979b = 1;
                }
                z11 = false;
            }
            if (dVar.C()) {
                bVar.f21978a = 1;
                z10 = false;
            }
            if (dVar.D()) {
                bVar.f21979b = 1;
                z11 = false;
            }
            int[] iArr2 = dVar.f20886v;
            if (z12) {
                if (iArr2[0] == 4) {
                    bVar.f21978a = 1;
                } else if (!z11) {
                    if (bVar.f21979b == 1) {
                        i11 = bVar.f21981d;
                    } else {
                        bVar.f21978a = 2;
                        cVar.b(dVar, bVar);
                        i11 = bVar.f21983f;
                    }
                    bVar.f21978a = 1;
                    bVar.f21980c = (int) (dVar.Y * i11);
                }
            }
            if (z13) {
                if (iArr2[1] == 4) {
                    bVar.f21979b = 1;
                } else if (!z10) {
                    if (bVar.f21978a == 1) {
                        i10 = bVar.f21980c;
                    } else {
                        bVar.f21979b = 2;
                        cVar.b(dVar, bVar);
                        i10 = bVar.f21982e;
                    }
                    bVar.f21979b = 1;
                    if (dVar.Z == -1) {
                        bVar.f21981d = (int) (i10 / dVar.Y);
                    } else {
                        bVar.f21981d = (int) (dVar.Y * i10);
                    }
                }
            }
            cVar.b(dVar, bVar);
            dVar.T(bVar.f21982e);
            dVar.O(bVar.f21983f);
            dVar.G = bVar.f21985h;
            dVar.K(bVar.f21984g);
            bVar.f21987j = 0;
            return;
        }
        bVar.f21982e = 0;
        bVar.f21983f = 0;
    }

    @Override // j3.m, j3.d
    public final void E() {
        this.f20896y0.t();
        this.f20897z0 = 0;
        this.A0 = 0;
        super.E();
    }

    @Override // j3.d
    public final void U(boolean z10, boolean z11) {
        super.U(z10, z11);
        int size = this.f20935s0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.f20935s0.get(i10)).U(z10, z11);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:227|228|229|(1:231)|232|233|234|235|(3:354|355|(30:357|358|359|360|361|362|363|238|239|(1:243)|244|(6:248|249|250|251|252|253)|327|(1:351)(9:331|332|333|334|335|336|337|338|339)|340|314|315|(3:317|(2:323|324)(1:321)|322)|325|326|266|(1:313)(6:271|(1:273)|274|275|(1:279)|(1:283))|284|(1:286)(1:312)|287|(1:289)(1:311)|(1:310)(4:291|(1:296)|297|(3:302|(2:304|305)(2:307|308)|306))|309|(0)(0)|306))|237|238|239|(2:241|243)|244|(7:246|248|249|250|251|252|253)|327|(1:329)|351|340|314|315|(0)|325|326|266|(0)|313|284|(0)(0)|287|(0)(0)|(0)(0)|309|(0)(0)|306) */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x079a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0678 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0816 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x060e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:626:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0638  */
    /* JADX WARN: Type inference failed for: r5v54, types: [java.lang.Object, k3.b] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X() {
        /*
            Method dump skipped, instructions count: 2316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.e.X():void");
    }

    public final void Y(int i10, d dVar) {
        if (i10 == 0) {
            int i11 = this.B0 + 1;
            b[] bVarArr = this.E0;
            if (i11 >= bVarArr.length) {
                this.E0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.E0;
            int i12 = this.B0;
            bVarArr2[i12] = new b(dVar, 0, this.f20895x0);
            this.B0 = i12 + 1;
            return;
        }
        if (i10 == 1) {
            int i13 = this.C0 + 1;
            b[] bVarArr3 = this.D0;
            if (i13 >= bVarArr3.length) {
                this.D0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.D0;
            int i14 = this.C0;
            bVarArr4[i14] = new b(dVar, 1, this.f20895x0);
            this.C0 = i14 + 1;
        }
    }

    public final void Z(c3.d dVar) {
        int i10;
        boolean d02 = d0(64);
        d(dVar, d02);
        int size = this.f20935s0.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar2 = (d) this.f20935s0.get(i11);
            boolean[] zArr = dVar2.U;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar2 instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                d dVar3 = (d) this.f20935s0.get(i12);
                if (dVar3 instanceof a) {
                    a aVar = (a) dVar3;
                    for (int i13 = 0; i13 < aVar.f20927t0; i13++) {
                        d dVar4 = aVar.f20926s0[i13];
                        if (aVar.f20819v0 || dVar4.e()) {
                            int i14 = aVar.f20818u0;
                            if (i14 != 0 && i14 != 1) {
                                if (i14 == 2 || i14 == 3) {
                                    dVar4.U[1] = true;
                                }
                            } else {
                                dVar4.U[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.M0;
        hashSet.clear();
        for (int i15 = 0; i15 < size; i15++) {
            d dVar5 = (d) this.f20935s0.get(i15);
            dVar5.getClass();
            boolean z11 = dVar5 instanceof l;
            if (z11 || (dVar5 instanceof h)) {
                if (z11) {
                    hashSet.add(dVar5);
                } else {
                    dVar5.d(dVar, d02);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = (l) ((d) it.next());
                for (int i16 = 0; i16 < lVar.f20927t0; i16++) {
                    if (hashSet.contains(lVar.f20926s0[i16])) {
                        lVar.d(dVar, d02);
                        hashSet.remove(lVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).d(dVar, d02);
                }
                hashSet.clear();
            }
        }
        if (c3.d.f7904q) {
            HashSet hashSet2 = new HashSet();
            for (int i17 = 0; i17 < size; i17++) {
                d dVar6 = (d) this.f20935s0.get(i17);
                dVar6.getClass();
                if (!(dVar6 instanceof l) && !(dVar6 instanceof h)) {
                    hashSet2.add(dVar6);
                }
            }
            if (this.f20882r0[0] == 2) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            c(this, dVar, hashSet2, i10, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar7 = (d) it3.next();
                k.a(this, dVar, dVar7);
                dVar7.d(dVar, d02);
            }
        } else {
            for (int i18 = 0; i18 < size; i18++) {
                d dVar8 = (d) this.f20935s0.get(i18);
                if (dVar8 instanceof e) {
                    int[] iArr = dVar8.f20882r0;
                    int i19 = iArr[0];
                    int i20 = iArr[1];
                    if (i19 == 2) {
                        dVar8.P(1);
                    }
                    if (i20 == 2) {
                        dVar8.R(1);
                    }
                    dVar8.d(dVar, d02);
                    if (i19 == 2) {
                        dVar8.P(i19);
                    }
                    if (i20 == 2) {
                        dVar8.R(i20);
                    }
                } else {
                    k.a(this, dVar, dVar8);
                    if (!(dVar8 instanceof l) && !(dVar8 instanceof h)) {
                        dVar8.d(dVar, d02);
                    }
                }
            }
        }
        if (this.B0 > 0) {
            hl.f.s(this, dVar, null, 0);
        }
        if (this.C0 > 0) {
            hl.f.s(this, dVar, null, 1);
        }
    }

    public final boolean a0(int i10, boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        k3.f fVar = this.f20892u0;
        e eVar = (e) fVar.f21992c;
        int l10 = eVar.l(0);
        int l11 = eVar.l(1);
        int t10 = eVar.t();
        int u10 = eVar.u();
        Object obj = fVar.f21994e;
        if (z13 && (l10 == 2 || l11 == 2)) {
            Iterator it = ((ArrayList) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                q qVar = (q) it.next();
                if (qVar.f22034f == i10 && !qVar.k()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && l10 == 2) {
                    eVar.P(1);
                    eVar.T(fVar.e(eVar, 0));
                    eVar.f20854d.f22033e.d(eVar.s());
                }
            } else if (z13 && l11 == 2) {
                eVar.R(1);
                eVar.O(fVar.e(eVar, 1));
                eVar.f20856e.f22033e.d(eVar.m());
            }
        }
        if (i10 == 0) {
            int i11 = eVar.f20882r0[0];
            if (i11 == 1 || i11 == 4) {
                int s7 = eVar.s() + t10;
                eVar.f20854d.f22037i.d(s7);
                eVar.f20854d.f22033e.d(s7 - t10);
                z11 = true;
            }
            z11 = false;
        } else {
            int i12 = eVar.f20882r0[1];
            if (i12 == 1 || i12 == 4) {
                int m10 = eVar.m() + u10;
                eVar.f20856e.f22037i.d(m10);
                eVar.f20856e.f22033e.d(m10 - u10);
                z11 = true;
            }
            z11 = false;
        }
        fVar.i();
        ArrayList arrayList = (ArrayList) obj;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            q qVar2 = (q) it2.next();
            if (qVar2.f22034f == i10 && (qVar2.f22030b != eVar || qVar2.f22035g)) {
                qVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            q qVar3 = (q) it3.next();
            if (qVar3.f22034f == i10 && (z11 || qVar3.f22030b != eVar)) {
                if (!qVar3.f22036h.f22008j || !qVar3.f22037i.f22008j || (!(qVar3 instanceof k3.d) && !qVar3.f22033e.f22008j)) {
                    z12 = false;
                    break;
                }
            }
        }
        eVar.P(l10);
        eVar.R(l11);
        return z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b0(int r25, int r26, int r27, int r28, int r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 1421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.e.b0(int, int, int, int, int, int, int):void");
    }

    public final boolean d0(int i10) {
        return (this.F0 & i10) == i10;
    }

    @Override // j3.d
    public final void p(StringBuilder sb2) {
        sb2.append(this.f20870l + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.W);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.X);
        sb2.append("\n");
        Iterator it = this.f20935s0.iterator();
        while (it.hasNext()) {
            ((d) it.next()).p(sb2);
            sb2.append(",\n");
        }
        sb2.append(UrlTreeKt.componentParamSuffix);
    }
}
