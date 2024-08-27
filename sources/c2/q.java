package c2;

import java.util.Map;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7810a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ut.g f7811b;

    /* renamed from: c, reason: collision with root package name */
    public final d2 f7812c;

    /* JADX WARN: Type inference failed for: r0v1, types: [c2.d2, java.util.TreeSet] */
    public q() {
        ut.i iVar = ut.i.f37392a;
        this.f7811b = ut.h.b(j.f7737b);
        this.f7812c = new TreeSet(new p(0));
    }

    public final void a(androidx.compose.ui.node.a aVar) {
        if (aVar.C()) {
            if (this.f7810a) {
                ut.g gVar = this.f7811b;
                Integer num = (Integer) ((Map) gVar.getValue()).get(aVar);
                if (num == null) {
                    ((Map) gVar.getValue()).put(aVar, Integer.valueOf(aVar.f1410k));
                } else {
                    if (num.intValue() != aVar.f1410k) {
                        t0.t.C0("invalid node depth");
                        throw null;
                    }
                }
            }
            this.f7812c.add(aVar);
            return;
        }
        t0.t.C0("DepthSortedSet.add called on an unattached node");
        throw null;
    }

    public final boolean b(androidx.compose.ui.node.a aVar) {
        boolean contains = this.f7812c.contains(aVar);
        if (this.f7810a && contains != ((Map) this.f7811b.getValue()).containsKey(aVar)) {
            t0.t.C0("inconsistency in TreeSet");
            throw null;
        }
        return contains;
    }

    public final boolean c(androidx.compose.ui.node.a aVar) {
        Integer num;
        if (aVar.C()) {
            boolean remove = this.f7812c.remove(aVar);
            if (this.f7810a) {
                Integer num2 = (Integer) ((Map) this.f7811b.getValue()).remove(aVar);
                if (remove) {
                    num = Integer.valueOf(aVar.f1410k);
                } else {
                    num = null;
                }
                if (!Intrinsics.a(num2, num)) {
                    t0.t.C0("invalid node depth");
                    throw null;
                }
            }
            return remove;
        }
        t0.t.C0("DepthSortedSet.remove called on an unattached node");
        throw null;
    }

    public final String toString() {
        return this.f7812c.toString();
    }
}
