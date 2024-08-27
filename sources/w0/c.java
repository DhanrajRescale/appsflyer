package w0;

import java.util.Collection;
import x0.f;

/* loaded from: classes.dex */
public interface c extends b, Collection, ju.a {
    c a(x0.b bVar);

    @Override // java.util.List
    c add(int i10, Object obj);

    @Override // java.util.List, java.util.Collection
    c add(Object obj);

    @Override // java.util.List, java.util.Collection
    c addAll(Collection collection);

    c j(int i10);

    f l();

    @Override // java.util.List
    c set(int i10, Object obj);
}
