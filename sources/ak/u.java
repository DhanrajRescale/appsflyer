package ak;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final List f574a;

    public u(ArrayList arrayList) {
        this.f574a = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f574a.iterator();
    }
}
