package lv;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class s implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final ConcurrentHashMap f25466g = new ConcurrentHashMap(4, 0.75f, 2);
    private static final long serialVersionUID = -1177360819670808121L;

    /* renamed from: a, reason: collision with root package name */
    public final hv.c f25467a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25468b;

    /* renamed from: c, reason: collision with root package name */
    public final transient r f25469c;

    /* renamed from: d, reason: collision with root package name */
    public final transient r f25470d;

    /* renamed from: e, reason: collision with root package name */
    public final transient r f25471e;

    /* renamed from: f, reason: collision with root package name */
    public final transient r f25472f;

    static {
        new s(4, hv.c.f18707a);
        a(1, hv.c.f18710d);
    }

    public s(int i10, hv.c cVar) {
        b bVar = b.DAYS;
        b bVar2 = b.WEEKS;
        this.f25469c = new r("DayOfWeek", this, bVar, bVar2, r.f25457f);
        this.f25470d = new r("WeekOfMonth", this, bVar2, b.MONTHS, r.f25458g);
        h hVar = i.f25445a;
        this.f25471e = new r("WeekOfWeekBasedYear", this, bVar2, hVar, r.f25459h);
        this.f25472f = new r("WeekBasedYear", this, hVar, b.FOREVER, r.f25460i);
        el.l.D0(cVar, "firstDayOfWeek");
        if (i10 >= 1 && i10 <= 7) {
            this.f25467a = cVar;
            this.f25468b = i10;
            return;
        }
        throw new IllegalArgumentException("Minimal number of days is invalid");
    }

    public static s a(int i10, hv.c cVar) {
        String str = cVar.toString() + i10;
        ConcurrentHashMap concurrentHashMap = f25466g;
        s sVar = (s) concurrentHashMap.get(str);
        if (sVar == null) {
            concurrentHashMap.putIfAbsent(str, new s(i10, cVar));
            return (s) concurrentHashMap.get(str);
        }
        return sVar;
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return a(this.f25468b, this.f25467a);
        } catch (IllegalArgumentException e10) {
            throw new InvalidObjectException("Invalid WeekFields" + e10.getMessage());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s) && hashCode() == obj.hashCode()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25467a.ordinal() * 7) + this.f25468b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WeekFields[");
        sb2.append(this.f25467a);
        sb2.append(',');
        return a3.a.i(sb2, this.f25468b, ']');
    }
}
