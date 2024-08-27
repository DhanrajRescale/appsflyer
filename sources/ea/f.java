package ea;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.chat.detail.group.ChatSharedViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15149c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ChatRepository f15151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.work.i0 f15152f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(kq.e eVar, ct.a aVar, UserRepository userRepository, ChatRepository chatRepository, androidx.work.i0 i0Var, int i10) {
        super(0);
        this.f15147a = i10;
        this.f15148b = eVar;
        this.f15149c = aVar;
        this.f15150d = userRepository;
        this.f15151e = chatRepository;
        this.f15152f = i0Var;
    }

    public final ChatSharedViewModel a() {
        switch (this.f15147a) {
            case 0:
                return new ChatSharedViewModel(this.f15148b, this.f15149c, this.f15150d, this.f15151e, this.f15152f);
            default:
                return new ChatSharedViewModel(this.f15148b, this.f15149c, this.f15150d, this.f15151e, this.f15152f);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f15147a) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}
