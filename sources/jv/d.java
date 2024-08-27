package jv;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e[] f21680a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21681b;

    public d(ArrayList arrayList, boolean z10) {
        this((e[]) arrayList.toArray(new e[arrayList.size()]), z10);
    }

    @Override // jv.e
    public final boolean a(e5.o oVar, StringBuilder sb2) {
        int length = sb2.length();
        boolean z10 = this.f21681b;
        if (z10) {
            oVar.f15029b++;
        }
        try {
            for (e eVar : this.f21680a) {
                if (!eVar.a(oVar, sb2)) {
                    sb2.setLength(length);
                    return true;
                }
            }
            if (z10) {
                oVar.f15029b--;
            }
            return true;
        } finally {
            if (z10) {
                oVar.f15029b--;
            }
        }
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        e[] eVarArr = this.f21680a;
        if (eVarArr != null) {
            boolean z10 = this.f21681b;
            if (z10) {
                str = "[";
            } else {
                str = "(";
            }
            sb2.append(str);
            for (e eVar : eVarArr) {
                sb2.append(eVar);
            }
            if (z10) {
                str2 = "]";
            } else {
                str2 = ")";
            }
            sb2.append(str2);
        }
        return sb2.toString();
    }

    public d(e[] eVarArr, boolean z10) {
        this.f21680a = eVarArr;
        this.f21681b = z10;
    }
}
