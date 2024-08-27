package wa;

import ba.b7;
import com.assetgro.stockgro.data.model.ChangeDto;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f38899b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(1);
        this.f38898a = i10;
        this.f38899b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f38898a;
        d dVar = this.f38899b;
        switch (i10) {
            case 0:
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.e(dVar.f22629a.getContext()).m((String) obj).e()).i()).z(((b7) dVar.f17291u).f4264u);
                return Unit.f23355a;
            default:
                ((b7) dVar.f17291u).f4262s.a((ChangeDto) obj);
                return Unit.f23355a;
        }
    }
}
