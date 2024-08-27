package h3;

import g3.k;
import j3.j;
import j3.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class f extends g3.g {
    public i3.a n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f17933o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f17934p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f17935q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f17936r0;

    /* renamed from: s0, reason: collision with root package name */
    public float f17937s0;

    /* renamed from: t0, reason: collision with root package name */
    public String f17938t0;

    /* renamed from: u0, reason: collision with root package name */
    public String f17939u0;

    /* renamed from: v0, reason: collision with root package name */
    public String f17940v0;

    /* renamed from: w0, reason: collision with root package name */
    public String f17941w0;

    /* renamed from: x0, reason: collision with root package name */
    public int[] f17942x0;

    public f(k kVar, int i10) {
        super(kVar, i10);
        if (i10 == 10) {
            this.f17934p0 = 1;
        } else if (i10 == 11) {
            this.f17935q0 = 1;
        }
    }

    @Override // g3.g, g3.b, g3.h
    public final void a() {
        t();
        i3.a aVar = this.n0;
        int i10 = this.f17933o0;
        aVar.getClass();
        if ((i10 == 0 || i10 == 1) && aVar.S0 != i10) {
            aVar.S0 = i10;
        }
        int i11 = this.f17934p0;
        if (i11 != 0) {
            i3.a aVar2 = this.n0;
            if (i11 > 50) {
                aVar2.getClass();
            } else if (aVar2.J0 != i11) {
                aVar2.J0 = i11;
                aVar2.k0();
                aVar2.g0();
            }
        }
        int i12 = this.f17935q0;
        if (i12 != 0) {
            i3.a aVar3 = this.n0;
            if (i12 > 50) {
                aVar3.getClass();
            } else if (aVar3.L0 != i12) {
                aVar3.L0 = i12;
                aVar3.k0();
                aVar3.g0();
            }
        }
        float f10 = this.f17936r0;
        if (f10 != s0.g.f34069a) {
            i3.a aVar4 = this.n0;
            if (f10 < s0.g.f34069a) {
                aVar4.getClass();
            } else if (aVar4.M0 != f10) {
                aVar4.M0 = f10;
            }
        }
        float f11 = this.f17937s0;
        if (f11 != s0.g.f34069a) {
            i3.a aVar5 = this.n0;
            if (f11 < s0.g.f34069a) {
                aVar5.getClass();
            } else if (aVar5.N0 != f11) {
                aVar5.N0 = f11;
            }
        }
        String str = this.f17938t0;
        if (str != null && !str.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            i3.a aVar6 = this.n0;
            String str2 = this.f17938t0;
            String str3 = aVar6.O0;
            if (str3 == null || !str3.equals(str2)) {
                aVar6.O0 = str2;
            }
        }
        String str4 = this.f17939u0;
        if (str4 != null && !str4.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            i3.a aVar7 = this.n0;
            String str5 = this.f17939u0;
            String str6 = aVar7.P0;
            if (str6 == null || !str6.equals(str5)) {
                aVar7.P0 = str5;
            }
        }
        String str7 = this.f17940v0;
        if (str7 != null && !str7.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            i3.a aVar8 = this.n0;
            String str8 = this.f17940v0;
            String str9 = aVar8.Q0;
            if (str9 == null || !str9.equals(str8.toString())) {
                aVar8.H0 = false;
                aVar8.Q0 = str8.toString();
            }
        }
        String str10 = this.f17941w0;
        if (str10 != null && !str10.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            i3.a aVar9 = this.n0;
            String str11 = this.f17941w0;
            String str12 = aVar9.R0;
            if (str12 == null || !str12.equals(str11)) {
                aVar9.H0 = false;
                aVar9.R0 = str11;
            }
        }
        int[] iArr = this.f17942x0;
        if (iArr != null && iArr.length > 0) {
            this.n0.X0 = iArr;
        }
        s();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j3.j, j3.l, i3.a] */
    @Override // g3.g
    public final j t() {
        boolean z10;
        int[][] i02;
        int[][] i03;
        boolean[][] zArr;
        if (this.n0 == null) {
            ?? lVar = new l();
            lVar.H0 = false;
            lVar.T0 = 0;
            lVar.V0 = new HashSet();
            lVar.Z0 = 0;
            lVar.f19332a1 = false;
            lVar.f19333b1 = false;
            lVar.k0();
            int[][] iArr = lVar.W0;
            if (iArr != null && iArr.length == lVar.f20927t0 && (zArr = lVar.U0) != null && zArr.length == lVar.I0 && zArr[0].length == lVar.K0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                lVar.g0();
            }
            if (z10) {
                for (int i10 = 0; i10 < lVar.U0.length; i10++) {
                    int i11 = 0;
                    while (true) {
                        boolean[][] zArr2 = lVar.U0;
                        if (i11 < zArr2[0].length) {
                            zArr2[i10][i11] = true;
                            i11++;
                        }
                    }
                }
                for (int i12 = 0; i12 < lVar.W0.length; i12++) {
                    int i13 = 0;
                    while (true) {
                        int[][] iArr2 = lVar.W0;
                        if (i13 < iArr2[0].length) {
                            iArr2[i12][i13] = -1;
                            i13++;
                        }
                    }
                }
            }
            lVar.T0 = 0;
            String str = lVar.R0;
            if (str != null && !str.trim().isEmpty() && (i03 = lVar.i0(lVar.R0, false)) != null) {
                lVar.e0(i03);
            }
            String str2 = lVar.Q0;
            if (str2 != null && !str2.trim().isEmpty() && (i02 = lVar.i0(lVar.Q0, true)) != null) {
                lVar.f0(i02);
            }
            this.n0 = lVar;
        }
        return this.n0;
    }

    public final void u(String str) {
        if (str.length() == 0) {
            return;
        }
        String[] split = str.split("\\|");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (String str2 : split) {
            String lowerCase = str2.toLowerCase();
            lowerCase.getClass();
            if (!lowerCase.equals("subgridbycolrow")) {
                if (lowerCase.equals("spansrespectwidgetorder")) {
                    arrayList.add(1);
                }
            } else {
                arrayList.add(0);
            }
        }
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iArr[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        this.f17942x0 = iArr;
    }
}
