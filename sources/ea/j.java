package ea;

import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15193c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ChatRepository f15194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArenaRepository f15196f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(kq.e eVar, ct.a aVar, ChatRepository chatRepository, UserRepository userRepository, ArenaRepository arenaRepository, int i10) {
        super(0);
        this.f15191a = i10;
        this.f15192b = eVar;
        this.f15193c = aVar;
        this.f15194d = chatRepository;
        this.f15195e = userRepository;
        this.f15196f = arenaRepository;
    }

    public final GroupInfoViewModel a() {
        switch (this.f15191a) {
            case 0:
                pj.a aVar = this.f15192b;
                ct.a aVar2 = this.f15193c;
                return new GroupInfoViewModel(this.f15196f, this.f15194d, this.f15195e, aVar, aVar2);
            default:
                pj.a aVar3 = this.f15192b;
                ct.a aVar4 = this.f15193c;
                return new GroupInfoViewModel(this.f15196f, this.f15194d, this.f15195e, aVar3, aVar4);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f15191a) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}
