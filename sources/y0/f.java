package y0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f extends vt.m {

    /* renamed from: a, reason: collision with root package name */
    public a1.b f41023a;

    /* renamed from: b, reason: collision with root package name */
    public r f41024b;

    /* renamed from: c, reason: collision with root package name */
    public Object f41025c;

    /* renamed from: d, reason: collision with root package name */
    public int f41026d;

    /* renamed from: e, reason: collision with root package name */
    public int f41027e;

    @Override // vt.m
    public final Set b() {
        return new h(this);
    }

    @Override // vt.m
    public final Set c() {
        return new j(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f41024b = r.f41041e;
        f(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        int i10;
        r rVar = this.f41024b;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return rVar.d(i10, 0, obj);
    }

    @Override // vt.m
    public final int d() {
        return this.f41027e;
    }

    @Override // vt.m
    public final Collection e() {
        return new l(this);
    }

    public final void f(int i10) {
        this.f41027e = i10;
        this.f41026d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int i10;
        r rVar = this.f41024b;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return rVar.g(i10, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        this.f41025c = null;
        r rVar = this.f41024b;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        this.f41024b = rVar.l(i10, obj, obj2, 0, this);
        return this.f41025c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [y0.d] */
    /* JADX WARN: Type inference failed for: r3v0, types: [y0.r] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, a1.a] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        b1.g gVar;
        f fVar;
        b1.g gVar2 = null;
        if (map instanceof d) {
            gVar = (d) map;
        } else {
            gVar = null;
        }
        if (gVar == null) {
            if (map instanceof f) {
                fVar = (f) map;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                gVar2 = ((b1.f) fVar).g();
            }
        } else {
            gVar2 = gVar;
        }
        if (gVar2 != null) {
            ?? obj = new Object();
            obj.f20a = 0;
            int d10 = d();
            ?? r32 = this.f41024b;
            r rVar = gVar2.f41018d;
            Intrinsics.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.f41024b = r32.m(rVar, 0, obj, this);
            int size = (gVar2.size() + d10) - obj.f20a;
            if (d10 != size) {
                f(size);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int d10 = d();
        r o10 = this.f41024b.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o10 == null) {
            o10 = r.f41041e;
        }
        this.f41024b = o10;
        return d10 != d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f41025c = null;
        r n10 = this.f41024b.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n10 == null) {
            n10 = r.f41041e;
        }
        this.f41024b = n10;
        return this.f41025c;
    }
}
