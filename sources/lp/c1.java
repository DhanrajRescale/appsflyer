package lp;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class c1 extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f24963b;

    public c1(h1 h1Var) {
        this.f24963b = h1Var;
    }

    @Override // bl.j
    public final Map v() {
        return new TreeMap(this.f24963b);
    }
}
