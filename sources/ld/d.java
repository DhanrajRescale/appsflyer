package ld;

import com.assetgro.stockgro.data.model.Media;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.w;
import qu.f0;
import t0.g1;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Media f24550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f24551b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Media media, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f24550a = media;
        this.f24551b = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f24550a, this.f24551b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        String type = this.f24550a.getType();
        if (type == null) {
            type = "image";
        }
        if (w.s(type, "image", false)) {
            k kVar = k.f24565a;
            str = "Image";
        } else if (w.s(type, "video", false)) {
            k kVar2 = k.f24565a;
            str = "Video";
        } else {
            str = null;
        }
        this.f24551b.setValue(str);
        return Unit.f23355a;
    }
}
