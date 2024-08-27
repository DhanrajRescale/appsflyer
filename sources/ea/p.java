package ea;

import com.assetgro.stockgro.data.LogoutSubject;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.NotificationsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class p extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15247c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ChatRepository f15249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ NotificationsRepository f15250f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ LogoutSubject f15251g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ jj.a f15252h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qf.a f15253i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(kq.e eVar, ct.a aVar, UserRepository userRepository, ChatRepository chatRepository, NotificationsRepository notificationsRepository, LogoutSubject logoutSubject, jj.a aVar2, qf.a aVar3, int i10) {
        super(0);
        this.f15245a = i10;
        this.f15246b = eVar;
        this.f15247c = aVar;
        this.f15248d = userRepository;
        this.f15249e = chatRepository;
        this.f15250f = notificationsRepository;
        this.f15251g = logoutSubject;
        this.f15252h = aVar2;
        this.f15253i = aVar3;
    }

    public final MainSharedViewModel a() {
        switch (this.f15245a) {
            case 0:
                return new MainSharedViewModel(this.f15246b, this.f15247c, this.f15248d, this.f15249e, this.f15250f, this.f15251g, this.f15252h, this.f15253i);
            default:
                return new MainSharedViewModel(this.f15246b, this.f15247c, this.f15248d, this.f15249e, this.f15250f, this.f15251g, this.f15252h, this.f15253i);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f15245a) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}
