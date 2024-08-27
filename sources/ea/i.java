package ea;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.chat.discover.info.GroupDetailViewModel;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15177b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15178c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ChatRepository f15179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FollowerRepository f15181f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qf.a f15182g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(kq.e eVar, ct.a aVar, ChatRepository chatRepository, UserRepository userRepository, FollowerRepository followerRepository, qf.a aVar2, int i10) {
        super(0);
        this.f15176a = i10;
        this.f15177b = eVar;
        this.f15178c = aVar;
        this.f15179d = chatRepository;
        this.f15180e = userRepository;
        this.f15181f = followerRepository;
        this.f15182g = aVar2;
    }

    public final SocialChatListViewModel a() {
        switch (this.f15176a) {
            case 1:
                return new SocialChatListViewModel(this.f15177b, this.f15178c, this.f15180e, this.f15179d, this.f15181f, this.f15182g);
            default:
                return new SocialChatListViewModel(this.f15177b, this.f15178c, this.f15180e, this.f15179d, this.f15181f, this.f15182g);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f15176a) {
            case 0:
                return new GroupDetailViewModel(this.f15177b, this.f15178c, this.f15180e, this.f15179d, this.f15181f, this.f15182g);
            case 1:
                return a();
            case 2:
                return a();
            default:
                return new UserStatisticsViewModel(this.f15177b, this.f15178c, this.f15180e, this.f15181f, this.f15179d, this.f15182g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kq.e eVar, ct.a aVar, UserRepository userRepository, ChatRepository chatRepository, FollowerRepository followerRepository, qf.a aVar2) {
        super(0);
        this.f15176a = 0;
        this.f15177b = eVar;
        this.f15178c = aVar;
        this.f15180e = userRepository;
        this.f15179d = chatRepository;
        this.f15181f = followerRepository;
        this.f15182g = aVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kq.e eVar, ct.a aVar, UserRepository userRepository, FollowerRepository followerRepository, ChatRepository chatRepository, qf.a aVar2) {
        super(0);
        this.f15176a = 3;
        this.f15177b = eVar;
        this.f15178c = aVar;
        this.f15180e = userRepository;
        this.f15181f = followerRepository;
        this.f15179d = chatRepository;
        this.f15182g = aVar2;
    }
}
