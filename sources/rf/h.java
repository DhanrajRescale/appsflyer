package rf;

import ba.xa;
import com.assetgro.stockgro.data.model.NotificationDto;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f33707b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i10) {
        super(1);
        this.f33706a = i10;
        this.f33707b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f33706a;
        i iVar = this.f33707b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                f fVar = iVar.f33709y;
                if (fVar != null) {
                    fVar.u(list);
                    return Unit.f23355a;
                }
                Intrinsics.k("notificationsAdapter");
                throw null;
            case 1:
                ((xa) iVar.f17291u).f6639t.setText((String) obj);
                return Unit.f23355a;
            default:
                NotificationDto it = (NotificationDto) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                iVar.f33708x.invoke(it);
                return Unit.f23355a;
        }
    }
}
