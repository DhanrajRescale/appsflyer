package nf;

import com.assetgro.stockgro.data.remote.response.MaintenanceResponseV2;
import com.assetgro.stockgro.data.remote.response.SectionMaintenanceConfig;
import com.assetgro.stockgro.data.remote.response.Sections;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class o extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainSharedViewModel f28662b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(MainSharedViewModel mainSharedViewModel, yt.a aVar) {
        super(2, aVar);
        this.f28662b = mainSharedViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new o(this.f28662b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        MaintenanceResponseV2 maintenanceResponseV2;
        Sections androidMaintenanceConfig;
        HashMap<String, SectionMaintenanceConfig> config;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f28661a;
        MainSharedViewModel mainSharedViewModel = this.f28662b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                UserRepository userRepository = mainSharedViewModel.f9081d;
                this.f28661a = 1;
                obj = userRepository.getMaintenanceConfigV2(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (maintenanceResponseV2 = (MaintenanceResponseV2) v0Var.f29303b) != null && (androidMaintenanceConfig = maintenanceResponseV2.getAndroidMaintenanceConfig()) != null && (config = androidMaintenanceConfig.getSections()) != null) {
                qf.a aVar2 = mainSharedViewModel.f9586q;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(config, "config");
                aVar2.f31926b = config;
                qf.a aVar3 = mainSharedViewModel.f9586q;
                aVar3.getClass();
                aVar3.f31925a.b(new kj.j(Unit.f23355a));
            }
        } catch (Exception e10) {
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
        return Unit.f23355a;
    }
}
