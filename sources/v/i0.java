package v;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final i0 f37530b = new i0(new u0(null, null, null, false, null, 63));

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f37531c = new i0(new u0(null, null, null, true, null, 47));

    /* renamed from: a, reason: collision with root package name */
    public final u0 f37532a;

    public i0(u0 u0Var) {
        this.f37532a = u0Var;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if ((obj instanceof i0) && Intrinsics.a(((i0) obj).f37532a, this.f37532a)) {
            return true;
        }
        return false;
    }

    public final i0 b(i0 i0Var) {
        boolean z10;
        u0 u0Var = this.f37532a;
        j0 j0Var = u0Var.f37621a;
        if (j0Var == null) {
            j0Var = i0Var.f37532a.f37621a;
        }
        r0 r0Var = u0Var.f37622b;
        if (r0Var == null) {
            r0Var = i0Var.f37532a.f37622b;
        }
        t tVar = u0Var.f37623c;
        if (tVar == null) {
            tVar = i0Var.f37532a.f37623c;
        }
        i0Var.f37532a.getClass();
        boolean z11 = u0Var.f37624d;
        u0 u0Var2 = i0Var.f37532a;
        if (!z11 && !u0Var2.f37624d) {
            z10 = false;
        } else {
            z10 = true;
        }
        Map map = u0Var2.f37625e;
        Map map2 = u0Var.f37625e;
        Intrinsics.checkNotNullParameter(map2, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        linkedHashMap.putAll(map);
        return new i0(new u0(j0Var, r0Var, tVar, z10, linkedHashMap));
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        String str;
        String str2;
        String str3;
        if (Intrinsics.a(this, f37530b)) {
            return "ExitTransition.None";
        }
        if (Intrinsics.a(this, f37531c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
        u0 u0Var = this.f37532a;
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
        e.v(sb2, str3, ",\nScale - ", null, ",\nKeepUntilTransitionsFinished - ");
        sb2.append(u0Var.f37624d);
        return sb2.toString();
    }

    public final int hashCode() {
        return this.f37532a.hashCode();
    }
}
