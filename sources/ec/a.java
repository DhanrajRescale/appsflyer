package ec;

import androidx.navigation.l0;
import androidx.navigation.x0;
import com.assetgro.stockgro.prod.R;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f15370b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f15371c = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15372a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(1);
        this.f15372a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15372a) {
            case 0:
                x0 popUpTo = (x0) obj;
                Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                popUpTo.f2340a = true;
                return Unit.f23355a;
            default:
                l0 navOptions = (l0) obj;
                Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                navOptions.a(R.id.missionsHomeFragment, f15370b);
                return Unit.f23355a;
        }
    }
}
