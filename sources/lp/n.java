package lp;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public class n extends i implements SortedSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f25013d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, SortedMap sortedMap) {
        super(rVar, sortedMap);
        this.f25013d = rVar;
    }

    public SortedMap b() {
        return (SortedMap) this.f24992b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new n(this.f25013d, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new n(this.f25013d, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new n(this.f25013d, b().tailMap(obj));
    }
}
