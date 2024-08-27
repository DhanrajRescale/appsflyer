package ah;

import ba.rb;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f423b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(1);
        this.f422a = i10;
        this.f423b = dVar;
    }

    public final void a(String str) {
        int i10 = this.f422a;
        d dVar = this.f423b;
        switch (i10) {
            case 0:
                ((rb) dVar.f17291u).f5955v.setText(str);
                return;
            case 1:
                ((rb) dVar.f17291u).f5956w.setText(str);
                return;
            default:
                ((rb) dVar.f17291u).f5954u.setText(str.toString());
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f422a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
