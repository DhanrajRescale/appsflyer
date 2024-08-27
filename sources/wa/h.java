package wa;

import ba.d7;
import com.assetgro.stockgro.data.model.ChangeDto;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f38909b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i10) {
        super(1);
        this.f38908a = i10;
        this.f38909b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f38908a;
        i iVar = this.f38909b;
        switch (i10) {
            case 0:
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.e(iVar.f22629a.getContext()).m((String) obj).e()).i()).z(((d7) iVar.f17291u).f4454u);
                return Unit.f23355a;
            default:
                ((d7) iVar.f17291u).f4452s.d((ChangeDto) obj);
                return Unit.f23355a;
        }
    }
}
