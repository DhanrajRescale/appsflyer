package ea;

import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.login.pin.PinLoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.register.NameRegisterViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class m0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15230c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jj.a f15232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(kq.e eVar, ct.a aVar, UserRepository userRepository, jj.a aVar2, int i10) {
        super(0);
        this.f15228a = i10;
        this.f15229b = eVar;
        this.f15230c = aVar;
        this.f15231d = userRepository;
        this.f15232e = aVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15228a;
        jj.a aVar = this.f15232e;
        UserRepository userRepository = this.f15231d;
        ct.a aVar2 = this.f15230c;
        pj.a aVar3 = this.f15229b;
        switch (i10) {
            case 0:
                return new NameRegisterViewModel(aVar3, aVar2, userRepository, aVar);
            default:
                return new PinLoginViewModel(aVar3, aVar2, userRepository, aVar);
        }
    }
}
