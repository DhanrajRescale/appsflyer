package mc;

import com.assetgro.stockgro.ui.arena.asset.host.ArenaAssetHostViewModel;
import iu.k;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArenaAssetHostViewModel f27705b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ArenaAssetHostViewModel arenaAssetHostViewModel, int i10) {
        super(1);
        this.f27704a = i10;
        this.f27705b = arenaAssetHostViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f27704a;
        ArenaAssetHostViewModel arenaAssetHostViewModel = this.f27705b;
        switch (i10) {
            case 0:
                j jVar = (j) obj;
                if (jVar != null && ((Unit) jVar.a()) != null) {
                    arenaAssetHostViewModel.getClass();
                    boolean b10 = arenaAssetHostViewModel.f8943o.b(qf.b.f31928c);
                    if (ArenaAssetHostViewModel.f8941u != b10) {
                        ArenaAssetHostViewModel.f8941u = b10;
                        arenaAssetHostViewModel.f8947s.postValue(new j(Boolean.valueOf(b10)));
                    }
                }
                return Unit.f23355a;
            default:
                arenaAssetHostViewModel.f9084g.postValue(Boolean.FALSE);
                return Unit.f23355a;
        }
    }
}
