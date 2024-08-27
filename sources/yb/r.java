package yb;

import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.o f41458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f41459b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f41460c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f41461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RiaProfileResponseDto.Group f41462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f41463f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function1 f41464g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function1 f41465h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f41466i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f41467j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f41468k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g1.o oVar, boolean z10, List list, List list2, RiaProfileResponseDto.Group group, Function2 function2, Function1 function1, Function1 function12, Function1 function13, int i10, int i11) {
        super(2);
        this.f41458a = oVar;
        this.f41459b = z10;
        this.f41460c = list;
        this.f41461d = list2;
        this.f41462e = group;
        this.f41463f = function2;
        this.f41464g = function1;
        this.f41465h = function12;
        this.f41466i = function13;
        this.f41467j = i10;
        this.f41468k = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        u.d(this.f41458a, this.f41459b, this.f41460c, this.f41461d, this.f41462e, this.f41463f, this.f41464g, this.f41465h, this.f41466i, (t0.n) obj, t0.t.H0(this.f41467j | 1), this.f41468k);
        return Unit.f23355a;
    }
}
