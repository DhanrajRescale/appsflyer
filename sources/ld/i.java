package ld;

import com.assetgro.stockgro.data.model.Media;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.w;
import qu.f0;
import t0.g1;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Media f24562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f24563b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Media media, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f24562a = media;
        this.f24563b = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i(this.f24562a, this.f24563b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        k kVar;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        String type = this.f24562a.getType();
        if (type == null) {
            type = "image";
        }
        if (w.s(type, "image", false)) {
            kVar = k.f24566b;
        } else if (w.s(type, "video", false)) {
            kVar = k.f24565a;
        } else {
            kVar = null;
        }
        this.f24563b.setValue(kVar);
        return Unit.f23355a;
    }
}
