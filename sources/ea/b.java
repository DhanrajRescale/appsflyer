package ea;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import com.assetgro.stockgro.ui.chat.create.members.create.MemberListViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.AddMembersViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15113c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FollowerRepository f15114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ChatRepository f15115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ContactsRepository f15116f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15117g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ChatRepository chatRepository, ContactsRepository contactsRepository, FollowerRepository followerRepository, UserRepository userRepository, kq.e eVar, ct.a aVar) {
        super(0);
        this.f15111a = 0;
        this.f15112b = eVar;
        this.f15113c = aVar;
        this.f15115e = chatRepository;
        this.f15114d = followerRepository;
        this.f15116f = contactsRepository;
        this.f15117g = userRepository;
    }

    public final GroupCreateViewModel a() {
        switch (this.f15111a) {
            case 1:
                pj.a aVar = this.f15112b;
                ct.a aVar2 = this.f15113c;
                return new GroupCreateViewModel(this.f15115e, this.f15116f, this.f15114d, this.f15117g, aVar, aVar2);
            default:
                pj.a aVar3 = this.f15112b;
                ct.a aVar4 = this.f15113c;
                return new GroupCreateViewModel(this.f15115e, this.f15116f, this.f15114d, this.f15117g, aVar3, aVar4);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f15111a) {
            case 0:
                pj.a aVar = this.f15112b;
                ct.a aVar2 = this.f15113c;
                return new AddMembersViewModel(this.f15115e, this.f15116f, this.f15114d, this.f15117g, aVar, aVar2);
            case 1:
                return a();
            case 2:
                pj.a aVar3 = this.f15112b;
                ct.a aVar4 = this.f15113c;
                return new MemberListViewModel(this.f15115e, this.f15116f, this.f15114d, this.f15117g, aVar3, aVar4);
            default:
                return a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(kq.e eVar, ct.a aVar, FollowerRepository followerRepository, ChatRepository chatRepository, ContactsRepository contactsRepository, UserRepository userRepository, int i10) {
        super(0);
        this.f15111a = i10;
        this.f15112b = eVar;
        this.f15113c = aVar;
        this.f15114d = followerRepository;
        this.f15115e = chatRepository;
        this.f15116f = contactsRepository;
        this.f15117g = userRepository;
    }
}
