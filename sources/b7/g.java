package b7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lp.o0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f3854a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final List f3855b;

    public g(o0 o0Var) {
        this.f3855b = o0Var;
    }

    public final List a(e5.o oVar) {
        boolean z10;
        String str;
        int i10;
        List list;
        byte[] bArr;
        boolean b10 = b(32);
        List list2 = this.f3855b;
        if (b10) {
            return list2;
        }
        e5.p pVar = new e5.p((byte[]) oVar.f15032e);
        while (pVar.a() > 0) {
            int u10 = pVar.u();
            int u11 = pVar.f15037b + pVar.u();
            if (u10 == 134) {
                ArrayList arrayList = new ArrayList();
                int u12 = pVar.u() & 31;
                for (int i11 = 0; i11 < u12; i11++) {
                    String s7 = pVar.s(3, kp.e.f23433c);
                    int u13 = pVar.u();
                    if ((u13 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = u13 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte u14 = (byte) pVar.u();
                    pVar.G(1);
                    if (z10) {
                        if ((u14 & 64) != 0) {
                            bArr = new byte[]{1};
                        } else {
                            bArr = new byte[]{0};
                        }
                        list = Collections.singletonList(bArr);
                    } else {
                        list = null;
                    }
                    b5.u uVar = new b5.u();
                    uVar.f3600k = str;
                    uVar.f3592c = s7;
                    uVar.C = i10;
                    uVar.f3602m = list;
                    arrayList.add(new b5.v(uVar));
                }
                list2 = arrayList;
            }
            pVar.F(u11);
        }
        return list2;
    }

    public final boolean b(int i10) {
        return (i10 & this.f3854a) != 0;
    }
}
