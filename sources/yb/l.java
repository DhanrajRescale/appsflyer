package yb;

import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RiaProfileResponseDto.Group f41445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f41446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f41447c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41448d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(RiaProfileResponseDto.Group group, Function0 function0, Function1 function1, int i10) {
        super(2);
        this.f41445a = group;
        this.f41446b = function0;
        this.f41447c = function1;
        this.f41448d = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int H0 = t0.t.H0(this.f41448d | 1);
        Function0 function0 = this.f41446b;
        Function1 function1 = this.f41447c;
        u.c(this.f41445a, function0, function1, (t0.n) obj, H0);
        return Unit.f23355a;
    }
}
