package lp;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public class m extends g implements SortedMap {

    /* renamed from: e, reason: collision with root package name */
    public SortedSet f25008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f25009f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, SortedMap sortedMap) {
        super(rVar, sortedMap);
        this.f25009f = rVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return f().comparator();
    }

    public SortedSet d() {
        return new n(this.f25009f, f());
    }

    @Override // lp.g, java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f25008e;
        if (sortedSet == null) {
            SortedSet d10 = d();
            this.f25008e = d10;
            return d10;
        }
        return sortedSet;
    }

    public SortedMap f() {
        return (SortedMap) this.f24980c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return f().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new m(this.f25009f, f().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return f().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new m(this.f25009f, f().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new m(this.f25009f, f().tailMap(obj));
    }
}
