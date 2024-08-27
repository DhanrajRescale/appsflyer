package g7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final b3 f17136a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f17137b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f17138c;

    /* renamed from: d, reason: collision with root package name */
    public int f17139d;

    /* renamed from: e, reason: collision with root package name */
    public int f17140e;

    /* renamed from: f, reason: collision with root package name */
    public int f17141f;

    /* renamed from: g, reason: collision with root package name */
    public int f17142g;

    /* renamed from: h, reason: collision with root package name */
    public int f17143h;

    /* renamed from: i, reason: collision with root package name */
    public final su.c f17144i;

    /* renamed from: j, reason: collision with root package name */
    public final su.c f17145j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f17146k;

    /* renamed from: l, reason: collision with root package name */
    public final h.c f17147l;

    public y2(b3 b3Var) {
        this.f17136a = b3Var;
        ArrayList arrayList = new ArrayList();
        this.f17137b = arrayList;
        this.f17138c = arrayList;
        this.f17144i = hl.f.a(-1, null, 6);
        this.f17145j = hl.f.a(-1, null, 6);
        this.f17146k = new LinkedHashMap();
        h.c cVar = new h.c(22, 0);
        cVar.V(b1.f16663a, x0.f17118b);
        this.f17147l = cVar;
    }

    public final y3 a(u4 u4Var) {
        Integer num;
        int i10;
        int size;
        ArrayList arrayList = this.f17138c;
        List R = vt.g0.R(arrayList);
        b3 b3Var = this.f17136a;
        if (u4Var != null) {
            int d10 = d();
            int i11 = -this.f17139d;
            int f10 = vt.y.f(arrayList) - this.f17139d;
            int i12 = i11;
            while (true) {
                i10 = u4Var.f17091e;
                if (i12 >= i10) {
                    break;
                }
                if (i12 > f10) {
                    size = b3Var.f16670a;
                } else {
                    size = ((u3) arrayList.get(this.f17139d + i12)).f17086a.size();
                }
                d10 += size;
                i12++;
            }
            int i13 = d10 + u4Var.f17092f;
            if (i10 < i11) {
                i13 -= b3Var.f16670a;
            }
            num = Integer.valueOf(i13);
        } else {
            num = null;
        }
        return new y3(R, num, b3Var, d());
    }

    public final void b(f1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int a10 = event.a();
        ArrayList arrayList = this.f17138c;
        if (a10 <= arrayList.size()) {
            LinkedHashMap linkedHashMap = this.f17146k;
            b1 b1Var = event.f16746a;
            linkedHashMap.remove(b1Var);
            this.f17147l.V(b1Var, y0.f17134c);
            int ordinal = b1Var.ordinal();
            ArrayList arrayList2 = this.f17137b;
            int i10 = 0;
            int i11 = event.f16749d;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    int a11 = event.a();
                    for (int i12 = 0; i12 < a11; i12++) {
                        arrayList2.remove(arrayList.size() - 1);
                    }
                    if (i11 != Integer.MIN_VALUE) {
                        i10 = i11;
                    }
                    this.f17141f = i10;
                    int i13 = this.f17143h + 1;
                    this.f17143h = i13;
                    this.f17145j.o(Integer.valueOf(i13));
                    return;
                }
                throw new IllegalArgumentException("cannot drop " + b1Var);
            }
            int a12 = event.a();
            for (int i14 = 0; i14 < a12; i14++) {
                arrayList2.remove(0);
            }
            this.f17139d -= event.a();
            if (i11 != Integer.MIN_VALUE) {
                i10 = i11;
            }
            this.f17140e = i10;
            int i15 = this.f17142g + 1;
            this.f17142g = i15;
            this.f17144i.o(Integer.valueOf(i15));
            return;
        }
        throw new IllegalStateException(("invalid drop count. have " + arrayList.size() + " but wanted to drop " + event.a()).toString());
    }

    public final f1 c(b1 loadType, w4 hint) {
        int f10;
        int f11;
        int size;
        int i10;
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(hint, "hint");
        b3 b3Var = this.f17136a;
        f1 f1Var = null;
        if (b3Var.f16674e == Integer.MAX_VALUE) {
            return null;
        }
        ArrayList arrayList = this.f17138c;
        if (arrayList.size() <= 2) {
            return null;
        }
        Iterator it = arrayList.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            i12 += ((u3) it.next()).f17086a.size();
        }
        int i13 = b3Var.f16674e;
        if (i12 <= i13) {
            return null;
        }
        if (loadType != b1.f16663a) {
            int i14 = 0;
            int i15 = 0;
            while (i14 < arrayList.size()) {
                Iterator it2 = arrayList.iterator();
                int i16 = 0;
                while (it2.hasNext()) {
                    i16 += ((u3) it2.next()).f17086a.size();
                }
                if (i16 - i15 <= i13) {
                    break;
                }
                int[] iArr = v2.f17102a;
                if (iArr[loadType.ordinal()] == 2) {
                    size = ((u3) arrayList.get(i14)).f17086a.size();
                } else {
                    size = ((u3) arrayList.get(vt.y.f(arrayList) - i14)).f17086a.size();
                }
                if (iArr[loadType.ordinal()] == 2) {
                    i10 = hint.f17112a;
                } else {
                    i10 = hint.f17113b;
                }
                if ((i10 - i15) - size < b3Var.f16671b) {
                    break;
                }
                i15 += size;
                i14++;
            }
            if (i14 != 0) {
                int[] iArr2 = v2.f17102a;
                if (iArr2[loadType.ordinal()] == 2) {
                    f10 = -this.f17139d;
                } else {
                    f10 = (vt.y.f(arrayList) - this.f17139d) - (i14 - 1);
                }
                if (iArr2[loadType.ordinal()] == 2) {
                    f11 = (i14 - 1) - this.f17139d;
                } else {
                    f11 = vt.y.f(arrayList) - this.f17139d;
                }
                if (b3Var.f16672c) {
                    if (loadType == b1.f16664b) {
                        i11 = d() + i15;
                    } else {
                        if (b3Var.f16672c) {
                            i11 = this.f17141f;
                        }
                        i11 += i15;
                    }
                }
                f1Var = new f1(loadType, f10, f11, i11);
            }
            return f1Var;
        }
        throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + loadType).toString());
    }

    public final int d() {
        if (this.f17136a.f16672c) {
            return this.f17140e;
        }
        return 0;
    }

    public final boolean e(int i10, b1 loadType, u3 page) {
        int i11;
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(page, "page");
        int ordinal = loadType.ordinal();
        ArrayList arrayList = this.f17137b;
        ArrayList arrayList2 = this.f17138c;
        int i12 = 0;
        if (ordinal != 0) {
            LinkedHashMap linkedHashMap = this.f17146k;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (!arrayList2.isEmpty()) {
                        if (i10 != this.f17143h) {
                            return false;
                        }
                        arrayList.add(page);
                        int i13 = page.f17090e;
                        if (i13 == Integer.MIN_VALUE) {
                            if (this.f17136a.f16672c) {
                                i11 = this.f17141f;
                            } else {
                                i11 = 0;
                            }
                            i13 = i11 - page.f17086a.size();
                            if (i13 < 0) {
                                i13 = 0;
                            }
                        }
                        if (i13 != Integer.MIN_VALUE) {
                            i12 = i13;
                        }
                        this.f17141f = i12;
                        linkedHashMap.remove(b1.f16665c);
                    } else {
                        throw new IllegalStateException("should've received an init before append".toString());
                    }
                }
            } else if (!arrayList2.isEmpty()) {
                if (i10 != this.f17142g) {
                    return false;
                }
                arrayList.add(0, page);
                this.f17139d++;
                int i14 = page.f17089d;
                if (i14 == Integer.MIN_VALUE && (i14 = d() - page.f17086a.size()) < 0) {
                    i14 = 0;
                }
                if (i14 != Integer.MIN_VALUE) {
                    i12 = i14;
                }
                this.f17140e = i12;
                linkedHashMap.remove(b1.f16664b);
            } else {
                throw new IllegalStateException("should've received an init before prepend".toString());
            }
        } else if (arrayList2.isEmpty()) {
            if (i10 == 0) {
                arrayList.add(page);
                this.f17139d = 0;
                int i15 = page.f17090e;
                if (i15 == Integer.MIN_VALUE) {
                    i15 = 0;
                }
                this.f17141f = i15;
                int i16 = page.f17089d;
                if (i16 != Integer.MIN_VALUE) {
                    i12 = i16;
                }
                this.f17140e = i12;
            } else {
                throw new IllegalStateException("init loadId must be the initial value, 0".toString());
            }
        } else {
            throw new IllegalStateException("cannot receive multiple init calls".toString());
        }
        return true;
    }

    public final g1 f(u3 u3Var, b1 loadType) {
        int i10;
        Intrinsics.checkNotNullParameter(u3Var, "<this>");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int ordinal = loadType.ordinal();
        int i11 = 0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i10 = (this.f17138c.size() - this.f17139d) - 1;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i10 = 0 - this.f17139d;
            }
        } else {
            i10 = 0;
        }
        List pages = vt.x.a(new s4(i10, u3Var.f17086a));
        int ordinal2 = loadType.ordinal();
        h.c cVar = this.f17147l;
        b3 b3Var = this.f17136a;
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 == 2) {
                    g1 g1Var = g1.f16784g;
                    if (b3Var.f16672c) {
                        i11 = this.f17141f;
                    }
                    a1 sourceLoadStates = cVar.X();
                    Intrinsics.checkNotNullParameter(pages, "pages");
                    Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
                    return new g1(b1.f16665c, pages, -1, i11, sourceLoadStates, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            g1 g1Var2 = g1.f16784g;
            int d10 = d();
            a1 sourceLoadStates2 = cVar.X();
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(sourceLoadStates2, "sourceLoadStates");
            return new g1(b1.f16664b, pages, d10, -1, sourceLoadStates2, null);
        }
        g1 g1Var3 = g1.f16784g;
        int d11 = d();
        if (b3Var.f16672c) {
            i11 = this.f17141f;
        }
        return mt.p.n(pages, d11, i11, cVar.X(), null);
    }
}
