package rd;

import com.assetgro.stockgro.data.model.DiscoverDto;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final z f33667b = new z(0);

    /* renamed from: c, reason: collision with root package name */
    public static final z f33668c = new z(1);

    /* renamed from: d, reason: collision with root package name */
    public static final z f33669d = new z(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33670a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i10) {
        super(1);
        this.f33670a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f33670a;
        switch (i10) {
            case 0:
                DiscoverDto response = (DiscoverDto) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                return response.getUserConfig();
            case 1:
                Throwable th2 = (Throwable) obj;
                switch (i10) {
                    case 1:
                        th2.printStackTrace();
                        break;
                    default:
                        FirebaseCrashlytics.getInstance().recordException(th2);
                        th2.printStackTrace();
                        break;
                }
                return Unit.f23355a;
            default:
                Throwable th3 = (Throwable) obj;
                switch (i10) {
                    case 1:
                        th3.printStackTrace();
                        break;
                    default:
                        FirebaseCrashlytics.getInstance().recordException(th3);
                        th3.printStackTrace();
                        break;
                }
                return Unit.f23355a;
        }
    }
}
