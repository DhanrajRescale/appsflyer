package ea;

import com.assetgro.stockgro.data.repository.MissionsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailViewModel;
import com.assetgro.stockgro.missions.presentation.history.MissionHistoryViewModel;
import com.assetgro.stockgro.missions.presentation.history.MissionStatusDetailViewModel;
import com.assetgro.stockgro.missions.presentation.home.MissionSharedViewModel;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class l0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15220c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MissionsRepository f15222e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(kq.e eVar, ct.a aVar, UserRepository userRepository, MissionsRepository missionsRepository, int i10) {
        super(0);
        this.f15218a = i10;
        this.f15219b = eVar;
        this.f15220c = aVar;
        this.f15221d = userRepository;
        this.f15222e = missionsRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15218a;
        MissionsRepository missionsRepository = this.f15222e;
        UserRepository userRepository = this.f15221d;
        ct.a aVar = this.f15220c;
        pj.a aVar2 = this.f15219b;
        switch (i10) {
            case 0:
                return new MissionHistoryViewModel(aVar2, aVar, userRepository, missionsRepository);
            case 1:
                return new MissionSharedViewModel(aVar2, aVar, userRepository, missionsRepository);
            case 2:
                return new MissionStatusDetailViewModel(aVar2, aVar, userRepository, missionsRepository);
            case 3:
                return new MissionTaskDetailViewModel(aVar2, aVar, userRepository, missionsRepository);
            default:
                return new MissionsHomeViewModel(aVar2, aVar, userRepository, missionsRepository);
        }
    }
}
