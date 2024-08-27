package ja;

import ba.za;
import com.assetgro.stockgro.data.model.ChangeDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f21258b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i10) {
        super(1);
        this.f21257a = i10;
        this.f21258b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f21257a;
        e eVar = this.f21258b;
        switch (i10) {
            case 0:
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.e(eVar.f22629a.getContext()).m((String) obj).e()).i()).z(((za) eVar.f17291u).f6827u);
                return Unit.f23355a;
            default:
                ((za) eVar.f17291u).f6825s.a((ChangeDto) obj);
                return Unit.f23355a;
        }
    }
}
