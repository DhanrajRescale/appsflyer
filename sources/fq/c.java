package fq;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import d7.i0;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f16205a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f16206b;

    public c(String str, Map map) {
        this.f16205a = str;
        this.f16206b = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d7.i0, java.lang.Object] */
    public static i0 a(String str) {
        ?? obj = new Object();
        obj.f14051b = null;
        obj.f14050a = str;
        return obj;
    }

    public static c b(String str) {
        return new c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f16205a.equals(cVar.f16205a) && this.f16206b.equals(cVar.f16206b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16206b.hashCode() + (this.f16205a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f16205a + ", properties=" + this.f16206b.values() + UrlTreeKt.componentParamSuffix;
    }
}
