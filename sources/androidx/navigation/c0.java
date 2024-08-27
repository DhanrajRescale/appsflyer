package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import d4.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f2173j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f2174a;

    /* renamed from: b, reason: collision with root package name */
    public f0 f2175b;

    /* renamed from: c, reason: collision with root package name */
    public String f2176c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f2177d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2178e;

    /* renamed from: f, reason: collision with root package name */
    public final t.k0 f2179f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f2180g;

    /* renamed from: h, reason: collision with root package name */
    public int f2181h;

    /* renamed from: i, reason: collision with root package name */
    public String f2182i;

    static {
        new LinkedHashMap();
    }

    public c0(v0 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        LinkedHashMap linkedHashMap = w0.f2336b;
        String navigatorName = ni.j.n(navigator.getClass());
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.f2174a = navigatorName;
        this.f2178e = new ArrayList();
        this.f2179f = new t.k0(0);
        this.f2180g = new LinkedHashMap();
    }

    public final void b(z navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        ArrayList k10 = q6.l.k(vt.p0.k(this.f2180g), new s(navDeepLink, 1));
        if (k10.isEmpty()) {
            this.f2178e.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.f2349a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + k10).toString());
    }

    public final Bundle e(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f2180g;
        if (bundle == null && (linkedHashMap == null || linkedHashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            k kVar = (k) entry.getValue();
            kVar.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(bundle2, "bundle");
            if (kVar.f2232c) {
                kVar.f2230a.e(bundle2, name, kVar.f2233d);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                k kVar2 = (k) entry2.getValue();
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(name2, "name");
                Intrinsics.checkNotNullParameter(bundle2, "bundle");
                boolean z10 = kVar2.f2231b;
                s0 s0Var = kVar2.f2230a;
                if (z10 || !bundle2.containsKey(name2) || bundle2.get(name2) != null) {
                    try {
                        s0Var.a(bundle2, name2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder s7 = da.e.s("Wrong argument type for '", name2, "' in argument bundle. ");
                s7.append(s0Var.b());
                s7.append(" expected.");
                throw new IllegalArgumentException(s7.toString().toString());
            }
        }
        return bundle2;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (obj == null || !(obj instanceof c0)) {
            return false;
        }
        ArrayList arrayList = this.f2178e;
        c0 c0Var = (c0) obj;
        if (vt.g0.y(arrayList, c0Var.f2178e).size() == arrayList.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        t.k0 k0Var = this.f2179f;
        int h10 = k0Var.h();
        t.k0 k0Var2 = c0Var.f2179f;
        if (h10 == k0Var2.h()) {
            Iterator it = pu.m.b(qu.i0.Q(k0Var)).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!k0Var2.d((g) it.next())) {
                        break;
                    }
                } else {
                    Iterator it2 = pu.m.b(qu.i0.Q(k0Var2)).iterator();
                    while (it2.hasNext()) {
                        if (!k0Var.d((g) it2.next())) {
                        }
                    }
                    z11 = true;
                }
            }
        }
        z11 = false;
        LinkedHashMap linkedHashMap = this.f2180g;
        int size = vt.p0.k(linkedHashMap).size();
        LinkedHashMap linkedHashMap2 = c0Var.f2180g;
        if (size == vt.p0.k(linkedHashMap2).size()) {
            Map k10 = vt.p0.k(linkedHashMap);
            Intrinsics.checkNotNullParameter(k10, "<this>");
            Set entrySet = k10.entrySet();
            Intrinsics.checkNotNullParameter(entrySet, "<this>");
            int i10 = 2;
            Iterator it3 = new t1(entrySet, i10).iterator();
            while (true) {
                if (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    if (!vt.p0.k(linkedHashMap2).containsKey(entry.getKey()) || !Intrinsics.a(vt.p0.k(linkedHashMap2).get(entry.getKey()), entry.getValue())) {
                        break;
                    }
                } else {
                    Map k11 = vt.p0.k(linkedHashMap2);
                    Intrinsics.checkNotNullParameter(k11, "<this>");
                    Set entrySet2 = k11.entrySet();
                    Intrinsics.checkNotNullParameter(entrySet2, "<this>");
                    Iterator it4 = new t1(entrySet2, i10).iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it4.next();
                        if (vt.p0.k(linkedHashMap).containsKey(entry2.getKey()) && Intrinsics.a(vt.p0.k(linkedHashMap).get(entry2.getKey()), entry2.getValue())) {
                        }
                    }
                    z12 = true;
                }
            }
        }
        z12 = false;
        if (this.f2181h != c0Var.f2181h || !Intrinsics.a(this.f2182i, c0Var.f2182i) || !z10 || !z11 || !z12) {
            return false;
        }
        return true;
    }

    public final int[] g(c0 c0Var) {
        f0 f0Var;
        vt.q qVar = new vt.q();
        c0 c0Var2 = this;
        while (true) {
            f0 f0Var2 = c0Var2.f2175b;
            if (c0Var != null) {
                f0Var = c0Var.f2175b;
            } else {
                f0Var = null;
            }
            if (f0Var != null) {
                f0 f0Var3 = c0Var.f2175b;
                Intrinsics.c(f0Var3);
                if (f0Var3.o(c0Var2.f2181h, true) == c0Var2) {
                    qVar.g(c0Var2);
                    break;
                }
            }
            if (f0Var2 == null || f0Var2.f2192l != c0Var2.f2181h) {
                qVar.g(c0Var2);
            }
            if (Intrinsics.a(f0Var2, c0Var) || f0Var2 == null) {
                break;
            }
            c0Var2 = f0Var2;
        }
        List R = vt.g0.R(qVar);
        ArrayList arrayList = new ArrayList(vt.z.k(R));
        Iterator it = R.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((c0) it.next()).f2181h));
        }
        return vt.g0.Q(arrayList);
    }

    public final g h(int i10) {
        g gVar;
        t.k0 k0Var = this.f2179f;
        if (k0Var.h() == 0) {
            gVar = null;
        } else {
            gVar = (g) k0Var.e(i10);
        }
        if (gVar == null) {
            f0 f0Var = this.f2175b;
            if (f0Var == null) {
                return null;
            }
            return f0Var.h(i10);
        }
        return gVar;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        Set<String> keySet;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f2181h * 31;
        String str = this.f2182i;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i18 = i17 + i10;
        Iterator it = this.f2178e.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            int i19 = i18 * 31;
            String str2 = zVar.f2349a;
            if (str2 != null) {
                i14 = str2.hashCode();
            } else {
                i14 = 0;
            }
            int i20 = (i19 + i14) * 31;
            String str3 = zVar.f2350b;
            if (str3 != null) {
                i15 = str3.hashCode();
            } else {
                i15 = 0;
            }
            int i21 = (i20 + i15) * 31;
            String str4 = zVar.f2351c;
            if (str4 != null) {
                i16 = str4.hashCode();
            } else {
                i16 = 0;
            }
            i18 = i21 + i16;
        }
        t.m0 Q = qu.i0.Q(this.f2179f);
        while (Q.hasNext()) {
            g gVar = (g) Q.next();
            int i22 = ((i18 * 31) + gVar.f2208a) * 31;
            k0 k0Var = gVar.f2209b;
            if (k0Var != null) {
                i12 = k0Var.hashCode();
            } else {
                i12 = 0;
            }
            i18 = i22 + i12;
            Bundle bundle = gVar.f2210c;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                Intrinsics.checkNotNullExpressionValue(keySet, "keySet()");
                for (String str5 : keySet) {
                    int i23 = i18 * 31;
                    Bundle bundle2 = gVar.f2210c;
                    Intrinsics.c(bundle2);
                    Object obj = bundle2.get(str5);
                    if (obj != null) {
                        i13 = obj.hashCode();
                    } else {
                        i13 = 0;
                    }
                    i18 = i23 + i13;
                }
            }
        }
        LinkedHashMap linkedHashMap = this.f2180g;
        for (String str6 : vt.p0.k(linkedHashMap).keySet()) {
            int g10 = jr.h.g(str6, i18 * 31, 31);
            Object obj2 = vt.p0.k(linkedHashMap).get(str6);
            if (obj2 != null) {
                i11 = obj2.hashCode();
            } else {
                i11 = 0;
            }
            i18 = g10 + i11;
        }
        return i18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if ((!q6.l.k(r6, new androidx.navigation.y(0, r13)).isEmpty()) != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.navigation.b0 i(h.c r21) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.c0.i(h.c):androidx.navigation.b0");
    }

    public void k(Context context, AttributeSet attrs) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, e7.a.f15090e);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        String string = obtainAttributes.getString(2);
        if (string == null) {
            this.f2181h = 0;
            this.f2176c = null;
        } else if (!kotlin.text.w.C(string)) {
            String uriPattern = x2.c.n(string);
            this.f2181h = uriPattern.hashCode();
            this.f2176c = null;
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            b(new z(uriPattern, null, null));
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        ArrayList arrayList = this.f2178e;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.a(((z) obj).f2349a, x2.c.n(this.f2182i))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        zq.f.u(arrayList).remove(obj);
        this.f2182i = string;
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            this.f2181h = resourceId;
            this.f2176c = null;
            this.f2176c = x2.c.o(resourceId, context);
        }
        this.f2177d = obtainAttributes.getText(0);
        Unit unit = Unit.f23355a;
        obtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f2176c;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.f2181h));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = this.f2182i;
        if (str2 != null && !kotlin.text.w.C(str2)) {
            sb2.append(" route=");
            sb2.append(this.f2182i);
        }
        if (this.f2177d != null) {
            sb2.append(" label=");
            sb2.append(this.f2177d);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }
}
