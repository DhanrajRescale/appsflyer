package vt;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class q0 extends d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38333b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f38334c;

    public q0(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f38334c = delegate;
    }

    @Override // vt.b
    public final int b() {
        int i10 = this.f38333b;
        Object obj = this.f38334c;
        switch (i10) {
            case 0:
                return ((List) obj).size();
            default:
                return ((kotlin.text.f) obj).f23408a.groupCount() + 1;
        }
    }

    @Override // vt.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        switch (this.f38333b) {
            case 1:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.contains((String) obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.f38333b;
        Object obj = this.f38334c;
        switch (i11) {
            case 0:
                List list = (List) obj;
                if (i10 >= 0 && i10 <= y.f(this)) {
                    return list.get(y.f(this) - i10);
                }
                StringBuilder n10 = a3.a.n("Element index ", i10, " must be in range [");
                n10.append(new kotlin.ranges.c(0, y.f(this), 1));
                n10.append("].");
                throw new IndexOutOfBoundsException(n10.toString());
            default:
                String group = ((kotlin.text.f) obj).f23408a.group(i10);
                if (group == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return group;
        }
    }

    @Override // vt.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        switch (this.f38333b) {
            case 1:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.indexOf((String) obj);
            default:
                return super.indexOf(obj);
        }
    }

    @Override // vt.d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.f38333b) {
            case 0:
                return listIterator(0);
            default:
                return super.iterator();
        }
    }

    @Override // vt.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f38333b) {
            case 1:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.lastIndexOf((String) obj);
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // vt.d, java.util.List
    public final ListIterator listIterator() {
        switch (this.f38333b) {
            case 0:
                return listIterator(0);
            default:
                return super.listIterator();
        }
    }

    @Override // vt.d, java.util.List
    public final ListIterator listIterator(int i10) {
        switch (this.f38333b) {
            case 0:
                return new e1.b0(this, i10);
            default:
                return new e(this, i10);
        }
    }

    public q0(kotlin.text.f fVar) {
        this.f38334c = fVar;
    }
}
