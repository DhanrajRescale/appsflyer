package ea;

import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.arena.asset.host.ArenaAssetHostViewModel;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15214c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArenaRepository f15216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf.a f15217f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(kq.e eVar, ct.a aVar, UserRepository userRepository, ArenaRepository arenaRepository, qf.a aVar2, int i10) {
        super(0);
        this.f15212a = i10;
        this.f15213b = eVar;
        this.f15214c = aVar;
        this.f15215d = userRepository;
        this.f15216e = arenaRepository;
        this.f15217f = aVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f15212a) {
            case 0:
                return new LeagueDetailPreJoiningViewModel(this.f15213b, this.f15214c, this.f15215d, this.f15216e, this.f15217f);
            default:
                return new ArenaAssetHostViewModel(this.f15213b, this.f15214c, this.f15215d, this.f15216e, this.f15217f);
        }
    }
}
