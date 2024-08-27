package rk;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public Class f33946a;

    /* renamed from: b, reason: collision with root package name */
    public Class f33947b;

    /* renamed from: c, reason: collision with root package name */
    public Class f33948c;

    public i(Class cls, Class cls2, Class cls3) {
        this.f33946a = cls;
        this.f33947b = cls2;
        this.f33948c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f33946a.equals(iVar.f33946a) && this.f33947b.equals(iVar.f33947b) && k.a(this.f33948c, iVar.f33948c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f33947b.hashCode() + (this.f33946a.hashCode() * 31)) * 31;
        Class cls = this.f33948c;
        if (cls != null) {
            i10 = cls.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f33946a + ", second=" + this.f33947b + UrlTreeKt.componentParamSuffixChar;
    }
}
