package b3;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes.dex */
public final class c extends b4.l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f3102c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, q qVar) {
        super(qVar, 10);
        this.f3102c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(Object obj, Object obj2, ou.g gVar) {
        f3.c cVar;
        f3.g gVar2 = this.f3102c.f3105b;
        String str = ((iu.c) gVar).f20541d;
        q qVar = (q) ((p) obj2);
        h.c cVar2 = qVar.f3141b;
        boolean L = cVar2.L();
        h.c cVar3 = qVar.f3140a;
        h.c cVar4 = qVar.f3142c;
        if (L && cVar4.L()) {
            cVar = cVar3.j();
        } else {
            f3.b bVar = new f3.b(new char[0]);
            if (!cVar2.L()) {
                bVar.E("min", cVar2.j());
            }
            if (!cVar4.L()) {
                bVar.E("max", cVar4.j());
            }
            bVar.E(AppMeasurementSdk.ConditionalUserProperty.VALUE, cVar3.j());
            cVar = bVar;
        }
        gVar2.E(str, cVar);
    }
}
