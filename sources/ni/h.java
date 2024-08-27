package ni;

import ba.vc;
import com.assetgro.stockgro.data.model.ChangeDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f28735b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i10) {
        super(1);
        this.f28734a = i10;
        this.f28735b = iVar;
    }

    public final void a(String str) {
        int i10 = this.f28734a;
        i iVar = this.f28735b;
        switch (i10) {
            case 0:
                ((vc) iVar.f17291u).f6427v.setText(str);
                return;
            case 1:
                ((vc) iVar.f17291u).f6428w.setText(str);
                return;
            case 2:
            default:
                ((vc) iVar.f17291u).f6424s.setText(str);
                return;
            case 3:
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.e(iVar.f22629a.getContext()).m(str).e()).i()).z(((vc) iVar.f17291u).f6426u);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28734a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                ((vc) this.f28735b.f17291u).f6425t.d((ChangeDto) obj);
                return Unit.f23355a;
            case 3:
                a((String) obj);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
