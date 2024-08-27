package h2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class j implements v, Iterable, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f17850a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public boolean f17851b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17852c;

    public final boolean b(u uVar) {
        return this.f17850a.containsKey(uVar);
    }

    public final Object e(u uVar) {
        Object obj = this.f17850a.get(uVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + uVar + " - consider getOrElse or getOrNull");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (Intrinsics.a(this.f17850a, jVar.f17850a) && this.f17851b == jVar.f17851b && this.f17852c == jVar.f17852c) {
            return true;
        }
        return false;
    }

    public final Object g(u uVar, Function0 function0) {
        Object obj = this.f17850a.get(uVar);
        if (obj == null) {
            return function0.mo2invoke();
        }
        return obj;
    }

    public final void h(u uVar, Object obj) {
        boolean z10 = obj instanceof a;
        LinkedHashMap linkedHashMap = this.f17850a;
        if (z10 && linkedHashMap.containsKey(uVar)) {
            Object obj2 = linkedHashMap.get(uVar);
            Intrinsics.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            a aVar = (a) obj2;
            a aVar2 = (a) obj;
            String str = aVar2.f17809a;
            if (str == null) {
                str = aVar.f17809a;
            }
            ut.d dVar = aVar2.f17810b;
            if (dVar == null) {
                dVar = aVar.f17810b;
            }
            linkedHashMap.put(uVar, new a(str, dVar));
            return;
        }
        linkedHashMap.put(uVar, obj);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17852c) + v.e.d(this.f17851b, this.f17850a.hashCode() * 31, 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f17850a.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f17851b) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (this.f17852c) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f17850a.entrySet()) {
            u uVar = (u) entry.getKey();
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(uVar.f17909a);
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return t0.t.y0(this) + "{ " + ((Object) sb2) + " }";
    }
}
