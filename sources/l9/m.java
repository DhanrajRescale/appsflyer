package l9;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class m implements n, k {

    /* renamed from: a, reason: collision with root package name */
    public final Path f24314a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f24315b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f24316c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f24317d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final r9.g f24318e;

    public m(r9.g gVar) {
        gVar.getClass();
        this.f24318e = gVar;
    }

    public final void a(Path.Op op2) {
        Matrix matrix;
        Matrix matrix2;
        Path path = this.f24315b;
        path.reset();
        Path path2 = this.f24314a;
        path2.reset();
        ArrayList arrayList = this.f24317d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            n nVar = (n) arrayList.get(size);
            if (nVar instanceof e) {
                e eVar = (e) nVar;
                ArrayList arrayList2 = (ArrayList) eVar.g();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path i10 = ((n) arrayList2.get(size2)).i();
                    m9.t tVar = eVar.f24262k;
                    if (tVar != null) {
                        matrix2 = tVar.e();
                    } else {
                        matrix2 = eVar.f24254c;
                        matrix2.reset();
                    }
                    i10.transform(matrix2);
                    path.addPath(i10);
                }
            } else {
                path.addPath(nVar.i());
            }
        }
        int i11 = 0;
        n nVar2 = (n) arrayList.get(0);
        if (nVar2 instanceof e) {
            e eVar2 = (e) nVar2;
            List g10 = eVar2.g();
            while (true) {
                ArrayList arrayList3 = (ArrayList) g10;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                Path i12 = ((n) arrayList3.get(i11)).i();
                m9.t tVar2 = eVar2.f24262k;
                if (tVar2 != null) {
                    matrix = tVar2.e();
                } else {
                    matrix = eVar2.f24254c;
                    matrix.reset();
                }
                i12.transform(matrix);
                path2.addPath(i12);
                i11++;
            }
        } else {
            path2.set(nVar2.i());
        }
        this.f24316c.op(path2, path, op2);
    }

    @Override // l9.d
    public final void b(List list, List list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f24317d;
            if (i10 < arrayList.size()) {
                ((n) arrayList.get(i10)).b(list, list2);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // l9.k
    public final void g(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            d dVar = (d) listIterator.previous();
            if (dVar instanceof n) {
                this.f24317d.add((n) dVar);
                listIterator.remove();
            }
        }
    }

    @Override // l9.n
    public final Path i() {
        Path path = this.f24316c;
        path.reset();
        r9.g gVar = this.f24318e;
        if (gVar.f33494b) {
            return path;
        }
        int e10 = w.k.e(gVar.f33493a);
        if (e10 != 0) {
            if (e10 != 1) {
                if (e10 != 2) {
                    if (e10 != 3) {
                        if (e10 == 4) {
                            a(Path.Op.XOR);
                        }
                    } else {
                        a(Path.Op.INTERSECT);
                    }
                } else {
                    a(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                a(Path.Op.UNION);
            }
        } else {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f24317d;
                if (i10 >= arrayList.size()) {
                    break;
                }
                path.addPath(((n) arrayList.get(i10)).i());
                i10++;
            }
        }
        return path;
    }
}
