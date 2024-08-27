package z0;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import vt.o;
import w0.d;

/* loaded from: classes.dex */
public final class b extends o implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final b f41892e;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41893b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f41894c;

    /* renamed from: d, reason: collision with root package name */
    public final y0.d f41895d;

    static {
        a1.b bVar = a1.b.f21a;
        y0.d dVar = y0.d.f41017f;
        Intrinsics.d(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        f41892e = new b(bVar, bVar, dVar);
    }

    public b(Object obj, Object obj2, y0.d dVar) {
        this.f41893b = obj;
        this.f41894c = obj2;
        this.f41895d = dVar;
    }

    @Override // vt.b
    public final int b() {
        return this.f41895d.size();
    }

    @Override // vt.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f41895d.containsKey(obj);
    }

    @Override // vt.o, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new c(this.f41893b, this.f41895d);
    }
}
