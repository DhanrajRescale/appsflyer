package f3;

import androidx.constraintlayout.core.parser.CLParsingException;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class b extends c {

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f15909e;

    public b(char[] cArr) {
        super(cArr);
        this.f15909e = new ArrayList();
    }

    public final String A(String str) {
        String str2;
        c p10 = p(str);
        if (p10 instanceof h) {
            return p10.e();
        }
        if (p10 != null) {
            str2 = p10.i();
        } else {
            str2 = null;
        }
        StringBuilder l10 = v.e.l("no string found for key <", str, ">, found [", str2, "] : ");
        l10.append(p10);
        throw new CLParsingException(l10.toString(), this);
    }

    public final String B(String str) {
        c w10 = w(str);
        if (w10 instanceof h) {
            return w10.e();
        }
        return null;
    }

    public final boolean C(String str) {
        Iterator it = this.f15909e.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if ((cVar instanceof d) && ((d) cVar).e().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList D() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f15909e.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar instanceof d) {
                arrayList.add(((d) cVar).e());
            }
        }
        return arrayList;
    }

    public final void E(String str, c cVar) {
        Iterator it = this.f15909e.iterator();
        while (it.hasNext()) {
            d dVar = (d) ((c) it.next());
            if (dVar.e().equals(str)) {
                if (dVar.f15909e.size() > 0) {
                    dVar.f15909e.set(0, cVar);
                    return;
                } else {
                    dVar.f15909e.add(cVar);
                    return;
                }
            }
        }
        b bVar = new b(str.toCharArray());
        bVar.f15911b = 0L;
        long length = str.length() - 1;
        if (bVar.f15912c == Long.MAX_VALUE) {
            bVar.f15912c = length;
            b bVar2 = bVar.f15913d;
            if (bVar2 != null) {
                bVar2.k(bVar);
            }
        }
        if (bVar.f15909e.size() > 0) {
            bVar.f15909e.set(0, cVar);
        } else {
            bVar.f15909e.add(cVar);
        }
        this.f15909e.add(bVar);
    }

    @Override // f3.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f15909e.equals(((b) obj).f15909e);
    }

    @Override // f3.c
    public int hashCode() {
        return Objects.hash(this.f15909e, Integer.valueOf(super.hashCode()));
    }

    public final void k(c cVar) {
        this.f15909e.add(cVar);
    }

    @Override // f3.c
    /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public b clone() {
        b bVar = (b) super.clone();
        ArrayList arrayList = new ArrayList(this.f15909e.size());
        Iterator it = this.f15909e.iterator();
        while (it.hasNext()) {
            c clone = ((c) it.next()).clone();
            clone.f15913d = bVar;
            arrayList.add(clone);
        }
        bVar.f15909e = arrayList;
        return bVar;
    }

    public final c o(int i10) {
        if (i10 >= 0 && i10 < this.f15909e.size()) {
            return (c) this.f15909e.get(i10);
        }
        throw new CLParsingException(jr.h.n("no element at index ", i10), this);
    }

    public final c p(String str) {
        Iterator it = this.f15909e.iterator();
        while (it.hasNext()) {
            d dVar = (d) ((c) it.next());
            if (dVar.e().equals(str)) {
                if (dVar.f15909e.size() > 0) {
                    return (c) dVar.f15909e.get(0);
                }
                return null;
            }
        }
        throw new CLParsingException(nn.d.k("no element for key <", str, UrlTreeKt.configurablePathSegmentSuffix), this);
    }

    public final a q(String str) {
        c w10 = w(str);
        if (w10 instanceof a) {
            return (a) w10;
        }
        return null;
    }

    public final float r(int i10) {
        c o10 = o(i10);
        if (o10 != null) {
            return o10.g();
        }
        throw new CLParsingException(jr.h.n("no float at index ", i10), this);
    }

    public final float s(String str) {
        c p10 = p(str);
        if (p10 != null) {
            return p10.g();
        }
        StringBuilder s7 = da.e.s("no float found for key <", str, ">, found [");
        s7.append(p10.i());
        s7.append("] : ");
        s7.append(p10);
        throw new CLParsingException(s7.toString(), this);
    }

    public final int t(int i10) {
        c o10 = o(i10);
        if (o10 != null) {
            return o10.h();
        }
        throw new CLParsingException(jr.h.n("no int at index ", i10), this);
    }

    @Override // f3.c
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f15909e.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (sb2.length() > 0) {
                sb2.append("; ");
            }
            sb2.append(cVar);
        }
        return super.toString() + " = <" + ((Object) sb2) + " >";
    }

    public final c u(int i10) {
        if (i10 >= 0 && i10 < this.f15909e.size()) {
            return (c) this.f15909e.get(i10);
        }
        return null;
    }

    public final c w(String str) {
        Iterator it = this.f15909e.iterator();
        while (it.hasNext()) {
            d dVar = (d) ((c) it.next());
            if (dVar.e().equals(str)) {
                if (dVar.f15909e.size() <= 0) {
                    return null;
                }
                return (c) dVar.f15909e.get(0);
            }
        }
        return null;
    }

    public final String y(int i10) {
        c o10 = o(i10);
        if (o10 instanceof h) {
            return o10.e();
        }
        throw new CLParsingException(jr.h.n("no string at index ", i10), this);
    }
}
