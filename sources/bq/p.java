package bq;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Class f7275a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f7276b;

    public p(Class cls, Class cls2) {
        this.f7275a = cls;
        this.f7276b = cls2;
    }

    public static p a(Class cls) {
        return new p(o.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f7276b.equals(pVar.f7276b)) {
            return false;
        }
        return this.f7275a.equals(pVar.f7275a);
    }

    public final int hashCode() {
        return this.f7275a.hashCode() + (this.f7276b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f7276b;
        Class cls2 = this.f7275a;
        if (cls2 == o.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
