package je;

import com.assetgro.stockgro.ui.chat.list.UserGroupListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserGroupListViewModel f21336b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(UserGroupListViewModel userGroupListViewModel, int i10) {
        super(1);
        this.f21335a = i10;
        this.f21336b = userGroupListViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f21335a;
        switch (i10) {
            case 0:
                fv.f it = (fv.f) obj;
                switch (i10) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.f21336b.f9402q.postValue(Boolean.TRUE);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        synchronized (this.f21336b) {
                            break;
                        }
                }
                return Unit.f23355a;
            default:
                fv.f it2 = (fv.f) obj;
                switch (i10) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        this.f21336b.f9402q.postValue(Boolean.TRUE);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        synchronized (this.f21336b) {
                            break;
                        }
                }
                return Unit.f23355a;
        }
    }
}
