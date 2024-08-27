package um;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public float f37248a = -3.4028235E38f;

    /* renamed from: b, reason: collision with root package name */
    public float f37249b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public float f37250c = -3.4028235E38f;

    /* renamed from: d, reason: collision with root package name */
    public float f37251d = Float.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public float f37252e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public float f37253f = Float.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f37254g = -3.4028235E38f;

    /* renamed from: h, reason: collision with root package name */
    public float f37255h = Float.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public List f37256i;

    public g(ym.b... bVarArr) {
        ArrayList arrayList = new ArrayList();
        for (ym.b bVar : bVarArr) {
            arrayList.add(bVar);
        }
        this.f37256i = arrayList;
        a();
    }

    public final void a() {
        Object obj;
        ym.b bVar;
        List<ym.b> list = this.f37256i;
        if (list == null) {
            return;
        }
        this.f37248a = -3.4028235E38f;
        this.f37249b = Float.MAX_VALUE;
        this.f37250c = -3.4028235E38f;
        this.f37251d = Float.MAX_VALUE;
        for (ym.b bVar2 : list) {
            float f10 = this.f37248a;
            h hVar = (h) bVar2;
            float f11 = hVar.f37273q;
            if (f10 < f11) {
                this.f37248a = f11;
            }
            float f12 = this.f37249b;
            float f13 = hVar.f37274r;
            if (f12 > f13) {
                this.f37249b = f13;
            }
            float f14 = this.f37250c;
            float f15 = hVar.f37275s;
            if (f14 < f15) {
                this.f37250c = f15;
            }
            float f16 = this.f37251d;
            float f17 = hVar.f37276t;
            if (f16 > f17) {
                this.f37251d = f17;
            }
            if (hVar.f37260d == 1) {
                if (this.f37252e < f11) {
                    this.f37252e = f11;
                }
                if (this.f37253f > f13) {
                    this.f37253f = f13;
                }
            } else {
                if (this.f37254g < f11) {
                    this.f37254g = f11;
                }
                if (this.f37255h > f13) {
                    this.f37255h = f13;
                }
            }
        }
        this.f37252e = -3.4028235E38f;
        this.f37253f = Float.MAX_VALUE;
        this.f37254g = -3.4028235E38f;
        this.f37255h = Float.MAX_VALUE;
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                bVar = (ym.b) it.next();
                if (((h) bVar).f37260d == 1) {
                    break;
                }
            } else {
                bVar = null;
                break;
            }
        }
        if (bVar != null) {
            h hVar2 = (h) bVar;
            this.f37252e = hVar2.f37273q;
            this.f37253f = hVar2.f37274r;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                h hVar3 = (h) ((ym.b) it2.next());
                if (hVar3.f37260d == 1) {
                    float f18 = hVar3.f37274r;
                    if (f18 < this.f37253f) {
                        this.f37253f = f18;
                    }
                    float f19 = hVar3.f37273q;
                    if (f19 > this.f37252e) {
                        this.f37252e = f19;
                    }
                }
            }
        }
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object obj2 = (ym.b) it3.next();
            if (((h) obj2).f37260d == 2) {
                obj = obj2;
                break;
            }
        }
        if (obj != null) {
            h hVar4 = (h) obj;
            this.f37254g = hVar4.f37273q;
            this.f37255h = hVar4.f37274r;
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                h hVar5 = (h) ((ym.b) it4.next());
                if (hVar5.f37260d == 2) {
                    float f20 = hVar5.f37274r;
                    if (f20 < this.f37255h) {
                        this.f37255h = f20;
                    }
                    float f21 = hVar5.f37273q;
                    if (f21 > this.f37254g) {
                        this.f37254g = f21;
                    }
                }
            }
        }
    }

    public ym.b b(int i10) {
        List list = this.f37256i;
        if (list != null && i10 >= 0 && i10 < list.size()) {
            return (ym.b) list.get(i10);
        }
        return null;
    }

    public final int c() {
        List list = this.f37256i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final int d() {
        Iterator it = this.f37256i.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((h) ((ym.b) it.next())).f37272p.size();
        }
        return i10;
    }

    public i e(wm.c cVar) {
        int i10 = cVar.f39311e;
        List list = this.f37256i;
        if (i10 >= list.size()) {
            return null;
        }
        return ((h) ((ym.b) list.get(cVar.f39311e))).h(cVar.f39307a, cVar.f39308b, 3);
    }

    public final ym.b f() {
        List<ym.b> list = this.f37256i;
        if (list != null && !list.isEmpty()) {
            ym.b bVar = (ym.b) list.get(0);
            for (ym.b bVar2 : list) {
                if (((h) bVar2).f37272p.size() > ((h) bVar).f37272p.size()) {
                    bVar = bVar2;
                }
            }
            return bVar;
        }
        return null;
    }

    public final float g(int i10) {
        if (i10 == 1) {
            float f10 = this.f37252e;
            return f10 == -3.4028235E38f ? this.f37254g : f10;
        }
        float f11 = this.f37254g;
        return f11 == -3.4028235E38f ? this.f37252e : f11;
    }

    public final float h(int i10) {
        if (i10 == 1) {
            float f10 = this.f37253f;
            return f10 == Float.MAX_VALUE ? this.f37255h : f10;
        }
        float f11 = this.f37255h;
        return f11 == Float.MAX_VALUE ? this.f37253f : f11;
    }
}
