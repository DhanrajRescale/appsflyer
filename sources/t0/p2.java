package t0;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p2 implements Iterable, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final o2 f35127a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35128b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35129c;

    public p2(int i10, int i11, o2 o2Var) {
        this.f35127a = o2Var;
        this.f35128b = i10;
        this.f35129c = i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i10;
        ArrayList arrayList;
        int H1;
        o2 o2Var = this.f35127a;
        if (o2Var.f35112g == this.f35129c) {
            HashMap hashMap = o2Var.f35114i;
            d dVar = null;
            int i11 = this.f35128b;
            if (hashMap != null) {
                if (!o2Var.f35111f) {
                    if (i11 >= 0 && i11 < (i10 = o2Var.f35107b) && (H1 = dp.b.H1((arrayList = o2Var.f35113h), i11, i10)) >= 0) {
                        dVar = (d) arrayList.get(H1);
                    }
                    if (dVar != null) {
                    }
                } else {
                    t.F("use active SlotWriter to crate an anchor for location instead");
                    throw null;
                }
            }
            return new r0(i11 + 1, dp.b.D0(o2Var.f35106a, i11) + i11, o2Var);
        }
        throw new ConcurrentModificationException();
    }
}
