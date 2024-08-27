package yb;

import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RiaProfileResponseDto.Group f41443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f41444b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(RiaProfileResponseDto.Group group, Function1 function1) {
        super(0);
        this.f41443a = group;
        this.f41444b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        String description = this.f41443a.getDescription();
        if (description != null) {
            this.f41444b.invoke(description);
        }
        return Unit.f23355a;
    }
}
