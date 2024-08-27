package ea;

import android.content.Context;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.TopChartsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import com.assetgro.stockgro.ui.chat.helper.search.SearchContactViewModel;
import com.assetgro.stockgro.ui.home.HomeViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class i0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15183a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15185c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f15189g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f15190h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, ChatRepository chatRepository, FeedRepository feedRepository, FollowerRepository followerRepository, UserRepository userRepository, kq.e eVar, ct.a aVar) {
        super(0);
        this.f15187e = context;
        this.f15184b = eVar;
        this.f15185c = aVar;
        this.f15186d = userRepository;
        this.f15188f = feedRepository;
        this.f15189g = followerRepository;
        this.f15190h = chatRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15183a;
        Object obj = this.f15188f;
        Object obj2 = this.f15189g;
        Object obj3 = this.f15187e;
        Object obj4 = this.f15190h;
        switch (i10) {
            case 0:
                return new FeedStreamViewModel((Context) obj3, (ChatRepository) obj4, (FeedRepository) obj, (FollowerRepository) obj2, this.f15186d, this.f15184b, this.f15185c);
            case 1:
                return new HomeViewModel(this.f15184b, this.f15185c, (TopChartsRepository) obj3, this.f15186d, (mj.a) obj, (PaymentRepository) obj2, (jj.a) obj4);
            default:
                return new SearchContactViewModel(this.f15184b, this.f15185c, (ChatRepository) obj4, (ContactsRepository) obj3, this.f15186d, (FollowerRepository) obj2, (androidx.work.i0) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(kq.e eVar, ct.a aVar, ChatRepository chatRepository, ContactsRepository contactsRepository, UserRepository userRepository, FollowerRepository followerRepository, androidx.work.i0 i0Var) {
        super(0);
        this.f15184b = eVar;
        this.f15185c = aVar;
        this.f15190h = chatRepository;
        this.f15187e = contactsRepository;
        this.f15186d = userRepository;
        this.f15189g = followerRepository;
        this.f15188f = i0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(kq.e eVar, ct.a aVar, TopChartsRepository topChartsRepository, UserRepository userRepository, mj.a aVar2, PaymentRepository paymentRepository, jj.a aVar3) {
        super(0);
        this.f15184b = eVar;
        this.f15185c = aVar;
        this.f15187e = topChartsRepository;
        this.f15186d = userRepository;
        this.f15188f = aVar2;
        this.f15189g = paymentRepository;
        this.f15190h = aVar3;
    }
}
