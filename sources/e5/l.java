package e5;

import h.r0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15021a;

    /* renamed from: b, reason: collision with root package name */
    public r0 f15022b = new r0(2);

    /* renamed from: c, reason: collision with root package name */
    public boolean f15023c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15024d;

    public l(Object obj) {
        this.f15021a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            return this.f15021a.equals(((l) obj).f15021a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15021a.hashCode();
    }
}
