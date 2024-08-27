package wb;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.w;
import qu.f0;
import t0.g1;

/* loaded from: classes.dex */
public final class b extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hb.k f38924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f38925b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hb.k kVar, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f38924a = kVar;
        this.f38925b = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new b(this.f38924a, this.f38925b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        d dVar;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        hb.k kVar = this.f38924a;
        String str = kVar.f18198b;
        if (w.s(str, "image", false)) {
            dVar = d.f38928b;
        } else if (w.s(str, "video", false)) {
            if (w.s(kVar.f18200d, "youtube", false)) {
                dVar = d.f38930d;
            } else {
                dVar = d.f38927a;
            }
        } else if (w.s(str, "pdf", false)) {
            dVar = d.f38929c;
        } else if (w.s(str, "youtube", false)) {
            dVar = d.f38930d;
        } else if (w.s(str, "shorts", false)) {
            dVar = d.f38931e;
        } else {
            dVar = null;
        }
        this.f38925b.setValue(dVar);
        return Unit.f23355a;
    }
}
