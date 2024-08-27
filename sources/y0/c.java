package y0;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    public final i f41015c;

    /* renamed from: d, reason: collision with root package name */
    public Object f41016d;

    public c(i iVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f41015c = iVar;
        this.f41016d = obj2;
    }

    @Override // y0.b, java.util.Map.Entry
    public final Object getValue() {
        return this.f41016d;
    }

    @Override // y0.b, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i10;
        Object obj2 = this.f41016d;
        this.f41016d = obj;
        g gVar = this.f41015c.f41033a;
        f fVar = gVar.f41028d;
        Object obj3 = this.f41013a;
        if (fVar.containsKey(obj3)) {
            boolean z10 = gVar.f41022c;
            if (z10) {
                if (z10) {
                    s sVar = gVar.f41020a[gVar.f41021b];
                    Object obj4 = sVar.f41046a[sVar.f41048c];
                    fVar.put(obj3, obj);
                    if (obj4 != null) {
                        i10 = obj4.hashCode();
                    } else {
                        i10 = 0;
                    }
                    gVar.d(i10, fVar.f41024b, obj4, 0);
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                fVar.put(obj3, obj);
            }
            gVar.f41031g = fVar.f41026d;
        }
        return obj2;
    }
}
