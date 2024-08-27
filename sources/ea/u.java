package ea;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileViewModel;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchViewModel;
import com.assetgro.stockgro.ui.profile.user.UserProfileViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class u extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15286c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ChatRepository f15288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FollowerRepository f15289f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ChatRepository chatRepository, FollowerRepository followerRepository, UserRepository userRepository, kq.e eVar, ct.a aVar) {
        super(0);
        this.f15284a = 1;
        this.f15285b = eVar;
        this.f15286c = aVar;
        this.f15287d = userRepository;
        this.f15288e = chatRepository;
        this.f15289f = followerRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f15284a) {
            case 0:
                pj.a aVar = this.f15285b;
                ct.a aVar2 = this.f15286c;
                UserRepository userRepository = this.f15287d;
                return new RiaProfileViewModel(this.f15288e, this.f15289f, userRepository, aVar, aVar2);
            case 1:
                pj.a aVar3 = this.f15285b;
                ct.a aVar4 = this.f15286c;
                return new SocialAdvancedSearchViewModel(this.f15288e, this.f15289f, this.f15287d, aVar3, aVar4);
            default:
                pj.a aVar5 = this.f15285b;
                ct.a aVar6 = this.f15286c;
                UserRepository userRepository2 = this.f15287d;
                return new UserProfileViewModel(this.f15288e, this.f15289f, userRepository2, aVar5, aVar6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(kq.e eVar, ct.a aVar, UserRepository userRepository, FollowerRepository followerRepository, ChatRepository chatRepository, int i10) {
        super(0);
        this.f15284a = i10;
        this.f15285b = eVar;
        this.f15286c = aVar;
        this.f15287d = userRepository;
        this.f15289f = followerRepository;
        this.f15288e = chatRepository;
    }
}
