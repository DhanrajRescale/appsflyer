package wf;

import com.assetgro.stockgro.data.remote.response.MaintenanceResponseV2;
import com.assetgro.stockgro.data.remote.response.SectionMaintenanceConfig;
import com.assetgro.stockgro.data.remote.response.Sections;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.payments.home.WalletHomeViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletHomeViewModel f39055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(WalletHomeViewModel walletHomeViewModel, yt.a aVar) {
        super(2, aVar);
        this.f39055b = walletHomeViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f39055b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        MaintenanceResponseV2 maintenanceResponseV2;
        Sections androidMaintenanceConfig;
        HashMap<String, SectionMaintenanceConfig> config;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39054a;
        WalletHomeViewModel walletHomeViewModel = this.f39055b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                UserRepository userRepository = walletHomeViewModel.f9081d;
                this.f39054a = 1;
                obj = userRepository.getMaintenanceConfigV2(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (maintenanceResponseV2 = (MaintenanceResponseV2) v0Var.f29303b) != null && (androidMaintenanceConfig = maintenanceResponseV2.getAndroidMaintenanceConfig()) != null && (config = androidMaintenanceConfig.getSections()) != null) {
                qf.a aVar2 = walletHomeViewModel.f9649o;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(config, "config");
                aVar2.f31926b = config;
                qf.a aVar3 = walletHomeViewModel.f9649o;
                aVar3.getClass();
                aVar3.f31925a.b(new kj.j(Unit.f23355a));
            }
        } catch (Exception e10) {
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
        return Unit.f23355a;
    }
}
