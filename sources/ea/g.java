package ea;

import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15154a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15156c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArenaRepository f15157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ChatRepository f15158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qf.a f15160g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kq.e eVar, ct.a aVar, ArenaRepository arenaRepository, ChatRepository chatRepository, UserRepository userRepository, qf.a aVar2) {
        super(0);
        this.f15155b = eVar;
        this.f15156c = aVar;
        this.f15157d = arenaRepository;
        this.f15158e = chatRepository;
        this.f15159f = userRepository;
        this.f15160g = aVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f15154a) {
            case 0:
                return new GroupChatHostViewModel(this.f15155b, this.f15156c, this.f15159f, this.f15158e, this.f15157d, this.f15160g);
            default:
                return new LeagueDetailPostJoiningViewModel(this.f15155b, this.f15156c, this.f15157d, this.f15158e, this.f15159f, this.f15160g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kq.e eVar, ct.a aVar, UserRepository userRepository, ChatRepository chatRepository, ArenaRepository arenaRepository, qf.a aVar2) {
        super(0);
        this.f15155b = eVar;
        this.f15156c = aVar;
        this.f15159f = userRepository;
        this.f15158e = chatRepository;
        this.f15157d = arenaRepository;
        this.f15160g = aVar2;
    }
}
