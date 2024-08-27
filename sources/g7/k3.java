package g7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k3 extends kp.j {

    /* renamed from: e, reason: collision with root package name */
    public final a4 f16874e;

    /* renamed from: f, reason: collision with root package name */
    public final a4 f16875f;

    public k3(z2 newList, z2 previousList) {
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(previousList, "previousList");
        this.f16874e = newList;
        this.f16875f = previousList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k3) {
            a4 a4Var = this.f16874e;
            int i10 = ((z2) a4Var).f17163c;
            k3 k3Var = (k3) obj;
            a4 a4Var2 = k3Var.f16874e;
            if (i10 == ((z2) a4Var2).f17163c && ((z2) a4Var).f17164d == ((z2) a4Var2).f17164d && ((z2) a4Var).e() == ((z2) k3Var.f16874e).e() && ((z2) a4Var).f17162b == ((z2) k3Var.f16874e).f17162b) {
                a4 a4Var3 = this.f16875f;
                int i11 = ((z2) a4Var3).f17163c;
                a4 a4Var4 = k3Var.f16875f;
                if (i11 == ((z2) a4Var4).f17163c && ((z2) a4Var3).f17164d == ((z2) a4Var4).f17164d && ((z2) a4Var3).e() == ((z2) k3Var.f16875f).e() && ((z2) a4Var3).f17162b == ((z2) k3Var.f16875f).f17162b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16875f.hashCode() + this.f16874e.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: ");
        z2 z2Var = (z2) this.f16874e;
        sb2.append(z2Var.f17163c);
        sb2.append("\n                    |       placeholdersAfter: ");
        sb2.append(z2Var.f17164d);
        sb2.append("\n                    |       size: ");
        sb2.append(z2Var.e());
        sb2.append("\n                    |       dataCount: ");
        sb2.append(z2Var.f17162b);
        sb2.append("\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: ");
        z2 z2Var2 = (z2) this.f16875f;
        sb2.append(z2Var2.f17163c);
        sb2.append("\n                    |       placeholdersAfter: ");
        sb2.append(z2Var2.f17164d);
        sb2.append("\n                    |       size: ");
        sb2.append(z2Var2.e());
        sb2.append("\n                    |       dataCount: ");
        sb2.append(z2Var2.f17162b);
        sb2.append("\n                    |   )\n                    |");
        return kotlin.text.l.c(sb2.toString());
    }
}
