package gf;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.ui.home.HomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f17381b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(HomeViewModel homeViewModel, int i10) {
        super(1);
        this.f17380a = i10;
        this.f17381b = homeViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HomeViewModel homeViewModel = this.f17381b;
        int i10 = this.f17380a;
        switch (i10) {
            case 0:
                e0 e0Var = homeViewModel.D;
                Unit unit = Unit.f23355a;
                e0Var.postValue(unit);
                return unit;
            case 1:
                hf.i it = (hf.i) obj;
                switch (i10) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it, "it");
                        homeViewModel.j(it);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        homeViewModel.j(it);
                        break;
                }
                return Unit.f23355a;
            default:
                hf.i it2 = (hf.i) obj;
                switch (i10) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        homeViewModel.j(it2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        homeViewModel.j(it2);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
