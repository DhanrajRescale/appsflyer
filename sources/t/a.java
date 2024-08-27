package t;

import com.google.protobuf.b1;
import com.google.protobuf.g1;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f34824b;

    public /* synthetic */ a(Map map, int i10) {
        this.f34823a = i10;
        this.f34824b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f34823a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((b1) this.f34824b).put((Comparable) entry.getKey(), entry.getValue());
                    return true;
                }
                return false;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f34823a) {
            case 1:
                ((b1) this.f34824b).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f34823a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((b1) this.f34824b).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                    return false;
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i10 = this.f34823a;
        Map map = this.f34824b;
        switch (i10) {
            case 0:
                return new d((f) map);
            default:
                return new g1((b1) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f34823a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((b1) this.f34824b).remove(entry.getKey());
                    return true;
                }
                return false;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i10 = this.f34823a;
        Map map = this.f34824b;
        switch (i10) {
            case 0:
                return ((f) map).f34873c;
            default:
                return ((b1) map).size();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b1 b1Var) {
        this(b1Var, 1);
        this.f34823a = 1;
    }
}
