package v;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f37526b = new h0(new u0(null, null, null, false, null, 63));

    /* renamed from: a, reason: collision with root package name */
    public final u0 f37527a;

    public h0(u0 u0Var) {
        this.f37527a = u0Var;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if ((obj instanceof h0) && Intrinsics.a(((h0) obj).f37527a, this.f37527a)) {
            return true;
        }
        return false;
    }

    public final h0 b(h0 h0Var) {
        u0 u0Var = this.f37527a;
        j0 j0Var = u0Var.f37621a;
        if (j0Var == null) {
            j0Var = h0Var.f37527a.f37621a;
        }
        r0 r0Var = u0Var.f37622b;
        if (r0Var == null) {
            r0Var = h0Var.f37527a.f37622b;
        }
        t tVar = u0Var.f37623c;
        if (tVar == null) {
            tVar = h0Var.f37527a.f37623c;
        }
        h0Var.f37527a.getClass();
        Map map = h0Var.f37527a.f37625e;
        Map map2 = u0Var.f37625e;
        Intrinsics.checkNotNullParameter(map2, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        linkedHashMap.putAll(map);
        return new h0(new u0(j0Var, r0Var, tVar, false, linkedHashMap, 16));
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        String str;
        String str2;
        String str3;
        if (Intrinsics.a(this, f37526b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb2 = new StringBuilder("EnterTransition: \nFade - ");
        u0 u0Var = this.f37527a;
        j0 j0Var = u0Var.f37621a;
        if (j0Var != null) {
            str = j0Var.toString();
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(",\nSlide - ");
        r0 r0Var = u0Var.f37622b;
        if (r0Var != null) {
            str2 = r0Var.toString();
        } else {
            str2 = null;
        }
        sb2.append(str2);
        sb2.append(",\nShrink - ");
        t tVar = u0Var.f37623c;
        if (tVar != null) {
            str3 = tVar.toString();
        } else {
            str3 = null;
        }
        return e.j(sb2, str3, ",\nScale - ", null);
    }

    public final int hashCode() {
        return this.f37527a.hashCode();
    }
}
