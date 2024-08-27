package hf;

import com.assetgro.stockgro.ui.home.HomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f18382b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(HomeViewModel homeViewModel, int i10) {
        super(0);
        this.f18381a = i10;
        this.f18382b = homeViewModel;
    }

    public final void a() {
        int i10 = this.f18381a;
        HomeViewModel homeViewModel = this.f18382b;
        switch (i10) {
            case 0:
                homeViewModel.j(h.f18373c);
                return;
            case 1:
                homeViewModel.k(new uh.g(true));
                return;
            default:
                homeViewModel.k(new uh.g(false));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f18381a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
