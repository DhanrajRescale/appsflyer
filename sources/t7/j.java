package t7;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f35485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f35486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35487c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f35488d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f35489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f35490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f35491g;

    public j(l lVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f35491g = lVar;
        this.f35485a = obj;
        this.f35486b = arrayList;
        this.f35489e = obj2;
        this.f35490f = arrayList2;
    }

    @Override // t7.o
    public final void c(p pVar) {
        pVar.w(this);
    }

    @Override // t7.q, t7.o
    public final void e(p pVar) {
        l lVar = this.f35491g;
        Object obj = this.f35485a;
        if (obj != null) {
            lVar.s(obj, this.f35486b, null);
        }
        Object obj2 = this.f35487c;
        if (obj2 != null) {
            lVar.s(obj2, this.f35488d, null);
        }
        Object obj3 = this.f35489e;
        if (obj3 != null) {
            lVar.s(obj3, this.f35490f, null);
        }
    }
}
