package g7;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g1 extends j1 {

    /* renamed from: g, reason: collision with root package name */
    public static final g1 f16784g;

    /* renamed from: a, reason: collision with root package name */
    public final b1 f16785a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16786b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16787c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16788d;

    /* renamed from: e, reason: collision with root package name */
    public final a1 f16789e;

    /* renamed from: f, reason: collision with root package name */
    public final a1 f16790f;

    static {
        List a10 = vt.x.a(s4.f17053d);
        y0 y0Var = y0.f17134c;
        y0 y0Var2 = y0.f17133b;
        f16784g = mt.p.n(a10, 0, 0, new a1(y0Var, y0Var2, y0Var2), null);
    }

    public g1(b1 b1Var, List list, int i10, int i11, a1 a1Var, a1 a1Var2) {
        this.f16785a = b1Var;
        this.f16786b = list;
        this.f16787c = i10;
        this.f16788d = i11;
        this.f16789e = a1Var;
        this.f16790f = a1Var2;
        if (b1Var != b1.f16665c && i10 < 0) {
            throw new IllegalArgumentException(jr.h.n("Prepend insert defining placeholdersBefore must be > 0, but was ", i10).toString());
        }
        if (b1Var != b1.f16664b && i11 < 0) {
            throw new IllegalArgumentException(jr.h.n("Append insert defining placeholdersAfter must be > 0, but was ", i11).toString());
        }
        if (b1Var == b1.f16663a && !(!list.isEmpty())) {
            throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.f16785a == g1Var.f16785a && Intrinsics.a(this.f16786b, g1Var.f16786b) && this.f16787c == g1Var.f16787c && this.f16788d == g1Var.f16788d && Intrinsics.a(this.f16789e, g1Var.f16789e) && Intrinsics.a(this.f16790f, g1Var.f16790f);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f16789e.hashCode() + da.e.f(this.f16788d, da.e.f(this.f16787c, nn.d.e(this.f16786b, this.f16785a.hashCode() * 31, 31), 31), 31)) * 31;
        a1 a1Var = this.f16790f;
        if (a1Var == null) {
            hashCode = 0;
        } else {
            hashCode = a1Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        String str;
        Object obj;
        List list;
        List list2;
        List list3 = this.f16786b;
        Iterator it = list3.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((s4) it.next()).f17055b.size();
        }
        String str2 = "none";
        int i11 = this.f16787c;
        if (i11 == -1) {
            str = "none";
        } else {
            str = String.valueOf(i11);
        }
        int i12 = this.f16788d;
        if (i12 != -1) {
            str2 = String.valueOf(i12);
        }
        StringBuilder sb2 = new StringBuilder("PageEvent.Insert for ");
        sb2.append(this.f16785a);
        sb2.append(", with ");
        sb2.append(i10);
        sb2.append(" items (\n                    |   first item: ");
        s4 s4Var = (s4) vt.g0.w(list3);
        Object obj2 = null;
        if (s4Var != null && (list2 = s4Var.f17055b) != null) {
            obj = vt.g0.w(list2);
        } else {
            obj = null;
        }
        sb2.append(obj);
        sb2.append("\n                    |   last item: ");
        s4 s4Var2 = (s4) vt.g0.D(list3);
        if (s4Var2 != null && (list = s4Var2.f17055b) != null) {
            obj2 = vt.g0.D(list);
        }
        sb2.append(obj2);
        sb2.append("\n                    |   placeholdersBefore: ");
        sb2.append(str);
        sb2.append("\n                    |   placeholdersAfter: ");
        sb2.append(str2);
        sb2.append("\n                    |   sourceLoadStates: ");
        sb2.append(this.f16789e);
        sb2.append("\n                    ");
        String sb3 = sb2.toString();
        a1 a1Var = this.f16790f;
        if (a1Var != null) {
            sb3 = sb3 + "|   mediatorLoadStates: " + a1Var + '\n';
        }
        return kotlin.text.l.c(sb3 + "|)");
    }
}
