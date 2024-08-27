package r5;

import b5.j1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class f0 implements u, t {

    /* renamed from: a, reason: collision with root package name */
    public final u[] f33152a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentityHashMap f33153b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.p f33154c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f33155d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f33156e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public t f33157f;

    /* renamed from: g, reason: collision with root package name */
    public e1 f33158g;

    /* renamed from: h, reason: collision with root package name */
    public u[] f33159h;

    /* renamed from: i, reason: collision with root package name */
    public e.l f33160i;

    public f0(mt.p pVar, long[] jArr, u... uVarArr) {
        this.f33154c = pVar;
        this.f33152a = uVarArr;
        pVar.getClass();
        this.f33160i = new e.l(new x0[0], 18);
        this.f33153b = new IdentityHashMap();
        this.f33159h = new u[0];
        for (int i10 = 0; i10 < uVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f33152a[i10] = new d0(uVarArr[i10], j10);
            }
        }
    }

    @Override // r5.u
    public final void A(t tVar, long j10) {
        this.f33157f = tVar;
        ArrayList arrayList = this.f33155d;
        u[] uVarArr = this.f33152a;
        Collections.addAll(arrayList, uVarArr);
        for (u uVar : uVarArr) {
            uVar.A(this, j10);
        }
    }

    @Override // r5.u
    public final e1 D() {
        e1 e1Var = this.f33158g;
        e1Var.getClass();
        return e1Var;
    }

    @Override // r5.x0
    public final long G() {
        return this.f33160i.G();
    }

    @Override // r5.x0
    public final void J(long j10) {
        this.f33160i.J(j10);
    }

    @Override // r5.t
    public final void a(u uVar) {
        ArrayList arrayList = this.f33155d;
        arrayList.remove(uVar);
        if (!arrayList.isEmpty()) {
            return;
        }
        u[] uVarArr = this.f33152a;
        int i10 = 0;
        for (u uVar2 : uVarArr) {
            i10 += uVar2.D().f33147a;
        }
        j1[] j1VarArr = new j1[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < uVarArr.length; i12++) {
            e1 D = uVarArr[i12].D();
            int i13 = D.f33147a;
            int i14 = 0;
            while (i14 < i13) {
                j1 a10 = D.a(i14);
                j1 j1Var = new j1(i12 + ":" + a10.f3377b, a10.f3379d);
                this.f33156e.put(j1Var, a10);
                j1VarArr[i11] = j1Var;
                i14++;
                i11++;
            }
        }
        this.f33158g = new e1(j1VarArr);
        t tVar = this.f33157f;
        tVar.getClass();
        tVar.a(this);
    }

    @Override // r5.w0
    public final void b(x0 x0Var) {
        t tVar = this.f33157f;
        tVar.getClass();
        tVar.b(this);
    }

    @Override // r5.u
    public final long g(long j10, i5.j1 j1Var) {
        u uVar;
        u[] uVarArr = this.f33159h;
        if (uVarArr.length > 0) {
            uVar = uVarArr[0];
        } else {
            uVar = this.f33152a[0];
        }
        return uVar.g(j10, j1Var);
    }

    @Override // r5.x0
    public final long i() {
        return this.f33160i.i();
    }

    @Override // r5.u
    public final long o(u5.s[] sVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        v0 v0Var;
        ArrayList arrayList;
        Integer num;
        int intValue;
        int[] iArr = new int[sVarArr.length];
        int[] iArr2 = new int[sVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = sVarArr.length;
            identityHashMap = this.f33153b;
            if (i11 >= length) {
                break;
            }
            v0 v0Var2 = v0VarArr[i11];
            if (v0Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(v0Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i11] = intValue;
            u5.s sVar = sVarArr[i11];
            if (sVar != null) {
                String str = sVar.c().f3377b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = sVarArr.length;
        v0[] v0VarArr2 = new v0[length2];
        v0[] v0VarArr3 = new v0[sVarArr.length];
        u5.s[] sVarArr2 = new u5.s[sVarArr.length];
        u[] uVarArr = this.f33152a;
        ArrayList arrayList2 = new ArrayList(uVarArr.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < uVarArr.length) {
            int i13 = i10;
            while (i13 < sVarArr.length) {
                if (iArr[i13] == i12) {
                    v0Var = v0VarArr[i13];
                } else {
                    v0Var = null;
                }
                v0VarArr3[i13] = v0Var;
                if (iArr2[i13] == i12) {
                    u5.s sVar2 = sVarArr[i13];
                    sVar2.getClass();
                    arrayList = arrayList2;
                    j1 j1Var = (j1) this.f33156e.get(sVar2.c());
                    j1Var.getClass();
                    sVarArr2[i13] = new c0(sVar2, j1Var);
                } else {
                    arrayList = arrayList2;
                    sVarArr2[i13] = null;
                }
                i13++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i14 = i12;
            u[] uVarArr2 = uVarArr;
            u5.s[] sVarArr3 = sVarArr2;
            long o10 = uVarArr[i12].o(sVarArr2, zArr, v0VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = o10;
            } else if (o10 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < sVarArr.length; i15++) {
                boolean z11 = true;
                if (iArr2[i15] == i14) {
                    v0 v0Var3 = v0VarArr3[i15];
                    v0Var3.getClass();
                    v0VarArr2[i15] = v0VarArr3[i15];
                    identityHashMap.put(v0Var3, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    if (v0VarArr3[i15] != null) {
                        z11 = false;
                    }
                    yk.j.H0(z11);
                }
            }
            if (z10) {
                arrayList3.add(uVarArr2[i14]);
            }
            i12 = i14 + 1;
            arrayList2 = arrayList3;
            uVarArr = uVarArr2;
            sVarArr2 = sVarArr3;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(v0VarArr2, i16, v0VarArr, i16, length2);
        u[] uVarArr3 = (u[]) arrayList2.toArray(new u[i16]);
        this.f33159h = uVarArr3;
        this.f33154c.getClass();
        this.f33160i = new e.l(uVarArr3, 18);
        return j11;
    }

    @Override // r5.u
    public final void p() {
        for (u uVar : this.f33152a) {
            uVar.p();
        }
    }

    @Override // r5.u
    public final long q(long j10) {
        long q10 = this.f33159h[0].q(j10);
        int i10 = 1;
        while (true) {
            u[] uVarArr = this.f33159h;
            if (i10 < uVarArr.length) {
                if (uVarArr[i10].q(q10) == q10) {
                    i10++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return q10;
            }
        }
    }

    @Override // r5.u
    public final void r(long j10) {
        for (u uVar : this.f33159h) {
            uVar.r(j10);
        }
    }

    @Override // r5.x0
    public final boolean s(long j10) {
        ArrayList arrayList = this.f33155d;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((u) arrayList.get(i10)).s(j10);
            }
            return false;
        }
        return this.f33160i.s(j10);
    }

    @Override // r5.x0
    public final boolean u() {
        return this.f33160i.u();
    }

    @Override // r5.u
    public final long w() {
        long j10 = -9223372036854775807L;
        for (u uVar : this.f33159h) {
            long w10 = uVar.w();
            if (w10 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (u uVar2 : this.f33159h) {
                        if (uVar2 == uVar) {
                            break;
                        }
                        if (uVar2.q(w10) != w10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = w10;
                } else if (w10 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && uVar.q(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }
}
