package nd;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f28619b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f28620c = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28621a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(1);
        this.f28621a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28621a) {
            case 0:
                BaseResponseDto response = (BaseResponseDto) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                return (List) response.getData();
            default:
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
