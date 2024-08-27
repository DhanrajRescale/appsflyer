package nf;

import android.os.Build;
import com.assetgro.stockgro.data.remote.request.AppCloneDataRequest;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.main.MainViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;

/* loaded from: classes.dex */
public final class z extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f28682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppCloneDataRequest f28683b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(MainViewModel mainViewModel, AppCloneDataRequest appCloneDataRequest, yt.a aVar) {
        super(2, aVar);
        this.f28682a = mainViewModel;
        this.f28683b = appCloneDataRequest;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new z(this.f28682a, this.f28683b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        MainViewModel mainViewModel = this.f28682a;
        if (!mainViewModel.f9081d.getCloneDataUpdated()) {
            UserRepository userRepository = mainViewModel.f9081d;
            String fid = userRepository.getFid();
            AppCloneDataRequest appCloneDataRequest = this.f28683b;
            appCloneDataRequest.setUdid(fid);
            try {
                String MANUFACTURER = Build.MANUFACTURER;
                Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                appCloneDataRequest.setManufacturer(MANUFACTURER);
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                appCloneDataRequest.setModel(MODEL);
                appCloneDataRequest.setOsVersion(String.valueOf(Build.VERSION.SDK_INT));
            } catch (Exception unused) {
            }
            appCloneDataRequest.setLicensed(mainViewModel.Z);
            at.m<BaseResponseDto<Object>> postAppCloneData = userRepository.postAppCloneData(appCloneDataRequest);
            kq.e eVar = (kq.e) mainViewModel.f9079b;
            nt.h hVar = new nt.h(postAppCloneData.c(eVar.J()), eVar.Q(), 0);
            jt.d dVar = new jt.d(new jf.g(19, new s(mainViewModel, 2)), new jf.g(20, m.f28656f));
            hVar.a(dVar);
            mainViewModel.f9080c.c(dVar);
        }
        return Unit.f23355a;
    }
}
