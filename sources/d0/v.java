package d0;

import a2.l1;
import a2.m1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final s f13231a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f13232b = new LinkedHashMap();

    public v(s sVar) {
        this.f13231a = sVar;
    }

    @Override // a2.m1
    public final boolean a(Object obj, Object obj2) {
        s sVar = this.f13231a;
        return Intrinsics.a(sVar.b(obj), sVar.b(obj2));
    }

    @Override // a2.m1
    public final void b(l1 l1Var) {
        int i10;
        LinkedHashMap linkedHashMap = this.f13232b;
        linkedHashMap.clear();
        Iterator it = l1Var.f104a.iterator();
        while (it.hasNext()) {
            Object b10 = this.f13231a.b(it.next());
            Integer num = (Integer) linkedHashMap.get(b10);
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            if (i10 == 7) {
                it.remove();
            } else {
                linkedHashMap.put(b10, Integer.valueOf(i10 + 1));
            }
        }
    }
}
