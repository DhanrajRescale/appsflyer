package hi;

import com.assetgro.stockgro.ui.splash.SplashViewModel;
import iu.k;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplashViewModel f18491b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(SplashViewModel splashViewModel, int i10) {
        super(1);
        this.f18490a = i10;
        this.f18491b = splashViewModel;
    }

    public final void a(j jVar) {
        int i10 = this.f18490a;
        SplashViewModel splashViewModel = this.f18491b;
        switch (i10) {
            case 0:
                if (jVar != null && ((Unit) jVar.a()) != null) {
                    splashViewModel.f9081d.logoutOffline();
                    splashViewModel.f10159n.t0(HttpUrl.FRAGMENT_ENCODE_SET);
                    splashViewModel.f10163r.postValue(new j(Unit.f23355a));
                    return;
                }
                return;
            default:
                if (jVar != null && ((Unit) jVar.a()) != null) {
                    splashViewModel.f9081d.logoutOffline();
                    splashViewModel.f10159n.t0(HttpUrl.FRAGMENT_ENCODE_SET);
                    splashViewModel.f10163r.postValue(new j(Unit.f23355a));
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f18490a) {
            case 0:
                a((j) obj);
                return Unit.f23355a;
            default:
                a((j) obj);
                return Unit.f23355a;
        }
    }
}
