package za;

import androidx.activity.q;
import ba.ei;
import com.assetgro.stockgro.feature_onboarding.presentation.login.intro.IntroFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.login.intro.IntroViewModel;
import com.assetgro.stockgro.prod.R;
import iu.k;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q6.l;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntroFragment f42209b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(IntroFragment introFragment, int i10) {
        super(1);
        this.f42208a = i10;
        this.f42209b = introFragment;
    }

    public final void a(j jVar) {
        int i10 = this.f42208a;
        IntroFragment introFragment = this.f42209b;
        switch (i10) {
            case 0:
                l.h(introFragment).o(new androidx.navigation.a(R.id.loginFlow));
                return;
            default:
                l.h(introFragment).o(new androidx.navigation.a(R.id.registrationFlow));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f42208a;
        IntroFragment introFragment = this.f42209b;
        switch (i10) {
            case 0:
                a((j) obj);
                return Unit.f23355a;
            case 1:
                a((j) obj);
                return Unit.f23355a;
            case 2:
                ((IntroViewModel) introFragment.r()).f8722t = true;
                IntroViewModel introViewModel = (IntroViewModel) introFragment.r();
                int i11 = introViewModel.f8721s + 1;
                introViewModel.f8721s = i11;
                if (i11 == introViewModel.f8720r) {
                    introViewModel.f8721s = 0;
                }
                int i12 = introViewModel.f8721s;
                if (i12 > -1) {
                    ((ei) introFragment.q()).f4618t.setCurrentItem(i12);
                }
                return Unit.f23355a;
            default:
                q addCallback = (q) obj;
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                int currentItem = ((ei) introFragment.q()).f4618t.getCurrentItem();
                if (currentItem == 0) {
                    introFragment.requireActivity().finish();
                } else {
                    ((ei) introFragment.q()).f4618t.setCurrentItem(currentItem - 1);
                }
                return Unit.f23355a;
        }
    }
}
