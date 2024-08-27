package nv;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class e0 extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29200b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bl.j f29201c;

    public /* synthetic */ e0(bl.j jVar, int i10) {
        this.f29200b = i10;
        this.f29201c = jVar;
    }

    @Override // bl.j
    public final void k(s0 s0Var, Object obj) {
        int i10 = this.f29200b;
        bl.j jVar = this.f29201c;
        switch (i10) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        jVar.k(s0Var, it.next());
                    }
                    return;
                }
                return;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i11 = 0; i11 < length; i11++) {
                        jVar.k(s0Var, Array.get(obj, i11));
                    }
                    return;
                }
                return;
        }
    }
}
